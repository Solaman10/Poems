/*
Input : 8 4 1 9 6 2

Output: 8->9  4->6  1->2  9->  2->4
*/

import java.util.Scanner;

public class FindPrintGreaterNumforEveryElemnt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,j,max=0,flag=0;
        Scanner sca=new Scanner(System.in);
        int[] arr = new int[n];
        for(i=0;i<n;i++) {
            arr[i] = sca.nextInt();
        }

        for(i=0;i<n;i++) {
            for(j=0;j<n;j++) {
                if(arr[i]<arr[j]) {
                    if(flag==0) {
                        max=arr[j];
                        flag=1;
                    }
                    else if(max>arr[j]) {
                        max=arr[j];
                    }
                }

            }
            if (max==0)
                System.out.print(arr[i]+"->"+"  ");
            else
                System.out.print(arr[i]+"->"+max+"  ");
            flag=0;
            max=0;
        }
    }
}
