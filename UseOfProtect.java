public class UseOfProtect {
    public static void main(String[] args) {
        Dogs saint_bernard = new Dogs();
        saint_bernard.name = "Chopsticks";
        saint_bernard.display();
        saint_bernard.getinfo();
    }
}

class pets {
    protected String name;

    protected void display() {
        System.out.println("Dogs are humans' best friends");
    }
}

class Dogs extends pets {
    public void getinfo() {
        System.out.println("Dog's name is " + name);
    }
}
