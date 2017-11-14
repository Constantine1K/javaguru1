package lesson8.inheritance.Collegue;

public class Student {
    private String contractNumber;

    public void study(){
        System.out.println("I am studying");
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }
}
