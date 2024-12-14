package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import model.AdminBirdWatcher;
import model.Bird;
import model.BirdWatcher;


public class BirdWatchingApp {
    private static Map<String, BirdWatcher> users = new HashMap<>();
    private static Map<String, Bird>  birdDatabase = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        birdDatabase.put("mallard", new Bird("Mallard", "Green head (male), brownish (female)", "Medium, about 50 to 65 cm", "Common globally"));
        birdDatabase.put("common raven", new Bird("Common Raven", "Black, large size", "Large, 55 to 69 cm", "Common"));
        birdDatabase.put("wandering whistling duck", new Bird("Wandering Whistling Duck", "Brown with lighter underparts", "Medium, about 40 to 50 cm", "Common in wetlands"));
        birdDatabase.put("common pochard", new Bird("Common Pochard", "Rusty red head, black breast, gray body", "Medium, around 42 to 49 cm", "Uncommon in Asia"));
        birdDatabase.put("tufted duck", new Bird("Tufted Duck", "Black with white flanks, yellow eyes", "Medium, about 40 to 47 cm", "Common"));
        birdDatabase.put("northern shoveler", new Bird("Northern Shoveler", "Green head, white chest, brown sides", "Medium, around 45 to 50 cm", "Common"));
        birdDatabase.put("philippine duck", new Bird("Philippine Duck", "Brownish with a gray head and bluish wing patch", "Medium, 48 to 58 cm", "Endangered, native to the Philippines"));
        birdDatabase.put("northern pintail", new Bird("Northern Pintail", "Gray body, white underparts, long tail", "Large, around 50 to 65 cm", "Common"));
        birdDatabase.put("asian pygmy goose", new Bird("Asian Pygmy Goose", "Greenish body, white face, dark wings", "Small, around 27 to 30 cm", "Uncommon"));
        birdDatabase.put("philippine megapode", new Bird("Philippine Megapode", "Blackish-brown", "Medium, 30 to 35 cm", "Vulnerable, restricted to the Philippines"));
        birdDatabase.put("blue-breasted quail", new Bird("Blue-breasted Quail", "Blue breast with brown body", "Small, around 16 to 18 cm", "Uncommon"));
        birdDatabase.put("red junglefowl", new Bird("Red Junglefowl", "Red, orange, and black with metallic sheen (males)", "Medium, 43 to 78 cm", "Common, ancestor of domestic chickens"));
        birdDatabase.put("daurian partridge", new Bird("Daurian Partridge", "Gray with brown and rufous patches", "Medium, about 28 to 32 cm", "Uncommon"));
        birdDatabase.put("little grebe", new Bird("Little Grebe", "Brown and chestnut with a blackish neck", "Small, around 25 to 29 cm", "Common in freshwater habitats"));
        birdDatabase.put("rock dove", new Bird("Rock Dove (Common Pigeon)", "Gray with iridescent neck", "Medium, 29 to 37 cm", "Very common globally"));
        birdDatabase.put("white-throated pigeon", new Bird("White-throated Pigeon", "Greenish body with white throat", "Medium, around 33 to 36 cm", "Uncommon in forested areas"));
        birdDatabase.put("island collared dove", new Bird("Island Collared Dove", "Grayish with a white collar", "Medium, 30 to 34 cm", "Fairly common in Southeast Asia"));
        birdDatabase.put("red collared dove", new Bird("Red Collared Dove", "Reddish with a black collar", "Medium, around 20 to 25 cm", "Common in Asia"));
        birdDatabase.put("spotted-necked dove", new Bird("Spotted-necked Dove", "Gray with spotted neck patches", "Medium, about 28 to 32 cm", "Common in open woodlands"));
        birdDatabase.put("philippine cuckoo dove", new Bird("Philippine Cuckoo Dove", "Reddish-brown with iridescent green", "Medium, around 27 to 33 cm", "Fairly common in the Philippines"));
        birdDatabase.put("zebra dove", new Bird("Zebra Dove", "Grayish-brown with zebra-like markings", "Small, around 20 to 23 cm", "Common in Southeast Asia"));
        birdDatabase.put("luzon bleeding-heart", new Bird("Luzon Bleeding-heart", "Gray with red 'blood spot' on chest", "Medium, around 25 to 29 cm", "Endangered, native to the Philippines"));
        birdDatabase.put("pink-necked green pigeon", new Bird("Pink-necked Green Pigeon", "Green with pinkish neck (male)", "Medium, around 26 to 30 cm", "Common in Southeast Asia"));
        birdDatabase.put("pompadour green pigeon", new Bird("Pompadour Green Pigeon", "Green body with maroon back", "Medium, 28 to 30 cm", "Fairly common in tropical forests"));
        birdDatabase.put("emerald dove", new Bird("Emerald Dove", "Bright green wings, reddish-brown body", "Medium, around 23 to 28 cm", "Common in forests of Southeast Asia"));
        birdDatabase.put("white-eared brown dove", new Bird("White-eared Brown Dove", "Brown with a white ear patch", "Medium, about 25 to 30 cm", "Common in the Philippines"));
        birdDatabase.put("amethyst brown dove", new Bird("Amethyst Brown Dove", "Brown with a purplish sheen", "Medium, around 28 to 33 cm", "Endemic to the Philippines, uncommon"));
        birdDatabase.put("pink-bellied imperial pigeon", new Bird("Pink-bellied Imperial Pigeon", "Greenish body with pinkish belly", "Large, around 42 to 48 cm", "Rare, forest habitats in the Philippines"));
        birdDatabase.put("spotted imperial pigeon", new Bird("Spotted Imperial Pigeon", "White with black spots on wings", "Large, around 40 to 45 cm", "Uncommon in tropical forests"));
        birdDatabase.put("green imperial pigeon", new Bird("Green Imperial Pigeon", "Greenish-gray body", "Large, around 40 to 45 cm", "Common in Southeast Asia"));
        birdDatabase.put("pied imperial pigeon", new Bird("Pied Imperial Pigeon", "White with black on wings and tail", "Large, around 37 to 44 cm", "Common in coastal regions"));
        birdDatabase.put("flame-breasted fruit dove", new Bird("Flame-breasted Fruit Dove", "Bright orange breast, green body", "Medium, about 27 to 29 cm", "Rare, found in the Philippines"));
        birdDatabase.put("cream-bellied fruit dove", new Bird("Cream-bellied Fruit Dove", "Creamy belly, green body", "Medium, around 29 to 31 cm", "Rare in tropical forests"));
        birdDatabase.put("yellow-breasted fruit dove", new Bird("Yellow-breasted Fruit Dove", "Yellow breast, green body", "Medium, around 23 to 26 cm", "Uncommon in Southeast Asia"));
        birdDatabase.put("black-chinned fruit dove", new Bird("Black-chinned Fruit Dove", "Green body, black chin", "Medium, about 22 to 25 cm", "Rare, island species"));
        birdDatabase.put("red-tailed tropicbird", new Bird("Red-tailed Tropicbird", "White with red tail feathers", "Medium-large, about 90 to 105 cm wingspan", "Rare"));
        birdDatabase.put("philippine frogmouth", new Bird("Philippine Frogmouth", "Brown with mottled pattern, large mouth", "Medium, around 25 to 30 cm", "Rare, endemic to the Philippines"));
        birdDatabase.put("great eared nightjar", new Bird("Great Eared Nightjar", "Dark brown with ear tufts", "Large, about 31 to 38 cm", "Common in forests"));
        birdDatabase.put("grey nightjar", new Bird("Grey Nightjar", "Grayish with streaked pattern", "Medium, around 24 to 28 cm", "Fairly common in Asia"));
        birdDatabase.put("philippine nightjar", new Bird("Philippine Nightjar", "Brown and gray with intricate patterns", "Medium, around 24 to 27 cm", "Endemic and uncommon in the Philippines"));
        birdDatabase.put("savanna nightjar", new Bird("Savanna Nightjar", "Brown with barred patterns", "Small-medium, 22 to 26 cm", "Common in grasslands"));
        birdDatabase.put("whiskered treeswift", new Bird("Whiskered Treeswift", "Dark blue with white whiskers", "Small, around 16 to 18 cm", "Uncommon in forests"));
        birdDatabase.put("purple needletail", new Bird("Purple Needletail", "Dark purplish-black with glossy sheen", "Medium, 18 to 20 cm", "Rare, fast flyer"));
        birdDatabase.put("pygmy swiftlet", new Bird("Pygmy Swiftlet", "Brownish-gray", "Very small, around 9 to 10 cm", "Common in caves and forests"));
        birdDatabase.put("glossy swiftlet", new Bird("Glossy Swiftlet", "Shiny black-blue", "Small, around 10 to 11 cm", "Common in Southeast Asia"));
        birdDatabase.put("ameline swiftlet", new Bird("Ameline Swiftlet", "Dull brownish-gray", "Small, around 9 to 10 cm", "Uncommon"));
        birdDatabase.put("philippine swiftlet", new Bird("Philippine Swiftlet", "Brownish-gray", "Small, around 10 to 11 cm", "Endemic to the Philippines, fairly common"));
        birdDatabase.put("asian palm swift", new Bird("Asian Palm Swift", "Light brown", "Small, about 12 to 13 cm", "Common near palms"));
        birdDatabase.put("fork-tailed swift", new Bird("Fork-tailed Swift", "Blackish with a white rump", "Medium, 16 to 18 cm", "Common"));
        birdDatabase.put("house swift", new Bird("House Swift", "Blackish with a white throat", "Small, around 13 to 14 cm", "Common in urban areas"));
        birdDatabase.put("rufous coucal", new Bird("Rufous Coucal", "Reddish-brown", "Medium-large, around 40 to 45 cm", "Uncommon in Southeast Asia"));
        birdDatabase.put("philippine coucal", new Bird("Philippine Coucal", "Brown with black head and body", "Large, about 41 to 46 cm", "Endemic, common in the Philippines"));
        birdDatabase.put("lesser coucal", new Bird("Lesser Coucal", "Black with brown wings", "Medium, around 35 to 38 cm", "Fairly common in grasslands"));
        birdDatabase.put("rough-crested malkoha", new Bird("Rough-crested Malkoha", "Green with red eye patch", "Medium, around 36 to 38 cm", "Rare, forest habitat"));
        birdDatabase.put("scale-feathered malkoha", new Bird("Scale-feathered Malkoha", "Gray with scaled feather pattern", "Medium, around 39 to 41 cm", "Rare, endemic to the Philippines"));
        birdDatabase.put("chestnut-winged cuckoo", new Bird("Chestnut-winged Cuckoo", "Chestnut wings, black and white head", "Medium, around 42 to 44 cm", "Uncommon"));
        birdDatabase.put("common koel", new Bird("Common Koel", "Black (male), brown spotted (female)", "Medium-large, about 39 to 46 cm", "Common"));
        birdDatabase.put("violet cuckoo", new Bird("Violet Cuckoo", "Iridescent violet body, white belly", "Small, around 18 to 20 cm", "Uncommon"));
        birdDatabase.put("plaintive cuckoo", new Bird("Plaintive Cuckoo", "Gray with rufous underparts", "Small, about 22 to 24 cm", "Fairly common"));
        birdDatabase.put("rusty-breasted cuckoo", new Bird("Rusty-breasted Cuckoo", "Brownish-gray with rusty breast", "Small, around 21 to 23 cm", "Uncommon"));
        birdDatabase.put("drongo cuckoo", new Bird("Drongo Cuckoo", "Black with iridescent blue", "Medium, about 24 to 26 cm", "Uncommon in forests"));
    
        AdminBirdWatcher admin = new AdminBirdWatcher("admin", "glindathegood", users);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n=================================================================");
            System.out.println("|                   *WELCOME TO FEATHER QUEST*                  |");
            System.out.println("=================================================================");
            System.out.println("|                            3) Admin Login                     |");
            System.out.println("|                            4) User Login                      |");
            System.out.println("|                            5) Sign Up                         |");
            System.out.println("|                            6) Exit                            |");
            System.out.println("=================================================================");
            System.out.print("Choose an option: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 3:
                        adminLogin(admin);
                        break;
                    case 4:
                        userLogin();
                        break;
                    case 5:
                        signUp();
                        break;
                    case 6:
                        isRunning = false;
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please choose another.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private static void adminLogin(AdminBirdWatcher admin) {
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();

        if (admin.validatePassword(password)) {
            System.out.println("Welcome, Admin!");
            adminMenu(admin);
        } else {
            System.out.println("Incorrect password.");
        }
    }

    private static void userLogin() {
        System.out.print("Username: ");
        String username = scanner.nextLine();

        BirdWatcher watcher = users.get(username);
        if (watcher == null) {
            System.out.println("User not found. Please sign up.");
            return;
        }

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (watcher.validatePassword(password)) {
            System.out.println("Welcome back, " + username + "!");
            userSession(watcher);
        } else {
            System.out.println("Incorrect password.");
        }
    }

    private static void signUp() {
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Username already exists.");
            return;
        }

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        users.put(username, new BirdWatcher(username, password));
        System.out.println("Sign-up successful!");
    }

    private static void userSession(BirdWatcher watcher) {
        boolean isLoggedIn = true;
        while (isLoggedIn) {
            System.out.println("\n=================================================================");
            System.out.println("|                      USER MENU - Feather Quest                |");
            System.out.println("=================================================================");
            System.out.println("|                      3) Log Sighting                          |");
            System.out.println("|                      4) View Sightings                        |");
            System.out.println("|                      5) View Other Users' Ranks               |");
            System.out.println("|                      6) Logout                                |");
            System.out.println("=================================================================");
            System.out.print("Choose an option: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 3:
                        System.out.print("Enter bird name: ");
                        String birdName = scanner.nextLine();
                        System.out.print("Enter location of sighting: ");
                        String location = scanner.nextLine();
                        watcher.logSighting(birdName, location, scanner);
                        System.out.println("Your current rank: " + watcher.getRank());
                        pauseToContinue();
                        break;
                    case 4:
                        watcher.viewSightings();
                        pauseToContinue();
                        break;
                    case 5:
                        viewOtherUsersRanks();
                        pauseToContinue();
                        break;
                    case 6:
                        System.out.println("Logging out...");
                        isLoggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please choose another.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private static void viewOtherUsersRanks() {
        System.out.println("=================================================================");
        System.out.println("|                   OTHER USERS' RANKS                          |");
        System.out.println("=================================================================");

        boolean hasUsers = false; // Initialize the flag to track non-admin users
        for (BirdWatcher watcher : users.values()) {
            if (!(watcher instanceof AdminBirdWatcher)) { // Skip admin users
                System.out.println("User: " + watcher.getUsername() + " | Rank: " + watcher.getRank() + " | Sightings: " + watcher.getSightingsCount());
                hasUsers = true; // Set flag to true if a user is found
            }
        }

        if (!hasUsers) {
            System.out.println("No users found.");
        }
    }

    private static void pauseToContinue() {
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    private static void adminMenu(AdminBirdWatcher admin) {
        boolean isAdminLoggedIn = true;
        while (isAdminLoggedIn) {
            System.out.println("\n=================================================================");
            System.out.println("|                      ADMIN MENU - Feather Quest               |");
            System.out.println("=================================================================");
            System.out.println("|                      3) View All Users                        |");
            System.out.println("|                      4) Delete User                           |");
            System.out.println("|                      5) Add  Bird to Database                 |");
            System.out.println("|                      6) Delete Bird from Database             |");
            System.out.println("|                      7) View User Ranks                       |");
            System.out.println("|                      8) Log Out                               |");
            System.out.println("=================================================================");
            System.out.print("Choose an option: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 3:
                        System.out.println("=================================================================");
                        System.out.println("|                        ALL USERS                              |");
                        System.out.println("=================================================================");
                        if (users.size() == 0) {
                            System.out.println("No users found.");
                        } else {
                            for (BirdWatcher watcher : users.values()) {
                                if (!(watcher instanceof AdminBirdWatcher)) {
                                    System.out.println("Username: " + watcher.getUsername());
                                }
                            }
                        }
                        break;
                    case 4:
                        if (users.size() == 0) {
                            System.out.println("No users available to delete.");
                        } else {
                            System.out.print("Enter username to delete: ");
                            String username = scanner.nextLine();
                            admin.deleteUser(username);
                        }
                        break;
                    case 5:
                        admin.addBird();
                        break;
                    case 6:
                        admin.deleteBird();
                        break;
                    case 7:
                        viewOtherUsersRanks();
                        break;
                    case 8:
                        System.out.println("Logging out...");
                        isAdminLoggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}

