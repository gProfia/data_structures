package java_lang_de;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashingExemple {
    public static void main(String[] args) {
        
        //################# HashMap
        System.out.println("HashMap");

        HashMap<String, String> fighterCountry = new HashMap<String, String>();

        fighterCountry.put("Bob knucles", "AU");
        fighterCountry.put("El Cucuy", "USA");
        fighterCountry.put("Adesanya", "NI");
        fighterCountry.put("Aldo", "BR");
        fighterCountry.put("Charles", "BR");
        fighterCountry.put("Muller", "USA");
        fighterCountry.put("Luke", "USA");
        fighterCountry.put("Luke", "USA");

        System.out.println(fighterCountry);
        System.out.println(fighterCountry.get("Aldo"));
        fighterCountry.remove("Luke");
        System.out.println(fighterCountry);
        System.out.println(fighterCountry.size());

        for (String fc : fighterCountry.keySet()){
            System.out.print(fc + " | ");
        }
            System.out.println();
        for (String fc : fighterCountry.values()){
            System.out.print(fc + " | ");
        }
        System.out.println();

        for (String fc : fighterCountry.keySet()){
            System.out.println(fc + " =>[" + fighterCountry.get(fc)+ "] ");
        }
        
        System.out.println();
        //################# HashSet
        System.out.println("HashSet");                

        HashSet<String> coffes = new HashSet<String>();

        coffes.add("americano");
        coffes.add("black");
        coffes.add("latte");
        coffes.add("cappuccino");
        coffes.add("red eye");
        coffes.add("cortado");
        coffes.add("doppio");
        coffes.add("espresso");
        coffes.add("galão");
        coffes.add("mocha");
        coffes.add("lungo");
        coffes.add("macchiato");
        coffes.add("macchiato");
        coffes.add("mocha");
        System.out.println(coffes.size());
        System.out.println(coffes);
        System.out.println(coffes.contains("mocha"));
        coffes.remove("mocha");
        System.out.println(coffes.contains("mocha"));
        for(String i : coffes){
            System.out.println("I never drunk "+ i);
        }
        Iterator<String> it = coffes.iterator();
        while(it.hasNext()){
            String i = it.next();
            System.out.println(i);
            if(i.equals("lungo"))
                it.remove();
        }   
        System.out.println(coffes);
    }
}

