package DeleteElement;
//Input: nums = [3,2,2,3], val = 3;
//Output: 2, nums = [2,2,_,_]
class Solution {
    public int removeElement(int[] nums, int val) {
        int[] nums2 = nums.clone();
        int j = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] != val){
                nums[j] = nums2[i];
                j++;
            } else {
                ;
            }
        }
        return j;
    }

}
