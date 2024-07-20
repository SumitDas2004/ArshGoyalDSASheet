import java.util.*;
class Solution {
    static void helper(HashSet<ArrayList<Integer>> ans, ArrayList<Integer> list, ArrayList<Integer> arr){
        if(arr.size()==0){
            ans.add(list);
            return ;
        }
        for(int j=0;j<arr.size();j++){
            list.add(arr.get(j));
            ArrayList<Integer> tmp = new ArrayList<>(arr);
            tmp.remove((Integer)arr.get(j));
            helper(ans, new ArrayList<>(list), tmp);
            list.remove(list.size()-1);
        }
    }
    
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        HashSet<ArrayList<Integer>> ans = new HashSet<>();
        helper(ans, new ArrayList<>(), arr);
        ArrayList<ArrayList<Integer>> tmp = new ArrayList<>(ans);
        Collections.sort(tmp, (x, y)->{
            for(int i=0;i<Math.min(x.size(),y.size()); i++){
                if(x.get(i)<y.get(i))return -1;
                else if(x.get(i)>y.get(i))return 1;
            }
            return 0;
        });
        return tmp;
    }
};