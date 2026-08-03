class Solution {
    public boolean check(int [] have , int [] need){
        for(int i =0 ; i<256 ; i++){
            if(have[i]<need[i]){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int [] need = new int[256];
        int [] have = new int[256];

        for(char ch : t.toCharArray()){
            need[ch]++;
        }
        int low = 0 ;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for(int high = 0 ; high < s.length() ; high++){
            have[s.charAt(high)]++;

            while(check(have,need)){
                if(high-low+1 < minLen){
                    minLen = high-low+1;
                    start = low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start,start+minLen);
    }
}