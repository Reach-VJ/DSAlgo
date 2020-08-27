package target150.after150;

import java.util.Arrays;
import java.util.Comparator;

public class ReOrderDataLogs937 {

    public static void main(String [] args) {
        String [] logs =  {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        System.out.println("Logs before sort --> "+ Arrays.toString(logs));
        logs = ReOrderDataLogs937.reorderLogFiles(logs);
        System.out.println("Logs after sort --> "+ Arrays.toString(logs));

    }

    static public String[] reorderLogFiles(String[] logs) {

        if(logs == null || logs.length == 0)
            return logs;
        Arrays.sort(logs, new Comparator<String>() {
            @Override
            public int compare(String str1,String str2) {
                int str1Index = str1.indexOf(' ');
                int str2Index = str2.indexOf(' ');

                String subString1 = str1.substring(str1Index+1);
                String subString2 = str2.substring(str2Index+1);

                if(subString1.charAt(0) <= '9')
                    if(subString2.charAt(0) <= '9' )
                        return 0;
                    else return 1;
                else {
                    if(subString2.charAt(0) <= '9') return -1;
                    else {
                        int comp = subString1.compareTo(subString2);
                        return comp == 0 ? str1.substring(0, str1Index).compareTo(str2.substring(0, str2Index)) : comp;
                    }
                }
            }
        });
        return logs;
    }
}
