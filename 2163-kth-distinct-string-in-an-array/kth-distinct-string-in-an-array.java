class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer>m=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
             if(m.containsKey(arr[i]) && m.get(arr[i])==1)
             {
                c++;
             }
             if(c==k)
             {
                return arr[i];
             }
             
        }
        return "";

    }
}