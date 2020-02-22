package inheritance;


public class PhysicsTeacher extends Teacher {
    private String physicsTeachingExperience;

    public String getPhysicsTeachingExperience() {
        return physicsTeachingExperience;
    }

    public void setPhysicsTeachingExperience(String physicsTeachingExperience) {
        this.physicsTeachingExperience = physicsTeachingExperience;
    }

    public void labWork(){
        System.out.println("I would do lab work for 2 hours");
    }
}
