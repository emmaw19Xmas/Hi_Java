package DuplicatedZeros;

import java.util.Arrays;

//{0,1,2,3};
public class Solution2 {
    public void duplicateZeros(int[] arr){
        int[] arr2 = arr.clone();
        int count = 0;

        for (int i = 0; i < arr2.length-1; i++) {
            if (arr2[i] != 0) {
                arr[count] = arr2[i];
            } else {
                arr[count] = 0;
                count++;
                if (count == arr2.length) {
                    break;
                } else {
                    arr[count] = 0;
                }

            }
            count++;
            if (count == arr2.length) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}