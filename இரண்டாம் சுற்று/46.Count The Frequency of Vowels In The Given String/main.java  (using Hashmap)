/*
i/p:
welcome to ZOHO

o/p:                      ||
a - 2                     || o - 4
o - 4                     || a - 2
                          ||
*/

import java.util.HashMap;
import java.util.Scanner;

public class countTheVowelsInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> hmap = new HashMap<>();
        Integer i,countA=0,countE=0,countI=0,countO=0,countU=0;

        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A')
            {
                hmap.put('a',++countA);
            }
            if(str.charAt(i) == 'e' || str.charAt(i) == 'E')
            {
                hmap.put('e',++countE);
            }
            if(str.charAt(i) == 'i' || str.charAt(i) == 'I')
            {
                hmap.put('i',++countI);
            }
            if(str.charAt(i) == 'o' || str.charAt(i) == 'O')
            {
                hmap.put('o',++countO);
            }
            if(str.charAt(i) == 'u' || str.charAt(i) == 'U')
            {
                hmap.put('u',++countU);
            }
        }

        System.out.println(hmap);
    }
}
