package quiz17e02;

public class Application {
// создается anonymous inner class
    public void f() {
        X x = new X() {
            @Override
            public String toString() {
                return "Hello!";
            }
        };
    }

    public class X {

    }
}
