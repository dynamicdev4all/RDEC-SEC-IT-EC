public class StringTIme {
    public static void main(String[] args) {
        long start, end;
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(" "); 
        }
        end = System.nanoTime();
        System.out.println(end - start);

    }
}
