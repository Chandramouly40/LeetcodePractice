class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //Create new set
        Set<Integer> firstSet = new HashSet<>();

        // iterate nums1 and store it
        for(int val : nums1){
            firstSet.add(val);
        }

        // Create new set to store unique values
        Set<Integer> uniqueSet = new HashSet<>();
        for(int val: nums2){
        //Check if the value is presnet in prev set, then add
            if(firstSet.contains(val))
               uniqueSet.add(val);
        }
        // create result arr length of uniqueSet
        int[] result = new int[uniqueSet.size()];
        int i = 0;
        // Copy result
        for(int val : uniqueSet){
            result[i++] = val;
        }
        // return the result
        return result;
    }
}
