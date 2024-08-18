
public class Main {
    enum GameStatus{WON,LOST,DRAW}

    public static void main(String[] args)
    {
       GameStatus gameStatus = startGame();

       GameStatus[] gameStatuses= GameStatus.values();
       for(GameStatus status1:gameStatuses){
           System.out.println(status1);
       }
       if(gameStatus==GameStatus.WON){
           System.out.println("Player won the game");
       }
       else if(gameStatus==GameStatus.LOST){
           System.out.println("Player lost the game");
       }
       else if(gameStatus==GameStatus.DRAW){
           System.out.println("Game draw");
       }
    }
    public static GameStatus startGame(){
        GameStatus status;
        status=GameStatus.WON;
        return status;

    }
}