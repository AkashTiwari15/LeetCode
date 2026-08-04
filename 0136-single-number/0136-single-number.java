class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
       int left = 0;
       int right = n-1;
       while(left<right){
        if(nums[left] != nums[left+1]){
            return nums[left];
        }
        left+=2;
       }
       return nums[right];
    }
}