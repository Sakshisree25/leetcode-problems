class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>s=new Stack<>();
        for(String o:operations)
        {
            if(o.equals("C"))
            {
                s.pop();
            }
            else if(o.equals("D"))
            {
                s.push(2*s.peek());
            }
            else if(o.equals("+"))
            {
                int top=s.pop();
                int newScore=top+s.peek();
                s.push(top);
                s.push(newScore);
            }
            else
            {
                s.push(Integer.parseInt(o));
            }
        }
            int sum=0;
            for(int n:s)
            {
                sum+=n;
                
             }
             return sum;
        
        
    }
}