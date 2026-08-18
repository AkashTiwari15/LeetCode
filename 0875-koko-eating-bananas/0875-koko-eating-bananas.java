class Solution {

    public long helper(int[] piles, long mid) {

        long hours = 0;

        for (int pile : piles) {
            hours += (long) Math.ceil((double) pile / mid);
        }

        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {

        long low = 1;
        long high = 0;

        for (int pile : piles) {
            high = Math.max(high, (long) pile);
        }

        long ans = high;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            long hours = helper(piles, mid);

            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }
}