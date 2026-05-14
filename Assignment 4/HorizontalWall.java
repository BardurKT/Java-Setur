public class HorizontalWall extends BoardElement {

    private int row;
    private int col;
    private int length;

    public HorizontalWall(int row, int col, int length) {

        this.row = row;
        this.col = col;
        this.length = length;
    }

    @Override
    public void renderOn(BoardDisplay display) {

        int step = length > 0 ? 1 : -1;

        for (int i = 0; i != length; i += step) {

            display.setSouthWall(row, col + i);
        }
    }

    @Override
    public boolean interact(Robot robot, Direction direction) {

        int r = robot.getPosition().getRow();
        int c = robot.getPosition().getCol();

        if (direction == Direction.SOUTH) {

            int step = length > 0 ? 1 : -1;

            for (int i = 0; i != length; i += step) {

                if (r == row && c == col + i) {
                    return true;
                }
            }
        }

        if (direction == Direction.NORTH) {

            int step = length > 0 ? 1 : -1;

            for (int i = 0; i != length; i += step) {

                if (r - 1 == row && c == col + i) {
                    return true;
                }
            }
        }

        return false;
    }
}