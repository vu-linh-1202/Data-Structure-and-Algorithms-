package ExampleJava7andJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortInJava78 {
    public static void main(String[] args) {
        List<String> list1 = createDummyData();
        List<String> list2 = createDummyData();

        // Sort using Java 7 syntax
        sortUsingJava7(list1);
        System.out.println(list1);

        //Sort using Java 8 syntax
        sortUsingJava8(list2);
        System.out.println(list2);
    }

    public static void sortUsingJava7(List<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public static void sortUsingJava8(List<String> list){
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
    }
    private static List<String> createDummyData() {
        List<String> list = new ArrayList<>();
        list.add("Sleep");
        list.add("Play");
        list.add("Eat");
        list.add("Talk");
        list.add("Run");
        return list;
    }
}
