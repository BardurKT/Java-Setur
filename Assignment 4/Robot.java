// Robot game piece
public class Robot extends BoardElement {

    // Robot position
    private Position position;

    // Robot name
    private String name;

    // Constructor
    public Robot(int row, int col, String name) {

        this.position = new Position(row, col);
        this.name = name;
    }

    // Returns position
    public Position getPosition() {

        return position;
    }

    // Returns robot name
    public String getName() {

        return name;
    }

    // Moves robot one step
    public void step(Direction direction) {

        switch(direction) {

            case NORTH:
                position.setRow(position.getRow() - 1);
                break;

            case SOUTH:
                position.setRow(position.getRow() + 1);
                break;

            case EAST:
                position.setCol(position.getCol() + 1);
                break;

            case WEST:
                position.setCol(position.getCol() - 1);
                break;
        }
    }

    // Draws robot on board
    @Override
    public void renderOn(BoardDisplay display) {

        String coloredName = "";

        switch(name) {

            case "AA":
                coloredName = "\u001B[31m" + name + "\u001B[0m";
                break;

            case "BB":
                coloredName = "\u001B[34m" + name + "\u001B[0m";
                break;

            case "CC":
                coloredName = "\u001B[32m" + name + "\u001B[0m";
                break;

            default:
                coloredName = name;
        }

        display.set(
            position.getRow(),
            position.getCol(),
            coloredName
        );
    }

    // Robots do not block themselves
    @Override
    public boolean interact(Robot robot, Direction direction) {

        return false;
    }

    // Test main method
    public static void main(String[] args) {

        Robot robot = new Robot(1, 1, "AA");

        robot.step(Direction.EAST);

        System.out.println(robot.getPosition().getCol());
    }
}