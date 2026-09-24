public class Rectangle {
    // Private fields
    private double width;
    private double height;

    // Mutators/Setters
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Accessors/Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Method: getArea(width, height)
    public double getArea(double width, double height) {
        double area = width * height;
        return area;
    }
}
