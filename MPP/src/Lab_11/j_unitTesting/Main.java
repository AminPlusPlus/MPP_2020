package Lab_11.j_unitTesting;


import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    static Function<List<String>, List<String>> allToUpperCase =
            words -> words.stream()
                     .map(String::toUpperCase)
                     .collect(Collectors.toList());

    public static void main(String[] args) {

    }

    public boolean getOne (){
        return false;
    }
}


