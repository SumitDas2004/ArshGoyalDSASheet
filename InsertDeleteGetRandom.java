import java.util.*;
class RandomizedCollection {
    Map<Integer, Set<Integer>> map;
    List<Integer> list;

    public RandomizedCollection() {
        map = new HashMap<>();
        list = new LinkedList<>();
    }

    public boolean insert(int val) {
        boolean ans = false;
        if (!map.containsKey(val)) {
            map.put(val, new LinkedHashSet<>());
            ans = true;
        }
        map.get(val).add(list.size());
        list.add(val);
        return ans;
    }

    public boolean remove(int val) {
        boolean ans = map.containsKey(val);
        if (!ans)
            return ans;
        int ind = map.get(val).stream().findFirst().get();
        map.get(val).remove(ind);
        if (map.get(val).isEmpty())
            map.remove(val);
        int ind2 = list.size() - 1;
        if (ind2 != ind) {
            int tmp = list.get(ind);
            list.set(ind, list.get(ind2));
            list.set(ind2, tmp);
            map.get(list.get(ind)).remove(ind2);
            map.get(list.get(ind)).add(ind);
        }
        list.remove(ind2);
        return ans;
    }

    public int getRandom() {
        int random = (int) (Math.random() * 100000);
        random %= list.size();
        return list.get(random);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */