package model;

import java.util.Map;
import java.util.Scanner;

public class AdminBirdWatcher extends BirdWatcher {

    private Map<String, BirdWatcher> users; // A reference to the users map for managing users
    private Map<String, Bird> birdDatabase;

    // Constructor for the AdminBirdWatcher class
    public AdminBirdWatcher(String username, String password, Map<String, BirdWatcher> users) {
        super(username, password);
        this.users = users;
        this.birdDatabase = birdDatabase;
    }

    // Admin does not have a rank, so this method overrides the rank behavior
    @Override
    public String getRank() {
        return "Admin"; // Admin will simply return "Admin" instead of a rank number
    }

    // Method to view all users
    public void viewAllUsers() {
        System.out.println("\n=================================================================");
        System.out.println("|                       All Users - Feather Quest              |");
        System.out.println("=================================================================");
        for (BirdWatcher watcher : users.values()) {
            System.out.println("Username: " + watcher.getUsername() + " | Rank: " + watcher.getRank() + " | Sightings: " + watcher.getSightingsCount());
        }
    }

    // Method to delete a user
    public void deleteUser(String username) {
        if (users.containsKey(username)) {
            users.remove(username);
            System.out.println("User " + username + " has been deleted.");
        } else {
            System.out.println("User not found.");
        }
    }

    public void addBird() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter bird name: ");
        String birdName = scanner.nextLine().toLowerCase();

        // Check if the bird already exists
        if (getBirdDatabase().containsKey(birdName)) {
            System.out.println("This bird already exists in the database.");
            return;
        }

        System.out.print("Enter bird color: ");
        String color = scanner.nextLine();

        System.out.print("Enter bird size: ");
        String size = scanner.nextLine();

        System.out.print("Enter bird rarity: ");
        String rarity = scanner.nextLine();

        // Add the new bird to the database
        Bird newBird = new Bird(birdName, color, size, rarity);
        getBirdDatabase().put(birdName, newBird);
        System.out.println("Bird added successfully!");
    }

    // Delete a bird from the shared bird database
    public void deleteBird() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter bird name to delete: ");
        String birdName = scanner.nextLine().toLowerCase();

        // Check if the bird exists
        if (!getBirdDatabase().containsKey(birdName)) {
            System.out.println("This bird does not exist in the database.");
            return;
        }

        // Remove the bird from the database
        getBirdDatabase().remove(birdName);
        System.out.println("Bird deleted successfully!");
    }
}
