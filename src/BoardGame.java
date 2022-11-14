import java.util.Scanner;
import java.io.*;

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
        System.out.print(llll);
        System.out.print(rrrr);
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome");
        BoardGameLogicP1 use1 = new BoardGameLogicP1();
        for (int i = 0; i < 20; i ++){
            System.out.println(use1.player1Turn());
        }
Paths player1 = new Paths("Mennua");
        System.out.println(player1.getPath());
        player1.setPath(b);
        System.out.println(player1.getPath());

    }
}
