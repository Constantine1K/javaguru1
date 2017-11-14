package lesson8.inheritance.Collegue;

public class SeniorDeveloper extends MiddleDeveloper {
    public void solveProblems(){
        System.out.println("I am solving problems");
    }

    @Override
    public void askStupidQuestions(){
        System.out.println("Who wrote this code?!");
    }
}
