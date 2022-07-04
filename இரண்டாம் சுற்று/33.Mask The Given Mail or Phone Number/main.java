/*
i/p:
Zoho@Zoho.com

o/p:
z*****o@zoho.com
------------------
i/p:
+91-1234-(567)-890

o/p:
+91-*****7890
*/

import java.util.Locale;
import java.util.Scanner;

public class maskMailPhone {

    public static String maskPII(String S) {
        String countryCode = S.substring(0,4);
        int at = S.indexOf("@");
        if (at > 0)
        {
            S = S.toLowerCase();
            return (S.charAt(0) + "*****" + S.substring(at - 1)).toLowerCase();
        }
        S = S.replaceAll("[^0-9]", "");                                             //("[^0-9]") -> to remove all symbols like +-(),etc.
                                                                                   //("[0-9]") -> to remove all numbers
        return countryCode + "*****" + S.substring(S.length() - 4);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();

        System.out.println(maskPII(str));
    }
}
