package prometheus_practice.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.stream.Stream;

public class Main2 {

    private static final String GREEN = "green";
    private static final String YELLOW = "yellow";
    private static final String WHITE = "white";
    private static final String RED = "red";
    private static final String BLACK = "black";

    public static void main(String[] args) {

        // create array and list
        String [] colorsArray = {GREEN, YELLOW, WHITE, RED, BLACK};
        List<String> colorsList = Arrays.asList(colorsArray);

        // create streams
        Stream <String> streamArray = Arrays.stream(colorsArray);
        Stream <String> streamlist = colorsList.stream();

        // test count
        System.out.println(streamArray.count());
        System.out.println(streamlist.count());
        System.out.println(Stream.empty().count());

        //test for each
        streamArray.forEach(System.out::print);

        Stream <String> streamlist2 = colorsList.stream();
        streamlist2.forEach(System.out::print);


    }
}
