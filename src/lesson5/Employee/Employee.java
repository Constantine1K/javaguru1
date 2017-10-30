package lesson5.Employee;

public class Employee {
    private String contractNumber;
    private double salary;
    private Department department;

    public Employee(String contractNumber, double salary, Department department){
        this.contractNumber = contractNumber;
        this.salary = salary;
        this.department = department;
    }
}
