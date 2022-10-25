class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total_left = 0;
        for(int i=0;i<gas.length;i++)
        {
            total_left += gas[i] - cost[i];
        }
        
        if(total_left<0)
           return -1;

        int remaining = 0;
        int startIndex = 0;
        int currentGas = 0;
        int currentCost = 0;
        for(int i=0;i<gas.length;i++)
        {
            currentGas = gas[i] + remaining;
            currentCost = cost[i];
            remaining = currentGas - currentCost;

            if(remaining<0)
            {
                remaining = 0;
                startIndex = i+1;
            }
        }
        return startIndex;   
    }
}
