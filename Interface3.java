public class Interface3 {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        r1.getArea();
        r1.getSides();
        Square s1 = new Square();
        s1.getArea();
        s1.getSides();
    }
}

class Rect implements poly {
    public void getArea() {
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }

    public void getSides() {
        System.out.println("4 sides in a rectangle.");
    }
}

interface poly {
    void getArea();

    default void getSides() {
        System.out.println("I can get sides of a polygon.");
    }
}

class Square implements poly {
    public void getSides() {
        System.out.println("4 sides in a square.");
    }

    public void getArea() {
        int length = 6;
        int area = length * length;
        System.out.println("The area of the square is: " + area);
    }
}