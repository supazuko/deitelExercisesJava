package africa.semicolon.chapterEight;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        double area = rectangle.calculateArea(20, 10);
        double perimeter = rectangle.calculatePerimeter(20, 10);

        System.out.println(area);
        System.out.println(perimeter);
    }
}
