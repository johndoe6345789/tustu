package v;

import V.a;
import W.d;
import W.s;
import bH.D;
import com.efiAnalytics.apps.ts.tuningViews.F;
import com.efiAnalytics.apps.ts.tuningViews.TuneViewComponent;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import r.a;

public class g extends e {
  double a = 1.0D;
  
  public void a(F paramF, File paramFile) {
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    long l = System.currentTimeMillis();
    try {
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.newDocument();
      Element element1 = document.createElement("tuneView");
      element1.setAttribute("xmlns", "http://www.EFIAnalytics.com/:tuneView");
      document.appendChild(element1);
      Element element2 = document.createElement("bibliography");
      element2.setAttribute("viewName", paramF.b());
      element2.setAttribute("author", a.b + " " + a.a + " - EFI Analytics, Inc");
      element2.setAttribute("company", "EFI Analytics, © 2007 - 2018, All Rights Reserved.");
      element2.setAttribute("writeDate", (new Date()).toString());
      element1.appendChild(element2);
      Element element3 = document.createElement("versionInfo");
      element3.setAttribute("fileFormat", "" + this.a);
      element3.setAttribute("firmwareSignature", paramF.a());
      element3.setAttribute("enabledCondition", paramF.e());
      element1.appendChild(element3);
      String str = paramF.c();
      if (str != null && !str.isEmpty()) {
        Element element = document.createElement("previewImage");
        element.setTextContent(str);
        element1.appendChild(element);
      } 
      Element element4 = document.createElement("tuningView");
      for (TuneViewComponent tuneViewComponent : paramF)
        a(document, element4, tuneViewComponent); 
      element1.appendChild(element4);
      a(paramFile, document);
    } catch (a a) {
      throw a;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error Saving TuningView. Check Log file for details.");
    } 
  }
  
  private Document a(Document paramDocument, Element paramElement, TuneViewComponent paramTuneViewComponent) {
    try {
      Element element = paramDocument.createElement("tuneComp");
      element = a(paramDocument, element, paramTuneViewComponent);
      paramElement.appendChild(element);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error Saving Component to root node. Check Log file for details.");
    } 
    return paramDocument;
  }
  
  public F a(File paramFile) {
    try {
      return a(s.a(paramFile, "SiJ6!EK&JC%@"));
    } catch (Exception exception) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, "Failed to load TuningView", exception);
      throw new a("Failed to load TuneView " + exception.getMessage(), exception);
    } 
  }
  
  public F a(Reader paramReader) {
    F f = new F();
    Document document = null;
    try {
      InputSource inputSource = new InputSource();
      inputSource.setCharacterStream(paramReader);
      DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      document = documentBuilder.parse(inputSource);
      NodeList nodeList = document.getElementsByTagName("*");
      for (byte b = 0; b < nodeList.getLength(); b++) {
        Node node = nodeList.item(b);
        if (node.hasAttributes() && node.getNodeName().equals("bibliography")) {
          NamedNodeMap namedNodeMap = node.getAttributes();
          for (byte b1 = 0; b1 < namedNodeMap.getLength(); b1++) {
            Node node1 = namedNodeMap.item(b1);
            if (node1.getNodeName() != null && node1.getNodeName().equals("viewName"))
              f.b(node1.getNodeValue()); 
          } 
        } 
        if (node.hasAttributes() && node.getNodeName().equals("versionInfo")) {
          NamedNodeMap namedNodeMap = node.getAttributes();
          String str = node.getNodeName();
          for (byte b1 = 0; b1 < namedNodeMap.getLength(); b1++) {
            Node node1 = namedNodeMap.item(b1);
            if (node1.getNodeName() != null && node1.getNodeName().equals("firmwareSignature")) {
              f.a(node1.getNodeValue());
            } else if (node1.getNodeName() != null && node1.getNodeName().equals("enabledCondition")) {
              f.d(node1.getNodeValue());
            } 
            if (node1.getNodeName() != null && node1.getNodeName().equals("fileFormat"))
              try {
                double d = Double.parseDouble(node1.getNodeValue());
                if (d > this.a) {
                  a a = new a("The format version of Tuning View: " + d + " is higher than \nthe maximum supported by this version application: " + this.a + "\nWill continue loading, but there may be issues.");
                  D.a("Unsupported TuneView File Version.", (Exception)a, null);
                } 
              } catch (Exception exception) {
                D.a(exception);
                D.a("Error parsing .tuneView format version: " + node1.getNodeValue());
              }  
          } 
        } 
        if (node.getNodeName().equals("previewImage")) {
          String str = node.getTextContent();
          if (str != null && !str.isEmpty())
            f.c(str); 
        } 
        if (node.getNodeName().equals("tuneComp"))
          try {
            TuneViewComponent tuneViewComponent = b(node);
            f.add(tuneViewComponent);
          } catch (Exception exception) {
            D.b("Failed to load TuneViewComponent:" + node.toString());
          }  
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Failed to load TuneView " + exception.getMessage(), exception);
    } finally {
      try {
        paramReader.close();
      } catch (IOException iOException) {}
    } 
    return f;
  }
  
  private TuneViewComponent b(Node paramNode) {
    return (TuneViewComponent)a(paramNode);
  }
  
  public static String a(F paramF) {
    g g1 = new g();
    File file = File.createTempFile("tsTuningView", "tuneView");
    g1.a(paramF, file);
    byte[] arrayOfByte = d.a(file);
    return new String(arrayOfByte, "UTF-8");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/v/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */