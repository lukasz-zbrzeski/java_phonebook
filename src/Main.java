import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    private static TreeMap<TelephoneNumber, Post> createPhonebook() {
        TelephoneNumber telNumber1 = new TelephoneNumber("48", "123456789");
        Person person1 = new Person("Jan", "Kowalski", "Przykładowa 123", telNumber1);
        TelephoneNumber telNumber2 = new TelephoneNumber("48", "012012012");
        Person person2 = new Person("Adam", "Nowak", "Nowa 100", telNumber2);

        TelephoneNumber telNumber3 = new TelephoneNumber("48", "000111222");
        Company company1 = new Company("ABC Sp. z o.o.", "Stara 25", telNumber3);
        TelephoneNumber telNumber4 = new TelephoneNumber("48", "333444555");
        Company company2 = new Company("XYZ S.A.", "Polna 58", telNumber4);

        TreeMap<TelephoneNumber, Post> phonebook = new TreeMap<>();

        phonebook.put(telNumber1, person1);
        phonebook.put(telNumber2, person2);
        phonebook.put(telNumber3, company1);
        phonebook.put(telNumber4, company2);

        return phonebook;
    }

    private static void printPhonebook(TreeMap<TelephoneNumber, Post> phonebook) {
        for (Map.Entry<TelephoneNumber, Post> entry : phonebook.entrySet()) {
            entry.getValue().description();
        }
    }
    public static void main(String[] args) {
        TreeMap<TelephoneNumber, Post> phonebook = createPhonebook();

        printPhonebook(phonebook);
        
    }
}