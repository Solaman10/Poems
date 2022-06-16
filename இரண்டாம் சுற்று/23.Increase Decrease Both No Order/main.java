/*
i/p: 
n=9
1 2 3 4 5 6 7 8 9

o/p: 
Increase

i/p:
9
9 8 7 6 5 4 3 4 5

o/p: 
Decrease and Increase
*/


import java.util.Scanner;

public class incrseDecrseNoOrder {
    public static void main(String[] args) {
        int n,i,j,k;
        boolean incr=false,decr=false;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Scanner sca = new Scanner(System.in);
        int[] arr = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sca.nextInt();
        }

        for(i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                incr=true;
            }
            else
                break;
        }
        for(j=1;j<n;j++)
        {
            if(arr[j]<arr[j-1])
            {
                decr=true;
            }
            else
                break;
        }

        if(i>=n && incr==true)
            System.out.print("Increase");
        else if(j>=n && decr==true)
            System.out.print("Decrease");
        else if(incr==true)
        {
            k=i+1;
            while(k<n)
            {
                if(arr[k]<arr[k-1])
                {
                    decr=true;
                    k++;
                }
                else
                    break;
            }
            if(k==n && decr==true)
                System.out.print("Increase and Decrease");
            else
                System.out.print("No order");
        }
        else if(decr==true)
        {
            k=j+1;
            while(k<n)
            {
                if(arr[k]>arr[k-1])
                {
                    incr=true;
                    k++;
                }
                else
                    break;
            }
            if(k==n && incr==true)
                System.out.print("Decrease and Increase");
            else
                System.out.print("No order");
        }

    }
}
