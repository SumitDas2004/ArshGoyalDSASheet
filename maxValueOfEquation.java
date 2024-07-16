import java.util.*;
class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int ans = Integer.MIN_VALUE;
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y)->Integer.compare(x[0], y[0])*-1);
        for(int point[]:points){
            while(!pq.isEmpty() && point[0]-pq.peek()[1]>k)pq.poll();
            if(!pq.isEmpty())
            ans = Math.max(ans, point[0]+point[1]+pq.peek()[0]);
            pq.add(new int[]{point[1]-point[0], point[0]});
        }
        return ans;
    }
}