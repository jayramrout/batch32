package classes_example;

public class DesignerHouse { // Outer Class
    private int cost;
    private String curtain;
    private String designName;

    /*
    private String kitchAppliance;
    private String kitchenDeck;
    private String kitchenSink;
    */
    private DesignerKitchen designerKitchen;

    class DesignerKitchen {   // Inner Class
        private String kitchAppliance;
        private String kitchenDeck;
        private String kitchenSink;
        private int kitchCost;
        private void costofKitchenWithDesignerHouse(){
            System.out.println(kitchCost + cost);
        }
    }

    public static void thisIsStatic(){

    }

    public static void thisIsStaticAgain(){
        thisIsStatic();
    }
    public void nonStatic(){
//        thisIsStatic();
    }

    private class ConstructionDetailsOfDK {

    }

}





