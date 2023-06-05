interface Polygon {
    float getArea(float x, float y);
}

class Rectangle implements Polygon {
    public float getArea(float x, float y) {
        return x * y;
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Polygon poly;
        poly = rect;
        System.out.println("Area of rectangle is:-> " + poly.getArea(10, 20));
    }
}