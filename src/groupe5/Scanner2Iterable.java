package groupe5;

import java.util.Iterator;
import java.util.Scanner;

public class Scanner2Iterable implements Iterable<String> {
    private final Scanner scanner;
    private static int numEntries = 0;

    public Scanner2Iterable(Scanner scanner, int numEntries) {
        this.scanner = scanner;
        Scanner2Iterable.numEntries = numEntries;
    }

    @Override
    public Iterator<String> iterator() {
        return new ScannerIteratorAdapter(scanner);
    }

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            Scanner2Iterable iterable = new Scanner2Iterable(scanner, 3);
            int entryCount = 0;
            System.out.print(">");
            for (String entry : iterable) {
                System.out.println(entry);
                System.out.print(">");
                entryCount++;
                if (entryCount >= numEntries * 2) {
                    break;
                }
            }
        }
    }
}