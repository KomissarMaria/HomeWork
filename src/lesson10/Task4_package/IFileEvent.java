package lesson10.Task4_package;

import java.io.File;

public interface IFileEvent {
	void onFileAdded(String s, File file);
}
