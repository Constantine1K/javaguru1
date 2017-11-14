package lesson8.inheritance.Collegue;

public class CollegueMain {
    public static void main(String[] args) {
        //all methods in student
        System.out.println("------Methods in Student class------");
        Student student = new Student();
        student.setContractNumber("2159");
        student.study();
        System.out.println("Student Contract Number " + student.getContractNumber());

        //all methods in teacher
        System.out.println("------Methods in Teacher class------");
        Teacher teacher = new Teacher();
        teacher.setContractNumber("4709");
        teacher.study();
        teacher.teacher();
        System.out.println("Teacher Contract Number " + teacher.getContractNumber());

        //all methods in director
        System.out.println("------Methods in Director class------");
        Director director = new Director();
        director.setContractNumber("5609");
        director.study();
        director.teacher();
        director.hireTeacher(teacher);
        director.fireTeacher(teacher);
        System.out.println("Director Contract Number " + director.getContractNumber());

        //all methods for Junior Developer
        System.out.println("------Methods in Junior class------");
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.setContractNumber("5108");
        juniorDeveloper.study();
        juniorDeveloper.writeCode();
        juniorDeveloper.askStupidQuestions();
        System.out.println("Junior Developer Contract Number " + juniorDeveloper.getContractNumber());

        //all methods for Middle Developer
        System.out.println("------Methods in Middle Developer class------");
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        middleDeveloper.setContractNumber("8888");
        middleDeveloper.study();
        middleDeveloper.writeCode();
        middleDeveloper.askStupidQuestions();
        middleDeveloper.debugCode();
        System.out.println("Middle Developer Contract Number " + middleDeveloper.getContractNumber());

        //all methods for Senior Developer
        System.out.println("------Methods in Senior Developer class------");
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        seniorDeveloper.setContractNumber("7898");
        seniorDeveloper.study();
        seniorDeveloper.writeCode();
        seniorDeveloper.askStupidQuestions();
        seniorDeveloper.debugCode();
        seniorDeveloper.solveProblems();
        System.out.println("Senior Developer Contract number " + seniorDeveloper.getContractNumber());
    }
}

