package quiz17e03;

public class Application {
//создается anonymous static nested class
    public static void f() {
        X x = new X() {
            @Override
            public String toString() {
                return "Hello!";
            }
        };
    }

    public static class X {

    }
}
