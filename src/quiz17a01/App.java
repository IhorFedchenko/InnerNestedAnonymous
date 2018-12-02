package quiz17a01;

public class App {

    public int k0 = 0;
    public final int k1 = 0;
    public static int k2 = 0;

    private int k3 = 0;
    private final int k4 = 0;
    private static int k5 = 0;

    public static void main(String[] args) {
        int k6 = 0;
        final int k7 = 0;

        Runnable runnable = new Runnable() {
            public int k8 = 0;
            public final int k9 = 0;
            /*public static int k3 = 3; Inner classes cannot have static declarations*/

            private int k10 = 0;
            private final int k11 = 0;

            /* private static int k6 = 6;*/
            @Override
            public void run() {
                int k12 = 0;
                final int k13 = 0;

                System.out.println();/*Printable: 2,5,6,7,8,9,10,11,12,13*/
            }
        };

        f(runnable);
    }

    public static void f(Runnable ref) {
        int k14 = 0;
        final int k15 = 0;
        ref.run();
    }
}
