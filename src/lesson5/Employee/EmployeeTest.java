package lesson5.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Company company = new Company("IBM","5600");
        Department department = new Department("One", company);
        Employee employee = new Employee("123", 1000.00, department);
        employee.toString();

        System.out.println(employee);



    }
}
