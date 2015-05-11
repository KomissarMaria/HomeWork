package lesson13.Task4_package;

public interface IFileEvents {
    void onFileAdded(String path);
    void onFileDeleted(String path);
}
