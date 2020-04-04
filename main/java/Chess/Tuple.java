package Chess;

/**
 * Used to store an int/int pair to map to tiles on the chessboard.
 */
public class Tuple {
    private final int xAxis;
    private final int yAxis;

    public Tuple(int x, int y){
            this.xAxis = x;
            this.yAxis =y;
    }

    public int getX(){
        return xAxis;
    }

    public int getY(){
        return yAxis;
    }

}
