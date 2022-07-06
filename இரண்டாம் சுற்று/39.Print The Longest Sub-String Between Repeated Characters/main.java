/*
i/p:
solaimani

o/p:
man
*/

import java.awt.event.KeyEvent;
import java.util.*;

public class doAndErase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str,ans="";
        str = sc.nextLine();
        int i=0,j=0,len,flag=1,start = 0,end=0,max=0,ind=0,varnce;
        len = str.length();
        int[] dist = new int[len];

        for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    dist[ind++] = i;
                    dist[ind++] = j;
                }
            }
        }

        i=0;
        j=0;
        while(i<ind)
        {
            j=i+1;
            {
                varnce = dist[j] - dist[i];
                if(max<varnce)
                {
                    if (flag == 1)
                    {
                        max = varnce;
                        start = dist[i];
                        end = dist[j];
                        flag = 0;
                        i += 2;
                    }
                    else
                    {
                        max = varnce;
                        start = dist[i];
                        end = dist[j];
                        i += 2;
                     }
                }
                else
                {
                    i+=2;
                }
            }
        }
        for(i=start+1;i<end;i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}
