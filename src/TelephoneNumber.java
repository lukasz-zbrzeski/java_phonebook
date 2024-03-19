public class TelephoneNumber implements Comparable<TelephoneNumber> {
    private final String areaCode;
    private final String phoneNumber;

    public TelephoneNumber(String areaCode, String phoneNumber) {
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public int compareTo(TelephoneNumber o) {
        int compareAreaCode = this.areaCode.compareTo(o.areaCode);
        if (compareAreaCode == 0)
            return this.phoneNumber.compareTo(o.phoneNumber);
        return compareAreaCode;
    }

    @Override
    public String toString() {
        return "+" + this.areaCode + " " + this.phoneNumber;
    }
}
