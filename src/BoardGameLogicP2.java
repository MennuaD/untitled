public class BoardGameLogicP2 {
    public BoardGameLogicP2(){

    }


    public int player2Turn(){
        return (1 + (int) (Math.random()* 6));
    }

}
