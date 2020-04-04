package Chess.Pieces;

import Chess.ChessPiece;
import Chess.Move;

public class Pawn extends ChessPiece {

	public Pawn(Color color){
		super(PieceType.PAWN, color, validMoves(color), false);
	}

	private static Move[] validMoves(PieceColor color){
        if (color == PieceColor.Black){
            return new Move[]{new Move(0, 1, false, false), new Move(0, 2, true, false),
                              new Move(1, 1, false, true), new Move(-1, 1, false, true)};
        } else {
            return new Move[]{new Move(0, -1, false, false), new Move(0, -2, true, false),
                              new Move(1, -1, false, true), new Move(-1, -1, false, true)};
        }
	}
}
