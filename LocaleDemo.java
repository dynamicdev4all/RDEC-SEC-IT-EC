import java.util.*;
import java.text.*;

public class LocaleDemo {

    static void printTotal(Locale locale) {
        // NumberFormat nf = new NumberFormat();
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        System.out.println(nf.format(45630));
    }

    static void printDate(Locale locale) {
        Date date = new Date();
        DateFormat dtf = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println(dtf.format(date));
    }

    public static void main(String[] args) {
        Locale locale = new Locale("hi", "IN");
        Locale locale = Locale.of("hi", "IN");
        // Locale locale = Locale.UK;
        // 1,00,000.00
        // 100,000.00
        printTotal(locale);
        printDate(locale);
    }
}
