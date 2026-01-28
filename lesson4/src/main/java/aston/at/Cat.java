package aston.at;

class Cat extends Animal{
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