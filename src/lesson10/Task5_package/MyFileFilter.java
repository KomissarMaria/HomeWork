package lesson10.Task5_package;

import java.io.*;

public class MyFileFilter implements FilenameFilter {
    private String ext;

    public MyFileFilter(String ext) {
        this.ext = ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
