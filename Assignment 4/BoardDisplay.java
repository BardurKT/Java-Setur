public class BoardDisplay {

    private int rows;
    private int cols;

    private String[][] contents;
    private boolean[][] southWalls;
    private boolean[][] eastWalls;

    public BoardDisplay(int rows, int cols) {

        this.rows = rows;
        this.cols = cols;

        contents = new String[rows][cols];
        southWalls = new boolean[rows][cols];
        eastWalls = new boolean[rows][cols];

        for (int r = 0; r < rows; r++) {

            for (int c = 0; c < cols; c++) {

                contents[r][c] = "  ";
            }
        }
    }

    public void set(int row, int col, String content) {

        contents[row][col] = content;
    }

    public void setSouthWall(int row, int col) {

        southWalls[row][col] = true;
    }

    public void setEastWall(int row, int col) {

        eastWalls[row][col] = true;
    }

    public void show() {

        for (int r = 0; r < rows; r++) {

            for (int c = 0; c < cols; c++) {

                System.out.print("+");

                if (r == 0 || southWalls[r - 1][c]) {
                    System.out.print("--");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println("+");

            for (int c = 0; c < cols; c++) {

                if (c == 0) {
                    System.out.print("|");
                }

                System.out.print(contents[r][c]);

                if (eastWalls[r][c] || c == cols - 1) {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for (int c = 0; c < cols; c++) {

            System.out.print("+--");
        }

        System.out.println("+");
    }

    public static void main(String[] args) {

        BoardDisplay display = new BoardDisplay(4, 7);

        display.set(1, 1, "AA");
        display.set(0, 0, "BB");
        display.set(3, 3, "CC");
        display.set(2, 2, "gg");

        display.setEastWall(1, 2);
        display.setSouthWall(0, 3);

        display.show();
    }
}