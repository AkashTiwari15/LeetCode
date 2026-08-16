class Solution {
    public int findMaxLength(int[] nums) {
        int zero = 0;
        int one = 0;
        int res = 0;
        HashMap<Integer,Integer> f = new HashMap<>();
        f.put(0, -1);
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]==0){
                zero++;
            }else{
                one++;
            }
            int diff = zero - one;
          if (f.containsKey(diff)) {
                int idx = f.get(diff);
                int len = i - idx;
                res = Math.max(res, len);
            } else {
                // Store only the first occurrence
                f.put(diff, i);
            }
            
        }
        return res;
    }
}