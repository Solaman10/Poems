/*
i/p: 4

o/p:  
            1
        2   5
     3  6   8
  4  7  9  10
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    
    for(int i=1;i<=n;i++)
    {
       int x=n-1;
       
       for(int j=i;j<=n;j++)
       {
            if(j==n)
           {
                 cout<<setw(4)<<i;
                 int y=i;
                 
                 for(int k=n-i+2;k<=n;k++)
                 {
                      y=y+x;
                      cout<<setw(4)<<y;
                      x--;
                 }
                 cout<<endl<<endl;
            }
            else
            {
               cout<<setw(4)<<" ";
            }
        }
    }
}
