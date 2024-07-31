package udemi2.u7;

public class ParametrizedClass {
}


class Info <T> {
    private T value;
    public Info (T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "==" + value +"==";
    }

    public T getValue() {
        return value;
    }
}

class Parent {
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}

class Child extends Parent {
    public void abc (Info <String> info) {
        String s = info.getValue();
    }
}