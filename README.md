# 🌿 **Feather Quest: Batangas Bird Watching App** 🌿  

## **Table of Contents** 📚  
1. [Project Introduction](#project-introduction)  
2. [Objectives](#objectives)  
3. [Project Description](#project-description)  
   - [Scope](#scope)  
   - [Limitations and Constraints](#limitations-and-constraints)  
   - [Features](#features)  
   - [Problem it Solves](#problem-it-solves)
4. [OOP Concepts](#oop-concepts)
5. [Bird Database Highlights](#bird-database-highlights)  
6. [Setup Instructions](#setup-instructions)  
7. [Files and Storage](#files-and-storage)  

---

## **Project Introduction** 🚀  
**Feather Quest** is a Java-based console application created for bird enthusiasts in Batangas and beyond. This app empowers users to log their bird sightings, track their progress, and engage in friendly competition through a ranking system. With a built-in database of over 50 bird species, it provides detailed information about endemic and rare birds found in the Philippines.  

---

## **Objectives** 💡  
- Create a birdwatching platform that logs sightings with ease.  
- Provide an extensive bird database to educate users.  
- Encourage active birdwatching through ranks and leaderboards.  
- Support conservation efforts by raising awareness of bird species.  

---

## **Project Description** 👾  

### **Scope**  
- Enable users to log bird sightings and access a comprehensive bird database.  
- Support user registration and authentication for a personalized experience.  
- Allow users to track progress through ranks and leaderboards.  

### **Limitations and Constraints**  
- **Database**: Data is stored in plain text files and does not persist in a database.  
- **Interface**: Command-line interface limits user experience.  
- **Multiplayer Feature**: Leaderboards compare users but do not allow real-time interaction.  

### **Features**  
#### **User Authentication**  
- Sign up and log in using unique usernames and passwords.  

#### **Bird Sighting Logging**  
- Record bird sightings with details like name, location, and time.  
- Add details for new birds (color, size, rarity) if not already in the database.  

#### **Bird Database**  
- Includes descriptions of 50+ species found in the Philippines.  
- Highlights endemic, common, and rare species.  

#### **Ranking System**  
| **Rank**         | **Sightings**   |  
|-------------------|-----------------|  
| **No Rank**       | 0 sightings     |  
| **Sparrow I**     | 1–5 sightings   |  
| **Duck II**       | 6–10 sightings  |  
| **Heron III**     | 11–25 sightings |  
| **Robin IV**      | 26–50 sightings |  
| **Swan V**        | 51–80 sightings |  
| **Phoenix**       | 81+ sightings   |  

#### **Leaderboards**  
- Compare your rank and sightings count with other users.  

### **Problem it Solves**  
Feather Quest simplifies birdwatching documentation and promotes awareness of bird species in the Philippines, encouraging conservation efforts.  

---

## **OOP Concepts** 🔄

### 1. **Encapsulation** 🔒  
Encapsulation is demonstrated in Feather Quest by organizing data within classes and providing public getter and setter methods to control access to private fields. This ensures that users can only interact with the data in specific, controlled ways, preserving the integrity of the program.

### 2. **Inheritance** 🔄  
The program demonstrates inheritance through a hierarchy of bird species. For instance, different types of birds (like EndemicBird, CommonBird, RareBird) inherit from a base class `Bird`. This allows for code reuse, where common properties like name, color, and size are defined in the parent class, and specialized behaviors can be added in the subclasses.


### 3. **Polymorphism** 🔄  
The program demonstrates polymorphism through method overloading and overriding. This allows the same method name to behave differently depending on the context or the object calling it.


### 4. **Abstraction** 🔍  
The program demonstrates abstraction by using abstract classes or interfaces to hide the complex details of bird behavior, exposing only essential operations to the user.


## **Bird Database Highlights** 🐦  
**Endemic Species**:  
- Philippine Duck  
- Luzon Bleeding-heart  
- Scale-feathered Malkoha  

**Common Birds**:  
- Mallard  
- Tufted Duck  
- Common Koel  

**Rare Birds**:  
- Flame-breasted Fruit Dove  
- Philippine Frogmouth  
- Red-tailed Tropicbird  

---

## **Setup Instructions** 🛠️  

### **Prerequisites**  
- **Java Runtime Environment (JRE)**: Version 8 or higher.  

### **Steps to Run**  
1. Compile the code:  
   ```bash  
   javac BirdWatchingApp.java  

---

## **Files and Storage** 📂  

- User data and bird sightings are stored locally in text files named `<username>_sightings.txt`.  
- Each sighting includes the bird’s name, location, date, and time.
- The file format for each sighting is as follows:
  ```plaintext
  Bird Name: Philippine Duck
  Location: Taal Lake
  Date: 2024-11-21
  Time: 08:45 AM

birder123_sightings.txt

Bird Name: Philippine Duck
Location: Taal Lake
Date: 2024-11-21
Time: 08:45 AM

Bird Name: Mallard
Location: Taal Lake
Date: 2024-11-20
Time: 10:00 AM

---
 

### **Prerequisites**  
To run this project, you will need:

- **Java Runtime Environment (JRE)** version 8 or higher.
- A compatible IDE or text editor for editing and running Java programs (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code).

