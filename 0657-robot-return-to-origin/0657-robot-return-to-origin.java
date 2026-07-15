class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int countu = 0;
        int countd = 0;
        int countl =0;
        int countr = 0;
        for(int i = 0 ; i< n ; i++){
            char ch = moves.charAt(i);
            if(ch == 'U'){
                countu++;
            } 
            if(ch == 'D'){
                countd++;
            }
            if(ch == 'L'){
                countl++;
            }
            if(ch == 'R'){
                countr++;
            }

        }
        if((countu - countd==0 )&& (countr - countl ==0)){
            return true;
        }
        return false;
    }
}