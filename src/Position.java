
public class Position {
	   private int x;
	    private int y;
	    private Orientation orientation;

	    public Position(int x, int y, Orientation orientation) {
	        this.x = x;
	        this.y = y;
	        this.orientation = orientation;
	    }

	    public int getX() {
	        return x;
	    }

	    public int getY() {
	        return y;
	    }

	    public Orientation getOrientation() {
	        return orientation;
	    }

	    public void turnRight() {
	        orientation = orientation.turnRight();
	    }

	    public void turnLeft() {
	        orientation = orientation.turnLeft();
	    }

	    public Position moveForward() {
	        switch (orientation) {
	            case N:
	                return new Position(x, y + 1, orientation);
	            case E:
	                return new Position(x + 1, y, orientation);
	            case S:
	                return new Position(x, y - 1, orientation);
	            case W:
	                return new Position(x - 1, y, orientation);
	            default:
	                throw new IllegalStateException("Unexpected value: " + orientation);
	        }
	    }

	    @Override
	    public String toString() {
	        return x + " " + y + " " + orientation;
	    }
}
