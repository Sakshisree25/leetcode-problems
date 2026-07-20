class Solution {
    public String removeTrailingZeros(String num) {
      StringBuilder sb=new StringBuilder();
      int c=0;
      for(int i=num.length()-1;i>=0;i--)
      {
        if(num.charAt(i)=='0' && c==0)
        {
             continue;
        }
        else
        {
            c=1;
            sb.append(num.charAt(i));
           
        }
      }
     String ans= sb.reverse().toString();
      return ans;
        
    }
}