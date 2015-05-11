package lesson18.Task6_package;

import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ServersAvailability {
    HashMap<String, String> servers;

    public ServersAvailability(String path) {
        servers = readservers(path);
    }

    public void serversstatus() {
        Set<Map.Entry<String, String>> set = servers.entrySet();
        for (Map.Entry<String, String> entry : set)
            System.out.println(entry.getKey() + " = " + entry.getValue());
    }

    private HashMap<String, String> readservers(String path) {
        HashMap<String, String> serverlist = new HashMap<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            BufferedReader buf = new BufferedReader(new InputStreamReader(fis));
            String line;
            line = buf.readLine();
            while (line != null) {
                serverlist.put(line.trim(), status(line.trim()));
                line = buf.readLine();
            }
            fis.close();
            buf.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл со списком серверов не найден!");
        } catch (IOException e) {
            System.out.println(e);
        }
        return serverlist;
    }

    private String status(String url) {
        String availability = "";
        try{
            URL server = new URL(url);
            server.openConnection().connect();
            availability = "available";
        }
        catch(IOException ex){
            System.out.println(ex);
            availability = "not available";
        }
        return availability;
    }
}
