import java.util.List;

// Abstract parent class for all board elements
public abstract class BoardElement {

    // Draws element on board
    public abstract void renderOn(BoardDisplay display);

    // Handles interaction with robot
    public abstract boolean interact(Robot robot, Direction direction);

    // Checks if game has ended
    public boolean gameOver(List<Robot> robots) {

        return false;
    }
}