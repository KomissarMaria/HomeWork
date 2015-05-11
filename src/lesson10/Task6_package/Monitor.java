package lesson10.Task6_package;

import java.io.File;
import java.io.IOException;

public class Monitor {
    String file;
    IFileEvent event;
    String etc;

    public Monitor(String file, IFileEvent event, String etc) {
        this.file = file;
        this.event = event;
        this.etc = etc;
    }

    public void start() throws IOException {
        boolean filefind = false;
        while (!filefind) {
            filefind = findFiles(this.file, this.etc);
            if (!filefind) {
                delay(); // задержка
                System.out.println("Waiting...");
            }
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

    private boolean findFiles(String srcPath, String ext) throws IOException {
        File dir = new File(srcPath);
        File[] filesDirectories = dir.listFiles();
        File[] files = dir.listFiles(new MyFileFilter(ext));
        boolean rezult = false;
        if (files.length != 0) {
            event.onFileAdded(dir);
            return true;
        } else
            for (int i = 0; i < filesDirectories.length; i++) {
                if (filesDirectories[i].isDirectory()) {
                    String newsrcPath = filesDirectories[i] + "/";
                    rezult = findFiles(newsrcPath, ext);
                    if (rezult)
                        break;
                }
            }
        return rezult;
    }
}
