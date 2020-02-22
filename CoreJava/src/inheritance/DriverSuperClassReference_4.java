package inheritance;

public class DriverSuperClassReference_4 {
    public static void main(String[] args) {
        DriverSuperClassReference_4 driver = new DriverSuperClassReference_4();
        Teacher teacher;

        teacher = new PhysicsTeacher();
        teacher.setId(10);
        teacher.setSchool("ABC School");
        teacher.setSubject("Physics");
        driver.printDetails(teacher);

        teacher = new MathTeacher();
        teacher.setId(100);
        teacher.setMale(Boolean.TRUE);
        teacher.setSchool("ABC School");
        teacher.setSubject("Math");
        driver.printDetails(teacher);

    }

    public void printDetails(Teacher teacher) {
        System.out.println(teacher.getId());
        System.out.println(teacher.getSchool());
        System.out.println(teacher.getSubject());

        PhysicsTeacher physicsTeacher = (PhysicsTeacher)teacher;
        physicsTeacher.labWork();

    }


}
