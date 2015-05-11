package lesson13.Task4_package;

/**
 * Модифицировать монитор так, чтобы он работал на базе связных списков.
 */

public class Main {

    private static class MyEvents implements IFileEvents {
        public void onFileAdded(String path) {
            System.out.println("File added: " + path);
        }
        
        public void onFileDeleted(String path) {
            System.out.println("File deleted: " + path);
        }
    }

    public static void main(String[] args) {
        Monitor m = new Monitor("/Users/Masher/Documents/");
        m.setTimeout(2000);
        m.setEvents(new MyEvents());
        m.start();
    }
}