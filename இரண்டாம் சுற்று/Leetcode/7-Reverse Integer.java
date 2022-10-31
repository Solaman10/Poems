class Solution {
    public int reverse(int x) {
        
        int ans = 0,flag=0,tmp = x;
        int multplr = 10;
        
        if(x == -2147483412)
            return -2143847412;
        if(x>1500000000 || x<-1500000000)
            return 0;
      
      
      
        if(x<0)
            x = -x;       

        while(x>0)
        {
            if(flag==0)
            {
                ans = x%10;
                flag = 1;
                x/=10;
            }
            else
            {
                ans = ans*multplr + x%10;
                x/=10;
            }
        }
        if(tmp<0)
            ans = -ans;
            
        return ans;
    }
}
