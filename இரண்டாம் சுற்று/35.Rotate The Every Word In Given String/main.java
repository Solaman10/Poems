/*
i/p:
Rotate the wheel through 180 degrees

o/p:
etatoR eht leehw hguorht 081 seerged
*/

import java.util.Scanner;

public class rotateEveryWordInGvnStrng {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str + " ";
        int len = str.length(), ind,ind2, tempWrdLen;
        String word = "", endResult = "";

        for (ind = 0; ind < len; ind++)
        {
            if (str.charAt(ind) != ' ')
                word = word + str.charAt(ind);
            else
            {
                tempWrdLen = word.length()-1;
                for(ind2=tempWrdLen;ind2>=0;ind2--)
                {
                    endResult += word.charAt(ind2);
                }
                word = "";
                endResult+=" ";
            }
        }
        System.out.print(endResult);
    }
}
