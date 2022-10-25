class Solution {
    public int findJudge(int n, int[][] trust) {
        
        if(trust.length == 0 && n==1)
          return n;
        if(trust.length == 0 && n>1)
          return -1;  

        int[] trustArray = new int[n+1];

        for(int i=0;i<trust.length;i++)
        {
            trustArray[trust[i][1]] += 1;
            trustArray[trust[i][0]] -= 1;
        }

        for(int i=0;i<trustArray.length;i++)
        {
            if(trustArray[i] == n-1)
               return i;
        }

        return -1;
    }
}
