class Solution {
    public int totalMoney(int n) {
        int total=0;
        int monday=1;
        int day=monday;
        for(int i=1;i<=n;i++)
        {
            total+=day;
            day++;
            if(i%7==0)
            {
                monday++;
                day=monday;
            }
        }
        return total;
        
    }
}