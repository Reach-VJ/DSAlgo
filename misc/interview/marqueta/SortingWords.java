package misc.interview.marqueta;

import misc.string.StringReverse344;

import java.util.*;
import java.util.stream.Collectors;

public class SortingWords {

    public static void main(String [] args) {
        String str = "The quick brown fox jumped over the lazy brown dog’s back";

        String [] stringList = str.split("\\s+");

        Map<String,Integer> map = new TreeMap<>();

        for(String string : stringList) {
            map.put(string,map.getOrDefault(string,0)+1);
        }

        for(Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey().toString() + entry.getValue().toString());
        }

        Set set = map.entrySet();
        List<String> list = new ArrayList<>(map.keySet());

       Collections.sort(list, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               return o1.length() < o2.length() ? -1 : 1;
           }
       });


//       list.forEach((x)-> {
//           System.out.println(map.get(x) + " "+x);
//       });

       map.keySet().stream().sorted((x,y) -> { return x.length() - y.length();}).forEach((x) ->System.out.println(
               map.get(x) +" "+x
       ));




    }
}
