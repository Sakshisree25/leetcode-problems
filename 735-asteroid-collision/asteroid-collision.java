class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                st.push(arr[i]);
            } else {
                int r = Math.abs(arr[i]);
                while(!st.isEmpty() && st.peek()> 0 && st.peek()<Math.abs(arr[i])) {
                    st.pop();
                } 
            
            if ( !st.isEmpty() && st.peek() == Math.abs(arr[i] )) {
                st.pop();
            }
            else if(st.isEmpty() || st.peek()<0)
            {
                st.push(arr[i]);
            }
            }
        }
        int a[] = new int[st.size()];
            for (int i = st.size()-1; i >=0; i--) {
                a[i] = st.pop();
            }
        
        return a;
    }

    }
