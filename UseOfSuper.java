public class UseOfSuper {
    public static void main(String[] args) {
        snake King_cobra = new snake();
        King_cobra.bite();
        King_cobra.hiss();
    }
}

class deadly {
    public void hiss() {
        System.out.println("Super class :");
        System.out.println("Snake makes a hissing sound");
    }
}

class snake extends deadly {
    public void hiss() {
        System.out.println("Beware of the hissing sound");
        super.hiss();
    }

    public void bite() {
        System.out.println("Snakes have a deadly bite");
    }
}