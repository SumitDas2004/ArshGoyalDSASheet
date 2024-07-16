import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int left[] = new int[heights.length];
        int right[] = new int[heights.length];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(-1);
        for(int i=0;i<heights.length;i++){
            while(st.peek()!=-1 && heights[st.peek()]>=heights[i])st.pop();
            left[i] = st.peek();
            st.push(i);
        }
        st.clear();
        st.push(heights.length);
        for(int i=heights.length-1;i>=0;i--){
            while(st.peek()!=heights.length && heights[st.peek()]>=heights[i])st.pop();
            right[i] = st.peek();
            st.push(i);
        }

        int ans = 0;
        for(int i=0;i<heights.length;i++){
            ans = Math.max(ans, (right[i]-left[i]-1)*heights[i]);
        }
        return ans;

    }
}