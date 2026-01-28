package aston.at;

public class Animal {
    String name;
    private static int animalCount = 0;
    public Animal() {
        animalCount++; 
    }
    public static int getAnimalCount() {
        return animalCount;
    }
    public Animal(String name) {
        this.name = name; 
    }
    public void run(int distance) {
        System.out.println(name + " пробежал" + distance + "м.");
    }
    public void swim(int distance) {
        System.out.println(name + " проплыл" + distance + "м.");
    }
    public String getName() {
        return name;
    }
}