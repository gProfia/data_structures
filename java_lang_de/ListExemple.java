package java_lang_de;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.function.Consumer;

public class ListExemple {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        //################## LinkedList
        System.out.println("LinkedList ");
        LinkedList<Integer> ll = new LinkedList<Integer>();
        
        ll.add(13);
        ll.add(r.nextInt(99));
        ll.add(r.nextInt(99));
        ll.add(r.nextInt(99));
        ll.add(13);
        System.out.println(ll);
        ll.remove(4);
        System.out.println(ll);
        System.out.println();

        //################## ArrayList
        System.out.println("ArrayList ");
        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("corsa");
        cars.add("camaro");
        cars.add("uno");
        cars.add("carango");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.set(0, "strada");
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars);
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("corsa");
        cars.add("camaro");
        cars.add("uno");
        cars.add("carango");
        for(String c : cars){
            System.out.print(c+ "| ");
        }
        System.out.println();
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
        Consumer<String> imSpeed = (s) -> {System.out.println(s + " musch fast, like a v8 mate!"); };
        cars.forEach((n) -> {System.out.println(n + " go vrum vrum");});
        cars.forEach(imSpeed);
    }
}

