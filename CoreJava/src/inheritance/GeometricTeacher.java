package inheritance;

public final class GeometricTeacher extends MathTeacher {
    @Override
    public void preCalculus() {
        System.out.println("Not Ok to teach Pre calculus");
    }
}
