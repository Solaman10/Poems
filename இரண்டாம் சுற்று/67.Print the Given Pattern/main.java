/*
i/p:
5

o/p:
 1  
 3  2
 6  5  4
10  9  8  7
15 14 13 12 11
*/

import java.util.*;
 
class Main{
	public static void main(String args[]){
    
		int i,j,n,k=1;
 		Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of lines");
 		n=sc.nextInt();
 		
		for(i=1;i<=n;i++)
		{
    		k = (i*(i+1))/2;
    		for(j=1;j<=i;j++){
    			System.out.printf("%3d",k);
    			k--;
    		}
    		System.out.println();				 			
		}
	}
}
