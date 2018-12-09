package quiz17e04;

public class Application {
// cannot be referenced from a static context
    public /*static*/ void f() {
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
