
import java.util.Objects;

public class Game{

    Board gameBoard;
    private int turn;

    Game(Board newBoard)
    {
        gameBoard = newBoard;
    }

    public void setBoard(Board newBoard)
    {
        gameBoard = newBoard;
    }
    public int getTurn()
    {
        return turn;
    }
    
    public int turnCount()
    {
        turn++;
        return turn;
    }
    private boolean rowWin(Board check, String mark){
       if(Objects.equals(check.space1, check.space2) && Objects.equals(check.space2, check.space3))
        {
            if(check.space2.equals(mark))
            {
                return true;
            }
        }
        if(Objects.equals(check.space4, check.space5) && Objects.equals(check.space5, check.space6))
        {
            if(check.space5.equals(mark))
            {
                return true;
            }
        }
        if(Objects.equals(check.space7, check.space8) && Objects.equals(check.space8, check.space9))
        {
            if(check.space8.equals(mark))
            {
                return true;
            }
        }
        return false;
        
    }
    private boolean collumWin(Board check, String mark)
    {
        if(Objects.equals(check.space1, check.space4) && Objects.equals(check.space4, check.space7))
        {
            if(check.space4.equals(mark))
            {
                return true;
            }
        }
        if(Objects.equals(check.space2, check.space5) && Objects.equals(check.space5, check.space8))
        {
            if(check.space5.equals(mark))
            {
                return true;
            }
        }
        if(Objects.equals(check.space3, check.space6) && Objects.equals(check.space6, check.space9))
        {
            if(check.space6.equals(mark))
            {
                return true;
            }
        }
        return false;
    }
    private boolean diagonalWin(Board check){
        if(!" ".equals(check.space5) && ((Objects.equals(check.space1, check.space5) && check.space5 == check.space9)||(Objects.equals(check.space3, check.space5) && Objects.equals(check.space5, check.space7))))
        {
            return true;
        }  
        return false;
    }
    public boolean winCheck()
    {
        if((rowWin(gameBoard,"X")) || (rowWin(gameBoard,"O")) || (collumWin(gameBoard,"X")) || (collumWin(gameBoard,"O")) || (diagonalWin(gameBoard)))
        {
            return true;
        }
        return false;
    }
    public boolean isTie()
    {
        if((!" ".equals(gameBoard.space1)) && (!" ".equals(gameBoard.space2)) && (!" ".equals(gameBoard.space3)) && (gameBoard.space4 != " ") && (gameBoard.space5 != " ") && (gameBoard.space6 != " ") && (gameBoard.space7 != " ") && (gameBoard.space8 != " ") && (gameBoard.space9 != " "))
        {
            return true;
        }
        return false;
    }
    public String whoWon()
    {
        if((winCheck()) && (turn%2 != 0))
        {
            return "X";
        }
        if((winCheck()) && (turn%2 == 0))
        {
            return "O";
        }
        if(isTie() )
        {
            return "The Cat";
        }
            return "skip";//a return of skip indicates that something is wrong because whoWon should only be called once we know some one has already won or the game has tied.
        
    }
}
