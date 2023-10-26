package groupe5;

import java.util.Iterator;
import java.util.Scanner;

public class ScannerIteratorAdapter implements Iterator<String> {
    private final Scanner scanner;

    public ScannerIteratorAdapter(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public boolean hasNext() {
        return scanner.hasNextLine();
    }

    @Override
    public String next() {
        return scanner.nextLine();
    }
}