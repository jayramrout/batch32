package inheritance;

public class CalculusTeacher extends MathTeacher {
    @Override
    public void preCalculus() {
        System.out.println("I am an expert in teaching precalculus...");
    }
}
