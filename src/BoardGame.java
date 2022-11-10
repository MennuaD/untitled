import java.util.Scanner;
import java.io.*;

public class BoardGame {
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
        for (int i = 0; i < 100; i ++){
            System.out.println(use1.player1Turn());
        }

    }
}
