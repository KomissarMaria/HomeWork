package Task5_package;

public interface IFileEvents {
    void onFileAdded(String path);
    void onFileDeleted(String path);
    void onFileChanged(String path);
}
