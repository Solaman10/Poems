/*
i/p
4
9 9 9 9
3
1 1 1                 //this program isn't the perfect solution for this problem
                     // but, can achieve the correct solution by developing this program's logic
o/p:             
1 0 1 1 0
*/

#include<stdio.h>
#include<string.h>

int main()
{
    //int size1,size2;
    int set1[5] = {9,9,9,9};
    int set2[4] = {1,1,1};
    int setAns;

    int i,j,size=0,num1=0,num2=0,len1,len2,temp,multplr=0,ansLen=0,len=0;
    len1=sizeof(set1)/sizeof(set1[0])-1;
    len2=sizeof(set2)/sizeof(set2[0])-1;
    
    for(i=len1-1;i>=0;i--)
    {
        if(i==len1-1)
        {
            num1=num1+set1[i];
            multplr=10;
        }
        
        if(i!=len1-1)
        {
            temp=multplr*set1[i];
            num1 = num1+temp;
            multplr=multplr*10;
        }
    }
    
    for(j=len2-1;j>=0;j--)
    {
        if(j==len2-1)
        {
            num2=num2+set2[j];
            multplr=10;
        }
        
        if(j!=len2-1)
        {
            temp=multplr*set2[j];
            num2 = num2+temp;
            multplr=multplr*10;
        }
    }
    
    setAns = num1+num2;
    i = setAns;
    while(i!=0)
    {
        ++len;
        i/=10;
    }
    size = len;
    int ans[len];
    
    while(setAns!=0)
    {
        ans[--len] = setAns%10;
        setAns/=10;
    }
    
    for(i=0;i<len1;i++)
    {
        printf("%d,",set1[i]);
    }
    printf("\n");
    for(i=0;i<len2;i++)
    {
        printf("%d,",set2[i]);
    }
    printf("\n");
    for(i=0;i<size;i++)
    {
        printf("%d,",ans[i]);
    }
}
