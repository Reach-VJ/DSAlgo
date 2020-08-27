package target150.onetoten;

public class LongestPalindromicSubString5 {
    static int startIndex = 0;
    static int length = 0;
    public static void main(String [] args) {
        String str = "baaaab";
        String pal = LongestPalindromicSubString5.longestPolindromicSubString(str);
        System.out.println(str+"  --> "+pal);
    }

    static String longestPolindromicSubString(String str) {
        for(int i = 0; i < str.length(); i++) {
                helper(str,i,i);
                helper(str,i,i+1);
        }
        return str.substring(startIndex,length);
    }

    static void helper(String str,int start, int end) {
        while(start>=0 && end<str.length() && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }

        if(length < end-start-1) {
            length = end-start-1;
            startIndex = start+1;
        }

    }

}
