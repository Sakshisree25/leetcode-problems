class Solution {
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
    }
