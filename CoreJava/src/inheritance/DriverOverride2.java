package inheritance;

public class DriverOverride2 {
    public static void main(String[] args) {
        DriverOverride2 driver = new DriverOverride2();
        Teacher teacher;

        /*teacher = new PhysicsTeacher();
        teacher.setId(10);
        teacher.setSubject("Physics");
        teacher.parkingSpot();
        teacher.incomingTime();



        teacher = new MathTeacher();
        teacher.setId(20);
        teacher.setSubject("Math");
        teacher.parkingSpot();
        teacher.incomingTime(); // run time polymorphism
*/
        /*teacher = new MathTeacher() {
            @Override
            public void parkingSpot() {
                System.out.println("Parking spot is just in front of your class");
            }

            @Override
            public void incomingTime() {
                System.out.println("You can come anytime you want...");
            }
        };*/
        /*teacher.setId(01);
        teacher.setSubject("Phd Math teaching");
        teacher.parkingSpot();
        teacher.incomingTime(); */// run time polymorphism

    }




}
