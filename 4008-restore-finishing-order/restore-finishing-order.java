class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
       HashMap<Integer,Integer>m=new HashMap<>();
       for(int i=0;i<friends.length;i++)
       {
        m.put(friends[i],m.getOrDefault(friends[i],0)+1);
       } 
       ArrayList<Integer>r=new ArrayList<>();
       for(int i=0;i<order.length;i++)
       {
        if(m.containsKey(order[i]))
        {
            r.add(order[i]);
        }
       }
       int a[]=new int[r.size()];
       for(int i=0;i<r.size();i++)
       {
        a[i]=r.get(i);
       }
       return a;
    }
}