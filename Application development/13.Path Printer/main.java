/*
i/p:
2 3
v > > v < < ^ > > v v

o/p:
8 3 4 5 0 9 8 3 4 5 0 5
*/

import java.util.ArrayList;
import java.util.Scanner;

public class pathPrinter {
    public static void main(String[] args) {

        int[][] a = new int[5][];
        a = new int[][]{{1,2,3,4,5},
                        {6,7,8,9,0},
                        {1,2,3,4,5},
                        {6,7,8,9,0},
                        {1,2,3,4,5}};

        int row,column;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        column = sc.nextInt();
        row -= 1;
        column -= 1;

        String symb;
        Scanner sca = new Scanner(System.in);
        symb =  sca.nextLine();
        int symbLen = symb.length(),ind,flag=1;
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(a[row][column]);
        for(ind=0;ind<symbLen;ind++)
        {
            if(symb.charAt(ind)=='>')
            {
                ++column;
                if(column <= 5)
                   arr.add(a[row][column]);
                else
                {
                    flag=0;
                    break;
                }
            }
            if(symb.charAt(ind)=='v')
            {
                ++row;
                if(row <= 5)
                    arr.add(a[row][column]);
                else
                {
                    flag = 0;
                    break;
                }
            }
            if(symb.charAt(ind)=='<')
            {
                --column;
                arr.add(a[row][column]);
            }
            if(symb.charAt(ind)=='^')
            {
                --row;
                arr.add(a[row][column]);
            }
        }
        if(flag==1)
            System.out.print(arr);
        else if(flag == 0)
            System.out.println("Invalid Path");
    }
}


