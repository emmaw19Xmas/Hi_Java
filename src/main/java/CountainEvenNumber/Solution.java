package CountainEvenNumber;

public class Solution {
    public int findNumbers(int[] nums){
        int n_length = 0;
        int count = 0;
        for (int num:nums){
            //solu1:
            //n_length  = String.valueOf(num).length();
            n_length = Integer.toString(num).length()%2;
            if (n_length == 0){
                count++;
            }

        }
        return count;
    }
}
