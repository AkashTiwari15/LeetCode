class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxending = nums[0];
        int maxsum = nums[0];
        int minending = nums[0];
         int minsum = nums[0];
        int ans = nums[0];
        int totalsum=0;
        for(int i=0 ; i<n ; i++){
            totalsum += nums[i];
            if(i>0){
            maxending = Math.max(nums[i], maxending + nums[i]);
            maxsum = Math.max(maxsum,maxending);

            minending = Math.min(nums[i] , minending + nums[i]);
            minsum = Math.min(minending , minsum);

            
            }
        }
        if(maxsum<0){
                return maxsum;
            }
            int circularsum = totalsum - minsum;
            ans = Math.max(circularsum,maxsum);
        return ans;
    }
}