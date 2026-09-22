class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i,prev;
        HashMap<Integer,Integer>map = new HashMap< >();
        for(i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                prev=map.get(nums[i]);
                if(i-prev<=k)
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    
    }
}