// Teleporter board element
public class Teleporter extends BoardElement {

    // Teleporter position
    private Position position;

    // Destination position
    private Position destination;

    // Constructor
    public Teleporter(
            int row,
            int col,
            int destinationRow,
            int destinationCol) {

        position = new Position(row, col);

        destination = new Position(destinationRow, destinationCol);
    }

    // Draw teleporter
    @Override
    public void renderOn(BoardDisplay display) {

        display.set(
            position.getRow(),
            position.getCol(),
            "\u001B[35mTP\u001B[0m"
        );
    }

    // Teleports robot
    @Override
    public boolean interact(Robot robot, Direction direction) {

        if (robot.getPosition().getRow() == position.getRow() &&
            robot.getPosition().getCol() == position.getCol()) {

            robot.getPosition().setRow(destination.getRow());
            robot.getPosition().setCol(destination.getCol());
        }

        return false;
    }

    // Test main method
    public static void main(String[] args) {

        System.out.println("Teleporter loaded");
    }
}