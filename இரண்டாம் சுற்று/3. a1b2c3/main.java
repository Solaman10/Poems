/*
i/p:
a1b2c3

o/p:
abbccc
*/

import java.util.Scanner;

public class ExpandString {
    public static void main(String[] args) {
        String expr;
        Scanner sc=new Scanner(System.in);
        expr = sc.nextLine();
        int ind=0,ind2, tempVal=0;
        char tempChar = '\0';

        while(ind<expr.length())
        {
            if((expr.charAt(ind)>=65 && expr.charAt(ind)<=90) || (expr.charAt(ind)>=97 && expr.charAt(ind)<=122))
            {
                tempChar = expr.charAt(ind);
                ++ind;
            }
            else if (expr.charAt(ind) >= 48 && expr.charAt(ind) <= 57)
            {
                    tempVal = expr.charAt(ind) - 48;

                    for (ind2 = 1; ind2 <= tempVal; ind2++)
                    {
                        System.out.print(tempChar);
                    }
                    tempVal = 0;
                    ++ind;

            }
        }
    }
}
