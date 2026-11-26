class Solution {
    public boolean canAliceWin(int n) {
        int counter = 10;
        int i = 1; 
        while (n >= counter) {
            n -= counter;
            counter--;
            i = (i == 1) ? 2 : 1;
        }

        return i == 2; 
    }
}
