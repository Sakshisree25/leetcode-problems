class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character>st=new Stack<>();
        String a="";
        for(int i=0;i<word.length();i++)
        {
            if(  word.charAt(i)==ch)
            {
               a+=word.charAt(i);
               break;
            }
            else
            {
            st.push(word.charAt(i));
            }
        }
        if(a.isEmpty())
        {
            return word;
        }
        while(!st.isEmpty())
        {
           a+=st.pop();
        }
        int index=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
               index=i;
               break;
            }
        }
        for(int i=index+1;i<word.length();i++)
        {
            a+=word.charAt(i);
        }
        return a;

    }
}