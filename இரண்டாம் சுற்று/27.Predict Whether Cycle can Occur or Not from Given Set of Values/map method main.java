/*
i/p: 
(1,2) (2,4) (5,6) (4,5) (6,1)

o/p:
Yes

Explanation: 1->2->4->5->6->1
----------------------------------
i/p: 
(1,2) (2,4) (5,6) (4,5)

o/p: 
No

Explanation: 1->2->4->5
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class roughClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer,Integer> hmap = new LinkedHashMap<>();
        int size;
        size = sc.nextInt();

        for(int ind=0;ind<size;ind++)
        {
            Integer key = sc.nextInt();
            Integer value = sc.nextInt();
            hmap.put(key,value);
        }

        Object[] key = hmap.keySet().toArray();
        Object[] value = hmap.values().toArray();

        if(key[0] == value[size-1])
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
