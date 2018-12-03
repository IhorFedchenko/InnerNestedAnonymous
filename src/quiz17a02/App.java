package quiz17a02;

public class App {
    public static void main(String[] args) {
        f(new Runnable() {
            public void run() {
               /* System.out.println(k);*/ //переменная из 10 строки не видна, так как находится за анонимной реализацией класса.
            }
        });
        final int k = 0;
    }

    public static void f(Runnable ref) {
        final int k = 1;
        ref.run();
    }
}
