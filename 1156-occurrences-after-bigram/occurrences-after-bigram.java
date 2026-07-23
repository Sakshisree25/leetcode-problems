class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        StringBuilder sb=new StringBuilder();
        String []ans=text.split("\\s");
        for(int i=1;i<ans.length-1;i++)
        {
           if((ans[i-1].equals(first)) &&(ans[i].equals(second)))
            {
                sb.append(ans[i+1]);
                sb.append(" ");
            }
        }
        if(sb.length()==0)
        {
            return new String[0];
        }
        String res[]=sb.toString().split("\\s+");
        return res;
    }
}