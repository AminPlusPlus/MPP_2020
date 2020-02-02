package assignment_l9.prob_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {
    public static Stream<String> streamSection(Stream<String> stream, int m, int n) {

        return  stream.collect(Collectors.toList())
                .subList(m,n+1)
                .stream();

    }

    private static Stream<String> nextStream() {
        return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
                "iii").stream();
    }

    public static void main(String[] args) {

        streamSection(nextStream(),0,1).forEach(System.out::println);

    }


}
