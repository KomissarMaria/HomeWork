package lesson18.Task3_package;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    int portnumber;
    Socket socket;

    public Server(int portnumber) {
        this.portnumber = portnumber;
    }

    public void run() throws IOException{
        ServerSocket serverSocket = new ServerSocket(portnumber);
        try  {
            while (true) {
               // Socket serv = serverSocket.accept();
                socket = new Socket("127.0.0.1",portnumber);
                Thread myClient = new Thread(new Client(socket));
                myClient.start();
               // Thread.sleep(1000);
            }
        } finally {
            serverSocket.close();
        }
    }
}


