class Solution {
    public List<Integer> findPeaks(int[] a) {
        List<Integer>l=new ArrayList<>();
        int n=a.length;
        for(int i=1;i<n-1;i++)
        {
            if(a[i]>a[i-1] && a[i]>a[i+1])
            {
                l.add(i);
            }
        }
        return l;
    }
}