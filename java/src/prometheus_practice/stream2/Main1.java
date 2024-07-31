package prometheus_practice.stream2;

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

        String[] colorsArray = {GREEN, YELLOW, WHITE, RED, BLACK};
        List<String> colors = Arrays.asList(GREEN, YELLOW, WHITE, RED, BLACK);

        System.out.println("-------------------");
        // peek (Consumer) + filter + map

        List <String> modifiedColors = colors.stream()
                .filter(color -> color.contains("e"))
                .peek (color -> System.out.println("Contains e " + color + " "))
                .map (String::toUpperCase)
                .toList();
        modifiedColors.stream().forEach(System.out::println);

        System.out.println("-------------------");
        // limit

        List <String> limitedColors = colors.stream()
                .limit(3)
                .toList();

        limitedColors.stream().forEach(System.out::println);
        System.out.println("-------------------");

        // skip (long n)
        List <String> skippedColors = colors.stream ()
                .skip(1)
                .toList();

        skippedColors.stream().forEach(System.out::println);

        System.out.println("-------------------");
        // findAny ()
        colors.stream()
                .findAny()
                .ifPresent(color -> System.out.println("anycolor: " + color));
        System.out.println("-------------------");

        colors.stream().findFirst().ifPresent(color -> System.out.println("first color: " + color));
        System.out.println("-------------------");

        // anyMatch (Predicate)

        boolean anyMatchRed = colors.stream()
                .anyMatch(color -> color.equals(YELLOW));
        System.out.println("any yeloow: " + anyMatchRed);
        System.out.println("-------------------");

        // allMatch (Predicate)
        boolean allMatchGreen = colors.stream()
                .allMatch(color -> color.equals(GREEN));
        System.out.println("all green: " + allMatchGreen);
        System.out.println("-------------------");

        // nonMatch
        boolean nonMatch = colors.stream().noneMatch(color -> color.equals("gold"));
        System.out.println("non match: " + nonMatch);
        System.out.println("-------------------");

        // String builder

        Stream <String> customBuilder = Stream.<String> builder ()
                .add ("That ")
                .add("Is ")
                .add("A ")
                .add("Custom ")
                .add("Stream")
                .build();
        customBuilder.forEach(System.out::println);


    }
}