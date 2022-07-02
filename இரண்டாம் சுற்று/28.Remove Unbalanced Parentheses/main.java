/*
i/p: 
((abc)((de))

o/p:
((abc)(de))
*/


import java.util.Scanner;

public class rmveUnblncedParntheses {

    public static String deleteBracket(String strng, char ch, int brckCount){

        String balncedExprssn = "";
        int count=0, ind;

        for(ind=0;ind<strng.length();ind++)
        {
            if(strng.charAt(ind) == ch)
                ++count;
            if(count<=brckCount || strng.charAt(ind) != ch)
                balncedExprssn += strng.charAt(ind);
        }
        return balncedExprssn;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();

        int ind, open, close, openBracket=0, closeBracket=0, blncedExprssn;

        for(ind=0;ind<str.length();ind++)
        {
            if(str.charAt(ind) == '(')
                ++openBracket;
            if(str.charAt(ind) == ')')
                ++closeBracket;
        }
        if(openBracket>closeBracket)
            System.out.println(deleteBracket(str, '(',closeBracket));
        else if(openBracket<closeBracket)
            System.out.println(deleteBracket(str, ')',openBracket));
    }
}
