package FreeStyle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CitiesInCountries {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("London");cities.add("Denver");cities.add("Paris");cities.add("Miami");
        cities.add("Seoul");cities.add("Tokyo");

        System.out.println(cities);
        System.out.println("The List size is " + cities.size());
        System.out.println("Is Miami in the list? " + cities.contains("Miami"));
        System.out.println("On the List, Denver is at index " + cities.indexOf("Miami"));
        System.out.println("Is the List empty? " + cities.isEmpty());

        cities.add(2, "Lagos");
        cities.add("Miami");
        System.out.println(cities);

        cities.removeAll(List.of("Miami"));
        cities.remove(1);
        System.out.println(cities);

        for (int i = cities.size()-1; i >= 0 ; i--) {
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();
    }
}
