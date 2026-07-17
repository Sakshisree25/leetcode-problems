class Solution {
    public String truncateSentence(String s, int k) {
        int space=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== ' ')
            {
                space++;
                if(space==k)
            {
                   break;
            }
            sb.append(" ");
            }
            else 
            {
                sb.append(s.charAt(i));
            }
            
        }
        return sb.toString();
    }
}