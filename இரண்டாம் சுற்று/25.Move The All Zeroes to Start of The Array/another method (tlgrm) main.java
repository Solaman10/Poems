/*
i/p:
8
1 2 0 4 3 0 5 0
o/p:
0 0 0 1 2 4 3 5
*/

import java.util.Scanner;

public class roughClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int num[]={1,2,3,0,0,0,4,5,0};
            int n=9;

            for(int i=0;i<n;i++)
            {
                if(num[i]==0)
                {
                    int k=num[i];
                    for(int j=0; j<=i ; j++)
                    {
                        num[j]+=k;
                        k=num[j]-k;
                        num[j]-=k;
                    }
                }
            }

            for(int i = 0;i<n;i++)
                System.out.print(num[i]+" ");
        }
    }
