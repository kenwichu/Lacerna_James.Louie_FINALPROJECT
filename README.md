# 🌿 **Feather Quest: Batangas Bird Watching App** 🌿  

## **Project Overview** 🚀  
**Feather Quest** is a Java-based console application designed to enhance the experience of birdwatching enthusiasts, particularly in Batangas, Philippines. The app provides users with a platform to log and track their bird sightings, learn about various bird species, and participate in a ranking system based on the number of sightings. It features an extensive database containing detailed information on **over 50 bird species** found across the Philippines, including endemic, rare, and common birds.  

The primary aim of **Feather Quest** is to make birdwatching more accessible and engaging while also promoting conservation efforts. By using the app, users can gain valuable insights into the birds of the Philippines and understand the importance of protecting local wildlife. The app also fosters a sense of community by encouraging users to log sightings, compare progress through rankings, and motivate others to explore the rich birdlife of the region.

In addition to its educational component, the app introduces a competitive element through a ranking system that rewards users for logging sightings. As users progress, they unlock higher ranks, from "No Rank" to "Phoenix," which encourages active participation. Furthermore, the app raises awareness of bird conservation, emphasizing the protection of endemic and rare species and supporting the goals of sustainable land use and biodiversity conservation.  

Through **Feather Quest**, birdwatching becomes not just a personal hobby but a tool for learning, community engagement, and contributing to environmental conservation efforts.  

## **How OOP Principles Were Applied** 🔄  

### 1. **Encapsulation** 🔒  
Encapsulation is implemented by organizing bird data and behavior into private fields within the `Bird` class and using public getter and setter methods to control access to these fields. This ensures the program's data is securely managed and protected from direct manipulation.

Example of Encapsulation:
```java
// Bird class with encapsulated fields
public class Bird {
    private String name;
    private String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
```

## 2. **Inheritance** 🔄
The program demonstrates inheritance through a hierarchy of bird species. For instance, different types of birds (like EndemicBird, CommonBird, RareBird) inherit from a base class Bird. This allows for code reuse, where common properties like name, color, and size are defined in the parent class, and specialized behaviors can be added in the subclasses.

Example of Inheritance:
```java
// Base class: Bird
public class Bird {
    private String name;
    private String color;
    private String size;

    // Constructor
    public Bird(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void displayInfo() {
        System.out.println("Bird Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
    }
}

// Subclass: EndemicBird (inherits from Bird)
public class EndemicBird extends Bird {
    private String endemicRegion;

    public EndemicBird(String name, String color, String size, String endemicRegion) {
        super(name, color, size);  // Call the parent class constructor
        this.endemicRegion = endemicRegion;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // Call the parent class method
        System.out.println("Endemic Region: " + endemicRegion);
    }
}
```

## 3. **Polymorphism** 🔄
The program demonstrates polymorphism through method overloading and overriding. This allows the same method name to behave differently depending on the context or the object calling it.

Example of Polymorphism:
```java
// Method Overloading Example: logSighting
public void logSighting(String birdName) {
    System.out.println("Sighting logged: " + birdName);
}

public void logSighting(String birdName, String location) {
    System.out.println("Sighting logged: " + birdName + " at " + location);
}
```

## 4. **Abstraction** 🔍
The program demonstrates abstraction by using abstract classes or interfaces to hide the complex details of bird behavior, exposing only essential operations to the user.

Example of Abstraction:
```java
// Abstract class: Bird
public abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    // Abstract method: To be implemented by subclasses
    public abstract void makeSound();

    // Common method
    public void displayInfo() {
        System.out.println("Bird Name: " + name);
    }
}

// Subclass: Sparrow
public class Sparrow extends Bird {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp!");
    }
}
```

## **Chosen SDG and Its Integration** 🌍
This project integrates **SDG 15: Life on Land**, which aims to protect, restore, and promote the sustainable use of terrestrial ecosystems. The app raises awareness of bird species in the Philippines, including endemic and rare species that are important to the local ecosystem. By providing a platform for users to track their bird sightings and learn about local species, the app supports conservation efforts and encourages biodiversity protection.

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
2. **Navigate to the Project Directory:
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
## **Files and Storage** 📂
- User data and bird sightings are stored locally in text files named <username>_sightings.txt.
- Each sighting includes the bird’s name, location, date, and time.
- The file format for each sighting is as follows:
   ```plaintext
Bird Name: Philippine Duck
Location: Taal Lake
Date: 2024-11-21
Time: 08:45 AM
   ```
