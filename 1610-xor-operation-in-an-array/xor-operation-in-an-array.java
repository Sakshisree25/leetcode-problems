class Solution {
    public int xorOperation(int n, int start) {
        int a[]=new int[n];
        int index=0;
      for(int i=0;i<n;i++)
      {
           int r=start+2*i;
           a[index++]=r;
      }  
      int xor=0;
      for(int i=0;i<a.length;i++)
      {
          xor=xor^a[i];
      }
      return xor;
     
    }

}