package prometheus_practice.stream3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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

        // flatMap
        List <String> flatMappedColors = colors.stream()
                .flatMap(color -> Stream.of(color.toUpperCase()))
                .toList();
        flatMappedColors.forEach(color -> System.out.println(color));
        System.out.println("-------------------");

        // min (Comparator)
        Optional <String> minColor = colors.stream()
                .min(Comparator.naturalOrder());
        minColor.ifPresent(color -> System.out.println("min color" + color));

        System.out.println("-------------------");

        // max (Comparator)
        Optional <String> maxColor = colors.stream()
                .max(Comparator.naturalOrder());
        maxColor.ifPresent(color -> System.out.println("max color" + color));

        System.out.println("-------------------");

        //reduce (identity, BinaryOperator)
        //String c
        



    }}
