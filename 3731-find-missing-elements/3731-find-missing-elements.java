class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res= new ArrayList<>();
        int n = nums.length;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i =0 ; i<n ; i++){
          smallest = Math.min(smallest,nums[i]);
          largest = Math.max(largest,nums[i]);
        }
        for(int i = smallest ; i<=largest ; i++){
             boolean found = false;

          for(int j = 0 ; j< n ; j++){
              if(nums[j]==i){
                found = true;
                break;
              }
          }
          if(!found){
            res.add(i);
          }
        }
          return res;
    }
}