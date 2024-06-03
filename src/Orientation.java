
public enum Orientation {
	   N, E, S, W;

    public Orientation turnRight() {
        return values()[(ordinal() + 1) % values().length];
    }

    public Orientation turnLeft() {
        return values()[(ordinal() + 3) % values().length];
    }
}
