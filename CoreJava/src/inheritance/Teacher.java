package inheritance;

public class Teacher {
    private int id;
    private String school;
    private String subject;
    private boolean isMale;

    public void incomingTime() {
        System.out.println(subject+ " Your general time is 9 am mon---friday");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void parkingSpot(){
        System.out.println(subject + "You park in the basement of the school..");
    }
}
