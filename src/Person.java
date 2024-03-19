public class Person extends Post {
    private final String name;
    private final String surname;
    private final String address;
    private final TelephoneNumber telephoneNumber;

    public Person(String name, String surname, String address, TelephoneNumber telephoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public void description() {
        System.out.println("Name: " + this.name + ", surname: " + this.surname
                + ", address: " + this.address + ", telephone number: " + this.telephoneNumber);
    }
}
