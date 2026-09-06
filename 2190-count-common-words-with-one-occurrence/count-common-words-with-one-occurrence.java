class Solution {
    public int countWords(String[]s1, String[]s2) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        HashMap<String,Integer>m1=new HashMap<>();
         HashMap<String,Integer>m2=new HashMap<>();
        for(int i=0;i<s1.length;i++)
        {
            m1.put(s1[i],m1.getOrDefault(s1[i],0)+1);
        }
        for(int i=0;i<s2.length;i++)
        {
            m2.put(s2[i],m2.getOrDefault(s2[i],0)+1);
        }
        for(String n:m1.keySet())
        {
           if(m1.get(n) == 1 && m2.containsKey(n) && m2.get(n) == 1)
           {
            c++;
           }
        }
        return c;
    }
}