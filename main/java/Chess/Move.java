package Chess;

public class Move{
    public final int moveToXCoordinate;
    public final int moveToYCoordinate;
    public final boolean firstMoveOnly;
    public final boolean onTakeOnly;

    public Move(int moveToXCoordinate, int moveToYCoordinate, boolean firstMoveOnly, boolean onTakeOnly) {
        this.moveToXCoordinate = moveToXCoordinate;
        this.moveToYCoordinate = moveToYCoordinate;
        this.firstMoveOnly = firstMoveOnly;
        this.onTakeOnly = onTakeOnly;
    }
}
