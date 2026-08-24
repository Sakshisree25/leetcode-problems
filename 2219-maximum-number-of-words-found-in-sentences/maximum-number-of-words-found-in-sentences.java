class Solution {
    public int mostWordsFound(String[] sentences) {
        int m=0;
        for(int i=0;i<sentences.length;i++)
        {
           String s[]=sentences[i].split(" ");
             if(s.length>m)
             {
                m=s.length;
             }
        }
        return m;
    }
}