import java.util.*;

public class maps {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("kiran", 75);
        map.put("sahasra", 55);
        map.put("Samanvitha", 90);

        map.entrySet().stream()
                .map(entry -> entry.getKey())
                .forEach(System.out::println);
    }
}