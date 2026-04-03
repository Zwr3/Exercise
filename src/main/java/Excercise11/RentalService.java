package Excercise11;

public class RentalService {
    public static final double BASE_FARE = 3.0;

    public void removeTrip(RegisteredUsers user) {
        double finalFare = user.calculateFare(BASE_FARE);
        System.out.println("Base Fare: " + BASE_FARE);
        System.out.println("Final Fare: " + finalFare);
        user.displayUserType();
    }
}