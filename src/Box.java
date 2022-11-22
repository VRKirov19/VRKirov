public class Box {
    private double length;
    private double width;
    private double height;
    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }
    private void setLength(double length) {
        if(length <= 0) {
            this.length = 1;
        } else {
            this.length = length;
        }
    }
    private void setWidth(double width) {
        if(width <= 0) {
            this.width = 1;
        } else {
            this.width = width;
        }
    }
    private void setHeight(double height) {
        if(height <= 0) {
            this.height = 1;
        } else {
            this.height = height;
        }
    }
}