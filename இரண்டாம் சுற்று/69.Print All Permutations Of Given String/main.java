/*
i/p:
AABB

o/p:
AABB
ABAB
ABBA
BAAB
BABA
BBAA
-----
i/p:
ABCD

o/p:
ABCD
ABDC
ACBD
ACDB
ADCB
ADBC
BACD
BADC
BCAD
BCDA
BDCA
BDAC
CBAD
CBDA
CABD
CADB
CDAB
CDBA
DBCA
DBAC
DCBA
DCAB
DACB
DABC
*/

import java.util.*;

public class Main {

	static ArrayList<String> permutations = new ArrayList<String>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printPermutations(str, 0, str.length() - 1);
		
		for(String s: permutations)
			System.out.println(s);
	}
	
	static void printPermutations(String s, int left, int right) {
    
		if(left == right) {
			if(permutations.indexOf(s) == -1)
			  permutations.add(s);
		} 
    else {
			for(int i=left;i<=right;i++) {
  				s = swap(s, left, i);
  				printPermutations(s, left+1, right);
  				s = swap(s, left, i);
			}
		}
	}
	
	public static String swap(String s, int i, int j) {
		char[] c = s.toCharArray();
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
		String result = "";
		
		for(int k=0;k<c.length;k++)
			result += c[k];
		
		return result;
	}
}
