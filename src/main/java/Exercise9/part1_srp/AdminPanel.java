package Exercise9.part1_srp;

public class AdminPanel {
    public static void main(String[] args) {
        System.out.println("=== Admin Panel ===");
        UserService us = new UserService();
        BikeService bs = new BikeService();
        RentalService rs = new RentalService();

        us.addUser();
        bs.findAvailableBikes();
        rs.startRental();
    }
}