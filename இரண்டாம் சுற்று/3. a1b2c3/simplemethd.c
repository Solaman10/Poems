#include<stdio.h>
int main()
{
    int num;
    char chr;
    while(scanf("%c%d",&chr,&num)==2)
    {
        while(num--)
        {
            printf("%c",chr);
        }
    }
    return 0;
}
