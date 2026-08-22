class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer>s=new HashSet<>();
        for(int x:m.keySet())
        {
           if(s.contains(m.get(x)))
           {
            return false;
           }
           s.add(m.get(x));
        }
        return true;
    }
}