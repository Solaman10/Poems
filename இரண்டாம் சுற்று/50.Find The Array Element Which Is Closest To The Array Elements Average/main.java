/*
i/p:
5
1 2 3 4 5

o/p:
Average is: 3
Closest element to average is: 3
-----------------------------------
i/p:
6
7 12 4 18 27 37

o/p:
Average is: 17
Closest element to average is: 18
*/

import java.util.*;

public class clstToAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size,avg=0,i,difrnce1,difrnce2,ans=0;
        size = sc.nextInt();
        int[] arr = new int[size];

        for(i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
            avg+=arr[i];
        }
        avg = avg/arr.length;
        System.out.println("Average is: "+avg);

        difrnce1 = avg - arr[0];

        for(i=1;i<size;i++)
        {
            difrnce2 = avg - arr[i];
            if(Math.abs(difrnce1) > Math.abs(difrnce2))
            {
                ans = arr[i];
                difrnce1 = difrnce2;
            }
        }
        System.out.println("Closest element to average is: "+ans);
    }
}
