public class fibonacciMemo {
    static int fibonacci(int n) {
        return fibonacci(n, new int[n + 1]);
    }

    static int fibonacci(int i, int[] memo) {
        if (i == 0 || i == 1) {
            return 1;
        }
        if (memo[i] == 0) {
            memo[i] = fibonacci(i - 1, memo) + fibonacci(i - 2, memo);
        }
        return memo[i];
    }

    static int smartFib(int n) {
        int a = 1;
        int b = 1;
        for (int i = 2; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(smartFib(10));
    }
}
