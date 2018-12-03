package quiz17b05;

class App {
    int k;
    class X {
        /*static*/ int p;//Inner classes cannot have static declarations
        /*static*/ class Y { //Inner classes cannot have static declarations
            public void f() {
                System.out.println(k);
                System.out.println(p);
            }
        }
    }
}
