import java.util.ArrayList;

public class Game {
//    //Top grid guide
//    public char[][] topGuide = {
//                               {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'},
//                               {'_', '_', '_', '_', '_', '_', '_', '_'}
//    };
//    public char[][] leftGuide = {
//            {'1', '|'},
//            {'2', '|'},
//            {'3', '|'},
//            {'4', '|'},
//            {'5', '|'},
//            {'6', '|'},
//            {'7', '|'},
//            {'8', '|'}
//    };
    //need a 2d array to hold game peices
    public char[][] board = new char[8][8];
    //Dummy board to be used in finding available moves
    public char[][] moveFind = new char[8][8];
    //X player char
    public char x = 'X';
    //O player char
    public char o = 'O';
    //Char to indicate valid move
    public char validMove  = '#';

    //main driving method for game
    public void playGame(){
        initGameBoards();
        printBoards();
        getAvailibleMoves(board);
    }

    //initializing board
    public void initGameBoards(){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                board[i][j] = '-';
            }
        }

        board[3][3] = x;
        board[3][4] = o;
        board[4][3] = o;
        board[4][4] = x;

        moveFind = board;
    }


    public void printBoards(){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void getAvailibleMoves(char[][] gameState){
        
    }
}
