package ExampleJava7andJava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filter_Number {
    public static void main(String[] args) {
        beforeJava8();
        System.out.println();
        java8Lamda();
    }

    private static void java8Lamda() {
        List<Integer> numbers= createDummyData();
        Collections.sort(numbers);
        Stream<Integer> stream = numbers.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                // return odd number
                return integer % 2 !=0;
            }
        });
        stream.forEach(integer -> System.out.print(integer+ " "));
    }

    private static void beforeJava8() {
        List<Integer> numbers= createDummyData();
        // get number and filter odd number
        numbers.stream().sorted().filter(t-> t% 2 !=0).forEach(t-> System.out.print(t+" "));
    }

    // Create 1 list number
    public static List<Integer> createDummyData(){
        return Arrays.asList(9,3,1,4,7,2,8,0,5);
    }
}
