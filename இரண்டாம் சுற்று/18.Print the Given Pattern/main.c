/*
i/p: 5

o/p:

1
2 1
4 2 1
6 4 2 1
8 6 4 2 1

*/

#include<stdio.h>
int main()
{
    int n,i,j,a[50],num=1;
    scanf("%d",&n);
    printf("\n");
    
    a[0]=num;
    num=num+1;
    
    for(i=1;i<n*2-1;i++)
    {
        a[i]=num;
        num+=2;
    }
    
   for(i=0;i<n;i++)
    {
    	for(j=i;j>=0;j--)
    	{
    		printf("%d ",a[j]);
		}
		printf("\n");
	}
	return 0;
}
