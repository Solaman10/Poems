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
import java.util.LinkedList;
import java.util.Scanner;

public class cycleOccurOrNot {

    public static void main(String[] args) {

        int pairs, i, j = 0, key, value;
        Scanner sc = new Scanner(System.in);
        pairs = sc.nextInt();

        LinkedList<Integer> lList = new LinkedList<Integer>();

        for(i=0;i<pairs*2;i++)
        {
            key = sc.nextInt();
            lList.add(key);
        }


        if(lList.get(0)==lList.get(pairs*2-1))
            System.out.println("Yes");
        else
            System.out.println("No");
        }
}
