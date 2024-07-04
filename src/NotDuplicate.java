public class NotDuplicate {

    public static void main(String[] args) {

        int[] nums = {1,1,2,3,4};

       int rd  = removeDuplicate(nums);
        System.out.println();
        for(int i = 0 ; i < rd ; i++){
            System.out.println(nums[i]);
        }
    }

    private static int removeDuplicate(int[] nums) {
        int rd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[rd] != nums[i]) {
                rd++;
                nums[rd] = nums[i];
            }
        }
        return rd +1;
    }
}
