package lesson8.inheritance.Cast;

import lesson8.inheritance.Collegue.SeniorDeveloper;
import lesson8.inheritance.Collegue.Student;
import lesson8.inheritance.Collegue.Teacher;

public class CastTest {
    public static void main(String[] args) {
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        //This is UPCAST and it is SAFE!
        Student student = seniorDeveloper;
        student.study();

        //This is DOWNCAST and it is NOTSAFE
        //so it should be done with the check on instanceof
        SeniorDeveloper sameSeniorDeveloper = null;
        if (student instanceof SeniorDeveloper){
            sameSeniorDeveloper = (SeniorDeveloper)student;
        }

        Teacher teacher = new Teacher();
        student = teacher;


        //student is not Senior Developer
        SeniorDeveloper notSenior = (SeniorDeveloper)student;



    }
}
