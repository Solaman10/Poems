#include<stdio.h>
#include<string.h>
int main()
{
    char str[40];
    char ans[40];
    int len,i,j,mid;
    gets(str);
    
    len=strlen(str);
    mid=(0+len-1)/2;

    
    for(i=0;i<len;i++)
    {
        ans[i]=str[(mid+i)%len];
        
        for(j=len-1;j>i;j--)
            printf(" ");
        for(j=0;j<=i;j++)
            printf("%c",ans[j]);
        printf("\n");
    }
}
