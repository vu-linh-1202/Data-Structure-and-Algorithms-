package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ConvertToStreamExample {
    public static void main(String[] args) {
        streamFromArray();
        streamFromCollection();
        streamUsingGenerate();
        streamUsingIterate();
        streamUsingRegex();
    }

    /**
     * Generate Streams from APIs like Regex
     */
    private static void streamUsingRegex() {
        String str = "Welcome, to, HCLTech";
        Pattern.compile(",").splitAsStream(str).forEach(System.out::print);
        //output: Welcome to HCLTech
    }

    /**
     * Generate Streams using Stream.iterate()
     */
    private static void streamUsingIterate() {
        Stream<Long> iterateNumber = Stream.iterate(1L, n -> n + 1).limit(5);
        iterateNumber.forEach(System.out::println);
        //output: 12345
    }

    /**
     * Generate Streams using Stream.generate()
     */
    private static void streamUsingGenerate() {
        Stream<String> stream = Stream.generate(() -> "HCLTech").limit(3);
        String[] testStrArr = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(testStrArr));
        //output: [HCLTech, HCLTech, HCLTech]
    }

    /**
     * Generate Stream from Collections
     */
    private static void streamFromCollection() {
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("Kotlin");
        items.add("Python");
        items.add("C#");
        items.add("React");
        items.stream().forEach(item -> System.out.println(item));
    }

    /**
     * Generate Streams from Arrays using .stream or Stream.of
     */
    private static void streamFromArray() {
        String[] language = {"Java", "C#", "C++", "PHP", "Javascript"};
        //get stream using the Arrays.stream
        Stream<String> testStream1 = Arrays.stream(language);

        //get stream using the stream.of
        Stream<String> testStream2 = Stream.of(language);
        testStream2.forEach(x -> System.out.println(x));
    }


}
