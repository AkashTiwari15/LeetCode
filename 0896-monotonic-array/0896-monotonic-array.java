class Solution {
    public boolean isMonotonic(int[] nums) {
        int left = 0;
        int right = 1;

        boolean increasing = true;
        boolean decreasing = true;

        while (right < nums.length) {

            if (nums[right] < nums[left]) {
                increasing = false;
            }

            if (nums[right] > nums[left]) {
                decreasing = false;
            }

            left++;
            right++;
        }

        return increasing || decreasing;
    }
}