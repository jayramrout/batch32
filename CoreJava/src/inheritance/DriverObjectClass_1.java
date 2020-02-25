package inheritance;

public class DriverObjectClass_1 {
    public static void main(String[] args) {
        DriverObjectClass_1 driver = new DriverObjectClass_1();
        GeometricTeacher teacher = new GeometricTeacher();
        System.out.println(teacher.hashCode());
        System.out.println(teacher.toString());


        GeometricTeacher teacher2 = new GeometricTeacher();
        System.out.println(teacher2.hashCode());
        System.out.println(teacher2.toString());





    }




}
