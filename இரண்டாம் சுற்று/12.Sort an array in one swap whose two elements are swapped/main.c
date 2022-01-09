/*
i/p:
6
10 20 50 40 30 60
o/p:
10 20 30 40 50 60
*/

#include<stdio.h>
int main()
{
    int a[20],n,i,indCont;
    scanf("%d",&n);
    
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    
    for(i=n-1;i>0;i--)
    {
        if(a[i]<a[i-1])
        {
            indCont=i-1;
            while(indCont>0 && a[i]<a[indCont])
             indCont--;

            a[i]=a[i]+a[indCont+1];
            a[indCont+1]=a[i]-a[indCont+1];
            a[i]=a[i]-a[indCont+1];
            break;
        }
    }
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
    return 0;
}
