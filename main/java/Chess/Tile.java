package Chess;


public class Tile {

    private ChessPiece piece;
    private final Color color;

    public Tile(Color color){
        this.color = color;
    }

    public Tile(Color color, ChessPiece piece){
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

    public String getValue(){
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
