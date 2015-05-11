package lesson17.Task3_package;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Есть список поездов, представленный с виде XML. Вывести на экран информацию о тех поездах, которые отправляются сегодня с 15:00 до 19:00.
 * Написать код для добавления новых поездов в существующий XML.
 */
public class Task3 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            String filename = "/Users/Masher/IdeaProjects/lesson17/src/Task3_package/example.xml";
            Document document = documentBuilder.parse(new File(filename));
            Element root = document.getDocumentElement();
            print(root);
            add(document,root,filename,3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void print(Element root) throws ParseException {
        Date today = new Date();
        Date start = new Date(today.getYear(), today.getMonth(), today.getDate(), 15, 0, 0);
        Date finish = new Date(today.getYear(), today.getMonth(), today.getDate(), 19, 0, 0);
        NodeList nodeList = root.getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String sd = element.getElementsByTagName("date").item(0).getChildNodes().item(0).getNodeValue() + " " + element.getElementsByTagName("departure").item(0).getChildNodes().item(0).getNodeValue();
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                Date date = format.parse(sd);
                if (date.after(start) && date.before(finish)) {
                    System.out.println("Train:");
                    System.out.println("From: " + element.getElementsByTagName("from").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("To: " + element.getElementsByTagName("to").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Date: " + element.getElementsByTagName("date").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Departure: " + element.getElementsByTagName("departure").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("----------------------");
                }
            }
        }
    }

    public static void add(Document document,Element root, String filename,int id) throws ParserConfigurationException, TransformerException {
        String from = input("Bведите город отправления: ");
        String to = input("Bведите город назначения: ");
        String date = input("Bведите дату отправления в формате дата.месяц.год: ");
        String departure = input("Bведите время отправления в формате час:минуты : ");

        Element train1 = document.createElement("train");
        train1.setAttribute("id",Integer.toString(id));
        root.appendChild(train1);

        Element from1 = document.createElement("from");
        from1.setTextContent(from);
        train1.appendChild(from1);

        Element to1 = document.createElement("to");
        to1.setTextContent(to);
        train1.appendChild(to1);

        Element date1 = document.createElement("date");
        date1.setTextContent(date);
        train1.appendChild(date1);

        Element departure1 = document.createElement("departure");
        departure1.setTextContent(departure);
        train1.appendChild(departure1);

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File(filename));
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(source, result);
    }

    public static String input(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextLine();
    }
}

