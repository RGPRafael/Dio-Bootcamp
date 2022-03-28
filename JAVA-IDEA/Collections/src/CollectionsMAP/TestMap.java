package CollectionsMAP;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    //Map<E> mapa = new Type();
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println(map);

    }
}
