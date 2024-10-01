import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Output {
    public static void main(String[] args) throws FileNotFoundException {
        // System.setOut(new
        // PrintStream("C:\\Users\\ACER\\Documents\\RDEC_JAVA_IT+EC\\temp.txt"));
        PrintStream out = new PrintStream("C:\\Users\\ACER\\Documents\\RDEC_JAVA_IT+EC\\temp2.txt");
        out.println("Vibhor");
    }
}
 