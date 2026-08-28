class Solution {
    public int numJewelsInStones(String s, String stones) {
        HashMap<Character,Integer>m=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        int c=0;
        for(int i=0;i<stones.length();i++)
        {
            if(m.containsKey(stones.charAt(i)))
            {
                c++;
            }
        }
        return c;
    }
}