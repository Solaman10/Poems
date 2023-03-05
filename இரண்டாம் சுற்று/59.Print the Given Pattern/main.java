/*
i/p:
5

o/p:

1 6 10 13 15 
2 7 11 14 
3 8 12 
4 9 
5 
--------------------
i/p:
10

o/p:

1 11 20 28 35 41 46 50 53 55 
2 12 21 29 36 42 47 51 54 
3 13 22 30 37 43 48 52 
4 14 23 31 38 44 49 
5 15 24 32 39 45 
6 16 25 33 40 
7 17 26 34 
8 18 27 
9 19 
10 

*/

import java.util.Scanner;
public class pattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt(),i,j,prntVal;

        for(i=1;i<=size;i++)
        {
            System.out.print(i+" ");
            prntVal = i;

            for(j=size;j>i;j--)
            {
                System.out.print(prntVal + j + " ");
                prntVal += j;
            }
            System.out.println();
        }
    }
}
