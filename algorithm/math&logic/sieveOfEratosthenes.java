import java.util.Arrays;

public class sieveOfEratosthenes {
    public static boolean[] generatePrimeList(int max) {
        boolean[] flags = new boolean[max + 1];
        Arrays.fill(flags, Boolean.TRUE);
        flags[0] = false;
        flags[1] = false;
        int prime = 2;

        while (prime <= Math.sqrt(max)) {
            crossOff(flags, prime);
            prime = getNextPrime(flags, prime);
        }

        return flags;
    }

    public static void crossOff(boolean[] flags, int prime) {
        for (int i = prime * prime; i < flags.length; i += prime) {
            flags[i] = false;
        }
    }

    public static int getNextPrime(boolean[] flags, int prime) {
        int next = prime + 1;
        while (next < flags.length && !flags[next]) {
            next++;
        }
        return next;
    }

    public static void main(String[] args) {
        boolean[] prime = generatePrimeList(100);
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) {
                System.out.println(i);
            }
        }
    }
}
