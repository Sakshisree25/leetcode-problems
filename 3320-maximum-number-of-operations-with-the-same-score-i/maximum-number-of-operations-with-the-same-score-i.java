/*class Solution {
    public int maxOperations(int[] nums) {
       Queue<Integer>q=new ArrayDeque<>();
       for(int i=0;i<nums.length;i++)
       {
          q.offer(nums[i]);
       }
       int target=q.poll() + q.poll();
       int c=1;
       int n=nums.length;
       while(q.size()>=2)
       {
       int a=q.poll();
       int b=q.poll();
       if(a+b==target)
       {
        c++;
       }
       else
       {
        break;
       }
       }
       return c;   
       } 
    }*/
    class Solution
    {
        public int maxOperations(int[] nums) {
            int target=nums[0]+nums[1];
            int c=0;
            for(int i=0;i<nums.length-1;i+=2)
            {
                if(nums[i]+nums[i+1]==target)
                {
                    c++;
                }
                else
                {
                    break;
                }
            }
            return c;
        }
    }

