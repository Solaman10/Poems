/*
i/p:

Enter the size: 5
Generated input
 1  2  3  4  5 
 6  7  8  9 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 

o/p:

Solved output...
 1  2  3  4  5 
10 15 20 25 24 
23 22 21 16 11 
 6  7  8  9 14 
19 18 17 12 13 
*/

import java.util.*;

public class roughClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] x = new int[100][100];
        int size,col,row,layer,left=1,right,nxtLine=1,num=1,ind;
        System.out.print("Enter the size: ");
        size = sc.nextInt();

        System.out.println("Generated input");
        for(col=1;col<=size;col++,System.out.println())
        {
            for(row=1;row<=size;row++)
            {
                System.out.printf("%2d ",num);
                x[col][row] = num;
                ++num;
            }
        }

        layer = size/2;
        right = size;

        System.out.println("\nSolved output...");
        while(layer!=0)
        {
            for(ind=left;ind<right;ind++,nxtLine++)
            {
                System.out.printf("%2d ",x[left][ind]);
                if(nxtLine%size==0)
                {
                    System.out.println();
                }
            }

            for(ind=left;ind<right;ind++,nxtLine++)
            {
                System.out.printf("%2d ",x[ind][right]);
                if(nxtLine%size==0)
                {
                    System.out.println();
                }
            }

            for(ind=right;ind>left;ind--,nxtLine++)
            {
                System.out.printf("%2d ",x[right][ind]);
                if(nxtLine%size==0)
                {
                    System.out.println();
                }
            }

            for(ind=right;ind>left;ind--,nxtLine++)
            {
                System.out.printf("%2d ",x[ind][left]);
                if(nxtLine%size==0)
                {
                    System.out.println();
                }
            }
            ++left;
            --right;
            --layer;
        }

        if(size%2==1)
        {
            System.out.printf("%2d ",x[size/2+1][size/2+1]);
        }
    }
}
