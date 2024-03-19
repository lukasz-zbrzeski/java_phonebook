public class Company extends Post {
    private final String companyName;
    private final String address;
    private final TelephoneNumber telephoneNumber;

    public Company(String companyName, String address, TelephoneNumber telephoneNumber) {
        this.companyName = companyName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void description() {
        System.out.println("Company name: " + this.companyName + ", address: " + this.address
                + ", telephone number: " + this.telephoneNumber);
    }
}
