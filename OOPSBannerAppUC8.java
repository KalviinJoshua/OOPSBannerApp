import java.util.HashMap;

public class OOPSBannerAppUC8 {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     * Each character maps to an array of strings where each string represents
     * one line of the character's ASCII art pattern.
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        charMap.put('P', new String[]{
                " ***** ",
                " *    *",
                " *    *",
                " ***** ",
                " *     ",
                " *     ",
                " *     "
        });

        charMap.put('S', new String[]{
                " ***** ",
                " *     ",
                " *     ",
                " ***** ",
                "     * ",
                "     * ",
                " ***** "
        });

        return charMap;
    }

    /**
     * Static method to display the banner message using the character map
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        // Assume all patterns have same height
        int patternHeight = charMap.get('O').length;

        // Loop through each row
        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            // Loop through each character in message
            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);

                if (pattern != null) {
                    sb.append(pattern[line]).append(" ");
                }
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main entry point
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}