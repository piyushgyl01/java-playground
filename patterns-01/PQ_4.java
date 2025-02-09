public class PQ_4 {

    public static void main(String[] args) {
        char ehe = 'a';

        for (int line = 1; line <= 7; line++) {
            for (int charLength = 1; charLength <= line; charLength++) {
                System.out.print(ehe);
                ehe++;
            }
            System.out.println("");
        }
    }
}