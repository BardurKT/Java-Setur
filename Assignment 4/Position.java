// Stores a position on the board
public class Position {

    // Row position
    private int row;

    // Column position
    private int col;

    // Constructor
    public Position(int row, int col) {

        this.row = row;
        this.col = col;
    }

    // Returns row
    public int getRow() {
        return row;
    }

    // Returns column
    public int getCol() {
        return col;
    }

    // Changes row
    public void setRow(int row) {
        this.row = row;
    }

    // Changes column
    public void setCol(int col) {
        this.col = col;
    }
}