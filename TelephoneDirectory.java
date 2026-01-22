import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneDirectory {
        private HashMap<String, ArrayList<String>> elements = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phones = elements.get(lastName);
        if (phones != null) {
            phones.add(phoneNumber);
        } else {
            phones = new ArrayList<>();
            phones.add(phoneNumber);
            elements.put(lastName, phones);
        }
    }

    public ArrayList<String> get(String lastName) {
        return elements.get(lastName);
    }

    public static void main(String[] args) {
        TelephoneDirectory phoneBook = new TelephoneDirectory();
        phoneBook.add("Иванов", "+79251234569");
        phoneBook.add("Сидорова", "+79252165647");
        phoneBook.add("Петрова", "+79254561278");
        phoneBook.add("Петрова", "+79259517553");
        phoneBook.add("Васильев", "+79254568264");
        phoneBook.add("Васильева", "+79252586482");

    System.out.println(phoneBook.get("Иванов").toString());
    System.out.println(phoneBook.get("Сидорова").toString());
    System.out.println(phoneBook.get("Петрова").toString());
    System.out.println(phoneBook.get("Васильев").toString());
    System.out.println(phoneBook.get("Васильева").toString());
    
    }
}


