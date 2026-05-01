public class Rectangle {
    private Point p1, p2;
    private Color color;

    public Rectangle(Point p1, Point p2, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
    }

    public boolean isInside(Point p) {
        return p.x >= p1.x && p.x <= p2.x &&
               p.y >= p1.y && p.y <= p2.y;
    }

    public Color getColor() {
        return color;
    }
}