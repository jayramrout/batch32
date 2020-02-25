package inheritance;

public class DriverInterfaces_1 {
    public static void main(String[] args) {
        DriverInterfaces_1 driver = new DriverInterfaces_1();

        //int short byte long float double
        // Integer Short Byte Long Float Double // Wrapper classes
//        Teacher teacher = new SocialTeacher();
        Recreation recreationTeacher = new SocialTeacher();
        driver.volleyBallDetails(recreationTeacher);
        Recreation recreationTeacher2 = new AlgebraTeacher();
        driver.volleyBallDetails(recreationTeacher2);
    }

    public void volleyBallDetails(Recreation recreation){
        recreation.playVolleyBall();
    }




}
