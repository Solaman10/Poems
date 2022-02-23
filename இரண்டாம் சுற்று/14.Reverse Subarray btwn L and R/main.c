/*
i/p: 
arr[] = [1 2 3 4 5 6 7]
L=2
R=5

o/p:
[1 5 4 3 2 6 7] 
*/

#include<stdio.h>
int main()
{
    int Arr[50],i,j,n,L,R,temp,l,r;
    printf("Enter the number to be entered: ");
    scanf("%d",&n);
    printf("Enter the numbers: ");
    for(i=0;i<n;i++)
    scanf("%d",&Arr[i]);
    printf("L = ");
    scanf("%d",&L);
    printf("R = ");
    scanf("%d",&R);
    
    for(i=0;i<n;i++)
    {
        for(j=n;j>0;j--)
        {
              if(L==Arr[i] && R==Arr[j])
              {
                  l=i;
                  r=j;
                  while(l<r)
                  {
                      temp=Arr[l];
                      Arr[l]=Arr[r];
                      Arr[r]=temp;
                      l++;
                      r--;
                  }
              }
        }
    }
    for(i=0;i<n;i++)
    {
        printf("%d ",Arr[i]);
    }
    return 0;
}
