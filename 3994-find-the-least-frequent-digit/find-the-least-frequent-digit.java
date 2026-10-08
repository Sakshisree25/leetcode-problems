class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer>m=new HashMap<>();
        int num=n;
        while(num!=0)
        {
            m.put(num%10,m.getOrDefault(num%10,0)+1);
            num/=10;
        }
        int maxi=Integer.MAX_VALUE;
        int ans=0;
        for(int x:m.keySet())
        {
            if(m.get(x)<maxi)
            {
                maxi=m.get(x);
                ans=x;
            }
        }
        return ans;
    }
}