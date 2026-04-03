package Excercise10;

import java.util.Scanner;

public class AdminPanel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BikeService bikeService = new BikeService();

        while (true) {
            System.out.println("\n===== Admin Panel =====");
            System.out.println("1. View System Logs");
            System.out.println("2. Manage Pending Bike Requests");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                bikeService.viewSystemLogs();
            } else if (choice == 2) {
                manageQueue(bikeService, sc);
            } else if (choice == 3) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        sc.close();
    }

    private static void manageQueue(BikeService service, Scanner sc) {
        while (true) {
            System.out.println("\n===== Manage Queue =====");
            System.out.println("1. View Queue");
            System.out.println("2. Update Queue");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int c = sc.nextInt();
            sc.nextLine();

            if (c == 1) {
                service.viewRequestQueue();
            } else if (c == 2) {
                service.removeFirstRequest();
            } else if (c == 3) {
                break;
            } else {
                System.out.println("Invalid");
            }
        }
    }
}