package lesson15.Task6_package;

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
        long bgn = 0;
        try {
            CopyPartOfFile part1 = new CopyPartOfFile(file, fileto, quantity, 0, bgn, new ProgressBar());
            part1.start();
            bgn += quantity;
            CopyPartOfFile part2 = new CopyPartOfFile(file, fileto, quantity, quantity + 1, bgn, new ProgressBar());
            part2.start();
            bgn += quantity;
            CopyPartOfFile part3 = new CopyPartOfFile(file, fileto, (int) file.length() - 2 * quantity, 2 * quantity + 1,bgn, new ProgressBar());
            part3.start();
        } finally {
        }
    }
}
