import java.util.Random;
public class Player2 {
    static String mark= "O";
    Game game;
    Minimax thisMinimax = new Minimax(game,mark);
    Player2(Game thisGame){
        game = thisGame;
    }
    
    public void choseMode(Board gameBoard, int spaceSelection, int modeSelection){
        if(modeSelection == 1){
            pressButtonAsHuman(gameBoard, spaceSelection);
        }
        if(modeSelection == 2){
            pressButtonAsEasyAi(gameBoard);
        }
        if(modeSelection == 3){
            pressButtonAsImpossibleAi(gameBoard);
        }
    }
    public void pressButtonAsHuman(Board gameBoard, int selection){
        pressButton(gameBoard, selection);
    }
    public void pressButtonAsEasyAi(Board gameBoard){
        Random aNumber = new Random();
        
        int selection = (aNumber.nextInt(9))+1;
        if(selection == 1){
            if(gameBoard.space1.equals(" ")){
                gameBoard.space1 = mark;
            }
            else{
                pressButtonAsEasyAi(gameBoard);
            }
        }
        if(selection == 2){
            if(gameBoard.space2.equals(" ")){
                gameBoard.space2 = mark;
            }
            else{
                pressButtonAsEasyAi(gameBoard);
            }
        }
        if(selection == 3){
            if(gameBoard.space3.equals(" ")){
                gameBoard.space3 = mark;
            }
            else{
                pressButtonAsEasyAi(gameBoard);
            }
        }
        if(selection == 4){
            if(gameBoard.space4.equals(" ")){
                gameBoard.space4 = mark;
            }
            else{
                pressButtonAsEasyAi(gameBoard);
            }
        }
        if(selection == 5){
            if(gameBoard.space5.equals(" ")){
                gameBoard.space5 = mark;
            }
            else{
                pressButtonAsEasyAi(gameBoard);
            }
        }
        if(selection == 6){
            if(gameBoard.space6.equals(" ")){
                gameBoard.space6 = mark;
            }
            else{
                pressButtonAsEasyAi(gameBoard);
            }
        }
        if(selection == 7){
            if(gameBoard.space7.equals(" ")){
                gameBoard.space7 = mark;
            }
            else{
                pressButtonAsEasyAi(gameBoard);
            }
        }
        if(selection == 8){
            if(gameBoard.space8.equals(" ")){
                gameBoard.space8 = mark;
            }
            else{
                pressButtonAsEasyAi(gameBoard);
            }
        }
        if(selection == 9){
            if(gameBoard.space9.equals(" ")){
                gameBoard.space9 = mark;
            }
            else{
                pressButtonAsEasyAi(gameBoard);
            }
        }
    }
    public void pressButtonAsImpossibleAi(Board gameBoard){
        thisMinimax.move();
    }

    private void pressButton(Board gameBoard, int selection){
        if(selection == 1){
            gameBoard.space1 = mark;
        }
        if(selection == 2){
            gameBoard.space2 = mark;
        }
        if(selection == 3){
            gameBoard.space3 = mark;
        }
        if(selection == 4){
            gameBoard.space4 = mark;
        }
        if(selection == 5){
            gameBoard.space5 = mark;
        }
        if(selection == 6){
            gameBoard.space6 = mark;
        }
        if(selection == 7){
            gameBoard.space7 = mark;
        }
        if(selection == 8){
            gameBoard.space8 = mark;
        }
        if(selection == 9){
            gameBoard.space9 = mark;
        }  
    }
}
