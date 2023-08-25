/*
input:
1
output:
4

input:
2
output:
7

input:
3
output:
44
*/

import java.util.*;
public class Main{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int N,indx=2,itr;
    System.out.print("Enter the n value: ");
    N = sc.nextInt();
    int[] a=new int[(N*2)+3];
    a[1] = 4;
    a[2] = 7;
    
    for(itr=1;itr<=N/2;itr++)
    {
        a[itr+indx]=(a[itr]*10)+4;
        indx++;
        a[itr+indx]=(a[itr]*10)+7;
    }
    
    System.out.print(a[N]);
}
}
