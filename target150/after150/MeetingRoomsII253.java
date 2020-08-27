package target150.after150;

import java.util.Arrays;

public class MeetingRoomsII253 {

    public static void main(String [] args) {
        int [][] intervals = {{0, 30},{5, 10},{15, 20}};
        int minMeetingRooms = MeetingRoomsII253.minMeetingRooms(intervals);
        System.out.println(minMeetingRooms);
    }

    static public int minMeetingRooms(int[][] intervals) {

        int count = 1;
        //Sort array with start period.
        Arrays.sort(intervals, (p1,p2)-> p1[0] - p2[0]);
        //Compare previous meeting start, end with current meeting if its fails increase the room numbers.
        for(int i = 1; i< intervals.length; i++) {
            if(!(intervals[i-1][0] < intervals[i][0]) || !(intervals[i-1][1] < intervals[i][1])) {
                count++;
            }
        }

        return count;
    }
}
