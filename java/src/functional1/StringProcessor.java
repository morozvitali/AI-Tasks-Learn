package functional1;

public class StringProcessor {

    public void processString (StringOperation stringOperation) {

String result = stringOperation.manipulate("Hello, World!");
        System.out.println("Result: " + result);
    }
}