class checkPermutation {
    /*
     * static boolean check(String s, String t) { if (s.length() != t.length()) {
     * return false; } return sort(s).equals(sort(t));
     * 
     * }
     * 
     * static String sort(String s) { char[] content = s.toCharArray();
     * java.util.Arrays.sort(content); return new String(content); }
     */

    // Second implementation
    static boolean check(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] frequency = new int[128];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            frequency[t.charAt(i)]--;
            if (frequency[t.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "Jian Qin";
        String str2 = "Qin Jian";
        System.out.println(check(str1, str2));
    }
}
