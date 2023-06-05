class TestPrivate {
    private String name;

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

}

public class Visibility {
    public static void main(String[] args) {
        TestPrivate d = new TestPrivate();
        d.setName("Niten Chandra");
        System.out.println(d.getName());
    }
}
