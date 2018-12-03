package quiz17a04;

public class App {
    public static void main(String[] args) {
        f(new Runnable() {
            public void run() {
                /*System.out.println(k);*///переменная в 10 строке не видна, так как находится за пределами анонимной реализации.
            }
        });
        final int k = 0;
    }

    public static void f(Runnable ref) {
        ref.run();
        final int k = 1;
    }
}
