package inheritance;

public class DriverAbstract_1 {
    public static void main(String[] args) {
        DriverAbstract_1 driver = new DriverAbstract_1();
        Teacher teacher;

        teacher = new PhysicsTeacher();
        teacher.setId(10);
        teacher.setSchool("ABC School");
        teacher.setSubject("Physics");
        teacher.teachingStyle();

        /*teacher = new MathTeacher();
        teacher.setId(100);
        teacher.setMale(Boolean.TRUE);
        teacher.setSchool("ABC School");
        teacher.setSubject("Math");
        teacher.teachingStyle();*/



        teacher = new SocialTeacher();
        teacher.teachingStyle();
    }




}
