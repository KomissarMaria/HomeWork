package lesson14.Task2_package;

import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Translate {

    private Map<String, String> dictionary = new HashMap<String, String>();
    private Language language;
    private String path;

    public Translate(Language language, String path) {
        this.language = language;
        this.path = path;
        createTranslator();
    }

    public String translation(String text) {
        String rezult = "";
        int pos, posnext;
        pos = 0;
        posnext = text.indexOf(' ');
        while (true) {
            if (posnext != -1) {
                rezult += findword(text.substring(pos, posnext)) + " ";
                pos = text.indexOf(' ', posnext);
                posnext = (pos != -1) ? text.indexOf(' ', pos + 1) : -1;
            } else {
                rezult += findword(text.substring(pos, text.length())) + " ";
                pos = -1;
            }
            if (pos == -1) break;
        }
        return rezult;
    }

    private String findword(String text) {
        String word = "";
        String newtext = text.trim();
        if (language == Language.ENGLISH) {
            word = dictionary.get(newtext);
        } else {
            Iterator<Map.Entry<String, String>> itr = dictionary.entrySet().iterator();
            while (itr.hasNext()) {
                if (itr.next().equals(newtext)) {
                    word = itr.next().getKey();
                    break;
                }
            }
        }
        return word;
    }

    private void createTranslator() {
        try {
            RandomAccessFile file = new RandomAccessFile(path, "r");
            try {
                while (file.getFilePointer() < file.length())
                    putelement(file.readLine());
            } finally {
                file.close();
            }
        } catch (Exception ex) {
        }
    }

    private void putelement(String newelem) {
        String newtext = newelem.trim();
        int pos = newtext.indexOf('-');
        dictionary.put(newtext.substring(0,pos),newtext.substring(pos+1,newtext.length()));
    }

}
