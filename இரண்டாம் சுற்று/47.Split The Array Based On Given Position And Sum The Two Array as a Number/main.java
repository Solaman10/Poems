/*
i/p:
7                 //number of array elements
2 6 3 0 6 3 1     //array elements
4                 //split position (index position)

o/p:
26337            // 26306 + 31 = 26337
*/

import java.util.Scanner;

public class sumOfElementFrontAndBack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(),i,j,indx,ans1=0,ans2=0,multplr=0,temp=0;
        int[] arr = new int[size];

        for(i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        indx = sc.nextInt();
        i = 0;

        for(i=indx;i>=0;i--)
        {
            if(i==indx)
            {
                ans1 = arr[i];
                multplr=10;
            }
            else
            {
                if(arr[i] == 0)
                {
                    temp = 1*multplr;
                    ans1 = ans1+temp-multplr;
                    multplr = multplr*10;
                }
                else
                {
                    temp = arr[i] * multplr;
                    ans1 = ans1 + temp;
                    multplr = multplr * 10;
                }
            }
        }
        
        temp = 0;
        multplr = 0;

        for(j=arr.length-1;j>indx;j--)
        {
            if(j==arr.length-1)
            {
                ans2 = arr[j];
                multplr = 10;
            }
            else
            {
                if(arr[j] == 0)
                {
                    temp = 1*multplr;
                    ans2 = ans2+temp-multplr;
                    multplr = multplr*10;
                }
                else
                {
                    temp = arr[j] * multplr;
                    ans2 = ans2 + temp;
                    multplr = multplr * 10;
                }
            }
        }
        System.out.println(ans1+ans2);
    }
}
