import java.util.Arrays;

public class Remove000 {


    public static void main(String[] args) {
        int[] nums = {0,9,0,4,0,1,2,9,0,64,0};
        removeZero(nums);
    }

    public static void removeZero(int[] nums) {

        int[] num0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                num0 = new int[]{nums[i]};
                System.out.println(Arrays.toString(num0));
            }
        }
    }
}
