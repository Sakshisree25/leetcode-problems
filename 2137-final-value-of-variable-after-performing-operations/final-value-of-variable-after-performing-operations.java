class Solution {
    public int finalValueAfterOperations(String[] n) {
        int c=0;
        for(int i=0;i<n.length;i++)
        {
            if(n[i].equals("--X") || n[i].equals("X--"))
            {
                c--;
            }
            if(n[i].equals("++X") || n[i].equals("X++"))
            {
                c++;
            }
        }
        return c;
    }
}