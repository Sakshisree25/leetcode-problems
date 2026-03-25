class Solution {
    public int countKeyChanges(String s) {
        String m=s.toLowerCase();
        int c=0;
        for(int i=1;i<m.length();i++)
        {
            if(m.charAt(i)!=m.charAt(i-1))
            {
                c++;
            }
        }
        return c;
    }
}