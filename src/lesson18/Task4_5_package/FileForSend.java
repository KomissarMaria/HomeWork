package Task2_2_3_Chat;

import java.io.Serializable;

public class FileForSend implements Serializable {
    private static final long serialVersionUID = 1L;

    public byte[] FileBytes = null;
    String NameOfFile = null;

    public FileForSend(String name, byte[] file) {
        this.NameOfFile = name;
        this.FileBytes = file;
    }

}
