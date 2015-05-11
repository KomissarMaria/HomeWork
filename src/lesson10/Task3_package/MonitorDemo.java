package lesson10.Task3_package;

/**
 * Добавить в проект «монитор» функцию вывода даты создания файла на экран (см. java.io.File).
 */
public class MonitorDemo {
	public static void main(String[] args) {
		Monitor m = new Monitor("/Users/Masher/Documents/Tasktable_Maria.numbers", new FileEvent());
		m.start();
	}
}