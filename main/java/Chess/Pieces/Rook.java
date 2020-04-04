package Chess.Pieces;

import Chess.ChessPiece;
import Chess.Move;

public class Rook extends ChessPiece {

	public Rook(Color color){
		super(PieceType.ROOK, color, validMoves(), true);
	}


	private static Move[] validMoves(){
		return new Move[]{	new Move(1, 0, false, false), new Move(0, 1, false, false),
                            new Move(-1, 0, false, false), new Move(0, -1, false, false)};
	}
}
