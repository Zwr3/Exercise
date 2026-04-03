package Excercise11;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<RegisteredUsers> registeredUsersList = new ArrayList<>();

    public RegisteredUsers addNewUser(String fullName, String emailAddress, String userType) {
        RegisteredUsers newUser;

        if (userType.equalsIgnoreCase("VIP")) {
            newUser = new VIPUser(fullName, emailAddress);
        } else {
            newUser = new RegularUser(fullName, emailAddress);
        }

        registeredUsersList.add(newUser);
        return newUser;
    }
}