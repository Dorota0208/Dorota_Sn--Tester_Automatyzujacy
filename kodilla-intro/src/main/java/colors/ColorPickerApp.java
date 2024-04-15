package colors;

public class ColorPickerApp {
    public static void main(String[] args) {
        UserDialogs userDialogs = new UserDialogs();
        Colors colorPicker = new Colors();

        String colorCode = userDialogs.getColorCode();
        Colors.Color color = colorPicker.pickColor(colorCode);
        userDialogs.displaySelectedColor(color);
    }
}

