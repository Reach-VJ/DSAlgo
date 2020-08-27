package misc;

import sun.jvm.hotspot.types.CIntegerField;

import java.util.*;

public class FindUnique {

    //It will work if duplicate element repeat even times

    public static void main(String [] args) {
        List<Integer> example1 = Arrays.asList(0,1,0,1,1); //5
        List<Integer> example2 = Arrays.asList(9); // 9
        List<Integer> example3 = Arrays.asList(0,0,-1,-1,13131,2,2); // 13131
        System.out.println(findUnique(example1));
        System.out.println(findUnique(example2));
        System.out.println(findUnique(example3));
    }

    //It works if duplicate element repeat even times
    public static Integer findUnique(List<Integer> example) {
        Set<Integer> set = new HashSet<>();
        for(Integer integer : example) {
            if(set.contains(integer)) {
                set.remove(integer);
            } else {
                set.add(integer);
            }
        }
        return set.size() > 0 ? set.stream().findFirst().get() : Integer.MIN_VALUE;
    }

    //Better Approach works in all cases HashMap

    public static Integer findUniqueInList(List<Integer> list) {
        Map<Integer,Integer> map = new HashMap<>();
        Integer occurrence = null;
        for(Integer element : list) {
            occurrence = map.get(element);
            map.put(element,occurrence == 0 ? 1 : occurrence+1);
        }

        Set<Map.Entry<Integer, Integer>> mapEntry = map.entrySet();
        for(Map.Entry<Integer,Integer> set : mapEntry) {
            if(set.getKey() == 1)
                return set.getValue();
        }
        return Integer.MIN_VALUE;
    }
}