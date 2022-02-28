package DeleteElement;

public class Result {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        Solution s = new Solution();
        int j = s.removeElement(nums, val);
        System.out.println(j);
    }
}
