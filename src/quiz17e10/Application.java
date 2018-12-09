package quiz17e10;

import java.util.LinkedHashMap;
import java.util.Map;

public class Application {
//    создается anonymous static nested class
    public static void f() {
        Map map = new LinkedHashMap() {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return true;
            }
        };
    }
}

