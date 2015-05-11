package Task2_2_3_Chat.client;
/**
 * Сделать ф-ю приватных сообщений, реализовать передачу файлов между клиентами.
 */

import Task2_2_3_Chat.Message;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    public static void readFile(byte[] bytes, String fileName, String fileDir) {
        String filestr = fileDir + fileName;
        System.out.println(filestr);
        File file = new File(filestr);
        try {
            FileOutputStream os = new FileOutputStream(file);
            os.write(bytes);
            os.close();
        } catch (Exception e) {
        }
    }

    public static byte[] readbytes(File file) throws IOException {
        InputStream is = new FileInputStream(file);
        long length = file.length();

        byte[] buf = new byte[(int) length];
        try {
            int r;
            do {
                r = is.read(buf, 0, buf.length);
            } while (r > 0);
        } finally {
            is.close();
        }
        return buf;
    }


    public static void main(String[] args) {
        try {
            final Scanner scanner = new Scanner(System.in);
            final Socket socket = new Socket("127.0.0.1", 5000);
            final InputStream is = socket.getInputStream();
            final OutputStream os = socket.getOutputStream();

            final String DirectoryForSave = "/Users/Masher/Documents/";

            System.out.println("Enter login: ");
            final String login = scanner.nextLine();

            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        while (!isInterrupted()) {
                            Message msg = Message.readFromStream(is);
                            if (msg == null) {
                                Thread.yield();
                            } else {
                                if (!msg.isFile) {
                                    if (msg.to.equals(login) || msg.from.equals(login)) {
                                        System.out.println(msg.toString());
                                    }
                                }
                                if (msg.isFile && msg.to.equals(login)) {
                                    readFile(msg.FileBytes, msg.NameOfFile, DirectoryForSave);
                                }
                            }
                        }
                    } catch (Exception e) {
                        return;
                    }
                }
            };
            th.setDaemon(true);
            th.start();

            try {
                while (true) {
                    System.out.println("Сообщение: ");
                    String s = scanner.nextLine();
                    if (s.isEmpty())
                        break;

                    int del = s.indexOf(':');
                    String to = "";
                    String text = s;

                    if (del >= 0) {
                        to = s.substring(0, del);
                        text = s.substring(del + 1);
                    }

                    if (text.contains("file")) {
                        System.out.println("Введите путь к файлу: ");
                        final String fileDir = scanner.nextLine();
                        Message m = new Message();
                        m.text = null;
                        m.from = login;
                        m.to = to;
                        File fu = new File(fileDir);
                        m.FileBytes = readbytes(fu);
                        m.NameOfFile = fu.getName();
                        m.isFile = true;
                        m.writeToStream(os);
                    } else {
                        Message m = new Message();
                        m.text = text;
                        m.from = login;
                        m.to = to;
                        m.isFile = false;
                        m.writeToStream(os);
                    }
                }
            } finally {
                scanner.close();
                th.interrupt();
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}