package misc.permutation;

import java.util.Arrays;

public class StringPermutation {

    static int count = 0;

    public static void main(String[] args) {
        String str = "ab";
        int [] elements = {1,2,3};
        //StringPermutation.permucation(str, 0, str.length());

        StringPermutation.permucation(elements, 0, elements.length);
        System.out.println(count);
    }

    private static void permucation(int [] elements, int l, int r) {
        if (l == r) {
            System.out.println(Arrays.toString(elements));
            int temp = 0;
            for(int i:elements) {
                temp = temp+i;
            }
            if(temp%2 != 0)
                count++;

        }
        else {
            for (int i = l; i < r; i++) {
                elements = swap(elements, l, i);
                permucation(elements, l + 1, r);
                elements = swap(elements, l, i);
            }
        }
    }

    private static void permucation(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i < r; i++) {
                str = swap(str, l, i);
                permucation(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String string, int i, int j) {
        char[] chars = string.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }

    private static int [] swap(int [] elements, int i, int j) {
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
        return elements;
    }

}
