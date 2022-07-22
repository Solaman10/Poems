/*
i/p:
5
1 2 3 2 1

o/p: 
Odd              // oddIndAvg = 2 , EvenIndAvg = 1 -> so , "Odd"
-----------
i/p:
10
1 5 2 4 3 3 4 2 5 1        

o/p
None            // oddIndAvg = 3 , EvenIndAvg = 3 -> so , "None"
*/

import java.util.*;

public class oddOrEvenBasedGreaterThanAvg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size,avg=0,i,odd=0,even=0,countOdd=0,countEven=0;
        size = sc.nextInt();
        int[] arr = new int[size];

        for(i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
            avg+=arr[i];
        }
        avg = avg/arr.length;
        //System.out.println("Average is: "+avg);

        for(i=0;i<size;i++)
        {
            if(i%2==1)
            {
                odd+=arr[i];
                ++countOdd;
            }
            if(i%2==0)
            {
                even+=arr[i];
                ++countEven;
            }
        }
        if(odd/countOdd > avg)
            System.out.println("Odd");
        else if(even/countEven > avg)
            System.out.println("Even");
        else
            System.out.println("None");
    }
}
