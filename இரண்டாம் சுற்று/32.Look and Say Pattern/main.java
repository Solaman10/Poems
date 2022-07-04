/*
i/p:
5

o/p:
1
1 1 
2 1 
1 2 1 1 
1 1 1 2 2 1 
*/

import java.util.Scanner;

public class lookAndSay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size, ind1=1;
        size = sc.nextInt();
        String str = "1";

        System.out.println(str);
        while(ind1<size)
        {
            String newStr = "";
            int count = 1;
            char tempChar = str.charAt(0);
            for(int ind2=1;ind2<str.length();ind2++)
            {
                if(str.charAt(ind2) != str.charAt(ind2-1))
                {
                    System.out.print(count+" "+tempChar+" ");
                    newStr=newStr+count+tempChar;
                    tempChar = str.charAt(ind2);
                    count=1;
                }
                else
                {
                    ++count;
                }
            }
            System.out.println(count+" "+tempChar+" ");
            newStr=newStr+count+tempChar;
            str = newStr;
            ++ind1;
        }
    }
}
