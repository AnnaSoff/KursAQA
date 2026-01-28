package aston.at;

public class Bowl {
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
