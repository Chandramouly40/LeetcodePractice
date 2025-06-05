class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] res = new int[nums.length];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                continue;
            }
            product*=nums[i];
        }   
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(count>1){
                    res[i]=0;
                }
                else{
                    res[i] = product;
                }
            }
            else if(count>=1){
                res[i]= 0;
            }
            else{
                res[i] = product/nums[i];
            }
        }
        return res;
    }
}
