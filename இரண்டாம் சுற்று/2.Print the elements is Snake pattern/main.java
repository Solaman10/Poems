/*
i/p:
4

o/p:
    1  2  3  4 
   8  7  6  5 
  9 10 11 12 
16 15 14 13 

*/

import java.util.Scanner;

public class snakePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(),row,colmn,prntngNum=0,gap;

        for(row=0;row<size;row++)
        {
            for(gap=row;gap<size-1;gap++)
            {
                System.out.print(" ");
            }

            for(colmn=0;colmn<size;colmn++)
            {
                if(row%2==0)
                {
                    prntngNum=prntngNum+1;
                    System.out.printf("%2d ",prntngNum);
                }
                else if(row%2==1)
                {
                    System.out.printf("%2d ",prntngNum);
                    prntngNum=prntngNum-1;
                }
            }
            prntngNum=prntngNum+size;
            System.out.println();
        }
    }
}
