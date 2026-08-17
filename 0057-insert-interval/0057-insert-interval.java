class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int start1 = newInterval[0];
        int end1 = newInterval[1];
        boolean inserted = false;
        for(int i = 0 ; i<intervals.length ; i++){
           int start2 = intervals[i][0];
           int end2 = intervals[i][1];
           // Current interval comes completely before newInterval
           if(end2<start1){
            res.add(new int[]{start2 , end2});
           }
           // Current interval comes completely after newInterval
           else if(start2>end1){
           if(!inserted){
                res.add(new int[]{start1,end1});
                inserted = true;
            }
            res.add(new int[]{start2,end2});
           }
           // Overlap
           else{
             start1 = Math.min(start1,start2);
             end1 = Math.max(end1 , end2);
           }
        }
        // If newInterval was not inserted yet
        if(!inserted){
            res.add(new int[]{start1,end1});
        }
        return res.toArray(new int[res.size()][]);
    }
}