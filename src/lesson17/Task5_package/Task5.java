package lesson17.Task5_package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

/**
 * Написать парсер для Yahoo Finance в режиме XML (format=xml).
 */

public class Task5 {
    public static void main(String[] args) throws Exception {
        String request = "http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20" +
                "yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\",%20\"EURUAH\")&env=store://datatables.org/alltableswithkeys";

        String result = performRequest(request);
        String filename = "/Users/Masher/IdeaProjects/lesson17/src/Task5_package/ex.xml";

        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(result.getBytes());
        }

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new File(filename));

        Element root = doc.getDocumentElement();
        print(root);
    }

    private static String performRequest(String request) throws IOException {
        URL url = new URL(request);
        StringBuilder sb = new StringBuilder();

        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()))) {
            char[] buf = new char[1000];
            int r = 0;
            do {
                if ((r = br.read(buf)) > 0) {
                    sb.append(new String(buf, 0, r));
                }
            } while (r > 0);
        }
        return sb.toString();
    }

    public static void print(Element root) throws ParseException {
        NodeList nodeList = root.getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getChildNodes().getLength() != 0) {
                NodeList nodeList1 = node.getChildNodes();
                for (int j = 0; j < nodeList1.getLength(); j++) {
                    Node node1 = nodeList.item(i);
                    printNode(node1);
                }
            } else {
                printNode(node);
            }
        }
    }

    private static void printNode(Node node) {
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            System.out.println("Name: " + element.getElementsByTagName("Name").item(0).getChildNodes().item(0).getNodeValue());
            System.out.println("Rate: " + element.getElementsByTagName("Rate").item(0).getChildNodes().item(0).getNodeValue());
            System.out.println("Date: " + element.getElementsByTagName("Date").item(0).getChildNodes().item(0).getNodeValue());
            System.out.println("Time: " + element.getElementsByTagName("Time").item(0).getChildNodes().item(0).getNodeValue());
            System.out.println("Ask: " + element.getElementsByTagName("Ask").item(0).getChildNodes().item(0).getNodeValue());
            System.out.println("Bid: " + element.getElementsByTagName("Bid").item(0).getChildNodes().item(0).getNodeValue());
            System.out.println("----------------------");
        }
    }
}
