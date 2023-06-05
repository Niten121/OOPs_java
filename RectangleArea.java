import java.lang.Math;

public class RectangleArea {

    public static void main(String[] args) {
        double area;
        Room obj = new Room();
        obj.getdata(30, 20);
        area = obj.len * obj.br;
        System.out.println("Room area:-> " + area);
    }
}

class Room {
    double len;
    double br;

    public void getdata(double a, double b) {
        len = a;
        br = b;
    }
}
