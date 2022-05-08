/*
Input : 8 4 1 9 6 2

Output: 8->9  4->6  1->2  9->  2->4
*/

import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.print("Input : ");
        
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        
        System.out.print("Output: ");
        int sol=0,count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    if(count==0)
                    {
                        sol=a[j];
                        count=1;
                    }
                    else
                    {
                        if(sol>a[j])
                         sol=a[j];
                    }
                }
            }
            if(sol==0)
            System.out.print(a[i]+"->" +"  ");
            else
            System.out.print(a[i]+"->"+sol+"  ");
            count=0;
            sol=0;
        }
    }
}
