package inheritance;


public abstract class MathTeacher extends Teacher {
    private String phdDetails;

    public abstract void preCalculus();
    public String getPhdDetails() {
        return phdDetails;
    }

    public void setPhdDetails(String phdDetails) {
        this.phdDetails = phdDetails;
    }

    public void mathQuiz() {
        System.out.println("Lets start match quiz...");
    }

    // Overriding
    @Override
    public void incomingTime(){
        System.out.println(getSubject()+ " Your general time is 12:30 pm mon---thursday");
    }

    @Override
    public void teachingStyle() {
//        super.teachingStyle();
        System.out.println("I use mainly algorithms to teach my students...");
    }
}
