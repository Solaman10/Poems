/*
i/p:
This is a sample text for testing

o/p:
ttissaepeassitt
(or)                   //If multiple palindrome of the same size could be 
aeissttettssiea       // formed, then it is enough if one of them is printed.

*/


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longstPlndrmShffleRearnge {

    public static String longPalindrome(String a) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<a.length(); i++)
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);

        char mid = 0;
        boolean mid_chosen = false;
        StringBuilder left = new StringBuilder();

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {

            if(!mid_chosen && entry.getValue() % 2 != 0) { //odd
                mid_chosen = true;
                mid = entry.getKey();
            }

            //Adding elements to left
            for(int k=0; k<entry.getValue()/2; k++)
                left.append(entry.getKey());
        }

        //New Step added to sort it lexicographically
        char[] leftChArr = left.toString().toCharArray();
        Arrays.sort(leftChArr);

        StringBuilder leftC = new StringBuilder(new String(leftChArr));
        StringBuilder right = new StringBuilder();

        //adding reverse elements to left
        for(int j=leftC.length()-1; j>=0; j--)
            right.append(leftC.charAt(j));

        if(mid_chosen == true)
            leftC.append(mid).append(right);
        else
            leftC.append(right);

        return leftC.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = longPalindrome(str).trim();

        System.out.println("Max possible palindrome: "+ans.length()+" characters \n"+ans);
    }
}
