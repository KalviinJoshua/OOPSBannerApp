/**
 * OOPSBannerApp UC7 – Store Character Pattern in an Inner Static Class
 *
 * Extends UC6 by encapsulating character-to-pattern mapping
 * using an inner static class for better modularity and scalability.
 *
 * @author KalviinJoshua
 * @version 7.0
 */
public class OOPSBannerAppUC7 {

    /**
     * Inner Static Class to store character and its ASCII pattern
     */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character character being mapped
         * @param pattern ASCII pattern lines
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * @return mapped character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * @return ASCII pattern for the character
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes character pattern mappings
     * @return array of CharacterPatternMap objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        };

        String[] pPattern = {
                " ***** ",
                " *    *",
                " *    *",
                " ***** ",
                " *     ",
                " *     ",
                " *     "
        };

        String[] sPattern = {
                " ***** ",
                " *     ",
                " *     ",
                " ***** ",
                "     * ",
                "     * ",
                " ***** "
        };

        String[] spacePattern = {
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        };

        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern),
                new CharacterPatternMap(' ', spacePattern)
        };
    }

    /**
     * Retrieves ASCII pattern for given character
     * @param ch character to lookup
     * @param charMaps array of CharacterPatternMap
     * @return pattern array
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints message as ASCII banner
     * @param message string to print
     * @param charMaps pattern maps
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main method – Entry point
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}