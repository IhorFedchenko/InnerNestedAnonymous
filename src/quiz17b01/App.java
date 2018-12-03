package quiz17b01;

class App {
    static int k;
    class X {
        /*static*/ int p; //Inner classes cannot have static declarations
        class Y {
            public void f() {
                System.out.println(k);
                System.out.println(p);
            }
        }
    }
}
