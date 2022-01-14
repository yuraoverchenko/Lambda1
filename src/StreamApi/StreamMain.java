package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamMain {

    static List<String> places = new ArrayList<>();

    public static List getPlaces(){

        places.add("Ukraine, Odessa");
        places.add("Ukraine, Vinnitsa");
        places.add("Russia, Moscow");
        places.add("USA, NewYork");
        return places;
    }

    public static void main( String[] args ) {

        List<String> myPlaces = getPlaces();
        System.out.println("Places from Ukraine:");

        myPlaces.stream()
                .filter((p) -> p.startsWith("Ukraine"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));
    }

}
