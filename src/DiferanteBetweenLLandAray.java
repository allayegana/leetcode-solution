import java.util.ArrayList;
import java.util.LinkedList;

public class DiferanteBetweenLLandAray {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
           linkedList.add("A");
           linkedList.add("B");
           linkedList.add("C");
           linkedList.add("D");
           linkedList.add(1,"E");
        System.out.println(linkedList);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add(1,"E");
        System.out.println(arrayList);
    }
}
