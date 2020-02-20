package inheritance;

public class DriverClass {
    public static void main(String[] args) {
        PhysicsTeacher physicsTeacher = new PhysicsTeacher();
        physicsTeacher.setId(10);
        System.out.println(physicsTeacher.getId());

        System.out.println(physicsTeacher.equals(""));
    }
}
