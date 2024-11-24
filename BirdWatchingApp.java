import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bird {
    private String name;
    private String color;
    private String size;
    private String rarity;

    public Bird(String name, String color, String size, String rarity) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getRarity() {
        return rarity;
    }

    @Override
    public String toString() {
        return "Bird: " + name + ", Color: " + color + ", Size: " + size + ", Rarity: " + rarity;
    }
}

class BirdWatcher {
    private String username;
    private String password;
    private Map<String, Bird> birdDatabase;
    private int sightingsCount;

    public BirdWatcher(String username, String password) {
        this.username = username;
        this.password = password;
        this.birdDatabase = new HashMap<>();
        this.sightingsCount = 0;
        initializeBirdDatabase();
    }

    private void initializeBirdDatabase() {
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
    }
    

    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    public void logSighting(String birdName, String location) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedTime = dateTime.format(timeFormatter);
        String formattedDate = dateTime.format(dateFormatter);

        birdName = birdName.toLowerCase();
        Bird bird = birdDatabase.get(birdName);
        Scanner scanner = new Scanner(System.in);

        if (bird == null) {
            System.out.println("Bird not found in the database. Please enter details:");
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Size: ");
            String size = scanner.nextLine();
            System.out.print("Rarity: ");
            String rarity = scanner.nextLine();
            bird = new Bird(birdName, color, size, rarity);
            birdDatabase.put(birdName, bird);
        }

        String record = "Bird: " + bird.getName() + ", Location: " + location + ", Date: " + formattedDate + ", Time: " + formattedTime;
        System.out.println("Sighting logged successfully.");

        // Print out bird details after logging
        System.out.println("Bird Details:");
        System.out.println("Name: " + bird.getName());
        System.out.println("Color: " + bird.getColor());
        System.out.println("Size: " + bird.getSize());
        System.out.println("Rarity: " + bird.getRarity());

        saveSightingToFile(record);
        sightingsCount++;
    }

    private void saveSightingToFile(String record) {
        try (FileWriter fw = new FileWriter(username + "_sightings.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(record);
            System.out.println("Sighting saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving sighting to file: " + e.getMessage());
        }
    }

    public void viewSightings() {
        File file = new File(username + "_sightings.txt");
        if (!file.exists()) {
            System.out.println("No sightings recorded.");
            return;
        }

        System.out.println("Your Sightings:");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            boolean hasSightings = false;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                hasSightings = true;
            }
            if (!hasSightings) {
                System.out.println("No sightings recorded.");
            }
        } catch (IOException e) {
            System.out.println("Error reading sighting file: " + e.getMessage());
        }
    }

    public void logout() {
        System.out.println("You have logged out. See you again soon!");
    }

    public String getRank() {
        if (sightingsCount >= 81) {
            return "Phoenix";
        } else if (sightingsCount >= 51) {
            return "Swan V";
        } else if (sightingsCount >= 26) {
            return "Robin IV";
        } else if (sightingsCount >= 11) {
            return "Heron III";
        } else if (sightingsCount >= 6) {
            return "Duck II";
        } else if (sightingsCount >= 1) {
            return "Sparrow I";
        } else {
            return "No Rank";
        }
    }

    public int getSightingsCount() {
        return sightingsCount;
    }

    public String getUsername() {
        return username;
    }
}

public class BirdWatchingApp {
    private static Map<String, BirdWatcher> users = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n=================================================================");
            System.out.println("|                   *WELCOME TO FEATHER QUEST*                  |");
            System.out.println("=================================================================");
            System.out.println("|                            3) Log In                          |");
            System.out.println("|                            4) Sign Up                         |");
            System.out.println("|                            5) Exit                            |");
            System.out.println("=================================================================");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 3:
                    login();
                    break;
                case 4:
                    signUp();
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void login() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            BirdWatcher watcher = users.get(username);
            if (watcher.validatePassword(password)) {
                System.out.println("Welcome back, " + username + "!");
                System.out.println("Your current rank: " + watcher.getRank());
                userSession(watcher);
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } else {
            System.out.println("Username not found. Please sign up first.");
        }
    }

    private static void signUp() {
        System.out.print("Enter your new username: ");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {
            System.out.println("Username already exists. Please log in.");
        } else {
            System.out.print("Create a password: ");
            String password = scanner.nextLine();
            BirdWatcher newWatcher = new BirdWatcher(username, password);
            users.put(username, newWatcher);
            System.out.println("Sign-up successful! Welcome, " + username + "!");
            userSession(newWatcher);
        }
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
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 3) {
                System.out.print("Enter bird name: ");
                String birdName = scanner.nextLine();
                System.out.print("Enter location of sighting: ");
                String location = scanner.nextLine();
                watcher.logSighting(birdName, location);
                System.out.println("Your current rank: " + watcher.getRank());
                pauseToContinue();
            } else if (choice == 4) {
                watcher.viewSightings();
                pauseToContinue();
            } else if (choice == 5) {
                viewOtherUsersRanks();
                pauseToContinue();
            } else if (choice == 6) {
                watcher.logout();
                isLoggedIn = false;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void viewOtherUsersRanks() {
        System.out.println("=================================================================");
        System.out.println("|                   OTHER USERS' RANKS                          |");
        System.out.println("=================================================================");
        for (BirdWatcher watcher : users.values()) {
            System.out.println("User: " + watcher.getUsername() + " | Rank: " + watcher.getRank() + " | Sightings: " + watcher.getSightingsCount());
        }
    }

    private static void pauseToContinue() {
        System.out.println("Press Enter to return to the User Menu...");
        scanner.nextLine();
    }
}
