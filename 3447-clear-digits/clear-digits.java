class Solution {
    public String clearDigits(String s) {
        String a="";
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
           if(Character.isDigit(s.charAt(i))&& Character.isLetter(st.peek()))
           {
             st.pop();
           }
           else
           {
           st.push(s.charAt(i));
           }
        }
        while(!st.isEmpty())
        {
            a=st.pop()+a;
        }
        return a;
        

        
    }
}