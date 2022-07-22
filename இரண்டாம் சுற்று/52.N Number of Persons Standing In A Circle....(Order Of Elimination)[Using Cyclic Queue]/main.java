/*
i/p:
6         -> size
3         -> position of gonna eliminate person

o/p:                //Explanation -> 1 2 [3] 4 5 6
3 6 4 2                              4 5 [6] 1 2
                                     1 2 [4] 5
                                     5 1 [2]
                                     1 5
*/

import java.util.*;

public class ordrOfElmntn {
    public static int size =20;
    static int[] queue = new int[size];
    static public int front = -1;
    static public int rear = 0;

    static void add (int Item)
    {
        if (front  ==-1)
            front=rear=0;
        else
            rear =(rear+1)%size;
        queue[rear] =Item;
    }

    static int delete()
    {
        int Item=0;
        Item=queue[front];
        if(front == rear)
            front=rear=-1 ;
        else
            front=(front+1)%size;
        return Item;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int n,i,r;
            n = sc.nextInt();
            r = sc.nextInt();
            for(i=1;i<=n;i++) add(i);

            while(n>=r)
            {
                for(i=1;i<=r;i++)
                {
                    if(i!=r)
                        add(delete());
                    else
                        System.out.print(delete()+" ");
                }
                n--;
            }
        }
    }
