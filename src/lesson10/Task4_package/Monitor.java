package lesson10.Task4_package;

import java.io.File;

public class Monitor {
    String[] list;
	IFileEvent event;

	public Monitor(String[] list, IFileEvent event) {
		this.list = list;
		this.event = event;
	}
	
	public void start() {
        for (int i = 0; i < list.length; i++) {
            File f = new File(list[i]);
            long d;
            while (true) {
                if (f.exists() && f.isFile()) {
                    if (event != null)
                        event.onFileAdded(list[i],f);
                    break;
                }
                delay(); // задержка
                System.out.println("Waiting for " + list[i]);
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

}
