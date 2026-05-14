public class VerticalWall extends BoardElement {

    private int row;
    private int col;
    private int length;

    public VerticalWall(int row, int col, int length) {

        this.row = row;
        this.col = col;
        this.length = length;
    }

    @Override
    public void renderOn(BoardDisplay display) {

        int step = length > 0 ? 1 : -1;

        for (int i = 0; i != length; i += step) {

            display.setEastWall(row + i, col);
        }
    }

    @Override
    public boolean interact(Robot robot, Direction direction) {

        int r = robot.getPosition().getRow();
        int c = robot.getPosition().getCol();

        if (direction == Direction.EAST) {

            int step = length > 0 ? 1 : -1;

            for (int i = 0; i != length; i += step) {

                if (r == row + i && c == col) {
                    return true;
                }
            }
        }

        if (direction == Direction.WEST) {

            int step = length > 0 ? 1 : -1;

            for (int i = 0; i != length; i += step) {

                if (r == row + i && c - 1 == col) {
                    return true;
                }
            }
        }

        return false;
    }
}