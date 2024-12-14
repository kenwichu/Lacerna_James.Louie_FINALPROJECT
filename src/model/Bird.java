package model;

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

    @Override
    public String toString() {
        return "Bird: " + name + ", Color: " + color + ", Size: " + size + ", Rarity: " + rarity;
    }
}

