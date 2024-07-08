package prometheus_practice.stream2;

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

        String[] colorsArray = {GREEN, YELLOW, WHITE, RED, BLACK};
        List<String> colors = Arrays.asList(GREEN, YELLOW, WHITE, RED, BLACK);

        //peek (Consumer) + filter() + map()
        List <String> modifiedColors = colors.stream()
                .filter (color -> color.contains("e"))
                .peek(color -> System.out.println("Contains 'e' : " + color  + " "))
                .map (String::toUpperCase)
                .toList();
        printWithSeparator("\n Modified list: " + modifiedColors);

        //limit (long maxsize)

        List <String> limitedColors = colors.stream()
                .limit(4)
                .toList();
        printWithSeparator("Limited colors: 3" + limitedColors);

        // skip
        List <String> skipedColors = colors.stream()
                .skip(1)
                .toList();
        printWithSeparator("Skiped colors: 2" + skipedColors);

        // find any

        colors.stream()
                .findAny()
                .ifPresent(color -> printWithSeparator("Found any color" + color));

        // findFirst
        colors.stream()
                .findFirst()
                .ifPresent(color -> printWithSeparator("Founf first color " + color));

        // anyMatch (Predicate)
        boolean anyMatchRed = colors.stream()
                .anyMatch(color -> color.equals(RED));

        printWithSeparator("Any red color " + anyMatchRed);

        //allMatch (Predicate)
        boolean allMatchGreen = colors.stream()
                .allMatch (color-> color.equals(GREEN));
        printWithSeparator("All green colors: " + allMatchGreen);

        //noneMatchGold (Predicate)
        boolean nonMatchGold = colors.stream()
                .noneMatch(color -> color.equals("gold"));
        printWithSeparator("No gold colors " + nonMatchGold);

        Stream <String> customStream = Stream.<String> builder()
                .add("That ")
                .add("Is ")
                .add("A ")
                .add("Custom ")
                .add("Stream ")
                .build();
        printWithSeparator("Custom stream elements " + Arrays.toString(customStream.toArray()));
        
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
