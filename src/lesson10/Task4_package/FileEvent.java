package lesson10.Task4_package;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEvent implements IFileEvent {
    @Override
    public void onFileAdded(String s, File file) {
        SimpleDateFormat sdf = new SimpleDateFormat("d/MM/yyyy hh:mm:ss");
        System.out.println("File added: " + s + ", date of create " + sdf.format(new Date(file.lastModified())));
    }

}
