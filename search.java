class search {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] a : matrix){
            if(search(a,target)){
                return true;
            }
        }
        return false;
    }
    public boolean search(int[] arr,int k){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==k){
                return true;
            }
            if(k>arr[mid]){
                 left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;
    }
}
