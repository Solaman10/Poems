#include<stdio.h>
int main()
{
    char a[100],b[10][10],c[100];
    int l,i,j,k,co,f=1,d=1;
    
    printf("Enter the String: ");
    scanf("%s",a);
    printf("Enter the sub-string: ");
    scanf("%s",c);
    printf("\n");
    for(l=0;a[l];l++)
        while(d*d<l)d++;
    for(i=0;i<d;i++)
    {
        for(j=0;j<d;j++)
        {
            if(k<=l)
             b[i][j]=a[k++];
            else
             b[i][j]=32;
            printf("%c ",b[i][j]);
        }
        printf("\n");
    }
    
    for(i=0;i<d;i++)
    {
        k=0;
        for(j=0;j<d;j++)
        {
            if(b[i][j]==c[k])
            {
                f=0;co=0;
                while(c[++k])
                {
                    co++;
                    if(c[k]!=b[i][++j])
                    {
                        f=1;
                        break;
                    }
                }
                if(f==0)
                {
                 printf("\n(%d,%d) to (%d,%d)\n",i,j-co,i,j);
                 break;
                }
            }
        }
    }
    
    f=1;
    for(j=0;j<d;j++)
    {
        k=0;
        for(i=0;i<d;i++)
        {
           if(b[j][i]==c[k])
           {
               f=0;co=0;
               while(c[++k])
               {
                   co++;
                   if(c[k]!=b[++j][i])
                   {
                       f=1;
                       break;
                   }
               }
               if(f==0)
               {
                printf("\n(%d,%d) to (%d,%d)\n",j-co,i,j,i);
                break;
               }    
           }
        }
    }
    return 0;
}
