public class DMPPBusiness implements DMPPInformation {

    private String businessName;
    private String businessAddress;
    private String businessType;



    public DMPPBusiness(String newBusinessName, String newBusinessAddress, String newBusinessType){
        this.businessName = newBusinessName;
        this.businessAddress = newBusinessAddress;
        this.businessType = newBusinessType;
    }

    // Returns Business Type
    public String getBusinessType() {
        return businessType;
    }

    // Sets Business Address
    @Override
    public void setAddress(String address) {

        businessAddress = address;
    }

    // Returns Business Address
    @Override
    public String getAddress() {
        return businessAddress;
    }

    // Sets Business Name
    @Override
    public void setName(String newBusinessName) {
        businessName = newBusinessName;
    }

    // Returns Business Name
    @Override
    public String getName() {
        return businessName;
    }

    // Business toString
    @Override
    public String toString() {

        return getName();
    }
}
