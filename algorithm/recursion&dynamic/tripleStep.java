public class tripleStep {

    static int count(int n) {
        return count(n, new int[n + 1]);
    }

    static int count(int n, int[] memo) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (memo[n] > 0) {
            return memo[n];
        } else {
            memo[n] = count(n - 1, memo) + count(n - 2, memo) + count(n - 3, memo);
            return memo[n];
        }
    }

    public static void main(String[] args) {
        System.out.println(count(20));
    }
}
