package lesson10.Task6_package;

import java.io.File;
import java.io.IOException;

public interface IFileEvent {
    void onFileAdded(File dir) throws IOException;
}
