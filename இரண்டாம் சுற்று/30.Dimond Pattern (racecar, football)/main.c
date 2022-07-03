/*
i/p:
racecar

o/p:
      e
    c   c
  a       a
r           r
  a       a
    c   c
      e
      
-------------------      
      
i/p:
football

o/p:
Not Possible
*/

#include<stdio.h>
int main()
{
    char str[20];
    gets(str);
    int len,halfLen,gapLen,addLen,row,gap,reduceLen;
    len = strlen(str);
    halfLen = len/2;
    gapLen = halfLen;
    addLen = 2;
    reduceLen = 4;
    
    if(len%2==1)
    {
    for(row=halfLen;row>=0;row--)
    {
        for(gap=row;gap>=1;gap--)
        {
            printf("  ");
        }
        
        if(halfLen==row)
        {
            printf("%c ",str[row]);
        }
        else
        {
            printf("%c",str[row]);
            for(gap=gapLen;gap>=1;gap--)
            {
                printf(" ");
            }
            printf("%c",str[row+addLen]);
            addLen=addLen+2;
            gapLen+=4;
        }
        printf("\n");
        
    }
    gapLen=halfLen*2+1;
    
    for(row=1;row<=halfLen;row++)
    {
        for(gap=row;gap>=1;gap--)
        {
            printf("  ");
        }
        
        if(halfLen==row)
        {
            printf("%c ",str[row]);
        }
        else
        {
            printf("%c",str[row]);
            for(gap=gapLen;gap>=1;gap--)
            {
                printf(" ");
            }
            printf("%c",str[row+reduceLen]);
            reduceLen = reduceLen-4;
            gapLen-=4;
        }
        printf("\n");
    }
 }
 else 
 {
     printf("Not Possible");
 }
    
}
