public class BoardFrame extends BoardElement {

    private int rows;
    private int cols;

    public BoardFrame(int rows, int cols) {

        this.rows = rows;
        this.cols = cols;
    }

    @Override
    public void renderOn(BoardDisplay display) {

        for (int r = 0; r < rows; r++) {

            display.setEastWall(r, cols - 1);
        }

        for (int c = 0; c < cols; c++) {

            display.setSouthWall(rows - 1, c);
        }
    }

    @Override
    public boolean interact(Robot robot, Direction direction) {

        int row = robot.getPosition().getRow();
        int col = robot.getPosition().getCol();

        switch(direction) {

            case NORTH:
                return row == 0;

            case SOUTH:
                return row == rows - 1;

            case EAST:
                return col == cols - 1;

            case WEST:
                return col == 0;
        }

        return false;
    }
}