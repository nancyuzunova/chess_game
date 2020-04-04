package Chess.Pieces;

import Chess.ChessPiece;
import Chess.Move;

public class Bishop extends ChessPiece {

	public Bishop(Color color){
		super(PieceType.BISHOP, color, validMoves(), true);
	}


	private static Move[] validMoves(){
		return	new Move[]{	new Move(1, 1, false, false), new Move(1, -1, false, false),
	                        new Move(-1, 1, false, false), new Move(-1, -1, false, false)};
	}
}
