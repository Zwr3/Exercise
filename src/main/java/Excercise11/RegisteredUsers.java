package Excercise11;

public class RegisteredUsers {
    private String fullName;
    private String emailAddress;

    public RegisteredUsers(String fullName, String emailAddress) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
    }

    public double calculateFare(double baseFare) {
        return baseFare;
    }

    public void displayUserType() {
        System.out.println("Registered User");
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}