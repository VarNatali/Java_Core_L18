package ua.lviv.lga.lesson18.task02;


public class ApplicationMap {
    public static void main(String[] args) {


        Map<Integer, String> myMap = new Map<Integer, String>(1, "KKK");

        myMap.addToMap(0, "ha1");
        myMap.addToMap(2, "ha2");
        myMap.addToMap(4, "ha3");
        System.out.println("Befor delete");
        myMap.showMap();
        myMap.removeByKey(2);
        myMap.removeByValue("ha3");
        System.out.println("After delete");
        myMap.showMap();
        System.out.println("Key:");
        myMap.keySetSchow();
        System.out.println("Value:");
        myMap.valueListSchow();


    }
}
