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
