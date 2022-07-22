/*
i/p:
12332

o/p:
1
-------
i/p:
1210201307

o/p:
3
*/

import java.util.*;

public class frstNonRptetveDigitInGvnInpt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem,i=0,ans=0,len=0;
        int[] arr = new int[20];

        while(num!=0)
        {
            rem=num%10;
            arr[i]=rem;
            ++i;
            ++len;
            num/=10;
        }
        for(i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(i!=j && arr[i]==arr[j])
                {
                    break;
                }
                else
                {
                    ans=arr[i];
                }
            }
        }
        System.out.print(ans);
    }
}
