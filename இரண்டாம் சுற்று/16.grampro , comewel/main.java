/*
i/p: program

o/p:
      g
     gr
    gra
   gram
  gramp
 grampr
grampro

*/

import java.util.Scanner;

public class gramPro {
    public static void main(String[] args) {
        int i,j,mid=0,k,count=0;
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        mid=(0+str.length()-1)/2;

        for(i=str.length();i>=1;i--) {
            if(i>mid+1) {
                for(j=i;j>=2;j--) {
                    System.out.print(" ");
                }
                for(k=0;k<=count;k++) {
                    System.out.print(str.charAt(mid+k));
                }
                System.out.print("\n");
            }
            else if(i<=mid+1 && i>=2) {
                for(j=i-1;j>=1;j--) {
                    System.out.print(" ");
                }
                for(k=0;k<=count;k++) {
                    System.out.print(str.charAt((mid+k)%str.length()));
                }
                System.out.print("\n");
            }
            else if(i==1) {
                for(k=0;k<=count;k++) {
                    System.out.print(str.charAt((mid+k)%str.length()));
                }
            }
            count++;
        }
    }
}
