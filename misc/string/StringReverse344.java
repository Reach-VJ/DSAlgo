package misc.string;

public class StringReverse344 {

    public static void main(String [] args) {
        StringReverse344 reverse = new StringReverse344();
        String str = "hello";
        reverse.reverseString(str.toCharArray());
    }

    public void reverseString(char[] s) {
        if (s == null || s.length < 2)
            return;
        int i = 0, j = s.length - 1;
        while (i <= j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(String.valueOf(s));
    }
}
