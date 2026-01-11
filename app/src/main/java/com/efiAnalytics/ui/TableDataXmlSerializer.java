package com.efiAnalytics.ui;

import V.ExceptionInVPackage;
import W.WInterfaceAn;
import bH.X;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TableDataXmlSerializer {
  public void ExceptionInVPackage(String paramString, s params) {
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    try {
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.newDocument();
      Element element1 = document.createElement("tableData");
      element1.setAttribute("xmlns", "http://www.EFIAnalytics.com/:table");
      document.appendChild(element1);
      Element element2 = document.createElement("bibliography");
      element2.setAttribute("author", "EFI Analytics - philip.tobin@yahoo.com");
      element2.setAttribute("company", "EFI Analytics, copyright 2010, All Rights Reserved.");
      element2.setAttribute("writeDate", (new Date()).toString());
      element1.appendChild(element2);
      Element element3 = document.createElement("versionInfo");
      element3.setAttribute("fileFormat", "1.0");
      element1.appendChild(element3);
      Element element4 = document.createElement("table");
      element4.setAttribute("rows", "" + (params.ExceptionInVPackage()).length);
      element4.setAttribute("cols", "" + (params.b()).length);
      element1.appendChild(element4);
      Element element5 = document.createElement("xAxis");
      element5.setAttribute("cols", "" + (params.b()).length);
      element5.setAttribute("name", "" + params.w());
      element5.setTextContent(X.ExceptionInVPackage(ExceptionInVPackage(params.b(), false)));
      element4.appendChild(element5);
      Element element6 = document.createElement("yAxis");
      element6.setAttribute("rows", "" + (params.ExceptionInVPackage()).length);
      element6.setAttribute("name", "" + params.v());
      element6.setTextContent(X.ExceptionInVPackage(ExceptionInVPackage(params.ExceptionInVPackage(), true)));
      element4.appendChild(element6);
      Element element7 = document.createElement("zValues");
      element7.setAttribute("cols", "" + (params.b()).length);
      element7.setAttribute("rows", "" + (params.ExceptionInVPackage()).length);
      element7.setTextContent(X.ExceptionInVPackage(ExceptionInVPackage(params)));
      element4.appendChild(element7);
      ExceptionInVPackage(paramString, document);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      throw ExceptionInVPackage;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Error Saving Table. Check Log file for details.");
    } 
  }
  
  private String[][] ExceptionInVPackage(String[] paramArrayOfString, boolean paramBoolean) {
    String[][] arrayOfString = new String[paramArrayOfString.length][1];
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (paramBoolean) {
        arrayOfString[arrayOfString.length - 1 - b][0] = paramArrayOfString[b];
      } else {
        arrayOfString[b][0] = paramArrayOfString[b];
      } 
    } 
    return arrayOfString;
  }
  
  private String[][] ExceptionInVPackage(WInterfaceAn paraman) {
    String[][] arrayOfString = new String[(paraman.ExceptionInVPackage()).length][(paraman.b()).length];
    for (byte b = 0; b < arrayOfString.length; b++) {
      for (byte b1 = 0; b1 < (arrayOfString[0]).length; b1++) {
        Object object = paraman.getValueAt(b, b1);
        if (object != null) {
          arrayOfString[arrayOfString.length - 1 - b][b1] = object.toString();
        } else {
          arrayOfString[arrayOfString.length - 1 - b][b1] = "";
        } 
      } 
    } 
    return arrayOfString;
  }
  
  public s ExceptionInVPackage(String paramString) {
    FileInputStream fileInputStream = null;
    try {
      File file = new File(paramString);
      fileInputStream = new FileInputStream(file);
      return ExceptionInVPackage(fileInputStream);
    } catch (FileNotFoundException fileNotFoundException) {
      fileNotFoundException.printStackTrace();
      throw new ExceptionInVPackage("Problem loading " + paramString + ", error message:\n" + fileNotFoundException.getMessage() + "\nCheck log file for more details.");
    } finally {
      try {
        fileInputStream.close();
      } catch (IOException iOException) {}
    } 
  }
  
  public s ExceptionInVPackage(InputStream paramInputStream) {
    Document document = null;
    s s = new s();
    try {
      DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      document = documentBuilder.parse(paramInputStream);
      NodeList nodeList = document.getElementsByTagName("*");
      int i = 0;
      int j = 0;
      for (byte b = 0; b < nodeList.getLength(); b++) {
        Node node = nodeList.item(b);
        if (node.hasAttributes() && node.getNodeName().equals("table")) {
          NamedNodeMap namedNodeMap = node.getAttributes();
          for (byte b1 = 0; b1 < namedNodeMap.getLength(); b1++) {
            Node node1 = namedNodeMap.item(b1);
            if (node1.getNodeName() != null && node1.getNodeName().equals("rows")) {
              i = Integer.parseInt(node1.getNodeValue());
            } else if (node1.getNodeName() != null && node1.getNodeName().equals("cols")) {
              j = Integer.parseInt(node1.getNodeValue());
            } 
          } 
          s.ExceptionInVPackage(i, j);
        } else if (node.hasAttributes() && node.getNodeName().equals("xAxis")) {
          NamedNodeMap namedNodeMap = node.getAttributes();
          for (byte b1 = 0; b1 < namedNodeMap.getLength(); b1++) {
            Node node1 = namedNodeMap.item(b1);
            if (node1.getNodeName() != null && node1.getNodeName().equals("name")) {
              String str1 = node1.getNodeValue();
              if (str1 != null && str1.length() > 0)
                s.e(str1); 
            } 
          } 
          String str = node.getTextContent();
          double[][] arrayOfDouble = new double[j][1];
          X.ExceptionInVPackage(arrayOfDouble, str);
          String[] arrayOfString = ExceptionInVPackage(arrayOfDouble);
          s.c(arrayOfString);
        } else if (node.hasAttributes() && node.getNodeName().equals("yAxis")) {
          NamedNodeMap namedNodeMap = node.getAttributes();
          for (byte b1 = 0; b1 < namedNodeMap.getLength(); b1++) {
            Node node1 = namedNodeMap.item(b1);
            if (node1.getNodeName() != null && node1.getNodeName().equals("name")) {
              String str1 = node1.getNodeValue();
              if (str1 != null && str1.length() > 0)
                s.d(str1); 
            } 
          } 
          String str = node.getTextContent();
          double[][] arrayOfDouble = new double[i][1];
          X.ExceptionInVPackage(arrayOfDouble, str);
          String[] arrayOfString = ExceptionInVPackage(arrayOfDouble);
          s.d(arrayOfString);
        } else if (node.hasAttributes() && node.getNodeName().equals("zValues")) {
          String str = node.getTextContent();
          double[][] arrayOfDouble = new double[i][j];
          X.ExceptionInVPackage(arrayOfDouble, str);
          s.ExceptionInVPackage(arrayOfDouble);
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Problem loading table, error message:\n" + exception.getMessage() + "\nCheck log file for more details.");
    } 
    return s;
  }
  
  public s b(String paramString, s params) {
    s s1 = ExceptionInVPackage(paramString);
    fh.ExceptionInVPackage(s1, params);
    return params;
  }
  
  private String[] ExceptionInVPackage(double[][] paramArrayOfdouble) {
    String[] arrayOfString = new String[paramArrayOfdouble.length];
    for (byte b = 0; b < paramArrayOfdouble.length; b++)
      arrayOfString[b] = paramArrayOfdouble[b][0] + ""; 
    return arrayOfString;
  }
  
  public void ExceptionInVPackage(String paramString, Document paramDocument) {
    try {
      File file = new File(paramString);
      if (!file.exists())
        file.createNewFile(); 
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      DOMSource dOMSource = new DOMSource(paramDocument);
      StreamResult streamResult = new StreamResult(fileOutputStream);
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      transformer.setOutputProperty("indent", "yes");
      transformer.transform(dOMSource, streamResult);
      fileOutputStream.close();
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Error Saving Document. Check Log file for details.");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */