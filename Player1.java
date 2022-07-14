public class Player1 {
    static String mark = "X";
    
    public void pressButton(Board gameBoard, int selection){
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
