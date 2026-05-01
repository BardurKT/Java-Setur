public class Circle {
    private Point center;
    private int radius;
    private Color color;

    public Circle(Point center, int radius, Color color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    public boolean isInside(Point p) {
        int dx = p.x - center.x;
        int dy = p.y - center.y;
        return dx * dx + dy * dy <= radius * radius;
    }

    public Color getColor() {
        return color;
    }
}