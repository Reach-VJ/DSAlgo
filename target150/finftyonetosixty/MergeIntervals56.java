package target150.finftyonetosixty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals56 {

    public static void main(String [] args) {
        int [][] intervals = {{2,6},{8,10},{15,18},{1,3}};
        intervals = MergeIntervals56.merge(intervals);
        System.out.println(intervals);
    }

    static public int[][] merge(int[][] intervals) {
        //Input : [[1,3],[2,6],[8,10],[15,18]]
        if (intervals == null || intervals.length <= 1)
            return intervals;

        // Sor the intervals in ascending order.
        Arrays.sort(intervals, (i0, i1) -> i0[0] - i1[0]);

        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval); // Add first interval

        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) { // Checking current interval start and added interval end.
                newInterval[1] = Math.max(interval[1], newInterval[1]); // Will assign max end.
            } else {
                newInterval = interval;
                result.add(newInterval); // If current interval start is greater of previous end. Add as new interval.
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
