import java.lang.*;

public class StringMethod {
    public static void main(String[] args) {
        String fname = "Malati";
        String lname = " Patil";
        System.out.println("Length of Malati:-> " + fname.length());
        System.out.println("Uppercase string:-> " + fname.toUpperCase());
        System.out.println("Lowercase string:-> " + fname.toLowerCase());
        System.out.println("New fname:-> " + fname.replace("Malati", "Manter"));
        System.out.println("Concatinate string:-> " + fname.concat(lname));
        System.out.println(fname + lname);
        System.out.println("Character at position 3 of Malati:-> " +
                fname.charAt(3));
        System.out.println("Index of character l of Malati:-> " +
                fname.indexOf("l"));
        System.out.println("Before trim:-> " + lname);
        System.out.println("After trim:-> " + lname.trim());
    }
}