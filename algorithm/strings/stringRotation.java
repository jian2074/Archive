public class stringRotation {
    static boolean checkRotation(String s1, String s2) {
        if (s1.length() > 0 && s1.length() == s2.length()) {
            String s1s1 = s1 + s1;
            return isSubstring(s1s1, s2);
        }
        return false;
    }

    public static boolean isSubstring(String s1, String s2) {
        if (s1.length() < s2.length())
            return false;
        if (s1.length() == s2.length())
            return s1.equals(s2);
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                int matchLength = 1;
                for (int j = 1; j < s2.length(); j++) {
                    if (s1.charAt(i + j) != s2.charAt(j)) {
                        break;
                    }
                    matchLength++;
                }
                if (matchLength == s2.length())
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "water";
        String s2 = "terwa";
        System.out.println(checkRotation(s1, s2));
    }
}
