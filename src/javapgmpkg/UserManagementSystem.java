package javapgmpkg;
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserManagementSystem {

    private static Map<String, User> userDatabase = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeDatabase();

        while (true) {
            System.out.println("\nUser Management System");
            System.out.println("1. Find user by ID");
            System.out.println("2. Update user email");
            System.out.println("3. Print all users");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    findUserById();
                    break;
                case 2:
                    updateUserEmail();
                    break;
                case 3:
                    printAllUsers();
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeDatabase() {
        userDatabase.put("U001", new User("U001", "anu@example.com", "Anu", 28));
        userDatabase.put("U002", new User("U002", null, "Bob", 35)); // User with no email
        userDatabase.put("U003", new User("U003", "ann@example.com", "Ann", 22));
    }

    private static void findUserById() {
        System.out.print("\nEnter user ID: ");
        String userId = scanner.nextLine();

      
        Optional<User> userOptional = Optional.ofNullable(userDatabase.get(userId));

        userOptional.ifPresentOrElse(
            user -> {
                System.out.println("\nUser found:");
                System.out.println("ID: " + user.getId());
                System.out.println("Name: " + user.getName());
                System.out.println("Age: " + user.getAge());
                
                String emailDisplay = user.getEmail()
                    .map(email -> "Email: " + email)
                    .orElse("Email: Not provided");
                
                System.out.println(emailDisplay);
            },
            () -> System.out.println("User with ID " + userId + " not found.")
        );
    }

    private static void updateUserEmail() {
        System.out.print("\nEnter user ID: ");
        String userId = scanner.nextLine();

        Optional<User> userOptional = Optional.ofNullable(userDatabase.get(userId));

        userOptional.ifPresentOrElse(
            user -> {
                System.out.print("Enter new email (leave blank to remove): ");
                String newEmail = scanner.nextLine().trim();
                
                // Update email if not blank, otherwise set to null
                user.setEmail(newEmail.isEmpty() ? null : newEmail);
                
                System.out.println("Email updated successfully.");
                System.out.println("Updated user details:");
                System.out.println(user);
            },
            () -> System.out.println("Cannot update: User with ID " + userId + " not found.")
        );
    }

    private static void printAllUsers() {
        System.out.println("\nAll Users in Database:");
        if (userDatabase.isEmpty()) {
            System.out.println("No users found.");
            return;
        }

        userDatabase.forEach((id, user) -> {
            System.out.println("\nUser ID: " + id);
            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());
            
            // Using Optional for email display
            String emailInfo = user.getEmail()
                .map(email -> "Email: " + email)
                .orElse("Email: Not provided");
            
            System.out.println(emailInfo);
        });
    }
}

class User {
    private String id;
    private String email;
    private String name;
    private int age;

    public User(String id, String email, String name, int age) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.age = age;
    }

    // Returns Optional<String> to explicitly indicate email might be absent
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Standard getters
    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return String.format(
            "User[id=%s, name=%s, age=%d, email=%s]",
            id, name, age, email != null ? email : "Not provided"
        );
    }
}