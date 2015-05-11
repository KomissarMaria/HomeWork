package lesson10.Task3_package;

import java.io.File;
import java.util.Date;

public class Monitor {
    String file;
    IFileEvent event;
    long data;

    public Monitor(String file, IFileEvent event) {
        this.file = file;
        this.event = event;
    }

    public void start() {
        File f = new File(file);
        while (true) {
            if (f.exists() && f.isFile()) {
                if (event != null) {
                    data = f.lastModified();
                    Date d = new Date(data);
                    event.onFileAdded(file + " date of create: "+ d.toString());
                }
                break;
            }
            delay(); // задержка
            System.out.println("Waiting...");
        }
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
