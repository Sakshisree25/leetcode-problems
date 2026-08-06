class Solution {
    public int[] dailyTemperatures(int[] a) {
        int ans[] = new int[a.length];
        Stack<Integer> st = new Stack<>();
        for (int i = a.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && a[st.peek()] <= a[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }
        return ans;
    }
}