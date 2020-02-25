package inheritance;

public class DriverSuperClassReference_3 {
    public static void main(String[] args) {
        DriverSuperClassReference_3 driver = new DriverSuperClassReference_3();
        Teacher teacher;

        teacher = new PhysicsTeacher();
        teacher.setId(10);
        teacher.setSchool("ABC School");
        teacher.setSubject("Physics");
        driver.printDetails(teacher);

        /*teacher = new MathTeacher();
        teacher.setId(100);
        teacher.setMale(Boolean.TRUE);
        teacher.setSchool("ABC School");
        teacher.setSubject("Math");
       driver.printDetails(teacher);*/

    }

    public void printDetails(Teacher teacher) {
        System.out.println(teacher.getId());
        System.out.println(teacher.getSchool());
        System.out.println(teacher.getSubject());

        if(teacher instanceof PhysicsTeacher) {
            PhysicsTeacher physicsTeacher = (PhysicsTeacher)teacher;
            physicsTeacher.labWork();
        }else if(teacher instanceof MathTeacher){
            MathTeacher mathTeacher = (MathTeacher) teacher;
            mathTeacher.mathQuiz();
        }
    }


}
