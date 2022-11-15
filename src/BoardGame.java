import java.util.Scanner;

public class BoardGame {
   static int b = 151;
   static int c = 152;
   static int d = 25;
   static int e = 601;
   static int f = 602;
   static int g = 40;

    public static final String ANSI_RESET = "\u001B[0m";

    // Declaring the color
    // Custom declaration
    public static final String llll = "\u001B[30m";
    public static final String rrrr = "\u001B[45m";

    // Main driver method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        P1Run use1 = new P1Run();
        Paths player1 = new Paths("Mennua");
        System.out.print(llll);
        System.out.print(rrrr);

        System.out.println("Welcome");

        for (int i = 0; i < 20; i ++){
            System.out.println(use1.player1Turn());
        }

        System.out.println(player1.getPath());
        System.out.println(player1.getPathname());
        player1.setPath(b);
        System.out.println(player1.getPath());
        System.out.println(player1.getPathname());
        System.out.println((player1.getPathname()).equals("b"));

        /*
        if ((player1.getPathname()).equals("b") && pl)

         */

    }
}
