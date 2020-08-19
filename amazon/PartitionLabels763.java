package com.reachingskies.amazon;

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
        List<Integer> list = new ArrayList<>();
        int [] last = new int[26];

        for(int i = 0; i < S.length(); i++) {
            last[S.charAt(i) - 'a'] = i;
        }

        int j = 0, restart = 0;

        for(int i = 0; i < S.length(); i++) {

            j = Integer.max(j,last[S.charAt(i)-'a']);

            if(i == j) {
                list.add(i - restart+1);
                System.out.println(S.substring(restart,i+1));
                restart = i+1;
            }
        }

        return list;
    }
}
