interface Language {
    String getName(String n);
}

class Name implements Language {

    public String getName(String n) {
        return n;
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Name a = new Name();
        Language lan;
        lan = a;
        String str = " Chandra";
        System.out.println(lan.getName("Niten") + str);
    }
}
