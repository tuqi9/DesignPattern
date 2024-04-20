package org.tuqi.sample.creator.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLUtil {

    public static String getProperty(String propertyName){
        String property = null;

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc;
//            doc = builder.parse(new File("classpath://config.xml"));
            doc = builder.parse(XMLUtil.class.getClassLoader().getResource("config.xml").getPath());

            NodeList propertyList = doc.getElementsByTagName(propertyName);
            Node firstChild = propertyList.item(0).getFirstChild();
            property = firstChild.getNodeValue().trim();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return property;
    }

}
