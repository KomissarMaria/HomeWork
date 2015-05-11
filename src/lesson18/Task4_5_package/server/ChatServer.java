package Task2_2_3_Chat.server;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        Server s = new Server(5000);
        s.start();
    }
}