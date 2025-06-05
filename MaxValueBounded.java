public class MaxValueBounded {
    public int maxValue(int n, int index, int maxSum) {
        int maxLeft = index,maxRight = n- index - 1;
        int currSum = n+1;
        int val = 2;
        int left = 0;
        int right = 0;
        if(currSum>maxSum){
            return 1;
        }
        while(currSum<maxSum){
            val++;
            left = Math.min(++left,maxLeft);
            right = Math.min(++right,maxRight);
            currSum+=(left+right+1);
            if(left==maxLeft && right==maxRight){
                break;
            }
        }
        System.out.println(currSum+" "+val);
        if(currSum<maxSum){
            int balance = maxSum-currSum;
            val += balance/(left+right+1);
            System.out.println(val);
        }

        return val;
    }
}
