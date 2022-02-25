/*
i/p: program

o/p:
      g
     gr
    gra
   gram
  gramp
 grampr
grampro

*/


#include<stdio.h>
#include<string.h>
int main()
{
	int i,j,mid = 0,k,count=0;
	char str[40];
	gets(str);
	mid = (0 + strlen(str) - 1)/2;
	
	for(i=strlen(str);i>=1;i--)
	{
		if(i > mid+1)
		{
			for(j=i;j>=2;j--)
			{
				printf(" ");
			}
			
			for(k=0;k<=count;k++)
			{
				printf("%c",str[mid+k]);
				
			}
			printf("\n");
			
			
		}
		
		else if(i <= mid + 1 && i >= 2)
		{
			for(j = i - 1;j>=1;j--)
			{
				printf(" ");
			}
			for(k = 0;k<=count;k++)
			{
				printf("%c",str[(mid+k)%strlen(str)]);
			}
			printf("\n");
		}
		
		else if(i==1)
		{
			for(k = 0;k<=count;k++)
			{
				printf("%c",str[(mid+k)%strlen(str)]);
			}
		}
		count++;
		
	}
}
