package Chess.Pieces;

import Chess.ChessPiece;
import Chess.Move;

public class King extends ChessPiece{

	public King(Color color){
		super(PieceType.KING, color, validMoves(), false);
	}

	private static Move[] validMoves(){
		return new Move[]{	new Move(1, 0, false, false), new Move(0, 1, false, false),
                        	new Move(-1, 0, false, false), new Move(0, -1, false, false),
                        	new Move(1, 1, false, false), new Move(1, -1, false, false),
                        	new Move(-1, 1, false, false), new Move(-1, -1, false, false)};
	}
}
