public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String country;
    private double price;
    private boolean states;


    
    public Product(String name, String productionDate, String manufacturer, 
                   String country, double price, boolean states) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.states = states;
    }
    public void productInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Забронирован: " + (states ? "Да" : "Нет"));
    }
public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", 
                                       "Samsung Corp.", "Korea", 900.0, true);
        
        productsArray[1] = new Product("iPhone 16 Pro", "21.10.2024", 
                                       "Apple Inc.", "USA", 1300.0, false);
        
        productsArray[2] = new Product("Sony PlayStation 5 Slim Blu-Ray", "24.04.2024", 
                                       "Sony", "Japan", 650.0, false);
        
        productsArray[3] = new Product("ASUS Vivobook 15 OLED X 1505VA", "20.11.2024", 
                                       "ASUS", "China", 600.0, true);
        
        productsArray[4] = new Product("MacBook Air M3", "01.06.2025", 
                                       "Apple Inc.", "USA", 700.0, false);

}
}