package Excercise10;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BikeService {
    private Stack<ERyderLog> logStack = new Stack<>();
    private Queue<BikeRequest> bikeRequestQueue = new ArrayDeque<>();
    private boolean bikeAvailable = false;

    public void reserveBike(String bikeId, String location, String userEmail) {
        if (bikeAvailable) {
            bikeAvailable = false;
            String event = "Bike " + bikeId + " rented at " + location;
            ERyderLog log = new ERyderLog("BR" + System.currentTimeMillis(),
                    event, LocalDateTime.now());
            logStack.push(log);
        } else {
            BikeRequest request = new BikeRequest(userEmail, location, LocalDateTime.now());
            bikeRequestQueue.add(request);
        }
    }

    public void removeTrip(String bikeId, String location) {
        String event = "Bike " + bikeId + " returned at " + location;
        ERyderLog log = new ERyderLog("TR" + System.currentTimeMillis(),
                event, LocalDateTime.now());
        logStack.push(log);

        bikeAvailable = true;

        if (!bikeRequestQueue.isEmpty()) {
            BikeRequest next = bikeRequestQueue.poll();
            reserveBike(bikeId, next.getLocation(), next.getUserEmail());
        }
    }

    public void viewSystemLogs() {
        System.out.println("\n===== System Logs =====");
        for (ERyderLog log : logStack) {
            System.out.println(log);
        }
    }

    public void viewRequestQueue() {
        System.out.println("\n===== Pending Requests =====");
        for (BikeRequest r : bikeRequestQueue) {
            System.out.println(r);
        }
    }

    public void removeFirstRequest() {
        if (!bikeRequestQueue.isEmpty()) {
            bikeRequestQueue.poll();
        }
    }

    public Queue<BikeRequest> getBikeRequestQueue() {
        return bikeRequestQueue;
    }
}