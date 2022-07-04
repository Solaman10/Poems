/*
i/p:
11544423

o/p:
[1.154.44.23, 11.54.44.23, 115.4.44.23, 115.44.4.23, 115.44.42.3]
-----------------------------------------------------------------------
i/p:
999999999

o/p:
[]
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ipAdrsRestortn {

    public static List<String> restoreIpAddresses(String s)
    {
        List<String> list = new ArrayList<String>();
        int size = s.length();

        for(int ind1 = 1; ind1 < 4 && ind1 < s.length(); ind1++)
        {
            for(int ind2 = 1; ind2 < 4 && ind1 + ind2 < s.length(); ind2++)
            {
                for(int ind3 = 1; ind3 < 4 && ind1 + ind2 + ind3 < s.length(); ind3++)
                {
                    String frst = s.substring(0, ind1);
                    String scnd = s.substring(ind1, ind1 + ind2);
                    String thrd = s.substring(ind1 + ind2, ind1 + ind2 + ind3);
                    String frth = s.substring(ind1 + ind2 + ind3, size);

                    if(isValidPart(frst) && isValidPart(scnd) && isValidPart(thrd) && isValidPart(frth))
                    {
                        String IP = frst + "." + scnd + "." +  thrd + "." + frth;
                        list.add(IP);
                    }
                }
            }
        }
        return list;
    }

    private static boolean isValidPart(String s)
    {
        if(s.length() > 3)
            return false;
        if(s.startsWith("0") && s.length() > 1)
            return false;

        int val = Integer.parseInt(s);
        return val >= 0 && val <= 255;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        System.out.println(restoreIpAddresses(str));
    }
}
