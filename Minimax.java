public class Minimax {
    int bestScore = -100;
    int x;
    int y;
    int[] bestMove = {x,y};
    int score;
    String mark;
    Game game;
    Minimax(Game thisGame,String thisMark){
        game = thisGame;
        mark = thisMark;
    }
    public void move(){
        System.out.println("I started");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(" ".equals(game.gameBoard.spaces[i][j])){
                    game.gameBoard.spaces[i][j] = mark;
                    score = minimax(game.gameBoard);
                    game.gameBoard.spaces[i][j]= " ";
                    if(score > bestScore){
                        bestScore = score;
                        x = i;
                        y = j;
                    }
                }
            }
        }
        game.gameBoard.spaces[x][y] = mark;
        System.out.println("I ran");
    }
    private int minimax(Board board){
        //TODO fill this in
        return 1;
    }
}

