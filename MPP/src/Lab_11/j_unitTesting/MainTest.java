package Lab_11.j_unitTesting;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void multipleWordsToUppercase(){
        List<String> input = Arrays.asList("a", "b", "hello");
        List<String> result = Main.allToUpperCase.apply(input);

        assertEquals(Arrays.asList("A","B","HELLO"),result);
    }

    @Test
    public void employeeCompare(){
        assert (StreamUtils.compareEmployee(new Employee("Aminjoni",5000),
                new Employee("Jack",2000))>0);
    }
}