package DuplicatedZeros;

import java.util.Arrays;

//{0,1,2,3};
public class Solution {
    public void duplicateZeros(int[] arr){
        int[] arr2 = arr.clone();
        int count = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr2[i] == 0){
                arr[count] = 0;
                if (count == arr.length-1){
                    break;
                }else{
                    arr[++count]=0;
                }
            } else {
                arr[count] = arr2[i];
            }
            count++;
            if (count == arr.length){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}