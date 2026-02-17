public class OOPSBanner02 {
    public static void main(String[] args) {

        // O
        String[] O = {
            String.join("", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*")
        };

        // P
        String[] P = {
            String.join("", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*"),
            String.join("", "*"),
            String.join("", "*")
        };

        // S
        String[] S = {
            String.join("", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*"),
            String.join("", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*")
        };

        // Print OOPS
        for (int i = 0; i < 7; i++) {
            System.out.print(O[i] + "   "); // O
            System.out.print(O[i] + "   "); // second O
            System.out.print(P[i] + "   "); // P
            System.out.println(S[i]);       // S
        }
    }
}
