public class printBinary {
    public static String PBinary(double num) {
        if (num > 1 || num < 0) {
            return "Out of Range";
        }
        StringBuilder binary = new StringBuilder();
        binary.append(".");
        while (num > 0) {
            if (binary.length() > 64) {
                return "Out of Bound";
            }
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        System.out.println(PBinary(0.5));
    }
}
