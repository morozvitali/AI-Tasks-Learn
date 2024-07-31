package prometheus_practice.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main1 {

    private static final String GREEN = "green";
    private static final String YELLOW = "yellow";
    private static final String WHITE = "white";
    private static final String RED = "red";
    private static final String BLACK = "black";

    public static void main(String[] args) {


        String [] colorsArray = {GREEN, YELLOW, WHITE, RED, BLACK};
        List <String> colorsList = Arrays.asList(colorsArray);

        //Create stream

        Stream <String> streamFromList = colorsList.stream();
        Stream <String> streamFromArray = Arrays.stream(colorsArray);

        // count()

        System.out.println("count array stream "+ streamFromArray.count());
        System.out.println("count list stream " + streamFromList.count());
        System.out.println("count empty stream "+ Stream.empty().count());

        // forEach()
        colorsList.forEach(System.out::print);

        // toList
        List <String> colors = colorsList.stream().toList();
        //filter ()

        List <String> withoutBlack = colors.stream()
                .filter(color -> !color.equals(BLACK))
                .toList();

        // map ()
        colors.stream()
                .map(String::toUpperCase)
                .forEach(System.out::print);

        //concat ()
        Stream.concat(colors.stream(), withoutBlack.stream())
                .forEach(System.out::print);

        // distinct ()
        Stream.concat(colors.stream(), withoutBlack.stream())
                .distinct()
                .forEach(System.out::print);

        // sorted ()
        List <String> sortedColors = colors.stream().sorted().toList();
        sortedColors.stream().forEach(System.out::println);


    }
}
