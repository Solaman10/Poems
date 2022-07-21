/*
i/p:
6
1 2 4 1 2 1 4

o/p:
4
---------------
i/p:
5
1 2 1 4 3 5

o/p:
1
*/

import java.util.*;

public class roughClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(),i,j,flag=1;
        int[] arr = new int[size];
        for(i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(i=arr.length-1;i>=0;i--)
        {
            for(j=i-1;j>=0;j--)
            {
                if(arr[i]==arr[j])
                {
                    flag=0;
                    System.out.println(arr[j]);
                    i=0;
                    j=0;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("No duplicates");
        }
    }
}
