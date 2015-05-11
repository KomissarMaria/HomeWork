package lesson10.Delete_from_TaskList.Task8_package;

public class FileEvent implements IFileEvent {
	@Override
	public void onFileAdded(String s) {
		System.out.println("File added: " + s);
	}

}
