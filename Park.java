public class Park {
    private String parkName;
    private Attraction[] attractions;

    public class Attraction {
        private String name;
        private String workingHours;
        private double ticketPrice;

        public Attraction(String name, String workingHours, double ticketPrice) {
            this.name = name;
            this.workingHours = workingHours;
            this.ticketPrice = ticketPrice;
        }

        public void printAttractionInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость билета: " + ticketPrice + " руб.");
        }
    }

    public Park(String parkName, int maxAttractions) {
        this.parkName = parkName;
        this.attractions = new Attraction[maxAttractions];
    }

    void addAttraction(String name, String workingHours, double ticketPrice, int index) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, workingHours, ticketPrice);
        } else {
            System.out.println("Ошибка: индекс выходит за границы массива аттракционов");
        }
    }

    void printAllAttractions() {
        System.out.println("Парк: " + parkName);
        System.out.println("Список аттракционов:\n");

        for (int i = 0; i < attractions.length; i++) {
            if (attractions[i] != null) {
                System.out.println("Аттракцион №" + (i + 1) + ":");
                attractions[i].printAttractionInfo();
            }
        }
    }
}

class ParkDemo {
    public static void main(String[] args) {
        Park parkSkazka = new Park("Парк развлечений 'Сказка'", 4);

        parkSkazka.addAttraction("Карусель Колобок", "10:00-22:00", 700, 0);
        parkSkazka.addAttraction("Экстремальные качели 'Микс'", "10:00-22:00", 650, 1);
        parkSkazka.addAttraction("Карусель 'Юла'", "10:00-22:00", 550, 2);
        parkSkazka.addAttraction("Карусель 'Вальс'", "10:00-22:00", 850, 3);

        parkSkazka.printAllAttractions();
    }
}
