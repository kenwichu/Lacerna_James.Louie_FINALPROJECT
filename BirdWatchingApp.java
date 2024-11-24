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
                    watcher.logSighting(birdName, location);
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
                    watcher.logout();
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
