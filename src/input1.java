//Java program to read the input1.xml file and display the attributes in the java output

package src;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class input1 {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        File xmlFile = new File("src/input1.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(xmlFile);

        NodeList orderLines = document.getElementsByTagName("OrderLine");
        for (int i = 0; i < orderLines.getLength(); i++) {
            Element orderLine = (Element) orderLines.item(i);
            NodeList items = orderLine.getElementsByTagName("Items");
            for (int j = 0; j < items.getLength(); j++) {
                Element item = (Element) items.item(j);
                System.out.println("ItemId: " + item.getAttribute("ItemId"));
                System.out.println("ItemDescription: " + item.getAttribute("ItemDescription"));
                System.out.println("UOM: " + item.getAttribute("UOM"));
                System.out.println("UnitPrice: " + item.getAttribute("UnitPrice"));
            }
        }
    }
}