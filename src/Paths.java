public class Paths {
    private int path;
    private int progress;
    private String pathIS;
    int a = 30;

    public Paths(String player){
      path = a;
      pathIS = "a";

    }
    public int getPath(){
        return path;
    }
    public void setPath(int choice){
        path = choice;
        if (choice == 151){
            pathIS = "b";
        }
        if (choice == 152){
            pathIS = "c";
        }
        if (choice == 601){
            pathIS = "d";
        }
        if (choice == 602){
            pathIS = "e";
        }
    }
}
