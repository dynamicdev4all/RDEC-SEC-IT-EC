import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // String a[] = new String[25];
        // int b[] = new int[25];
        // Integer c[] = new Integer[25];
        // System.out.println(a[0]);
        // System.out.println(b[0]);
        // System.out.println(c[0]);
        // a[0] = "ABC";

        // System.out.println(a.length);
        // System.out.println(a.length == 0);

        ArrayList<String> b = new ArrayList<>();
        System.out.println(b.get(0));
        b.add("ABC");
        b.add(20, "ABC");

        System.out.println(b.size()==0);
        System.out.println(b.isEmpty());
        System.out.println(b.contains("ABC"));
    }
}
