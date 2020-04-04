package Chess;


public class Tile {

    private ChessPiece piece;
    private final TileColor color;

    public enum TileColor{
        WHITE, BLACK
    }

    public Tile(TileColor color){
        this.color = color;
    }

    public Tile(TileColor color, ChessPiece piece){
        this(color)
        setPiece(piece)
    }

    public void setPiece(ChessPiece piece){
        if(piece != null) {
            this.piece = piece;
        }
    }

    public ChessPiece getPiece(){
        return this.piece;
    }

    public String toString(){
        if(piece != null){
            return "[" + piece.getCharValue() + "]";
        } else {
            return "[ ]";
        }
    }

    public boolean isEmpty(){
        return piece == null;
    }

    public void empty(){
        piece = null;
    }
}
