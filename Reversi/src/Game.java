import java.util.ArrayList;

public class Game {

    public enum CellState {
        EMPTY,
        XPOS,
        OPOS
    }

    private CellState[][] board = new CellState[8][8];

    //main driving method for game
    public void playGame(){
        initGameBoards();
        printBoards();
    }

    //initializing board
    public void initGameBoards(){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                board[i][j] = CellState.EMPTY;
            }
        }
        board[3][3] = CellState.XPOS;
        board[3][4] = CellState.OPOS;
        board[4][3] = CellState.OPOS;
        board[4][4] = CellState.XPOS;
    }


    public void printBoards(){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                System.out.print(board[i][j].toString() + "      ");
            }
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println();
        }
    }


    public void getAvailableMoves(){


    }
}
