package target150.after150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionLabels763 {

    public static void main(String [] args) {
        String str = "ababcbacadefegdehijhklij";
        PartitionLabels763 obj = new PartitionLabels763();
        System.out.println(obj.partitionLabels(str));
    }

    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        int[] last = new int[26];
        /**This is the key step:
         * we find the last occurrence of each letter and record them in last[]*/
        for (int i = 0; i < S.length(); i++) {
            last[S.charAt(i) - 'a'] = i;
        }
        System.out.println(Arrays.toString(last));
        int start = -1;
        int end = -1;
        for (int i = 0; i < S.length(); i++) {
            if (start == -1) {
                start = i;
            }
            end = Math.max(end, last[S.charAt(i) - 'a']);
            if (end == i) {
                result.add(end - start + 1);
                start = -1;
            }
        }
        return result;
    }
}
