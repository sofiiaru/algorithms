package review;

import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {

        //HAshSet does NOT maintain insertion order, but LinkedHashSet does
        Set<Student> set = new HashSet<>();

        set.add(new Student(1, "Jared"));
        set.add(new Student(2, "Mike"));
        set.add(new Student(3, "Julie"));
        set.add(new Student(4, "Mary"));
        set.add(new Student(4, "Mary"));

        System.out.println(firstRepeatingChar("Java"));



    }

    public static Character firstRepeatingChar(String word) {
        Set<Character> set = new HashSet<>();
        for(char c : word.toCharArray()) {
            if(!set.add(c)) return c;
        }
        return null;
    }
}
