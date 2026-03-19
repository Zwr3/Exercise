package Exercise6;

class UserRegistration {
    private String username;
    private String password;
    private String email;
    private int age;
    private boolean isRegistered;

    public UserRegistration() {
        this.isRegistered = false;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void registration() {
        if (username != null && password != null && email != null && age > 0) {
            this.isRegistered = true;
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed: incomplete information.");
        }
    }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isRegistered=" + isRegistered +
                '}';
    }
}
