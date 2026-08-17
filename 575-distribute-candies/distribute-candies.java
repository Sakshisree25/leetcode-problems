class Solution {
    public int distributeCandies(int[] candyType) {
      HashSet<Integer>s=new HashSet<>();
      for(int i=0;i<candyType.length;i++)
      {
        s.add(candyType[i]);
      } 
      int n=candyType.length;
      int c=n/2;
      if(c==s.size())
      {
        return s.size();
      }
      else if(c<s.size())
      {
        return c;
      }
      else
      {
        return s.size();
      }
    }
}