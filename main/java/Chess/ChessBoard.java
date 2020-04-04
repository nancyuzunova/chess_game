package Chess;

import Chess.Pieces.*;

import java.util.ArrayList;

public class ChessBoard {
    public static final int NUMBER_OF_SQUARES = 8;
    private final Tile[][] board;

    public ChessBoard(){
        board = new Tile[NUMBER_OF_SQUARES][NUMBER_OF_SQUARES];
        initializeBoard();
        fillBoard();
    }

    public Tile[][] getBoardArray(){
        return board;
    }

    private void initializeBoard(){
        for(int i = 0; i < NUMBER_OF_SQUARES; i++){
            for(int j = 0; j < NUMBER_OF_SQUARES; j++) {
                if (j % 2 + i == 0) {
                    board[i][j] = new Tile(Color.BLACK);
                }
                else {
                    board[i][j] = new Tile(Color.WHITE);
                }
            }
        }
    }

    //Will break on boards with no Kings of 'color'. Should never happen.
    public Tuple getKingLocation(Color color){
        Tuple location = new Tuple(-1,-1);
        for (int x = 0; x <= 7; x++){
            for (int y = 0; y <= 7 ; y++){
                if (!board[y][x].isEmpty()) {
                    ChessPiece piece = board[y][x].getPiece();
                    if (piece.getColor() == color && piece instanceof King){
                       location = new Tuple(x, y);
                    }
                }
            }
        }
        return location;
    }

    public Tuple[] getAllPiecesLocationForColor(Color color){
        ArrayList<Tuple> locations = new ArrayList<>();
        for (int x = 0; x <= 7; x++){
            for (int y = 0; y <= 7; y++){
               if(!board[y][x].isEmpty() && board[y][x].getPiece().getColor() == color)
                   locations.add(new Tuple(x,y));
            }
        }
        return locations.toArray(new Tuple[0]);//allocate new array automatically.
    }

    public Tile getTileFromTuple(Tuple tuple){
        return board[tuple.getY()][tuple.getX()];
    }

    /*
    Initial filler of board
     */
    private void fillBoard(){
        //pawns
        for(int i = 0; i < NUMBER_OF_SQUARES; i++){
        board[1][i].setPiece(new Pawn(Color.BLACK));
        board[6][i].setPiece(new Pawn(Color.WHITE));
        }

        //rooks
        board[0][0].setPiece(new Rook(Color.BLACK));
        board[0][7].setPiece(new Rook(Color.BLACK));
        board[7][0].setPiece(new Rook(Color.WHITE));
        board[7][7].setPiece(new Rook(Color.WHITE));

        //knight
        board[0][1].setPiece(new Knight(Color.BLACK));
        board[0][6].setPiece(new Knight(Color.BLACK));
        board[7][1].setPiece(new Knight(Color.WHITE));
        board[7][6].setPiece(new Knight(Color.WHITE));

        //bishop
        board[0][2].setPiece(new Bishop(Color.BLACK));
        board[0][5].setPiece(new Bishop(Color.BLACK));
        board[7][2].setPiece(new Bishop(Color.WHITE));
        board[7][5].setPiece(new Bishop(Color.WHITE));

        //queens
        board[0][3].setPiece(new Queen(Color.BLACK));
        board[7][3].setPiece(new Queen(Color.WHITE));

        //kings
        board[0][4].setPiece(new King(Color.BLACK));
        board[7][4].setPiece(new King(Color.WHITE));
    }
}
