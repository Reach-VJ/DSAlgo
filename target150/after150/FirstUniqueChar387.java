package target150.after150;

public class FirstUniqueChar387 {

    public static void main(String [] args) {
        String str = "helloh";
        int index = FirstUniqueChar387.leftMostNonRepeatedChar(str);
        System.out.println("Left most non repeated element from "+str+" --> "+str.charAt(index));
    }

    // Input : "hello"
    // Output : 0 (or h) Its left most non repeating char.
    // Time : O(n)
    // Space : O(n)
    // Logic : Store frequencies of chars and check if any char frequency is 1.
    //       : return -1 if all frequencies are more than one
    static int leftMostNonRepeatedChar(String str) {
        if(str == null || str.length() == 0)
            return -1;

        int [] charCount = new int[26];
        //Store frequencies of chars in charCount array.
        for(int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)-'a']++;
        }

        for(int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
