class StringDemo {

    public static void main(String args[]) {
        String Fname = "Malati";
        String Lname = "Malati";
        System.out.println("Lenght of " + Fname + " = " + Fname.length());
        System.out.println("character at position 5 of Malati is:-> " + Fname.charAt(5));
        if (Fname.equals(Lname)) {
            System.out.println("Both String are same");
        } else
            System.out.println("Not same");
    }
}
