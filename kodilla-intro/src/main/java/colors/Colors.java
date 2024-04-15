package colors;

public class Colors {
    public enum Color {

        RED,
        BLUE,
        YELLOW,
        GREEN,
        ORANGE,
        PINK,
        UNKNOWN,
    }

    public static Color pickColor(String colorCode) {
        colorCode = UserDialogs.getColorCode();
        switch (colorCode.toUpperCase()) {
            case "R":
                return Color.RED;
            case "G":
                return Color.GREEN;
            case "B":
                return Color.BLUE;
            case "Y":
                return Color.YELLOW;
            case "O":
                return Color.ORANGE;
            case "P":
                return Color.PINK;
            default:
                return Color.UNKNOWN;
        }
    }
}