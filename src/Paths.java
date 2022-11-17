public class Paths {
    private int path;
    private String name;
    private int progress;
    private String pathIS;
    String convert;
    int a = 30;
    public Paths(){}
    public Paths(String player){
        name = player;
        path = a;
        pathIS = "a";

    }
    public int getPath(){
        return path;
    }
    public String getPathname(){ return pathIS; }
    public String getName() { return name;}
    public void setPath(int choice){
        convert = ("" + choice);
        path = Integer.parseInt(convert.substring(0,2));
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


    public int moveUp() { return  (1 + (int) (Math.random()* 5)); }

    public int turn(){ return (1 + (int) (Math.random()* 6)); }
    public int moveDown() { return (-1 * (1 + (int) (Math.random() * 4))); }
    public int moveDown2() { return (-1 * (1 + (int) (Math.random()* 5))); }
    public int moveDown3() { return -3; }
}
