/*
i/p:
a(b(c)[2])[2]d

o/p:
abccbccd
---------------
i/p:
((x)[3](y)[2]z)[2]

o/p:
xxxyyzxxxyyz
*/

import java.io.*;
import java.util.*;

public class doAndErase{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String temp = "";
        String alpha = "";
        ArrayList<String> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') 
                stack.add(""+ch);
            else if (ch >= 'a' && ch <= 'z') {
                alpha += ch;
                
                if (!stack.isEmpty() && !stack.get(stack.size()-1).equals("(")) 
                    alpha = stack.remove(stack.size()-1) + alpha;
                
                stack.add(alpha);
                alpha = "";
            } 
            else if (ch == ')') {
                temp = stack.remove(stack.size()-1);
                
                for(; !stack.get(stack.size()-1).equals("(");) 
                    temp = stack.remove(stack.size()-1) + temp;

                stack.remove(stack.size()-1);
                stack.add(temp);
            } 
            else if (ch == '[') {
                i++;
                temp = stack.remove(stack.size()-1);
                String t = temp;

                if(s.charAt(i)=='0') 
                    temp = "";

                for(int j = 1; j < s.charAt(i)-48; j++) 
                    temp += t;                
                i++;
                
                if(s.charAt(i) == ']') 
                    stack.add(temp);
            }
        }

        for(int i=0;i<stack.size();i++)
            System.out.print(stack.get(i));
    }
}
