public class Variables {

    public static void main(String[] args) {
        //  byte age = (byte)130;
        //  System.out.println(age);


        String name = "Aryan";
        // String name2 = "Aryan";
        // String name2 = new String("Aryan");
        String name2 = new String("aryan");
        // PrintStream out = new PrintStream()
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name.compareTo(name2));
    }
}