/*
i/p:
8
0 5 6 0 9 0 0 1

o/p:
11                -> 5+6 = 11
-----------------
i/p:
5
12 31 10 6 40

o/p:
46                -> 6+40 = 46
*/

import java.util.*;

public class lrgstContgsPairOfLargstSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer size = sc.nextInt(),i,ans=0,maxVal,flag=0;
        Integer[] arr = new Integer[size];
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        maxVal = 0;

        for(i=1;i<arr.length;i++)
        {
            if(maxVal<(arr[i-1]+arr[i]))
            {
                maxVal = arr[i-1]+arr[i];
                if(flag==0)
                {
                    ans=maxVal;
                    flag=1;
                }
                else
                {
                    ans=maxVal;
                }
            }
        }
        System.out.print(ans);
    }
}
