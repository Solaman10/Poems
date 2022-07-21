/*
i/p:
solaimani

o/p:
6            // solaim -> 6
------------
i/p:
solaimbnj

o/p:
9           // solaimbnj -> 9
*/

import java.util.*;

public class roughClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List longestSubStr = new ArrayList();
        int maxCount=0,size;

        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                if(longestSubStr.contains(str.charAt(j)))
                    break;
                else
                    longestSubStr.add(str.charAt(j));
            }
            size = longestSubStr.size();
            if(maxCount<size)
            {
                maxCount = size;
            }
            longestSubStr = new ArrayList();
        }
        System.out.println(maxCount);
    }
}
