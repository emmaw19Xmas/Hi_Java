package ArrayPractice;

class SolutionConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Hint: Initialise and declare a variable here to
        // keep track of how many 1's you've seen in a row.
        // nums is an Array
        int final_count = 0;
        int count = 0;
        for (int num : nums) {
            // Do something with element nums[i].
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > final_count)
                final_count = count;
        }
        return final_count;
    }
}
