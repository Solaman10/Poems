/*
i/p: 
(1,2) (2,4) (5,6) (4,5) (6,1)

o/p:
Yes

Explanation: 1->2->4->5->6->1

i/p: 
(1,2) (2,4) (5,6) (4,5)

o/p: 
No

Explanation: 1->2->4->5
*/


import java.util.LinkedHashMap;
import java.util.Scanner;

public class cycleOccurOrNot {

    public static void main(String[] args) {

        int pairs, i, j = 0, key, value;
        Scanner sc = new Scanner(System.in);
        pairs = sc.nextInt();

        LinkedHashMap<Integer, Integer> hmap = new LinkedHashMap<>();

        for(i=0;i<pairs;i++)
        {
            key = sc.nextInt();
            value = sc.nextInt();

            hmap.put(key, value);
        }

        if(hmap.keySet().toArray()[0].equals(hmap.values().toArray()[pairs-1]))
            System.out.println("Yes");
        else
            System.out.println("No");

        }
}
