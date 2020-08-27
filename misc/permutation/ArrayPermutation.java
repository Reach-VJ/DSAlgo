package misc.permutation;

public class ArrayPermutation {

    public static void main(String [] args) {
        Integer [] elements = {1,2,3};
        printAllRecursive(elements,' ');

        System.out.println("Iter:");
        //printAllIterative(elements.length, elements, ';');
    }

    public static <T> void printAllRecursive(T[] elements, char delimiter) {
        printAllRecursive(elements.length, elements, delimiter);
    }

    public static <T> void printAllRecursive(int n, T[] elements, char delimiter) {

        if(n == 1) {
            printArray(elements, delimiter);
        } else {
            for(int i = 0; i < n-1; i++) {
                printAllRecursive(n - 1, elements, delimiter);
                if(n % 2 == 0) {
                    swap(elements, i, n-1);
                } else {
                    swap(elements, 0, n-1);
                }
            }
            printAllRecursive(n - 1, elements, delimiter);
        }
    }

    private static <T> void swap(T[] elements, int a, int b) {

        T tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
    }

    public static <T> void printAllIterative(int n, T[] elements, char delimiter) {

        int[] indexes = new int[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = 0;
        }

        printArray(elements, delimiter);

        int i = 0;
        while (i < n) {
            if (indexes[i] < i) {
                swap(elements, i % 2 == 0 ?  0: indexes[i], i);
                printArray(elements, delimiter);
                indexes[i]++;
                i = 0;
            }
            else {
                indexes[i] = 0;
                i++;
            }
        }
    }

    private static <T> void printArray(T[] elements, char delimiter) {

        String delimiterSpace = delimiter + " ";
        for(int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + delimiterSpace);
        }
        System.out.print('\n');


    }
}
