package Exercise7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] trip1 = {"2025-01-01, A to B", "2025-01-02, B to C", "2025-01-03, C to D"};
        String[] trip2 = {"2025-02-01, X to Y", "2025-02-02, Y to Z", "2025-02-03, Z to X"};
        String[] trip3 = {"2025-03-01, 1 to 2", "2025-03-02, 2 to 3", "2025-03-03, 3 to 1"};

        RegisteredUsers user1 = new RegisteredUsers(
            "Alice", "alice@test.com", "1990-01-01",
            "1234-5678-9012-3456", "12/28", "Visa", "123", "Customer", trip1
        );

        RegisteredUsers user2 = new RegisteredUsers(
            "Bob", "bob@test.com", "1991-02-02",
            "2345-6789-0123-4567", "11/29", "Mastercard", "456", "Driver", trip2
        );

        RegisteredUsers user3 = new RegisteredUsers(
            "Charlie", "charlie@test.com", "1992-03-03",
            "3456-7890-1234-5678", "10/30", "Amex", "789", "Admin", trip3
        );

        ArrayList<RegisteredUsers> userList = new ArrayList<>();

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        System.out.println("All registered users:");
        System.out.println("==============================");
        for (int i = 0; i < userList.size(); i++) {
            userList.get(i).printUserInfo();
        }

        System.out.println("After removing user2:");
        System.out.println("==============================");
        userList.remove(1);
        for (RegisteredUsers user : userList) {
            user.printUserInfo();
        }

        System.out.println("Total users now: " + userList.size());
    }
}
