package quiz17e09;

import java.util.LinkedHashMap;
import java.util.Map;

public class Application {
//    создается anonymous inner class
    public void f() {
        Map map = new LinkedHashMap() {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return true;
            }
        };
    }
}