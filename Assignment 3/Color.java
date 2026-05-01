public class Color {
    public int r, g, b;

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public static Color mixColors(Color c1, Color c2) {
        return new Color(
            (c1.r + c2.r) / 2,
            (c1.g + c2.g) / 2,
            (c1.b + c2.b) / 2
        );
    }

    public static String colorCode(Color bg, Color fg) {
        return String.format(
            "\033[48;2;%d;%d;%d;38;2;%d;%d;%dm",
            bg.r, bg.g, bg.b, fg.r, fg.g, fg.b
        );
    }
}