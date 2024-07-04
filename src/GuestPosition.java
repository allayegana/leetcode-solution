import java.util.ArrayList;
import java.util.List;

public class GuestPosition {


    private static void position(int target) {

        int[] nums = {3,4,5,8,9,8};

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                index = i;
                System.out.println(index);
            }
        }
    }

    public static void main(String[] args) {
        int target = 5;
        position(target);
    }



//    private static void position(int target) {
//
//        List<Integer> positions = new ArrayList<Integer>();
//        positions.add(3);
//        positions.add(5);
//        positions.add(7);
//        positions.add(8);
//        positions.add(8);
//        System.out.println(positions.indexOf(target));
//    }


}
