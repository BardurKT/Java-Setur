import java.util.List;

// Goal object
public class Goal extends BoardElement {

    // Goal position
    private Position position;

    // Goal name
    private String name;

    // Constructor
    public Goal(int row, int col, String name) {

        this.position = new Position(row, col);
        this.name = name;
    }

    // Draws goal on board
    @Override
    public void renderOn(BoardDisplay display) {

        display.set(
            position.getRow(),
            position.getCol(),
            "\u001B[33m" + name + "\u001B[0m"
        );
    }

    // Goal does not stop movement
    @Override
    public boolean interact(Robot robot, Direction direction) {

        return false;
    }

    // Checks if robot reached goal
    @Override
    public boolean gameOver(List<Robot> robots) {

        for (Robot robot : robots) {

            if (robot.getPosition().getRow() == position.getRow() &&
                robot.getPosition().getCol() == position.getCol()) {

                return true;
            }
        }

        return false;
    }
}