package lesson17.Task4_package;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

/**
 * Распарсить следующую структуру данных
 */
public class Task4 {
    public static void main(String[] args) {
        String path = "/Users/Masher/IdeaProjects/lesson17/src/Task4_package/Human";
        String info = GetInfo(path);
        Gson gson = new GsonBuilder().create();
        Information information = gson.fromJson(info, Information.class);
        System.out.println(information.toString());
    }

    public static String GetInfo(String path){
        StringBuilder stringbuilder = new StringBuilder();
        try{
            BufferedReader in = new BufferedReader(new FileReader(new File(path)));
            try{
                String text;
                while ((text = in.readLine()) != null) {
                    stringbuilder.append(text);
                    stringbuilder.append("\n");
                }
            }
            finally {
                in.close();
            }
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }
        return stringbuilder.toString();
    }
}
