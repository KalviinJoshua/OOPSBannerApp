/**
 * OOPSBannerApp UC6 – Refactor Banner Logic into Static Methods
 *
 * This use case extends UC5 by defining helper methods
 * to generate each character pattern (O, P, S).
 * Improves modularity and follows DRY principle.
 */

public class OOPSBannerAppUC6 {

    public static String[] getOPattern() {
        return new String[] {
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            " *    *",
            " *    *",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            " *     ",
            " *     ",
            " ***** ",
            "     * ",
            "     * ",
            " ***** "
        };
    }

    // Main method
    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and print OOPS banner
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + " " +
                oPattern[i] + " " +
                pPattern[i] + " " +
                sPattern[i]
            );
        }
    }
}
