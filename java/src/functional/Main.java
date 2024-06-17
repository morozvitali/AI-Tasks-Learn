package functional;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкту класу StringProcessor
        StringProcessor processor = new StringProcessor();

        // Лямбда-вираз, що перетворює рядок в верхній регістр
        StringOperation upperCaseOperation = str -> str.toUpperCase();

        // Лямбда-вираз, що додає до рядка " - modified"
        StringOperation addSuffixOperation = str -> str + " - modified";

        // Виклик методу processString для кожного об'єкту
        processor.processString(upperCaseOperation);
        processor.processString(addSuffixOperation);
    }
}
