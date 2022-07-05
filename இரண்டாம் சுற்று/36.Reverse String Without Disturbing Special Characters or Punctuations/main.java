/*
i/p:
A man, in the boat says : I see 1-2-3 in the sky

o/p:
y kse, ht ni3 21ee sIsy : a sta o-b-e ht nin amA
*/

import java.util.Scanner;

public class reverseStringNotPnctuatns {

    static boolean ischar(char s)
    {
        if((s>='a' && s<='z') || (s>='A' && s<='Z') || (s>='0' && s<='9'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String  strng;
        strng = sc.nextLine();
        char[] str = strng.toCharArray();
        int left=0, right=str.length-1;
        char temp;

        while(left<right)
        {
            if(ischar(str[left]) && ischar(str[right]))
            {
                temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
            else
            {
                if(ischar(str[left]) == false)
                {
                    left++;
                }
                if(ischar(str[right]) == false)
                {
                    right--;
                }
            }
        }
        for(int ind=0;ind<str.length;ind++)
        {
            System.out.print(str[ind]);
        }
    }
}
