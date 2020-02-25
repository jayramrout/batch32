package inheritance;

public class DriverSuperClassReference_2 {
    public static void main(String[] args) {
        DriverSuperClassReference_2 driver = new DriverSuperClassReference_2();

//        PhysicsTeacher physicsTeacher = new PhysicsTeacher();
        Teacher physicsTeacher = new PhysicsTeacher();
        physicsTeacher.setId(10);
        physicsTeacher.setSchool("ABC School");
        physicsTeacher.setSubject("Physics");
        driver.printDetails(physicsTeacher);

        /*Teacher mathTeacher = new MathTeacher();
        mathTeacher.setId(100);
        mathTeacher.setMale(Boolean.TRUE);
        mathTeacher.setSchool("ABC School");
        mathTeacher.setSubject("Math");
       driver.printDetails(mathTeacher);*/

    }

    public void printDetails(Teacher teacher) {
        System.out.println(teacher.getId());
        System.out.println(teacher.getSchool());
        System.out.println(teacher.getSubject());

    }


}
