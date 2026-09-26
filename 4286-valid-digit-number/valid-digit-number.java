class Solution {
    public boolean validDigit(int n, int x) {
       String num=String.valueOf(n);
       String y=String.valueOf(x);
       if(num.charAt(0)==(y.charAt(0)))
       {
        return false;
       }
       for(int i=num.length()-1;i>0;i--)
       {
        if(num.charAt(i)==(y.charAt(0)))
        {
            return true;
        }

       }
       return false;
    }
}