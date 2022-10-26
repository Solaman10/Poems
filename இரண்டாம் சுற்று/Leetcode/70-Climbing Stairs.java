class Solution {
    public int climbStairs(int n) {
        
        int[] arr = new int[n+1];
        arr[arr.length-1] = 1;
        arr[arr.length-2] = 1;

        for(int i=arr.length-3;i>=0;i--)
        {
            arr[i] = arr[i+1] + arr[i+2];
        }

        return arr[0];
    }
}
