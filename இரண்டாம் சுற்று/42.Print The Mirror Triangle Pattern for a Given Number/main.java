/*
i/p:
5

o/p:
                0 
             1  0  1 
          2  1  0  1  2 
       3  2  1  0  1  2  3 
    4  3  2  1  0  1  2  3  4 
 5  4  3  2  1  0  1  2  3  4  5 
 
*/

import java.util.Scanner;

public class mirrorTrngleNumPtrn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size,i,j;
        size = sc.nextInt();

        for(i=0; i<=size; i++)
        {

            for(j=1; j<=size-i; j++)
            {
                System.out.print("   ");
            }

            for(j=i; j>=-i; j--)
            {
                System.out.printf("%2d ",Math.abs(j));
            }

            System.out.println();
        }
    }
}
