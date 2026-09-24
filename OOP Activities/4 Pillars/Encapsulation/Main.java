//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.setWidth(10);
        r.setHeight(5);

        System.out.println("The width of the rectangle is: " + r.getWidth());
        System.out.println("The height of the rectangle is: " + r.getHeight());
        System.out.println("The area of the rectangle is: " + r.getArea(r.getWidth(), r.getHeight()));
    }
}