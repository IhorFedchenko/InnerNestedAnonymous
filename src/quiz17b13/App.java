package quiz17b13;

class App {
    static int k;
    static class X {
        int p;
        class Y {
            public void f() {
                System.out.println(k);
                System.out.println(p);
            }
        }
    }
}
