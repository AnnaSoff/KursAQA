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
}
class Bowl {
    private int food;

    public Bowl (int food) {
        this.food = food;
    }
    public boolean reductionOfFood(int amount) {
        if (amount <= 0) return false;
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }
    public void addFood(int amount) {
        if (amount > 0) {
            this.food += amount;
        }
    }
    public void info() {
        System.out.println("Текущее количество еды в миске: " + food);
    }
}
class Cat extends Animal {
    private final int RUN_LIMIT = 200;
    private static int catCount = 0;
    private final int appetite; 
    private boolean satiety; 

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        this.satiety = false;
        catCount++;
    }
    public static int getCatCount() {
        return catCount;
    }
    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(name + " пробежал" + distance + "m.");
        } else {
            System.out.println(name + " не может пробежать больше " + RUN_LIMIT);
        }
    }
    public void eat(Bowl bowl) {
        if (satiety) {
            System.out.println(name + " уже сыт!");
        }
        if (bowl.reductionOfFood(appetite)) {
            satiety = true;
            System.out.println(name + " покушал (" + appetite + " ед.).");
        } else {
            System.out.println(name + " не смог поесть: слишком мало еды!");
        }
    }
    public void info() {
        System.out.println("Кот: " + name + " | Сытость: " + (satiety ? "Сыт" : "Голоден"));
    }
    
}
class Dog extends Animal {
    private final int RUN_LIMIT = 500;
    private final int SWIM_LIMIT = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
         dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }
    @Override
    public void swim(int distance) {
        if (distance <= SWIM_LIMIT) {
            System.out.println(name + " проплыл" + distance + "m.");
        } else {
            System.out.println(name + " не может проплыть больше " + SWIM_LIMIT);
        }
    }

    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(name + " пробежал" + distance + "m.");
        } else {
            System.out.println(name + " не может пробежать больше " + RUN_LIMIT);
        }
        
    }
}



