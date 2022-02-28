package MergeArrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        if (m == 0){
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
        } else {
            for (int i = m; i < m + n; i++) {
                nums1[i] = nums2[j];
                j++;
            }


        }
        for (int x = 0; x < (nums1.length-1); x++){
            for (int i = 0; i < (nums1.length-1); i++) {
                if (nums1[i] > nums1[i+1]){
                    int temp = nums1[i];
                    nums1[i] = nums1[i+1];
                    nums1[i+1] = temp;
                }
            }
        }
    }
}