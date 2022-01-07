/*
Please enter the size of array: 5

Generated input: 

  1  2  3  4  5 
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
 
 Solved output:
 
 1  2  3  4  5
10 15 20 25 24
23 22 21 16 11
 6  7  8  9 14
19 18 17 12 13
*/

#include<stdio.h>
int main()
{
    int x[100][100],n,i,j,c=1,m,a=1,b,d=1;
    printf("Please enter the size of array: ");scanf("%d",&n);
    printf("\nGenerated input: \n\n");
    for(i=1;i<=n;i++,printf("\n"))
        for(j=1;j<=n;j++)
            {
                x[i][j]=c++;
                printf("%2d ",x[i][j]);
            }
    
    m=n/2;
    b=n;
    printf("\nSolved output: \n\n");
    while(m)
    {
        for(i=a;i<b;i++,d++)
        {
            printf("%2d ",x[a][i]);
            if(d%n==0)
             printf("\n");
        }
        for(i=a;i<b;i++,d++)
        {
            printf("%2d ",x[i][b]);
            if(d%n==0)
             printf("\n");
        }
        for(i=b;i>a;i--,d++)
        {
            printf("%2d ",x[b][i]);
            if(d%n==0)
             printf("\n");
        }
        for(i=b;i>a;i--,d++)
        {
            printf("%2d ",x[i][a]);
            if(d%n==0)
             printf("\n");
        }
        
        b--;
        a++;
        m--;
    }
    if(n%2)
     printf("%2d ",x[n/2+1][n/2+1]);
    return 0;
}
