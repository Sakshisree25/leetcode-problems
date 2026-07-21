class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int c1=0;
        int c2=0;
        int r1=0;
        int r2=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='L')
            {
               r1++;
            }
            else if( moves.charAt(i)=='R')
            {
                r2++;
            }
        }
        for(int i=0;i<moves.length();i++)
        { 
           
            if(moves.charAt(i)=='L')
            {
                c1++;
            }
            else if(moves.charAt(i)=='R')
            {
                c2++;
            }
            else if(moves.charAt(i)=='_' && r1>r2)
            {
                c1++;
            }
            else if(moves.charAt(i)=='_' && r2>r1)
            {
                c2++;
            }
            else if(moves.charAt(i)=='_' && r1==0 && r2==0)
            {
                c2++;
            }
            else if(moves.charAt(i)=='_' && r1==r2)
            {
                c1++;
            }
            
        }
       /* if(moves.length()==1 && moves.charAt(0)=='R')
        {
            return 1;
        }
        else if(moves.length()==1 && moves.charAt(0)=='L')
        {
            return 1;*/
        
        return Math.abs(c1-c2);
    }
}