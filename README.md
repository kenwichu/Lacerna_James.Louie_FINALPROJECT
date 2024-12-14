# 🌿 **Feather Quest: Local Bird Watching App** 🌿  

## **Project Overview** 🚀  
**Feather Quest** is a Java-based console application designed to enhance the experience of birdwatching enthusiasts, particularly in Batangas, Philippines. The app provides users with a platform to log and track their bird sightings, learn about various bird species, and participate in a ranking system based on the number of sightings. It features an extensive database containing detailed information on **over 50 bird species** found across the Philippines, including endemic, rare, and common birds.  

The app is designed with two types of users in mind: regular users and administrators. Regular users can log bird sightings, view their personal progress, and climb ranks through their contributions. Administrators, on the other hand, have the ability to manage the bird database by adding or removing species. This ensures that the bird data remains accurate, relevant, and up-to-date, while also allowing for the expansion of the database as new species are observed or recorded.  

The primary aim of **Feather Quest** is to make birdwatching more accessible and engaging while also promoting conservation efforts. By using the app, users can gain valuable insights into the birds of the Philippines and understand the importance of protecting local wildlife. The app fosters a sense of community by encouraging users to log sightings, compare progress through rankings, and motivate others to explore the rich birdlife of the region.  

In addition to its educational component, the app introduces a competitive element through a ranking system that rewards users for logging sightings. As users progress, they unlock higher ranks, from "No Rank" to "Phoenix," encouraging active participation. The integration of admin functionality ensures that the bird database is curated effectively, providing a robust foundation for the community.  

Through **Feather Quest**, birdwatching becomes not just a personal hobby but a tool for learning, community engagement, and contributing to environmental conservation efforts.  

---

## **How OOP Principles Were Applied** 🔄  

### 1. **Encapsulation** 🔒  
Encapsulation is implemented by organizing bird data and behavior into private fields within the `Bird` class and using public getter and setter methods to control access to these fields. This ensures the program's data is securely managed and protected from direct manipulation.  

Example of Encapsulation:  
```java
// Bird class with encapsulated fields
public class Bird {
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
}
```  

---

### 2. **Inheritance** 🔄  
The program demonstrates inheritance through the hierarchy of users. The `AdminBirdWatcher` class inherits from the `BirdWatcher` class. This allows the reuse of common functionalities while providing additional privileges to admins, such as adding or deleting bird species.  

Example of Inheritance:  
```java
// Base class: BirdWatcher
public class BirdWatcher {
    private String username;
    private String password;

    public BirdWatcher(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean validatePassword(String inputPassword) {
        return password.equals(inputPassword);
    }
}

// Subclass: AdminBirdWatcher (inherits from BirdWatcher)
public class AdminBirdWatcher extends BirdWatcher {
    public AdminBirdWatcher(String username, String password) {
        super(username, password);
    }

    public void addBird(BirdDatabase birdDatabase, String name, String color, String size, String rarity) {
        birdDatabase.addBird(new Bird(name, color, size, rarity));
    }

    public void deleteBird(BirdDatabase birdDatabase, String name) {
        birdDatabase.deleteBird(name);
    }
}
```  

---

### 3. **Polymorphism** 🔄  
The program demonstrates polymorphism through method overriding. The `AdminBirdWatcher` class extends the functionality of `BirdWatcher` by providing admin-specific methods, such as `addBird()` and `deleteBird()`.  

---

### 4. **Abstraction** 🔍  
Abstraction is achieved by using high-level interfaces and abstract classes to hide implementation details while exposing only the essential functionalities. For example, users interact with simplified methods like `logSighting()` or `addBird()` without dealing with the complexities of how data is stored or processed.  

---

## **Admin Features** 👩‍💻  
From its inception, the app was designed to empower administrators with the following capabilities:  

1. **Adding Birds:**  
   - Admins can add new birds to the database by specifying the bird's name, color, size, and rarity.  
   - This feature ensures the database remains comprehensive and informative for all users.  

2. **Deleting Birds:**  
   - Admins can remove birds from the database to maintain accuracy and relevance.  
   - This is useful for correcting errors or removing outdated entries.  

These features ensure that the bird database remains a reliable resource for the community of birdwatchers.  

---

## **Chosen SDG and Its Integration** 🌍  
This project integrates **SDG 15: Life on Land**, which aims to protect, restore, and promote the sustainable use of terrestrial ecosystems. The app raises awareness of bird species in the Philippines, including endemic and rare species that are important to the local ecosystem. By providing a platform for users to track their bird sightings and learn about local species, the app supports conservation efforts and encourages biodiversity protection.  

---

## **Instructions for Running the Program** 🛠️  

### **Prerequisites**  
Before running the program, ensure you have the following installed:  

- **Java Runtime Environment (JRE)**: Version 8 or higher.  
- A compatible IDE or text editor for editing and running Java programs, such as:  
  - IntelliJ IDEA  
  - Eclipse  
  - Visual Studio Code (with Java extensions)  

### **Steps to Run**  

1. **Clone the Repository:**  
   Start by cloning the repository to your local machine:  
   ```bash
   git clone https://github.com/yourusername/feather-quest.git
   ```  

2. **Navigate to the Project Directory:**  
    ```bash
    cd feather-quest
    ```  

3. **Compile the Code:**  
Use the following command to compile the Java files:  
   ```bash
   javac BirdWatchingApp.java
   ```  

4. **Run the Program:**  
Once the code is compiled, you can run the program with:  
   ```bash
   java BirdWatchingApp
   ```  

---

## **Files and Storage** 📂  
- **User Data:** Stored locally in text files named `<username>_sightings.txt`.  
- **Bird Database:** Managed in-memory for simplicity, with the ability to add or delete species during runtime.  
- **Sighting Format:**  
   ```plaintext
   Bird Name: Philippine Duck  
   Location: Taal Lake  
   Date: 2024-12-12  
   Time: 09:15 AM  
   ```  

--- 
