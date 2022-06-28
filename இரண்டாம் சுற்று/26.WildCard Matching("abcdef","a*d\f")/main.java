/*


*/

import java.util.Scanner;

public class strngSymbolReplcng {

        public static boolean isMatch(String s, String p) {

            int i = 0, j = 0, iStar = -1, jStar = -1, m = s.length(), n = p.length();

            while (i < m)
            {
                if (j < n && (s.charAt(i)== p.charAt(j) || p.charAt(j) == '\\'))
                {
                    ++i;
                    ++j;
                }
                else if (j < n &&  p.charAt(j) == '*')
                {
                    iStar = i;
                    jStar = j++;
                }
                else if (iStar >= 0)
                {
                    i = ++iStar;
                    j = jStar + 1;
                }
                else
                    return false;
            }

            while (j < n && p.charAt(j) == '*') 
                ++j;

            return j == n;
        }

        public static void main(String[] args)
        {
            String num1 = new String();
            String num2 = new String();
            Scanner sc = new Scanner(System.in);
            num1 = sc.nextLine();
            num2 = sc.nextLine();

            if(isMatch(num1, num2))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
}
