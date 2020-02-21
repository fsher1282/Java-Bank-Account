public class DMPPPerson implements DMPPInformation{
    private String name;
    private int age;
    private String address;


    DMPPPerson(String userName, String userAddress ,int userAge){
        this.name = userName;
        this.age = userAge;
        this.address = userAddress;
    }


    // Function Sets Name
    @Override
    public void setName(String userName) {
        this.name = userName;
    }

    // Function returns Name
    @Override
    public String getName() {
        return name;
    }

    // Function Sets Address
    @Override
    public void setAddress(String userAddress) {

        this.address = userAddress;
    }

    // Function returns Address
    @Override
    public String getAddress() {

        return address;
    }

    // Function returns Age
    public int getAge() {

        return age;
    }

    @Override
    public String toString() {
        String string1 = getName();
        return string1;
    }

}
