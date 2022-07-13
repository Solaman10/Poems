/*
i/p:
5

o/p:

          * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 
* * * * * * * * * * * 
  * * * * * * * * * 
    * * * * * * * 
      * * * * * 
        * * * 
          * 
*/

import java.util.Scanner;

public class mirrorTrngleNumPtrn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size,i,j,k;
        size = sc.nextInt();

        for(i=0;i<=size;i++)
        {
            for(j=size-1;j>=i;j--)
            {
                System.out.print("  ");
            }

            for(k=-i;k<=i;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(i=size-1;i>=0;i--)
        {
            for(j=size;j>i;j--)
            {
                System.out.print("  ");
            }

            for(k=-i;k<=i;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
