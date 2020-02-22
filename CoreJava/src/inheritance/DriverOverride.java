package inheritance;

public class DriverOverride {
    public static void main(String[] args) {
        DriverOverride driver = new DriverOverride();
        Teacher teacher;

        teacher = new PhysicsTeacher();
        teacher.setId(10);
        teacher.setSubject("Physics");
        teacher.parkingSpot();
        teacher.incomingTime();

        teacher = new MathTeacher();
        teacher.setId(20);
        teacher.setSubject("Math");
        teacher.parkingSpot();
        teacher.incomingTime();


    }




}
