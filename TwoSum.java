class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)){
                int[] r = {map.get(rem),i};
                return r;
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }
}
