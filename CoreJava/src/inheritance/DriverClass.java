package inheritance;

public class DriverClass {
    public static void main(String[] args) {
        PhysicsTeacher physicsTeacher = new PhysicsTeacher();
        physicsTeacher.setId(10);
        physicsTeacher.setSchool("ABC School");
        System.out.println(physicsTeacher.getId());

        System.out.println(physicsTeacher.equals(""));

        MathTeacher teacher = new MathTeacher();
        teacher.setId(100);
        teacher.setMale(Boolean.TRUE);
        teacher.setSchool("ABC School");


    }
}
