package classes_example;

public class Baby {
    private String ssn;

    private String name;
    private String citizenship;
    private int age;
    private int height;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    private int color;

    // Constructor name is same as class name
    // it does not have any return type.
    public Baby(){}

    public Baby(String name, int age){
        this.age = age;
        this.name = name;
    }

    public Baby(String name, int age, int colorCode){
        this.age = age;
        this.name = name;
        this.color = colorCode;
    }

    // Overloaded the constructor
    public Baby(String name, int age, String citizenship){
        this.age = age;
        this.name = name;
        this.citizenship = citizenship;
    }

    public Baby(String name, int age, String citizenship, int height){
        this(name,age,citizenship);
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printDetails() {
        System.out.println(System.lineSeparator());
        if(this.name != null)
            System.out.println("Baby Name = "+ this.name);

        System.out.println("Baby Age = "+ this.age);

        if(this.citizenship != null) {
            System.out.println("Baby Citizen = "+ this.citizenship);
        }
        if(height !=0)
            System.out.println("Baby Height = "+ height);
    }
}
