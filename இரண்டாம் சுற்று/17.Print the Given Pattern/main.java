/*
i/p:
5

o/p:
              1
           2  6
        3  7 10
     4  8 11 13
  5  9 12 14 15
*/

import java.util.Scanner;
public class doAndErase
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size,i,j,k,prntVal,addVal;
        size = sc.nextInt();

        for(i=1;i<=size;i++)
        {
            addVal=size-1;
            for(j=i;j<=size;j++)
            {
                if(j==size)
                {
                    System.out.printf("%3d",i);
                    prntVal=i;

                    for(k=size-i+2;k<=size;k++)
                    {
                        prntVal=prntVal+addVal;
                        System.out.printf("%3d",prntVal);
                        addVal--;
                    }
                    System.out.println();
                }
                else
                    System.out.print("   ");
            }
        }
    }
}
