class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String w1[]= s1.split(" ");
        String w2[]= s2.split(" ");
        HashMap<String,Integer>m=new HashMap<>();
        for(String x1:w1)
        {
            m.put(x1,m.getOrDefault(x1,0)+1);
        }
        for(String x2:w2)
        {
            m.put(x2,m.getOrDefault(x2,0)+1);
        }
        List<String>res=new ArrayList<>();
        for(Map.Entry<String,Integer>e:m.entrySet())
        {
            if(e.getValue()==1)
            {
                res.add(e.getKey());
            }
        }
        return res.toArray(new String[0]);
    }
}