package lesson17.Task1_package;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Сделать возможность искать значения в случае дублирования имен тэгов.
 */
public class MyParserDemo {
    public static void main(String[] args) throws IOException {
        MySimpleXMLParser xml;
        String filename = "/Users/Masher/IdeaProjects/lesson17/src/Task1_package/example.xml";
        xml = new MySimpleXMLParser(filename);
        ArrayList<String> value = xml.get("catalog/book/author");
        for (String elem : value)
            System.out.println(elem);
    }
}
