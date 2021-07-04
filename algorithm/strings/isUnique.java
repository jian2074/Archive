class isUnique {
    static boolean check(String s) {
        if (s.length() > 128) {
            return false;
        }
        boolean[] charset = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            if (charset[s.charAt(i)]) {
                return false;
            }
            charset[s.charAt(i)] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String test1 = "hello world";
        String test2 = "mynameisJ";
        System.out.println(check(test1));
        System.out.println(check(test2));
    }
}