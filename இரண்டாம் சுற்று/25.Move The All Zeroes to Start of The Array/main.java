/*
i/p:
8
1 2 0 4 3 0 5 0

o/p:
0 0 0 1 2 4 3 5
*/


import java.util.Scanner;

public class moveZeroToStart<arr> {
    public static void main(String[] args) {

        int size,i,currentInd;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] arr = new int[size];

        for(i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        currentInd = size-1;

        for(i=size-1;i>=0;i--)
        {
            if(arr[i]!=0)
            {
                arr[currentInd] = arr[i];
                currentInd--;
            }
        }
        for(i=currentInd;i>=0;i--)
        {
            arr[i]=0;
        }
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
