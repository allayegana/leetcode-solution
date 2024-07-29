public class has22 {

    public static void main(String[] args) {

        int[] nums = {2, 1, 2, 1};

        boolean b = has2Next2(nums);
        System.out.println(b);
    }

    private static boolean has2Next2(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;

            }
        }

        return false;
    }


}
