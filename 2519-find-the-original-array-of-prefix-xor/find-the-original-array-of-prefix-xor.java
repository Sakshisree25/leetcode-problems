class Solution {
    public int[] findArray(int[] pref) {
        int[]r=new int[pref.length];
        r[0]=pref[0];
        for(int i=1;i<pref.length;i++)
        {
           r[i]=pref[i-1]^pref[i];
        }
        return r;
    }
}