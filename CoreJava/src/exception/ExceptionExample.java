package exception;

import inheritance.GeometricTeacher;
import inheritance.SocialTeacher;
import inheritance.Teacher;

public class ExceptionExample {
    public static void main(String[] args) {
        GeometricTeacher teacher = null;

        System.out.println(teacher.getId());

        if(teacher != null){
            System.out.println(teacher.getId()); // from nothing you are trying to access something...
        }

        Teacher teacher1 = new SocialTeacher();
        teacher1.setSubject("Social");
        System.out.println(teacher1.getSubject());
    }
}
