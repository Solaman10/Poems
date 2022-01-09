/*
i/p:12345/*+-
o/p:-1      //1/2*3+4-5

i/p:67542-/+-
o/p:2      //6-7/5+4-2
*/


#include<stdio.h>
int main()
{
    char str[50],i,res,lim=-1,op;
    scanf("%s",&str);
    
    for(i=0;str[i];i++)
    {
        if(!(str[i]>=48 && str[i]<=57))
        {
            lim=i;
            break;
        }
    }
    
    res=str[0]-48;
    for(i=0;i<lim;i++)
    {
        op=i+lim-1;
        if(str[op]=='+')
         res=res+(str[i]-48);
        else if(str[op]=='-')
         res=res-(str[i]-48);
        else if(str[op]=='*')
         res=res*(str[i]-48);
        else if(str[op]=='/')
         res=res/(str[i]-48);
    }
    printf("%d",res);
    return 0;
}
