package lesson18.Task3_package;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;

public class Client implements Runnable {
    public static int reqnumber = 0;
    private Socket socket;

    public Client(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        StringBuilder text = new StringBuilder();
        text.append("Operating system name: " + System.getProperty("os.name") + "\n")
                .append("Operating system version: " + System.getProperty("os.version") + "\n")
                .append("Operating system architecture: " + System.getProperty("os.arch") + "\n")
                .append("User account name: " + System.getProperty("user.name") + "\n")
                .append("JRE version number: " + System.getProperty("java.version") + "\n")
                .append("Request number: " + ++reqnumber);
        try {
            if (socket.isConnected()) {
                socket.getOutputStream().write(text.toString().getBytes());
                socket.getOutputStream().flush();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
