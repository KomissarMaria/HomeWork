package lesson15.Task6_package;

import java.io.File;

public class ProgressBar implements Progress {
    private static long proc;

    @Override
    public void downloading(File file, int pos) {
        proc += pos;
        double d = (double) proc / file.length() * 100;
        int s = (int) Math.round(d);
        for (int i = 0; i < s / 10; i++) {
            System.out.print("*");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
}
