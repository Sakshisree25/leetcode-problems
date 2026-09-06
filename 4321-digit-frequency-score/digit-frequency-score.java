class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer>m=new HashMap<>();
        int num=n;
        while(num!=0)
        {
           m.put(num % 10, m.getOrDefault(num % 10, 0) + 1);
            num=num/10;
        }
        int s=0;
        for(int r:m.keySet())
        {
             s+=m.get(r)*r;
        }
        return s;
        
    }
}