/*
i/p:
5
o/p:
                0 
             1  0  1 
          2  1  0  1  2 
       3  2  1  0  1  2  3 
    4  3  2  1  0  1  2  3  4 
 5  4  3  2  1  0  1  2  3  4  5 
 
*/

#include<stdio.h>
int main()
{
    int size,i,j,k,gap;
    scanf("%d",&size);
    gap = size;
    
    for(i=0;i<=size;i++)
    {
        for(k=gap;k>0;k--)
        {
            printf("   ");
        }
        
        for(j=i;j>0;j--)
        {
            printf("%2d ",j);
        }
        
        for(j=0;j<=i;j++)
        {
            printf("%2d ",j);
        }
        printf("\n");
        gap--;
    }
}
