package inheritance;

public class AlgebraTeacher extends MathTeacher implements Recreation{
    @Override
    public void preCalculus() {
        System.out.println("I am Ok to teach pre calculus");
    }

    @Override
    public void playVolleyBall() {
        System.out.println("I am good at playing and teaching volleyball..");
    }
}
