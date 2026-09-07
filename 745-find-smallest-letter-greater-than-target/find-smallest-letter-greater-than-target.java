class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       /*
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]>target)
            {
                return letters[i];
            }
        }
        return letters[0];*/
        int n=letters.length-1;
        int l=0,h=n;
        char ans=letters[0];
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(letters[m]>target)
            { 
                ans=letters[m];
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return ans;
    }
}
