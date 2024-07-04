import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class NotDuplicateNums {

    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(4);
        var s = removeNums(nums);

        System.out.println(s);
    }
//
//    private static void removeNums(LinkedList<Integer> nums) {
//
//        Map<Integer,Integer> map = new HashMap();
//
//        for (Integer num : nums) {
//            if (map.containsKey(num)) {
//                map.put(num, map.get(num) + 1);
//            }else {
//                map.put(num, 1);
//            }
//        }
//
//        System.out.println("Duplicate elements in the array:");
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() <= 1) {
//
//                System.out.println(entry.getKey());
//            }
//    }

    private static HashSet<Integer> removeNums(LinkedList<Integer> nums) {
        return new HashSet<>(nums);
    }

}
