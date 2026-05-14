class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    /* HashMap<Character,Integer>m=new HashMap<>();
     for(int i=0;i<magazine.length();i++)
     {
        m.put(magazine.charAt(i),m.getOrDefault(magazine.charAt(i),0)+1);
     }
     for(int i=0;i<ransomNote.length();i++)
     {
        if(m.containsKey(ransomNote.charAt(i)) && m.get(ransomNote.charAt(i))>0)
        {
            m.put(ransomNote.charAt(i),m.get(ransomNote.charAt(i))-1);
        }
        else
        {
            return false;
        }
     }
   return true;*/
    int count[]=new int[26];
    for(char ch:magazine.toCharArray())
    {
        count[ch-'a']++;
    }
    for(char ch:ransomNote.toCharArray())
    {
        count[ch-'a']--;
        if(count[ch-'a']<0)
        {
            return false;
        }
    }
    return true;

    }
}