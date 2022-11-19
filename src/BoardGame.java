import java.util.Scanner;

public class Main {
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
        String responseCheck;
        int i = 0;
        System.out.print(llll);
        System.out.print(rrrr);
        Scanner s = new Scanner(System.in);
        Paths use = new Paths();
        System.out.println("Enter the first player's name: ");
        Paths player1 = new Paths(s.nextLine());
        System.out.println("Enter the second player's name: ");
        Paths player2 = new Paths(s.nextLine());
        PRun p1 = new PRun();

        p1.setProgress(use.turn());
        System.out.println(p1.getProgress());
        System.out.println("Welcome to The Board Game" + player1.getName() + " and " + player2.getName() + "!");
        System.out.println("First, when responding to questions, please enter exactly what is inside the quote marks.");
while (i <1){
System.out.println("Please enter \"ok\" to continue.");
responseCheck = s.nextLine();
if (responseCheck.equals("ok")){
i = 2;
}
}
i = 0;

System.out.println("Secondly, there are sevaral paths to choose from: \nA>B>D, A>B>E, A>C>F, and A>C>G.");
System.out.println("      D");
System.out.println("   B--^>E   F ");   
System.out.println("A--^>C------^>G");
      
while (i <1){
System.out.println("Please enter \"ok\" to continue.");
responseCheck = s.nextLine();
if (responseCheck.equals("ok")){
i = 2;
}
}
i = 0;
System.out.println("Lastly, there are three power ups you can use in this game. They are Debuff Cancel(Ignores a single \"move back\" block <Common>), Advance(Moves to the beginning of the opposite player's path <Very Rare>), and Move Forward(Moves forward two steps <Common>).");
        System.out.println(" It is the first player's turn." );
        System.out.println("Would you like to use a power up? \n Enter \"yes\" to pick one to use: ");
        responseCheck = s.nextLine();
        if (responseCheck.equals("yes")) {
            System.out.println("Would you like to use \"Debuff Cancel\", \"Advance\", or \"Move Forward\" ");
            responseCheck = s.nextLine();
            if (responseCheck.equals("Debuff Cancel"));
        }


        System.out.println(player1.getPath());
        System.out.println(player1.getPathname());
        player1.setPath(b);
        System.out.println(player1.getPath());
        System.out.println(player1.getPathname());
        System.out.println((player1.getPathname()).equals("b"));

        /*
        if ((player1.getPathname()).equals("a") && p1.getProgress() >= 30){}
        if ((player1.getPathname()).equals("b") && p1.getProgress() >= 15){}
        if ((player1.getPathname()).equals("c") && p1.getProgress() >= 15){}
        if ((player1.getPathname()).equals("d") && p1.getProgress() >= 25){}
        if ((player1.getPathname()).equals("e") && p1.getProgress() >= 50){}
        if ((player1.getPathname()).equals("f") && p1.getProgress() >= 50){}
        if ((player1.getPathname()).equals("g") && p1.getProgress() >= 35){}

        if ((player1.getPathname()).equals("a") && p1.getProgress() = 3){}
        if ((player1.getPathname()).equals("a") && p1.getProgress() = 12){}
        if ((player1.getPathname()).equals("a") && p1.getProgress() = 27){}
        if ((player1.getPathname()).equals("a") && p1.getProgress() = 13){}
        if ((player1.getPathname()).equals("a") && p1.getProgress() = 23){}

        if ((player1.getPathname()).equals("b") && p1.getProgress() = 3){}
        if ((player1.getPathname()).equals("b") && p1.getProgress() = 6){}
        if ((player1.getPathname()).equals("b") && p1.getProgress() = 9){}
        if ((player1.getPathname()).equals("b") && p1.getProgress() = 12){}
        if ((player1.getPathname()).equals("b") && p1.getProgress() = 15){}

`       if ((player1.getPathname()).equals("c") && p1.getProgress() = 1){}
        if ((player1.getPathname()).equals("c") && p1.getProgress() = 3){}
        if ((player1.getPathname()).equals("c") && p1.getProgress() = 5){}
        if ((player1.getPathname()).equals("c") && p1.getProgress() = 7){}
        if ((player1.getPathname()).equals("c") && p1.getProgress() = 9){}
        if ((player1.getPathname()).equals("c") && p1.getProgress() = 11){}
        if ((player1.getPathname()).equals("c") && p1.getProgress() = 13){}

        if ((player1.getPathname()).equals("d") && p1.getProgress() = 4){}
        if ((player1.getPathname()).equals("d") && p1.getProgress() = 6){}
        if ((player1.getPathname()).equals("d") && p1.getProgress() = 8){}
        if ((player1.getPathname()).equals("d") && p1.getProgress() = 10){}
        if ((player1.getPathname()).equals("d") && p1.getProgress() = 12){}
        if ((player1.getPathname()).equals("d") && p1.getProgress() = 14){}
        if ((player1.getPathname()).equals("d") && p1.getProgress() = 16){}
        if ((player1.getPathname()).equals("d") && p1.getProgress() = 18){}
        if ((player1.getPathname()).equals("d") && p1.getProgress() = 20){}
        if ((player1.getPathname()).equals("d") && p1.getProgress() = 22){}
        if ((player1.getPathname()).equals("d") && p1.getProgress() = 24){}

        if ((player1.getPathname()).equals("e") && p1.getProgress() = ){}
        if ((player1.getPathname()).equals("e") && p1.getProgress() = ){}
        if ((player1.getPathname()).equals("e") && p1.getProgress() = ){}
        if ((player1.getPathname()).equals("e") && p1.getProgress() = ){}
        if ((player1.getPathname()).equals("e") && p1.getProgress() = ){}

 */

    }
}
