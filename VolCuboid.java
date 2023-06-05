class Box {
    double len, br, hi;

    public void getdata(double l, double b, double h) {
        len = l;
        br = b;
        hi = h;
    }

    public void volume() {
        double v;
        v = len * br * hi;
        System.out.print("Volume of cuboid:-> " + v);
    }
}

public class VolCuboid {
    public static void main(String[] args) {

        Box b = new Box();
        b.getdata(10, 5, 3);
        b.volume();
    }
}
