class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 = cost1;
        long c2 = cost2;
        long cb = costBoth;
        long n1 = need1;
        long n2 = need2;
        if (cb >= c1 + c2) {
            return (c1 * n1) + (c2 * n2);
        }
        if (n1 > n2) {
            long remaining = n1 - n2;
            return (cb * n2) + (Math.min(c1, cb) * remaining);
        } else {
            long remaining = n2 - n1;
            return (cb * n1) + (Math.min(c2, cb) * remaining);
        }
    }
}
