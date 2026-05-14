import java.util.ArrayList;
import java.util.List;

// Stores board data and movement logic
public class Board {

    // Board size
    private int rows;
    private int cols;

    // All board elements
    private List<BoardElement> elements;

    // All robots
    private List<Robot> robots;

    // Constructor
    public Board(int rows, int cols) {

        this.rows = rows;
        this.cols = cols;

        elements = new ArrayList<>();
        robots = new ArrayList<>();
    }

    // Adds robot
    public void addRobot(Robot robot) {

        robots.add(robot);
    }

    // Adds board element
    public void addElement(BoardElement element) {

        elements.add(element);
    }

    // Returns elements
    public List<BoardElement> elements() {

        return elements;
    }

    // Returns robots
    public List<Robot> robots() {

        return robots;
    }

    // Handles robot sliding movement
    public void move(Robot robot, Direction direction) {

        while (true) {

            boolean stop = false;

            // Check walls and other elements
            for (BoardElement element : elements) {

                if (element.interact(robot, direction)) {
                    stop = true;
                }
            }

            // Check collisions with robots
            for (Robot other : robots) {

                if (other != robot) {

                    int nextRow = robot.getPosition().getRow();
                    int nextCol = robot.getPosition().getCol();

                    switch(direction) {

                        case NORTH:
                            nextRow--;
                            break;

                        case SOUTH:
                            nextRow++;
                            break;

                        case EAST:
                            nextCol++;
                            break;

                        case WEST:
                            nextCol--;
                            break;
                    }

                    if (other.getPosition().getRow() == nextRow &&
                        other.getPosition().getCol() == nextCol) {

                        stop = true;
                    }
                }
            }

            // Stop robot movement
            if (stop) {
                break;
            }

            // Move robot
            robot.step(direction);

            // Trigger teleporters and other effects
            for (BoardElement element : elements) {

                element.interact(robot, direction);
            }
        }
    }

    // Draws board
    public void show() {

        BoardDisplay display = new BoardDisplay(rows, cols);

        for (BoardElement element : elements) {

            element.renderOn(display);
        }

        for (Robot robot : robots) {

            robot.renderOn(display);
        }

        display.show();
    }

    // Test main method
    public static void main(String[] args) {

        Board board = new Board(4, 7);

        Robot aa = new Robot(1, 1, "AA");

        board.addRobot(aa);

        board.show();
    }
}