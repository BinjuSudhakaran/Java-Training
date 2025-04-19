package javapgmpkg;

import java.util.Optional;

public class OptionalExample {

    // A method that returns an Optional
    public static Optional<String> getName(boolean returnName) {
        if (returnName) {
            return Optional.of("Alice");
        } else {
            return Optional.empty(); // No value
        }
    }

    public static void main(String[] args) {
        Optional<String> optionalName = getName(true); // Try with false too

        // Check if value is present
        if (optionalName.isPresent()) {
            System.out.println("Name is: " + optionalName.get());
        } else {
            System.out.println("Name not found.");
        }

        // OR use ifPresent() for a cleaner way
        optionalName.ifPresent(name -> System.out.println("Hello, " + name));

        // OR use orElse()
        String finalName = optionalName.orElse("Default Name");
        System.out.println("Final Name: " + finalName);
    }
}
