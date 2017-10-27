package lesson4.ContactInformation;

public class Client {
    private String firstName;
    private String secondName;
    private String personalCode;
    private ContactInformation contactInformation;

    public String getFirstName() {
        this.firstName = firstName;
        return null;
    }
    public String getSecondName() {
        this.secondName = secondName;
        return null;
    }
    public String getPersonalCode() {
        this.personalCode = personalCode;
        return null;
    }

    public ContactInformation getContactInformation() {
        this.contactInformation = contactInformation;
        return null;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
    public void setPersonalCode(String personalCode){
        this.personalCode = personalCode;
    }
    public void setContactInformation(ContactInformation contactInformation){
        this.contactInformation = contactInformation;
    }
    public String toString(){
        return "First Name = " + firstName
                + "Second Name = " + secondName
                + "Personal code = " + personalCode
                + "Contact Information = " + contactInformation;

    }
}



