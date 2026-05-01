public class GridCell {
    private Color color;
    private String content;

    public GridCell() {
        this.color = new Color(255, 255, 255); // default white
        this.content = "   ";
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void printGridCell() {
        String reset = "\u001B[0m";
        System.out.print(Color.colorCode(color, color) + content + reset);
    }
}