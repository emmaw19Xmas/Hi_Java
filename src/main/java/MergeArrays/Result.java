package MergeArrays;

import java.util.Arrays;

public class Result {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int m = 3;
        int[] nums2 ={1,2,3};
        int n = 3;
        Solution s = new Solution();
        s.merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }
}
