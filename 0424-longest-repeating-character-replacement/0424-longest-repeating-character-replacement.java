class Solution {
    public int find(int[] freq){
        int maxfreq = -1;
        for(int i = 0 ; i< 256 ; i++){
            maxfreq = Math.max(maxfreq , freq[i]);
        }
        return maxfreq;
    }
    public int characterReplacement(String s, int k) {
     int n = s.length();
     int [] freq = new int[256];

    int left = 0;
    int ans = Integer.MIN_VALUE;
    for(int right= 0 ; right < n ; right++){
        freq[s.charAt(right)]++;

        int maxcount = find(freq);
        int length = right - left + 1;
        int diff = length - maxcount;

        while(diff>k){
            freq[s.charAt(left)]--;
            left++;

            maxcount = find(freq);
            length = right - left +1 ;
            diff = length - maxcount;
            
        }
        length = right - left + 1 ;
        ans = Math.max(ans , length);
    }
    return ans;
    }
}