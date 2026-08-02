class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left = 0;
        int ans = -1;
        int maxLen = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int high = 0 ; high < n ; high++){
            freq.put(fruits[high], freq.getOrDefault(fruits[high],0)+1);

             while (freq.size() > 2) {
                int leftFruit = fruits[left];
                freq.put(leftFruit, freq.get(leftFruit) - 1);
                if (freq.get(leftFruit) == 0)
                    freq.remove(leftFruit);
                left++;
            }
             maxLen = Math.max(maxLen, high - left + 1);
        }
            
         return maxLen;
    }
}