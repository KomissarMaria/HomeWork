package lesson10.Delete_from_TaskList.Task8_package;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Monitor {
    String file;
    IFileEvent event;

    public Monitor(String file, IFileEvent event) {
        this.file = file;
        this.event = event;
    }

    public void start() {
        File f = new File(file);
        long d;
        while (true) {
            if (f.exists() && f.isFile()) {
                if (event != null)
                    event.onFileAdded(file);
                d = f.lastModified();
                break;
            }
            delay(); // задержка
            System.out.println("Waiting...");
        }
        Date date = new Date(d);
        SimpleDateFormat sdf = new SimpleDateFormat("d/MM/yyyy hh:mm:ss");
        System.out.println("Date of create " + sdf.format(date));
    }

    private void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
            System.err.println("Thread interrupted!");
        }
    }

}
