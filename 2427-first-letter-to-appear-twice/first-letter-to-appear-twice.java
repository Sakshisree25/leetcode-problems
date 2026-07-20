class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer>m=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            if(m.get(s.charAt(i))==2)
            {
               return s.charAt(i);
            }
        }
    return '\0';
      
    }
}