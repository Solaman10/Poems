/*
i/p:
occurence
car

o/p:
ouene
*/



#include<stdio.h>
int main()
{
    char a[20],b[20];
    int i,j,flag;
    scanf("%s %s",a,b);
    
    for(i=0;a[i];i++)       //a[i]!='\0'
    {
        flag=1;
        for(j=0;b[j];j++)  //b[j]!='\0'
        {
            if(a[i]==b[j])
            {
                flag=0;break;
            }
        }
        if(flag)          //if(flag==1)
        {
           printf("%c",a[i]); 
        }
    }
    return 0;
}
