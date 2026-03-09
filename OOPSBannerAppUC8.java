import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    public static void main(String[] args) {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "** **",
                "** **",
                "**** ",
                "**   ",
                "**   ",
                "**   "
        });

        map.put('S', new String[]{
                " ****",
                "**   ",
                "**   ",
                " *** ",
                "   **",
                "   **",
                "**** "
        });

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(map.get(c)[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}