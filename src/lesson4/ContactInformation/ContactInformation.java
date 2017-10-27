package lesson4.ContactInformation;

public class ContactInformation {
    private String country;
    private String city;
    private String address;
    private String phoneNumber;
    private String email;

    public String getCountry(){
        this.country = country;
        System.out.println("Country = " + country);
        return country;
    }
    public String getCity(){
        this.city = city;
        System.out.println("City = " + city);
        return city;
    }
    public String getAddress(){
        this.address = address;
        System.out.println("Address = " + address);
        return address;
    }
    public String getPhoneNumber(){
        this.phoneNumber = phoneNumber;
        System.out.println("Phone Number = " + phoneNumber);
        return phoneNumber;
    }
    public String getEmail(){
        this.email = email;
        System.out.println("E-mail = " + email);
        return email;
    }

    public void setCountry(String country){
        this.country = country;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setAddress(String Address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String toString(){
        return "Country = " + country
                + "City = " + city
                + "Address = " + address
                + "Phone Number = " + phoneNumber
                + "E-mail = " + email;

    }

}
