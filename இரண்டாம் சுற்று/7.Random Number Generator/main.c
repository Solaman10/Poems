#include<stdio.h>
#include<stdlib.h>
int main()
{
    int a[50][50];
    int n,lim,i,j;
    
    printf("Enter the size of matrix: ");
    scanf("%d",&n);
    printf("\nEnter the limit: ");
    scanf("%d",&lim);
    
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            a[i][j]=(rand()%lim)+1;
        }
    }
    printf("\n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("  %3d  ",a[i][j]);
        }
        printf("\n");
    }    
    return 0;
}
