class Solution {
    public boolean areOccurrencesEqual(String s) {
       HashMap<Character,Integer>m=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
        m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
       }
       int f=m.get(s.charAt(0));
       for(int x:m.values())
       {
        if(x!=f)
        {
            return false;
        }
       }
       
       return true;
    }
    }

