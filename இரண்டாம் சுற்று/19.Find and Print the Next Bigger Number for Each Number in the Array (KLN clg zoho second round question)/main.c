/*
Input : 8 4 1 9 6 2
Output: 8->9 4->6 1->2 9->  6->8 2->4
*/

#include<stdio.h>
int main()
{
    int n,i,j,max=0,flag=0;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(arr[i]<arr[j])
            {
                if(flag==0)
                {
                    max=arr[j];
                    flag=1;
                }
                else if(max>arr[j])
                {
                    max=arr[j];
                }
            }
        }
        if(max==0)
         printf("%d->  ",arr[i]);
        else 
         printf("%d->%d ",arr[i],max);
        max=0;
        flag=0;
    }
    return 0;
}
