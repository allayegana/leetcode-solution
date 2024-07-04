import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);


        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        list1.addAll(list2);

        for (int i = 0; i < list1.size(); i++) {
            list1.stream().sorted().forEach(System.out::println);
        }
    }
}
