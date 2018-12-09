package quiz17b12;

class App {
    static int k;
    class X {
        //Inner classes cannot have static declarations
        /*static*/ int p;
        //Inner classes cannot have static declarations
        /*static */class Y {//Inner classes cannot have static declarations
            public void f() {
                System.out.println(k);
                System.out.println(p);
            }
        }
    }
}
