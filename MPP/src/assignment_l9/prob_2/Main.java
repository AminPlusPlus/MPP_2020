package assignment_l9.prob_2;

import java.util.IntSummaryStatistics;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntSummaryStatistics summaryStatistics =
                 IntStream.of(1,2,3,4,5,6)
                .summaryStatistics();

        //MAX
        System.out.println(summaryStatistics.getMax());

        //MIN
        System.out.println(summaryStatistics.getMin());

        //Summary
        System.out.println(summaryStatistics);
    }
}
