import java.util.*;
class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<string_list.length;i++){
            char[] arr=string_list[i].toCharArray();
            Arrays.sort(arr);
            String str=Arrays.toString(arr);
            ArrayList<String> list=map.getOrDefault(str,new ArrayList<String>());
            list.add(string_list[i]);
            map.put(str,list);
        }
        List<List<String>> ans=new ArrayList<>();
        for(Map.Entry<String,ArrayList<String>> e: map.entrySet()){
            ans.add(e.getValue());
        }
        return ans;
    } 
}
