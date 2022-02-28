package ArrayPractice;

import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args) {
        SolutionConsecutiveOnes s = new SolutionConsecutiveOnes();
        int[] arr = {1,1,0,1,1,1};
        System.out.println(s.findMaxConsecutiveOnes(arr));
    }
}
