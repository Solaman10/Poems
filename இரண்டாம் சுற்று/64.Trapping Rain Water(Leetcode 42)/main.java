/*
i/p:
12
0 1 0 2 1 0 1 3 2 1 2 1
o/p:
6
-------------------------
i/p:
6
4 2 0 3 2 5
o/p:
9
*/


import java.util.Arrays;
import java.util.Scanner;

public class trapingWater {

    private static int trap(int[] heights){

        int left=0,right=heights.length-1;
        int leftMax = heights[0],rightMax=heights[heights.length-1];
        int water = 0;

        while(left<right){
            if(leftMax<rightMax){
                left++;
                if(leftMax<heights[left])
                    leftMax = heights[left];
                else
                    water += leftMax-heights[left];
            }
            else {
                right--;
                if(rightMax<heights[right])
                    rightMax = heights[right];
                else
                    water += rightMax-heights[right];
            }
        }
        return water;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();

        System.out.println(trap(arr));
    }
}
