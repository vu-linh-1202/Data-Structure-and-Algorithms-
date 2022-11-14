package streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamEx {

    public static void main(String[] args) {
        withoutStream();
        withStream();
    }
    //Using Java 7
    public static void withoutStream() {
        List<Integer> numbers= createDummyData();
        long count = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.printf("There are %d elements that are even", count);
        System.out.println();
    }
    //Using Java 8 Stream API
    public static void withStream() {
        List<Integer> num= createDummyData();
        long count = num.stream().filter(number -> number % 2 == 0).count();
        System.out.printf("There are %d elements that are even", count);
    }
    public static List<Integer> createDummyData(){
        return Arrays.asList(9,3,1,4,7,2,8,0,5);
    }
}
