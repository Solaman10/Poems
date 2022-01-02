#include<stdio.h>
int main()
{
    int n,i,j,k,x=0;
    printf("Enter the size you want: ");
    scanf("%d",&n);
    
    for(i=0;i<n;i++)
    {
        for(k=i;k<n-1;k++)
        {
            printf("  ");
        }
        for(j=0;j<n;j++)
        {
           if(i%2==0)
           {
               x=x+1;
               printf(" %2d",x);
           }
           else 
           {
               printf(" %2d",x);
               x=x-1;
           }
        }
        x=x+n;
        printf("\n\n");
    }
    return 0;
}
