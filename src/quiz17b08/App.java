package quiz17b08;

class App {
    int k;
    static class X {
        static int p;
        class Y {
            public void f() {
                System.out.println(/*k*/);// Non-static field 'k' cannot be referenced from a static context
                System.out.println(p);
            }
        }
    }
}
