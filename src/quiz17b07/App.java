package quiz17b07;

class App {
    int k;
    static class X {
        int p;
        static class Y {
            public void f() {
                //Non-static field cannot be referenced from a static context
                /*System.out.println(k);
                System.out.println(p);*/
            }
        }
    }
}
