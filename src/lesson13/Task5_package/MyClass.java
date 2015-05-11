package Task5_package;

/**
 * Добавить в монитор, на базе списков, функцию вывода сообщения при изменении в файлах. (Программа хранит дату модификации файлов).
 */

public class MyClass {

    private static class MyEvents implements IFileEvents {
        public void onFileAdded(String path) {
            System.out.println("File added: " + path);
        }

        public void onFileDeleted(String path) {
            System.out.println("File deleted: " + path);
        }

        public void onFileChanged(String path) {
            System.out.println("File changed: " + path);
        }
    }

    public static void main(String[] args) {
        Monitor m = new Monitor("/Users/Masher/Documents/");
        m.setTimeout(2000);
        m.setEvents(new MyEvents());
        m.start();
    }
}