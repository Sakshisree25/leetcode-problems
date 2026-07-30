class Solution {
    public int minimumPushes(String word) {
        int push=1;
        int ans=0;
        int l=word.length();
        while(l>8)
        {
            ans+=8*push;
            l=l-8;
            push++;
        }
        ans+=l*push;
        return ans;
    }
}