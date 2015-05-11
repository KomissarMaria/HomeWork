package Task5_package;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class Monitor {

    private String path;
    private int timeout;
    private LinkedList<String> prev = new LinkedList<String>();
    private LinkedList<String> curr = new LinkedList<String>();
    private LinkedList<Long> prevdata = new LinkedList<Long>();
    private LinkedList<Long> currdata = new LinkedList<Long>();
    private IFileEvents events;

    public Monitor(String path) {
        this.path = path;
        createArray(prev, prevdata);
    }

    public void start() {
        while (true) {
            createArray(curr, currdata);
            compareArrays(prev, curr, prevdata, currdata);
            prev.clear();
            prevdata.clear();
            prev.addAll(curr);
            prevdata.addAll(currdata);

            System.out.println("Waiting...");
            try {
                Thread.sleep(timeout);
            } catch (InterruptedException ex) {
                return;
            }
        }
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int value) {
        timeout = value;
    }

    public IFileEvents getEvents() {
        return events;
    }

    public void setEvents(IFileEvents value) {
        events = value;
    }

    private void doFileAdded(String path) {
        if (events != null)
            events.onFileAdded(path);
    }

    private void doFileDeleted(String path) {
        if (events != null)
            events.onFileDeleted(path);
    }

    private void doFileChanged(String path) {
        if (events != null)
            events.onFileChanged(path);
    }

    private void compareArrays(LinkedList<String> m1, LinkedList<String> m2, LinkedList<Long> dm1, LinkedList<Long> dm2) {
        Iterator<String> it = m1.iterator();
        String path;
        Long data;

        int index = 0;
        while (it.hasNext()) {
            path = it.next();

            if (!m2.contains(path))
                doFileDeleted(path);
            else {
                File f = new File(path);
                data = f.lastModified();
                if (!dm1.get(index).equals(data)){
                    doFileChanged(path);
                }
            }
            index++;
        }

        it = m2.iterator();
        while (it.hasNext()) {
            path = it.next();

            if (!m1.contains(path))
                doFileAdded(path);
        }

    }

    private void createArray(LinkedList<String> output, LinkedList<Long> data) {
        try {
            File file = new File(path);
            File[] list = file.listFiles();

            output.clear();
            data.clear();
            for (File f : list) {
                output.add(f.getCanonicalPath());
                data.add(f.lastModified());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
