import java.util.LinkedList;

public class SumTwoLL {

    public static void main(String[] args) {
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(2);
        l1.add(4);
        l1.add(3);

        l2.add(5);
        l2.add(6);
        l2.add(4);


        for (int i = 0; i < l1.size(); i++) {

            for (int j = 0; j < l2.size(); i++) {
                var result = l1.get(i) + l2.get(j);

                if (result == 9){
                    result = 0;

                }
                System.out.println(result);
            }

        }

    }
}
