/*
i/p:
welcome to ZOHO

o/p:                      ||
a - 2                     || o - 4
o - 4                     || a - 2
                          ||
*/

import java.util.Scanner;

public class countTheVowelsInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i,countA=0,countE=0,countI=0,countO=0,countU=0;

        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A')
            {
                ++countA;
            }
            if(str.charAt(i) == 'e' || str.charAt(i) == 'E')
            {
                ++countE;
            }
            if(str.charAt(i) == 'i' || str.charAt(i) == 'I')
            {
                ++countI;
            }
            if(str.charAt(i) == 'o' || str.charAt(i) == 'O')
            {
                ++countO;
            }
            if(str.charAt(i) == 'u' || str.charAt(i) == 'U')
            {
                ++countU;
            }
        }

        if(countA != 0)
            System.out.println("a" +" - "+ countA);
        if(countE != 0)
            System.out.println("e" +" - "+ countE);
        if(countI != 0)
            System.out.println("i" +" - "+ countI);
        if(countO != 0)
            System.out.println("o" +" - "+ countO);
        if(countU != 0)
            System.out.println("u" +" - "+ countU);
    }
}
