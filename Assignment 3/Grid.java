public class Grid {
    private int h, w;
    private GridCell[][] cells;

    public Grid(int h, int w) {
        this.h = h;
        this.w = w;

        cells = new GridCell[h][w];

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                cells[y][x] = new GridCell();
            }
        }
    }

    public void drawRectangle(Rectangle rect) {
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                Point p = new Point(x, y);
                if (rect.isInside(p)) {
                    cells[y][x].setColor(rect.getColor());
                }
            }
        }
    }

    public void drawCircle(Circle circle) {
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                Point p = new Point(x, y);
                if (circle.isInside(p)) {
                    cells[y][x].setColor(circle.getColor());
                }
            }
        }
    }

    public void renderGrid() {
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                cells[y][x].printGridCell();
            }
            System.out.println();
        }
    }
}