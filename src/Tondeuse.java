
public class Tondeuse {
	private Position position;
    private Pelouse pelouse;

    public Tondeuse(Position position, Pelouse pelouse) {
        this.position = position;
        this.pelouse = pelouse;
    }

    public void executeInstructions(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'D') {
                position.turnRight();
            } else if (instruction == 'G') {
                position.turnLeft();
            } else if (instruction == 'A') {
                Position newPosition = position.moveForward();
                if (pelouse.isWithinBounds(newPosition)) {
                    position = newPosition;
                }
            }
        }
    }

    public Position getPosition() {
        return position;
    }
}
