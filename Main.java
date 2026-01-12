public class Main {
    public static void main(String[] args) {
        Bowl plate = new Bowl(55);
        Cat[] cats = {
            new Cat("Сима", 20),
            new Cat("Хлоя", 15),
            new Cat("Дейв", 25),
            new Cat("Феня", 10)
        };
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        System.out.println("\n--- Результаты ---");

        for (Cat cat : cats) {
            cat.info();
        }
        plate.addFood(25);
        plate.info();
    }
}
