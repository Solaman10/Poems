class Solution {
    public boolean containsDuplicate(int[] nums) {

        int i;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(nums[i]))
                return true;
            else
                hmap.put(nums[i],1);
        }
        return false;
    }
}
