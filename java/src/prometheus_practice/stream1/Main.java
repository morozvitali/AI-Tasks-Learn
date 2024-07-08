package prometheus_practice.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    private static final String GREEN = "green";
    private static final String YELLOW = "yellow";
    private static final String WHITE = "white";
    private static final String RED = "red";
    private static final String BLACK = "black";

    public static void main(String[] args) {

        String [] colorsArray = {GREEN, YELLOW, WHITE, RED, BLACK};
        List <String> colorsList = Arrays.asList(colorsArray);

        // Streams creeate

        Stream <String> streamFromList = colorsList.stream();
        Stream <String> streamFromArray = Arrays.stream(colorsArray);

        // count
        printWithSeparator("array stream elements count: " + streamFromArray.count());
        printWithSeparator("list stream elements count: " + streamFromList.count());
        printWithSeparator("empty stream elements count: " + Stream.empty().count());

        // forEach
        colorsList.forEach(Main::printWithBlank);
        // toList
        List <String> colors = colorsList.stream().toList();
        printWithSeparator(colors);

        //filter
        List <String> withoutBlack = colors.stream()
                .filter(color -> !color.equals(BLACK))
                .toList();
        printWithSeparator("Whitout black " + withoutBlack);

        //map
        colors.stream()
                .map(String::toUpperCase)
                .forEach(Main::printWithBlank);
        printWithSeparator("  [ after map() ]  ");

        //concat()
        Stream.concat(colors.stream(), withoutBlack.stream())
                .forEach(Main::printWithBlank);
        printWithSeparator("  [ after concat() ]  " );
        //distinct()
        Stream.concat(colors.stream(), withoutBlack.stream())
                .distinct()
                .forEach((Main::printWithBlank));
        printWithSeparator("  [ after distinct() ]  ");

        //sorted
        List <String> sortedColors = colors.stream().sorted().toList();
        printWithSeparator("Sorted colors: " + sortedColors);

        // count % filter
        long count = Stream.concat(colors.stream(), colors.stream())
                .filter(color -> color.equals(RED))
                .count();
        printWithSeparator("count of red = " + count);
//
    }






    // print methods

    private static void printWithBlank (Object content) {
        System.out.print(content + " ");
    }

    private static void printWithSeparator (Object content) {
        String separator = "\n ----------------------------- \n";
        System.out.println(content + separator);
    }
}
