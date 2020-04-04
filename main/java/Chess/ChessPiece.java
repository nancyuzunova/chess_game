package Chess;

public abstract class ChessPiece {

    public enum PieceType {
        PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING
    }

    private final PieceType type;
    private final Color color;
    private final Move[] moves;
    private final String name;
    private final char charValue;
    private final boolean repeatableMoves;

    protected ChessPiece(PieceType type, Color color, Move[] moves, boolean repeatableMoves){
        this.type = type;
        this.color = color;
        this.moves = moves;
        this.repeatableMoves = repeatableMoves;
        name = type.name();
        charValue = type.name().trim().charAt(0);
    }

    public Move[] getMoves(){ return moves; }

    public String getName(){ return name; }

    public Color getColor(){ return color; }

    public char getCharValue(){ return charValue; }

    public boolean hasRepeatableMoves(){ return repeatableMoves; }

    public PieceType getPieceType() {return type; }

    public static Color opponent(Color color) {
        return (color == Color.BLACK) ? Color.WHITE : Color.BLACK;
    }

}
