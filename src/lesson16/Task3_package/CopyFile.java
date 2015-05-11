package lesson16.Task3_package;

import java.io.File;
import java.io.IOException;

public class CopyFile {
    private String frompath;
    private String topath;

    public CopyFile(String frompath, String topath) {
        this.frompath = frompath;
        this.topath = topath;
    }

    public void Copy() throws IOException {
        File file = new File(frompath);
        File fileto = new File(topath);
        int quantity = (int) file.length() / 3;
        try {
            CopyPartOfFile part1 = new CopyPartOfFile(file, fileto, quantity, 0);
            part1.start();
            CopyPartOfFile part2 = new CopyPartOfFile(file, fileto, quantity, quantity + 1);
            part2.start();
            CopyPartOfFile part3 = new CopyPartOfFile(file, fileto, (int) file.length() - 2 * quantity, 2 * quantity + 1);
            part3.start();
        } finally {
        }
    }
}
