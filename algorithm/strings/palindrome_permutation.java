class palindrome_permutation {
    static boolean check(String s) {
        int count = 0;
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int sequence = Character.getNumericValue(s.charAt(i)) - Character.getNumericValue('a');
            if (sequence >= 0 && sequence <= 25) {
                frequency[sequence]++;
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] % 2 != 0) {
                count++;
            }
        }
        return (count <= 1);
    }

    public static void main(String[] args) {
        String str1 = "taco cat"; // true
        String str2 = "jiin"; // false
        System.out.println(check(str2));
    }
}
