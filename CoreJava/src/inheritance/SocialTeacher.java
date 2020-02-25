package inheritance;


public class SocialTeacher extends Teacher implements Recreation {

    /*public void teachingStyle(){
        System.out.println("I use maps for teaching my subject...");
    }*/

    @Override
    public void teachingStyle() {
        System.out.println("I use maps for teaching my subject...");
    }

    @Override
    public void playVolleyBall() {
        System.out.println("I am good at conducting and playing volleball..");
    }
}
