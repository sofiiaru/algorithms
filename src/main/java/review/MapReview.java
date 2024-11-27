package review;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");

        System.out.println(firstNonRepeatingChar("aaaaaaabbbbbdce"));
    }

    public static Character firstNonRepeatingChar(String word) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(Character c: word.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> e: map.entrySet()) {
            if(e.getValue() == 1) return e.getKey();
        }
        return null;
    }
}
