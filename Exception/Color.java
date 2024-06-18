// Custom Exception class for invalid color
class InvalidColorException extends Exception {
    public InvalidColorException(String message) {
        super(message);
    }
}

// Color class with data member, setter, getter, and toString method
public class Color {
    private String colorName;

    // Setter method with validation for allowed colors
    public void setColorName(String colorName) throws InvalidColorException {
        if (colorName.equalsIgnoreCase("red") || 
            colorName.equalsIgnoreCase("green") || 
            colorName.equalsIgnoreCase("white")) {
            this.colorName = colorName;
        } else {
            throw new InvalidColorException("Invalid color: " + colorName + ". Allowed colors are red, green, and white.");
        }
    }

    // Getter method for colorName
    public String getColorName() {
        return colorName;
    }

    // toString method to return the color name
    @Override
    public String toString() {
        return "Color: " + colorName;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Color color = new Color();
        try {
            color.setColorName("blue"); // This should throw an exception
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }

        try {
            color.setColorName("red"); // This should be valid
            System.out.println(color); // Output: Color: red
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }
    }
}
