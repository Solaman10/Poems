/*
i/p:
3
1 4 3 2 5 2
3

o/p:
1 2 2 4 3 5
--------------
i/p:
2
2 1
2

o/p:
1 2
------------------
i/p:
9
1 8 6 2 7 4 3 5 2
4

o/p:
1 2 3 2 8 6 7 4 5
------------------
Given an array of non-negative integers and value x, sort the numbers such that all
values less than x are placed before values greater than or equal to x.(Java)
Note- no additional array to be used

*/

import java.util.Arrays;
import java.util.Scanner;

public class partioningArray {

    public static void swap(int[] arr, int leftInd, int rightInd) {
        int tempLeftInd = leftInd;
        int x = arr[rightInd];
        int temp1 = arr[leftInd];
        int temp2;

        while (leftInd < rightInd) {
            temp2 = arr[leftInd + 1];
            arr[leftInd + 1] = temp1;
            temp1 = temp2;
            leftInd++;
        }
        arr[tempLeftInd] = x;
    }

    public static void solve(int[] arr, int num) {

        int leftInd = 0, rightInd = 1;

        while (rightInd < arr.length) {
            if (arr[leftInd] < num)
                leftInd++;
            else if (arr[leftInd] >= num && arr[rightInd] < num)
                swap(arr, leftInd, rightInd);
            rightInd++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int ind=0;ind<size;ind++)
            arr[ind]=sc.nextInt();
        int num = sc.nextInt();

        solve(arr, num);

        System.out.print(Arrays.toString(arr));
    }
}
