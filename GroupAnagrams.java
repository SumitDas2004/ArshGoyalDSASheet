
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String atos=Arrays.toString(arr);
            if(!map.containsKey(atos))
                map.put(atos, new ArrayList<>());
            map.get(atos).add(s);
        }
        List<List<String>> list=new ArrayList<>();
        for(Map.Entry<String, List<String>> e: map.entrySet()){
            list.add(e.getValue());
        }
        return list;
    }
}