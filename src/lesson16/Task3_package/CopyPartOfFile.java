package lesson16.Task3_package;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyPartOfFile extends Thread {
    private int pos, len;
    RandomAccessFile from;
    RandomAccessFile to;
    File frompath;
    File topath;

    public CopyPartOfFile(File frompath, File topath, int len, int pos) {
        this.len = len;
        this.pos = pos;
        this.frompath = frompath;
        this.topath = topath;
    }

    public synchronized void run() {
        try {
            from = new RandomAccessFile(frompath, "r");
            try {
                to = new RandomAccessFile(topath, "rw");
                try {
                    byte[] buf = new byte[len];
                    from.seek(pos);
                    int r = from.read(buf, 0, buf.length);
                    to.seek(pos);
                    to.write(buf);
                } finally {
                    to.close();
                }
            } finally {
                from.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

