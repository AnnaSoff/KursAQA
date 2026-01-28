package aston.at;

class Dog extends Animal {
    String name;
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
            System.out.println(getName() + " проплыл" + distance + "m.");
        } else {
            System.out.println(getName() + " не может проплыть больше " + SWIM_LIMIT + "m.");
        }
    }

    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(getName() + " пробежал " + distance + "m.");
        } else {
            System.out.println(getName() + " не может пробежать больше " + RUN_LIMIT + "m.");
        }
    }

}
