public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        // Step 1: Define array
        String[] lines = new String[9];

        // Step 2: Populate array using String.join()
        lines[0] = String.join(" ","   ***   "," ","   ***   "," ","******   "," ","   *****   ");
        lines[1] = String.join(" "," **   ** "," "," **   ** "," ","**    ** "," "," **        ");
        lines[2] = String.join(" ","**     **"," ","**     **"," ","**     **"," ","**         ");
        lines[3] = String.join(" ","**     **"," ","**     **"," ","**    ** "," "," **        ");
        lines[4] = String.join(" ","**     **"," ","**     **"," ","******   "," ","   ***     ");
        lines[5] = String.join(" ","**     **"," ","**     **"," ","**       "," ","      **   ");
        lines[6] = String.join(" ","**     **"," ","**     **"," ","**       "," ","       **  ");
        lines[7] = String.join(" "," **   ** "," "," **   ** "," ","**       "," ","      **   ");
		lines[8] = String.join(" ","   ***   "," ","   ***   "," ","**       "," "," *****     ");

        // Step 3: Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}