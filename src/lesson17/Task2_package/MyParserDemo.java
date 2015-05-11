package lesson17.Task2_package;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Реализовать обработку тэгов типа <tag />
 */
public class MyParserDemo {
    public static void main(String[] args) throws IOException {
        MySimpleXMLParser xml;
        String filename = "/Users/Masher/IdeaProjects/lesson17/src/Task2_package/example.xml";
        xml = new MySimpleXMLParser(filename);
        ArrayList<String> value = xml.get("catalog/book/genre");
        for (String elem : value)
            System.out.println(elem);
    }
}
