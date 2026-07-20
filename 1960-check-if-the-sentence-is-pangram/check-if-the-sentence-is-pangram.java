class Solution {
    public boolean checkIfPangram(String sentence) {
       /*int seen=0;
       for(char c:sentence.toCharArray())
       {
        int l=c-'a';
        seen=seen|(1<<l);
       }
       return seen==((1<<26)-1);*/
       boolean f[]=new boolean[26];
        for(int i=0;i<sentence.length();i++)
        {
            f[sentence.charAt(i)-'a']=true;
        }
        for(int i=0;i<26;i++)
        {
            if(f[i]!=true)
            {
                   return false;
            }
        }
        return true;
    }
}