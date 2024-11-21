# 🌿 **Feather Quest: Batangas Bird Watching App** 🌿  

## **Project Overview** 🚀  
**Feather Quest** is a Java-based console application designed to enhance the experience of birdwatching enthusiasts, particularly in Batangas, Philippines. The app provides users with a platform to log and track their bird sightings, learn about various bird species, and participate in a ranking system based on the number of sightings. It features an extensive database containing detailed information on over 50 bird species found across the Philippines, including endemic, rare, and common birds.  

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

java
Copy code
// Base class: Bird

## 
