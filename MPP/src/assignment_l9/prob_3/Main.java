package assignment_l9.prob_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static int countWords(List<String> words, char c, char d, int len) {

        return (int) words.stream()
                .filter(a -> a.length() == len)
                .filter(b -> b.contains(Character.toString(c)))
                .filter(w -> !w.contains(Character.toString(d)))
                .count();

    }

    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("One");
        nums.add("Two");
        nums.add("Two");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");

        System.out.println(countWords(nums,'T','q',3));

    }
}
