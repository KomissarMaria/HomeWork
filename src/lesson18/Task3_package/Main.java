package lesson18.Task3_package;

import java.io.IOException;

/**
 * Написать сервер, который будет отправлять пользователю информацию о системе и номер запроса.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Server myServer = new Server(5001);
        myServer.run();
    }
}