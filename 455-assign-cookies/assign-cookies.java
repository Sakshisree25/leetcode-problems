class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int s1=0;
        int g1=0;
        while(s1<s.length && g1<g.length)
        {
            if(g[g1]<=s[s1])
            {
                g1++;
            }
            s1++;
        }
        return g1;
    }

}