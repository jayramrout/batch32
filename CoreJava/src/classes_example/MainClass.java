package classes_example;

public class MainClass {
    public static void main(String[] args) {

        Box squareBox = new Box(); // object is an instance of a class
        squareBox.height = 4;
        squareBox.length = 4;
        squareBox.width = 4;
        squareBox.shape = "Square";

        Box rectangleBox = new Box();
        rectangleBox.height = 6;
        rectangleBox.length = 4;
        rectangleBox.width = 2;
        rectangleBox.shape = "Rectangle";

        System.out.println(squareBox.height);
//        System.out.println(rectangleBox.height);

        Box box2 = squareBox;
        System.out.println(box2.height);

        box2.height = 10;
        System.out.println(squareBox.height);

        Box box3 = new Box();
        box3.height = 5;
        box3.width = 4;
        box3.length = 6;
        box3.shape = "Rectangle";

        Gift gift = new Gift();
        gift.name = "Flower Base";

        box3.gift = gift;

        System.out.println(box3.height);
        System.out.println(box3.shape);
        System.out.println(box3.gift.name);

    }
}
