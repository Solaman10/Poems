/*
i/p: 
He did a good deed

o/p:
He good

i/p:
malayalam is a good level language

o/p:
is good language
*/


import java.util.Scanner;

public class rmvePalindromeWordsInString {

    public static boolean isPalindrome(String str) {

        int front = 0, back = str.length()-1;

        while(front<back)
        {
            if(str.charAt(front++)!=str.charAt(back--))
                return false;
        }
        return  true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        str = str+" ";
        int len = str.length(), ind;
        String word = "", endResult = "";

        for (ind = 0; ind < len; ind++)
        {
            if (str.charAt(ind) != ' ')
                word = word + str.charAt(ind);
            else
            {
                if (!(isPalindrome(word)))
                    endResult += word + " ";

                word = "";
            }
        }
        System.out.println(endResult);
    }
}

