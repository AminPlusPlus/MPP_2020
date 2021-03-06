package assignment_l9.prob_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        transactions.stream()
                .filter(y -> y.getYear()>= 2011)
                .sorted(comparing(s-> s.getYear()))
                .forEach(System.out::println);

        System.out.println();
        // Query 2: What are all the unique cities where the traders work?
        transactions.stream()
                .map(c->c.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println();
        // Query 3: Find all traders from Cambridge and sort them by name.
        transactions.stream()
                .filter(f->f.getTrader().getCity().equals("Cambridge"))
                .map(n->n.getTrader().getName())
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        // Query 4: Return a string of all traders names sorted alphabetically.
        transactions.stream()
                .map(n->n.getTrader().getName())
                .sorted()
                .forEach(System.out::println);

        // Query 5: Are there any trader based in Milan?
        System.out.println();
        Boolean milan =  transactions.stream()
                .anyMatch(s->s.getTrader().getCity().equals("Milan"));
        System.out.println(milan);

        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .filter(m->m.getTrader().getCity().equals("Milan"))
                .forEach(s-> s.getTrader().setCity("Cambridge"));

        
        // Query 7: What's the highest value in all the transactions?
        Optional<Integer> max =  transactions.stream()
                .map(h->h.getValue())
                .reduce(Integer::max);

        max.ifPresent(System.out::println);


    }
}
