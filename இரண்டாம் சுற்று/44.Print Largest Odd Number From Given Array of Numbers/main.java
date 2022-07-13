/*
i/p:
7
19 73 79 73 19 59 79 

o/p:
79
-------------------
i/p:
5
6 0 12 4 10

o/p:
NO odd number present.
*/

import java.util.Scanner;

public class largstOddNumInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size,i,j,max=0,flag=0;
        size = sc.nextInt();
        int[] arr = new int[size];

        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i]%2!=0 || arr[j]%2!=0)
                {
                    if(arr[i] < arr[j])
                    {
                        if(arr[j]%2!=0 && flag==0)
                        {
                            max=arr[j];
                            flag = 1;
                        }
                        else if(arr[j]%2!=0 && flag==1)
                        {
                            if(max<arr[j])
                            {
                                max=arr[j];
                            }
                        }
                        else if(arr[i]%2!=0)
                        {
                            max=arr[i];
                        }
                    }
                }
            }
        }

        if(max==0)
            System.out.println("No odd number present.");
        else
            System.out.println(max);
    }
}
