import java.lang.Math;

public class Interface4 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2, 3, 4);
        t1.getArea();
        t1.getPerimeter(2, 3, 4);
    }
}

interface poly1 {
    void getArea();

    void getPerimeter(int a, int b, int c);
}

class Triangle implements poly1 {
    private int a, b, c;
    private double s, area;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    public void getArea() {
        s = (double) (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area : " + area);
    }

    public void getPerimeter(int s1, int s2, int s3) {
        int perimeter = 0;
        // for(int side = 0; side < sides; side++)
        perimeter += s1 + s2 + s3;
        System.out.println("Perimeter = " + perimeter);
    }
}
