#include<iostream>
using namespace std;

string encode(string src)
{
    int count=1,i;
    string ans=" ";
    
    for(i=1;i<src.size();i++)
    {
        if(src[i-1]!=src[i])
        {
            ans=ans+src[i-1];
            ans=ans+to_string(count);
            count=1;
        }
        else
            count++;
    }
    ans=ans+src[src.size()-1];
    ans=ans+to_string(count);
    
    return ans;
}

int main()
{
    string s;
    cin>>s;
    cout<<encode(s);
    
    return 0;
}
