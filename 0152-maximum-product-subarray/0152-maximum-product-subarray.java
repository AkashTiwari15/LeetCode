class Solution {
    public int maxProduct(int[] nums) {
        int minEnding = nums[0];
        int maxEnding = nums[0];
        int ans = nums[0];
        int n = nums.length;
        for(int i = 1 ; i<n ; i++){
            int choice1 = nums[i];
            int choice2 = minEnding * nums[i];
            int choice3 = maxEnding * nums[i];

          maxEnding = Math.max(choice1 , Math.max(choice2 , choice3));
          minEnding = Math.min(choice1 , Math.min(choice2,choice3));

          ans = Math.max(ans,maxEnding);
        }
        return ans;
    }
}