class stringCompression {
    static String compression(String s) {
        String output = "";
        int countConsecutive = 0;
        for (int i = 0; i < s.length(); i++) {
            countConsecutive++;
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                output += "" + s.charAt(i) + countConsecutive;
                countConsecutive = 0;
            }
        }
        return output.length() < s.length() ? output : s;
    }

    public static void main(String[] args) {
        String test1 = "aaaaabbbbccccc";
        System.out.println(compression(test1));
    }
}
