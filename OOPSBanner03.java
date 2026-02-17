public class OOPSBanner03 {

    public static void main(String[] args) {

        // Create String array to store 7 lines of OOPS banner
        String[] banner = new String[7];

        // Populate each line using String.join()
        banner[0] = String.join("   ",
                " ***** ",
                " ***** ",
                " ******",
                " ***** ");

        banner[1] = String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*     *");

        banner[2] = String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*     *");

        banner[3] = String.join("   ",
                "*     *",
                "*     *",
                " ******",
                " ***** ");

        banner[4] = String.join("   ",
                "*     *",
                "*     *",
                "*      ",
                "      *");

        banner[5] = String.join("   ",
                "*     *",
                "*     *",
                "*      ",
                "*     *");

        banner[6] = String.join("   ",
                " ***** ",
                " ***** ",
                "*      ",
                " ***** ");

        // Print banner using enhanced for-loop (single clean output)
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
