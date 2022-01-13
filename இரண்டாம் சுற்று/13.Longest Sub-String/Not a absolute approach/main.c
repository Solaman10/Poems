import java.util.*;
import java.util.HashMap;

public class LongestSubStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=0,j=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        int count=0;
        int maxCount=0;

        while(i<str.length())
        {
            while(hm.get(str.charAt(i)) != null)
            {
                hm.remove(str.charAt(j));
                j++;
            }

            hm.put(str.charAt(i),i);
            count=i-j+1;
            i++;
            if(count<maxCount)      //
            {                      //
                count=maxCount;   // maxCount=Math.max(count,maxCount);
            }                    // 
        }
        System.out.println(count);
    }
}
