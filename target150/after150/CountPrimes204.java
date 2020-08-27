package target150.after150;

public class CountPrimes204 {

    public static void main(String[] args) {
        int num = 10;
        CountPrimes204 count = new CountPrimes204();
        System.out.println(count.countPrimes(num));
    }

    int countPrimes(int num) {
        int count = 0;
        if (num <= 1)
            return count;

        for (int i = 2; i < num; i++) {
            count = count + isPrime(i);
        }

        return count;

    }

    int isPrime(int num) {
        if (num == 2 || num == 3 || num == 5)
            return 1;
        if(num%2 == 0 || num%3 == 0 || num%5 == 0)
            return 0;
        int squareRoot = (int) Math.sqrt(num);
        for (int i = 7; i <= squareRoot; i += 2) {
            if (num % i == 0) return 0;
        }
        return 1;
    }

}
