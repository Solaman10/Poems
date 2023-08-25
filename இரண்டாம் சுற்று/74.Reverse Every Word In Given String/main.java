/*
i/p:
one two three
o/p:
three two one 
--------------------------------
i/p:
solaimani    is  a good    boy
o/p:
boy good a is solaimani

*/

import java.util.Scanner;

public class reverseWordsRecursion {

    static String ans="";
    private static String reverse(String str){
        String ans = "";
        for(int ind=str.length()-1;ind>=0;ind--)
            ans += str.charAt(ind);

        return ans+" ";
    }

    private static void reverse(String str,String word,int indx){
        if(indx<0)
            return;
        if(str.charAt(indx)==' ' && !word.isEmpty()){
            ans += reverse(word);
            word = "";
        }
        else if(Character.isAlphabetic(str.charAt(indx)))
            word += str.charAt(indx);

        reverse(str,word,indx-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = " ";
        str += sc.nextLine();
        reverse(str,"",str.length()-1);
        System.out.println(ans);
    }
}
