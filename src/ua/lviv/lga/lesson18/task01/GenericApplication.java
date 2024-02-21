package ua.lviv.lga.lesson18.task01;

import java.util.ArrayList;
import java.util.List;

public class GenericApplication {
    public static void main(String[] args) {

        //Я це розумію так:
        // Якщо не задавати зовсім ніякого типу в List, то можна записати туди що завгодно.

        List<Integer> list = new ArrayList<Integer>();
        List list2 = new ArrayList();
        list.add(2);
        list2 = list;
        list2.add("String");
        System.out.println(list2);
        System.out.println();

        //  А якщо задати тип, то скористатися перетворенням toString()

        List<Integer> list3 = new ArrayList<Integer>();
        List<String> s = new ArrayList<String>();
        list3.add(5);
        s.add(list3.toString());
        s.add("Плюс");
        System.out.println("Або ще так? " + s);


    }

}
