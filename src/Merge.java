import java.util.ArrayList;
import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        int[] nums1 = {11,12,13,0,0,0};
        int[] nums2 = {1,2,3};
        int m = 3;
        int n = 3;
        mergeSorted(nums1,m,nums2,n);

    }

    private static void mergeSorted(int[] nums1, int m, int[] nums2, int n) {

        int p = m+n - 1;
        int p1 = m-1;
        int p2 = n-1;

        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1];
                p--;
                p1--;

            }else {
                nums1[p] = nums2[p2];
                p2--;
                p--;
            }
        }

        while(p2 >= 0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
