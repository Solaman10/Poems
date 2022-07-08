/*
i/p:
abcdefg
a*de\g

o/p:
Yes
*/

import java.util.Scanner;

public class strngSymbolReplcng {

    public static boolean isMatching(String orgnlStrng, String ptrnStrng) {

        int orgnlInd=0,ptrnInd=0,orgnlSymbInd=-1,ptrnSymbInd=-1,orgnlLen=orgnlStrng.length(),ptrnLen=ptrnStrng.length();


        while (orgnlInd<orgnlLen)
        {
            if(ptrnInd<ptrnLen && (orgnlStrng.charAt(orgnlInd)==ptrnStrng.charAt(ptrnInd)) || ptrnStrng.charAt(ptrnInd)=='\\')
            {
                ++orgnlInd;
                ++ptrnInd;
            }
            else if(ptrnInd<ptrnLen && ptrnStrng.charAt(ptrnInd)=='*')
            {
                orgnlSymbInd = orgnlInd;
                ptrnSymbInd =  ptrnInd++;
            }
            else if(orgnlSymbInd>=0)
            {
                orgnlInd = ++orgnlSymbInd;
                ptrnInd = ptrnSymbInd+1;
            }
            else
                return false;
        }
        while(ptrnInd<ptrnLen && ptrnStrng.charAt(ptrnInd)=='*')
            ++ptrnInd;

        return ptrnInd == ptrnLen;
    }

    public static void main(String[] args) {

        String str1 = new String();
        String str2 = new String();
        Scanner sc = new Scanner(System.in);
        str1 = sc.nextLine();
        str2 = sc.nextLine();

        if(isMatching(str1,str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
