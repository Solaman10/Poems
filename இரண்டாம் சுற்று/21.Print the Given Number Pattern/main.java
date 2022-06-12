/*

i/p: 7 3 

o/p: 
1 8 15 
2 9 16 
3 10 17 
4 11 18 
5 12 19 
6 13 20 
7 14 21 

*/

import java.util.Scanner;

public class NumPattern {
    public static void main(String[] args) {

        Integer m,n,i,j,k;
        Scanner sc=new Scanner(System.in);
        Scanner sca=new Scanner(System.in);

        m=sc.nextInt();
        n=sca.nextInt();

        for(i=1;i<=m;i++) {
            k=i;
            for(j=1;j<=n;j++) {
                System.out.print(k + " ");
                k+=m;
            }
            System.out.println();
        }
    }
}
