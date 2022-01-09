/*
10
0 2 1 -1 1 2 0 4 -1 4
4 4 -1 -1 0 0 2 2 1 1 
*/


#include<stdio.h>
int main()
{
    int a[100],b[100][100],n,big,i,j,k,count;
   // printf("Enter the value gonna to you entered: ");
    scanf("%d",&n);
    scanf("%d",&a[0]);
    for(i=1;i<n;i++)
    {
        scanf("%d",&a[i]);
        if(big<a[i])
        big=a[i];
    }
    big++;
    for(i=n-1;i>=0;i--)
    {
        count=1;
        if(a[i]!=big)
        {
            for(j=i-1;j>=0;j--)
            {
              if(a[i]==a[j])
              {
                  count++;
                  a[j]=big;
              }
            }
            b[0][k]=count;
            b[1][k]=a[i];
            k++;
        }
        
    }
    
    for(i=0;i<k;i++)
    {
        for(j=i+1;j<k;j++)
        {
            if(b[0][i]<b[0][j])
            {
                int t=b[0][i];
                b[0][i]=b[0][j];
                b[0][j]=t;
                
                t=b[1][i];
                b[1][i]=b[1][j];
                b[1][j]=t;
            }
        }
    }
    for(i=0;i<k;i++)
    {
        for(j=0;j<b[0][i];j++)
        {
            printf("%d ",b[1][i]);
        }
    }
    return 0;
}
