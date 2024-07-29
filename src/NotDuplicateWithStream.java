import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NotDuplicateWithStream {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(3);
//
//        HashSet<Integer> set = new HashSet<Integer>();
//
//       list.removeIf(l -> !set.add(l));
//       list.forEach(System.out::println);

        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};

       // Arrays.stream(list).distinct().forEach(l -> System.out.println(l));
        Arrays.stream(list).distinct().forEach(System.out::println);


    }
}
