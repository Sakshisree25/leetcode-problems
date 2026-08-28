class Solution {
    public char findTheDifference(String s, String t) {
      StringBuilder sb=new StringBuilder();
      HashMap<Character,Integer>m=new HashMap<>();
      for(int i=0;i<s.length();i++)
      {
        m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
      }
     char a = ' ';
      for(int i=0;i<t.length();i++)
      {
        if(!m.containsKey(t.charAt(i)))
        {
            return t.charAt(i);
        }
        m.put(t.charAt(i),m.get(t.charAt(i))-1);
        if (m.get(t.charAt(i)) < 0) {
            return t.charAt(i);
        }
      }
      return ' ';

    }
}