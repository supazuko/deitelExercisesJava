package africa.semicolon.chapterEight;

public class Rectangle {
   private double length = 1;
   private double width = 1;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0){
            this.length = length;}
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0){
            this.width = width;
        }
    }

    public double calculateArea(double length, double width){
        return length * width;
    }

    public double calculatePerimeter(double length, double width){
        return 2 * (length + width);
    }
}
