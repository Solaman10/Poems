/*
i/p:
abcdefg
a*de\g

o/p: 
yes
--------
i/p: 
abcdefg
a\de*g

o/p: 
no
--------
Note:  '\' Matches any single character
       '*' Matches any sequence of characters 
*/


#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
	bool isMatch(string s, string p) {
	
		int i = 0, j = 0, iStar = -1, jStar = -1, m = s.size(), n = p.size();
		
		while (i < m)
		{
			if (j < n && (s[i] == p[j] || p[j] == '\\'))
			{
				++i;
				++j;
			}
			else if (j < n &&  p[j] == '*')
			{
				iStar = i;
				jStar = j++;
			}
			else if (iStar >= 0)
			{
				i = ++iStar;
				j = jStar + 1;
			}
			else 
			   return false;
		}
		
		while (j < n && p[j] == '*') ++j;
		
		return j == n;
	}
};

int main()
{
	Solution solution;
	string num1;
	string num2;
  cin>>num1;
  cin>>num2;
  
	if (solution.isMatch(num1, num2))
		cout << "yes" << endl;
	else
		cout << "no" << endl;

	return 0;
}
