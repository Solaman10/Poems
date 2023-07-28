/*
i/p:
1
o/p:
A
------
i/p:
26
o/p:
Z
------
i/p:
1000
o/p:
ALL
*/

import java.util.*;

public class Main
{
    public static String convertToTitle(int columnNum){
        String ans = "";
        while(columnNum>0){
            columnNum--;
            ans = (char) ('A'+(columnNum%26)) + ans;
            columnNum /= 26;
        }
        
        return ans;
    }
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.print(convertToTitle(num));

	}
}
