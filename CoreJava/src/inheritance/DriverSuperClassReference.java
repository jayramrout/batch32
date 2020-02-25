package inheritance;

public class DriverSuperClassReference {
    public static void main(String[] args) {
        DriverSuperClassReference driver = new DriverSuperClassReference();
        // You can create a reference of super class by create an instance of subclass.
//        Teacher physicsTeacher = new PhysicsTeacher();
//        PhysicsTeacher physicsTeacher = new Teacher(); // nono , b'coz super class should be on the left hand side..

        PhysicsTeacher physicsTeacher = new PhysicsTeacher();
        physicsTeacher.setId(10);
        physicsTeacher.setSchool("ABC School");
        physicsTeacher.setSubject("Physics");
//        driver.printPhysicsDetails(physicsTeacher);
        driver.printDetails(physicsTeacher);
//        driver.printPhysicsDetails((PhysicsTeacher) physicsTeacher);

//        physicsTeacher.labWork();

//        PhysicsTeacher cast = (PhysicsTeacher) physicsTeacher;
//        cast.setPhysicsTeachingExperience("4 Years Exp");

       /* MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.setId(100);
        mathTeacher.setMale(Boolean.TRUE);
        mathTeacher.setSchool("ABC School");
        mathTeacher.setSubject("Math");
//        driver.printMathDetails(mathTeacher);
       driver.printDetails(mathTeacher);*/

//        mathTeacher.mathQuiz();

    }

    public void printMathDetails(MathTeacher mathTeacher) {
        System.out.println(mathTeacher.getId());
        System.out.println(mathTeacher.getSchool());
        System.out.println(mathTeacher.getSubject());
        mathTeacher.mathQuiz();
    }
    public void printPhysicsDetails(PhysicsTeacher physicsTeacher) {
        System.out.println(physicsTeacher.getId());
        System.out.println(physicsTeacher.getSchool());
        System.out.println(physicsTeacher.getSubject());
        physicsTeacher.labWork();
    }

    public void printDetails(Teacher teacher) {
        System.out.println(teacher.getId());
        System.out.println(teacher.getSchool());
        System.out.println(teacher.getSubject());
    }


}
