package RPIS71.Doronina.wdad.learn.xml;

import org.xml.sax.SAXException;
import org.w3c.dom.*;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class XmlTask implements XmlTaskInterface {

    public String getNoteText (User owner, String title) throws IOException, SAXException, ParserConfigurationException{
    String noteAvr;
            List<Text> textList = getTextList ("src/main/java/RPIS71.Doronina/wdad/learn/xml/urmomgay.xml");
    }

}