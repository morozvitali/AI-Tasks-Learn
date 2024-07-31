package udemi2.parametrisedclass;

public class Info <T> {
    private T value;
    public Info (T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "==" + value +"==";
    }
}

    class Main {

        public static void main(String[] args) {
            Info <String> inf1 = new Info<>("hello there");
            System.out.println(inf1);

            Info <Integer> inf2 = new Info<>(555);
            System.out.println(inf2);
        }
    }
