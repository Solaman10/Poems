/*
i/p:
a1b2c3

o/p:
abbccc
*/

import java.util.*;

public class ExpandString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ind=0,ind2,num=0;
        char ch = '\0';

        while(ind<str.length())
        {
            if(str.charAt(ind) >= 65 && str.charAt(ind) <= 90 || str.charAt(ind) >= 97 && str.charAt(ind) <= 122)
            {
                if(ch!='\0')
                {
                    for(ind2=0;ind2<num;ind2++)
                        System.out.print(ch);
                        num=0;
                }
                ch = str.charAt(ind);
            }
            else if(str.charAt(ind) >= 48 && str.charAt(ind) <= 57)
            {
                num = num*10+str.charAt(ind) - 48;
            }
            ++ind;
        }
        
        for(ind2=0;ind2<num;ind2++)
        {
            System.out.print(ch);
        }
    }
}
