//command line
import java.util.*;
public class LanguageVector {

    public static void main(String[] args) {
        Vector<String> list = new Vector<String>();
        int len = args.length;
        for (int i = 0; i < len; i++) {
            list.addElement(args[i]);
        }
        list.insertElementAt("Cobol", 2);
        int size = list.size();
        String listArray[] = new String[size];
        list.copyInto(listArray);
        System.out.println("list of arguments:-> ");
        for (int i = 0; i < size; i++) {
            System.out.println(listArray[i]);
        }
    }
}
