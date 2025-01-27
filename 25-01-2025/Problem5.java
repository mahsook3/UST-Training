public abstract class User {
    public abstract void displayRole();
}

class Admin extends User {
    @Override
    public void displayRole() {
        System.out.println("Role: Admin");
    }
}

class RegularUser extends User {
    @Override
    public void displayRole() {
        System.out.println("Role: Regular User");
    }
}

public class Problem5 {
    public static void main(String[] args) {
        User admin = new Admin();
        User regularUser = new RegularUser();

        admin.displayRole();
        regularUser.displayRole();
    }
}