package Exercise6;
class Main {
    public static void main(String[] args) {
        UserRegistration userReg = new UserRegistration();
        userReg.setUsername("testUser");
        userReg.setPassword("securePass123");
        userReg.setEmail("test@example.com");
        userReg.setAge(20);
        userReg.registration();
        System.out.println(userReg);
    }
}