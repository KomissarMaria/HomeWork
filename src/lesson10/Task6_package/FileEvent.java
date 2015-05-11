package lesson10.Task6_package;

import java.io.*;

public class FileEvent implements IFileEvent {
    @Override
    public void onFileAdded(File dir) throws IOException {
        System.out.println("Файл .txt добавлен в папку: " + dir.getCanonicalPath());
    }

}
