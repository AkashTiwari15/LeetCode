class Solution {
    public int[] twoSum(int[] nums, int target){
    
       int n = nums.length;
       int left=0 ;
       int right=n-1;
        
        int newarr[][] = new int[n][2];
        for(int a =0 ; a<n ; a++){
            newarr[a][0] = nums[a];
            newarr[a][1] = a;
        }
        Arrays.sort(newarr, (a, b) -> Integer.compare(a[0], b[0]));
       
       
       while(left<right){
          int sum=newarr[left][0] + newarr[right][0];
          if(sum==target){
         return new int[]{newarr[left][1] , newarr[right][1]};
          }else if(sum<target){
            left++;
          }else{
            right--;
          }
       }
       return new int[]{-1,-1};
    }
      
    }
    
