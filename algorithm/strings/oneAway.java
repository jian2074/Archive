class oneAway {
    static boolean check(String s, String t) {
        if (Math.abs(s.length() - t.length()) > 1) {
            return false;
        }

        String longStr = (s.length() - t.length() > 0) ? s : t;
        String shortStr = (s.length() - t.length() > 0) ? t : s;
        int indexShort = 0;
        int indexLong = 0;
        boolean differenceFound = false;
        while (indexShort < shortStr.length() && indexLong < longStr.length()) {
            if (shortStr.charAt(indexShort) != longStr.charAt(indexLong)) {
                if (differenceFound) {
                    return false;
                }
                differenceFound = true;

                if (shortStr.length() == longStr.length()) {
                    indexShort++;
                }
            } else {
                indexShort++;
            }
            indexLong++;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "jian";
        String str2 = "jiann";
        System.out.println(check(str1, str2));
    }
}
