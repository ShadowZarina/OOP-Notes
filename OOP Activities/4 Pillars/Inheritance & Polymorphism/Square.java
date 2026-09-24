public class Square extends Shape {
    double side = 8;

    public double calculateArea() {
        // no parameters as shape method didn't have any
        return side * side;
    }
}