package assignment_l9.prob_6;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static Set<String> union(List<Set<String>> sets) {
        return sets.stream()
                .reduce(Main::mergeSets)
                .get();

    }

    //Merge sets
    public static Set<String> mergeSets (Set<String>a ,Set<String>b) {
        Set<String> mergeSet = new HashSet<>();
        mergeSet.addAll(a);
        mergeSet.addAll(b);
        return mergeSet;
    }

    public static void main(String[] args) {

        List<Set<String>> setList = new ArrayList<>();

        Set<String> stringHashSet1 = new HashSet<>();
        Set<String> stringHashSet2 = new HashSet<>();
        Set<String> stringHashSet3 = new HashSet<>();

        stringHashSet1.addAll(Arrays.asList("A","B"));
        stringHashSet2.addAll(Arrays.asList("D"));
        stringHashSet3.addAll(Arrays.asList("1","3","5"));

        setList.add(stringHashSet1);
        setList.add(stringHashSet2);
        setList.add(stringHashSet3);


        System.out.println(setList);

        System.out.println(union(setList));

    }

}
