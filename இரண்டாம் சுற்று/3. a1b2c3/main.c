#include<stdio.h>
int main()
{
    char s[50];
    int i,j,num=0;
    char alpha=0;
    printf("Enter the letters with numbers you want: ");
    scanf("%s",s);
    
    for(i=0;s[i];i++) // or for(i=0;s[i]!='\0';i++)
    {
        if((s[i]>=65 && s[i]<=90) || (s[i]>=97 && s[i]<=122))
        {
            if(alpha!=0)
            {
                for(j=0;j<num;j++)
                printf("%c",alpha);
                num=0;
            }
            alpha=s[i];
        }
        else if(s[i]>=48 && s[i]<=57)
        {
            num = num*10+s[i]-48;
        }
    }
    for(j=0;j<num;j++)
    printf("%c",alpha);
    
    return 0;
}
