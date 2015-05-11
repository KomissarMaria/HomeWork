package lesson13.Task4_package;

import java.lang.InterruptedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;
import java.util.LinkedList;

public class Monitor {
	
	private String path;
	private int timeout;
    private LinkedList<String> prev = new LinkedList<String>();
    private LinkedList<String> curr = new LinkedList<String>();


    private IFileEvents events;

	public Monitor(String path) {
		this.path = path;
		createArray(prev);
	}

	public void start() {
		while (true) {
			createArray(curr);
			compareArrays(prev, curr);
			prev.clear();
			prev.addAll(curr);
			
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

    private void compareArrays(LinkedList<String> m1, LinkedList<String> m2) {
        Iterator<String> it = m1.iterator();
        String path;

        while (it.hasNext()) {
            path = it.next();

            if ( ! m2.contains(path))
                doFileDeleted(path);
        }

        it = m2.iterator();
        while (it.hasNext()) {
            path = it.next();

            if ( ! m1.contains(path))
                doFileAdded(path);
        }
    }

    private void createArray(LinkedList<String> output) {
        try {
            File file = new File(path);
            File[] list = file.listFiles();

            output.clear();
            for (File f : list) {
                output.add(f.getCanonicalPath());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
