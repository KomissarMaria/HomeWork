package lesson17.Task1_package;

import java.io.*;
import java.util.ArrayList;

public class MySimpleXMLParser {
    private String xml;
    private String[] parts;

    public MySimpleXMLParser(String path) {
        byte[] buf = null;

        try {
            RandomAccessFile file = new RandomAccessFile(path, "r");
            try {
                buf = new byte[(int) file.length()];
                file.read(buf);
            } finally {
                file.close();
            }
        } catch (IOException ex) {
        }

        try {
            xml = new String(buf, "US-ASCII");
        } catch (UnsupportedEncodingException ex) {
        }
    }

    // "catalog/book/author"
    public ArrayList<String> get(String path) {
        ArrayList<String> mas = new ArrayList<String>();
        parts = path.split("/");
        weFind(xml, 0, mas);
        return mas;
    }

    private void weFind(String newxml, int pos, ArrayList<String> mas) {
        String tag = parts[pos];
        ArrayList<String> ourtags = new ArrayList<String>();
        String[] part = newxml.split("<" + tag + ">");
        for (int i = 1; i < part.length; i++)
            ourtags.add(part[i].split("</" + tag + ">")[0]);

        if (++pos == parts.length)
            mas.add(ourtags.toString());
        else
            for (String s : ourtags)
                weFind(s, pos, mas);
    }
}
