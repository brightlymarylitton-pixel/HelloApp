public class OOPSBannerAppUC6 {

    public static void main(String[] args) {

        String[] o = printO();
        String[] p = printP();
        String[] s = printS();

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "   " + o[i] + "   " + p[i] + "   " + s[i]);
        }
    }

    static String[] printO() {
        return new String[]{
            " *** ",
            "** **",
            "** **",
            "** **",
            "** **",
            "** **",
            " *** "
        };
    }

    static String[] printP() {
        return new String[]{
            "**** ",
            "** **",
            "** **",
            "**** ",
            "**   ",
            "**   ",
            "**   "
        };
    }

    static String[] printS() {
        return new String[]{
            " ****",
            "**   ",
            "**   ",
            " *** ",
            "   **",
            "   **",
            "**** "
        };
    }
}