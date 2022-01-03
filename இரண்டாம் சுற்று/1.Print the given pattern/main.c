/*
i/p: 5

o/p:
           1
         6 2
      10 7 3
   13 11 8 4
15 14 12 9 5
*/ 

#include<stdio.h>
int main()
{
    int size,col,row,spce,prntVal,colVal,colValAdder=1;
    printf("Enter the size you want: ");
    scanf("%d",&size);
    
    for(col=size;col>=1;col--)
    {
        colVal=col;
        prntVal=colValAdder;
        for(spce=col;spce>1;spce--)
        {
            printf("   ");
        }
        
        for(row=size;row>=col;row--)
        {
            
            printf(" %2d",prntVal);
            prntVal=prntVal-colVal;
            colVal++;
        }
        colValAdder=colValAdder+col;
        printf("\n");
    }
    return 0;
}
