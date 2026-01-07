public class Park {
    private String namePark;
    private String nameAttraction;
    private String openHours;
    private double price;
    
    public Park(String namePark) {
        this.namePark = namePark;
    }
    
    public class Attraction {
        String nameAttraction;
        String openHours;
        double price;
    
        public Attraction (String openHours, String nameAttraction, double price) {
            this.nameAttraction = nameAttraction;
            this.openHours = openHours;
            this.price = price;
        }
    }
}


