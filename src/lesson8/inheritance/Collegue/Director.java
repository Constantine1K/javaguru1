package lesson8.inheritance.Collegue;

public class Director extends Teacher{

    public void hireTeacher(Teacher teacher){
        System.out.println("Hire new teacher " + teacher.getContractNumber());
    }
    public void fireTeacher(Teacher teacher){
        System.out.println("Fire teacher " + teacher.getContractNumber() );
    }

}
