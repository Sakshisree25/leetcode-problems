class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
       HashSet<Character>s=new HashSet<>();
       int cn=0;
       for(char c:brokenLetters.toCharArray())
       {
        s.add(c);
       }
       String[]a=text.split(" ");
        
        for(String x:a )
        {
            for(char c:x.toCharArray())
            {
                if(s.contains(c))
                {
                    cn++;
                    break;
                }
            }
        }
        return a.length-cn;
    }
}