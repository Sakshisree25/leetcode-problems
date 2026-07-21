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
        return Math.abs(c1-c2);
    }
}
/*class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, blank = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'L') left++;
            else if (ch == 'R') right++;
            else blank++;
        }

        return Math.abs(right - left) + blank;
    }
}*/
/*Count how many fixed left and right moves there are.
Whichever side already has more moves, assign every _ to that side.
Then compute the final distance.*/