package SortedSquare;

public class Result {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] array1 = {-1,-2,3};
       // int[] array2 = s1.SquareArray(array1);
        System.out.println(array1);
//        int[] array3 = s1.SortedArray(array2);

        Solution2 s2 = new Solution2();
        int[] array4 = s2.SquareSorted(array1);
        System.out.println(array4);
        for (int arr:array4){
            System.out.print(arr+" ");
        }
    }
}
