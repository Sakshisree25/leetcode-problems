class Solution {
    public int findClosest(int x, int y, int z) {
        int x1=Math.abs(z-x);
        int x2=Math.abs(z-y);
        if(x1<x2)
        {
            return 1;
        }
        else if(x1>x2)
        {
            return 2;
        }
        return 0;
    }
}