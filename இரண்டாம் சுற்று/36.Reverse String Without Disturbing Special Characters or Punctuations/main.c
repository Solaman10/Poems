/*
i/p:
A man, in the boat says : I see 1-2-3 in the sky

o/p:
y kse, ht ni3 21ee sIsy : a sta o-b-e ht nin amA
*/

#include<stdio.h>

char isChar(char s)
{
    if((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z') || (s >= '0' && s <= '9'))
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int main()
{
    char S[100];
    gets(S);
    int len = strlen(S);
    int i = 0, j = len -1;
    char temp;
    while(i < j)
    {
        if(isChar(S[i]) && isChar(S[j]))
        {
            temp = S[i];
            S[i] = S[j];
            S[j] = temp;
            i++;
            j--;
        }
        else
        {
            if(isChar(S[i]) == 0)
            {
                i++;
            }
            
            if(isChar(S[j]) == 0)
            {
                j--;
            }
        }
    }
    printf("%s",S);
}
