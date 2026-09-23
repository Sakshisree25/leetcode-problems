class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       HashMap<Integer,String>m=new HashMap<>();
       for(int i=0;i<names.length;i++)
       {
        m.put(heights[i],names[i]);
       }
       Arrays.sort(heights);
       String[]res=new String[heights.length];
       int index=0;
       for(int i=heights.length-1;i>=0;i--)
       {
        res[index++]=m.get(heights[i]);
       }
       return res;
    }
}