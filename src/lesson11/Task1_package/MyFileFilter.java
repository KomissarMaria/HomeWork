package lesson11.Task1_package;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {
    private boolean isDirectory;

    public MyFileFilter(boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

    public boolean accept(File dir) {
        return dir.isDirectory();
    }
}

