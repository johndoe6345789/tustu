package W;

import G.A;
import G.R;
import G.aL;
import G.aM;
import G.bM;
import G.bT;
import G.ca;
import G.r;
import V.g;
import V.j;
import bH.D;
import bH.I;
import bH.X;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;

public class aa {
  boolean a = false;
  
  public static String b = "http://www.msefi.com/:msq";
  
  public static String c = "msq";
  
  public static boolean d = false;
  
  private List e = new ArrayList();
  
  private boolean f = false;
  
  public static boolean a(String paramString) {
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = s.a(new File(paramString), "SiJ6!EK&JC%@");
      for (byte b = 0; b < 4; b++) {
        String str = bufferedReader.readLine();
        if (str == null)
          return false; 
        if (str.contains(c))
          return true; 
      } 
    } catch (FileNotFoundException fileNotFoundException) {
      Logger.getLogger(aa.class.getName()).log(Level.SEVERE, (String)null, fileNotFoundException);
    } catch (IOException iOException) {
      Logger.getLogger(aa.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (Exception exception) {} 
    } 
    return false;
  }
  
  public bT a(File paramFile) {
    Document document = null;
    bT bT = new bT();
    try {
      DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      InputSource inputSource = new InputSource();
      inputSource.setCharacterStream(s.a(paramFile, "SiJ6!EK&JC%@"));
      document = documentBuilder.parse(inputSource);
      NodeList nodeList = document.getElementsByTagName("*");
      String str = "";
      for (byte b = 0; b < nodeList.getLength(); b++) {
        Node node = nodeList.item(b);
        if (node.hasAttributes() && node.getNodeName().equals("versionInfo")) {
          NamedNodeMap namedNodeMap = node.getAttributes();
          String str1 = node.getNodeName();
          for (byte b1 = 0; b1 < namedNodeMap.getLength(); b1++) {
            Node node1 = namedNodeMap.item(b1);
            if (node1.getNodeName() != null && node1.getNodeName().equals("signature")) {
              bT.a(node1.getNodeValue().getBytes());
              return bT;
            } 
            if (node1.getNodeName() != null && node1.getNodeName().equals("firmwareInfo")) {
              String str2 = URLDecoder.decode(node1.getNodeValue(), "UTF-8");
              bT.b(str2);
            } 
          } 
        } 
      } 
    } catch (aj aj) {
      throw aj;
    } catch (Exception exception) {
      throw new g("Unable to get signature in file:\n" + paramFile.getAbsolutePath());
    } 
    throw new g("Unable to get signature in file:\n" + paramFile.getAbsolutePath());
  }
  
  public void a(R paramR, String paramString) {
    a(paramR, paramString, (List)null);
  }
  
  public void a(R paramR, String paramString, List paramList) {
    Document document = null;
    File file = new File(paramString);
    String str = "msq";
    if (paramString.indexOf(".") != -1)
      str = paramString.substring(paramString.lastIndexOf(".")); 
    aL.a(paramR);
    try {
      DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      InputSource inputSource = new InputSource();
      inputSource.setCharacterStream(s.a(file, "SiJ6!EK&JC%@"));
      document = documentBuilder.parse(inputSource);
      NodeList nodeList = document.getElementsByTagName("*");
      if (paramList == null)
        paramR.D(); 
      byte b;
      for (b = 0; b < nodeList.getLength(); b++) {
        Node node = nodeList.item(b);
        if (node.hasAttributes() && node.getNodeName().equals("pcVariable"))
          a(paramR, node, paramList, str, false); 
      } 
      nodeList = document.getElementsByTagName("*");
      for (b = 0; b < nodeList.getLength(); b++) {
        Node node = nodeList.item(b);
        if (node.hasAttributes() && node.getNodeName().equals("bibliography")) {
          NamedNodeMap namedNodeMap = node.getAttributes();
          String str1 = node.getNodeName();
          for (byte b1 = 0; b1 < namedNodeMap.getLength(); b1++) {
            Node node1 = namedNodeMap.item(b1);
            if (node1.getNodeName() != null && node1.getNodeName().equals("tuneComment")) {
              String str2 = node1.getNodeValue();
              paramR.v(str2);
            } 
          } 
        } else if (node.hasAttributes() && node.getNodeName().equals("versionInfo")) {
          NamedNodeMap namedNodeMap = node.getAttributes();
          String str1 = node.getNodeName();
          for (byte b1 = 0; b1 < namedNodeMap.getLength(); b1++) {
            Node node1 = namedNodeMap.item(b1);
            if (node1.getNodeName() != null && node1.getNodeName().equals("firmwareInfo")) {
              String str2 = URLDecoder.decode(node1.getNodeValue(), "UTF-8");
              paramR.A(str2);
            } 
          } 
        } else if (node.hasAttributes() && node.getNodeName().equals("constant")) {
          a(paramR, node, paramList, str, true);
        } else if (node.hasAttributes() && node.getNodeName().equals("userComment")) {
          try {
            NamedNodeMap namedNodeMap = node.getAttributes();
            String str1 = namedNodeMap.getNamedItem("name").getNodeValue();
            String str2 = namedNodeMap.getNamedItem("value").getNodeValue();
            if (str1 != null && str2 != null && (paramList == null || paramList.contains(str1)))
              paramR.b(str1, str2); 
          } catch (Exception exception) {
            b("Could not get comment from node:" + node.toString());
          } 
        } 
      } 
    } catch (SAXParseException sAXParseException) {
      sAXParseException.printStackTrace();
      throw new g("Problem Parsing tune settings file (" + str + "):\n" + sAXParseException.getMessage(), sAXParseException);
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      arrayIndexOutOfBoundsException.printStackTrace();
      throw new g("Error loading " + str + "\nA constant is defined to out of range memory addresses.\nCheck your offset and page sizes." + arrayIndexOutOfBoundsException.getMessage(), arrayIndexOutOfBoundsException);
    } catch (aj aj) {
      throw aj;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new g("Error loading " + str + ": " + exception.getMessage(), exception);
    } 
  }
  
  private void a(R paramR, Node paramNode, List paramList, String paramString, boolean paramBoolean) {
    NamedNodeMap namedNodeMap = paramNode.getAttributes();
    String str1 = paramNode.getNodeName();
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    boolean bool = paramR.R();
    for (byte b = 0; b < namedNodeMap.getLength(); b++) {
      Node node = namedNodeMap.item(b);
      if (node.getNodeName() != null && node.getNodeName().equals("name")) {
        str1 = node.getNodeValue();
      } else if (node.getNodeName() != null && node.getNodeName().equals("rows")) {
        str3 = node.getNodeValue();
      } else if (node.getNodeName() != null && node.getNodeName().equals("cols")) {
        str4 = node.getNodeValue();
      } else if (node.getNodeName() != null && node.getNodeName().equals("units")) {
        str5 = node.getNodeValue();
      } 
    } 
    if (!paramNode.getNodeName().equalsIgnoreCase("page") && (paramList == null || paramList.contains(str1))) {
      NodeList nodeList = paramNode.getChildNodes();
      for (byte b1 = 0; b1 < nodeList.getLength(); b1++) {
        Node node = nodeList.item(b1);
        if (node.getNodeType() == 3 && node.getNodeValue() != null)
          str2 = node.getNodeValue(); 
      } 
      if (str2 != null && str5 != null) {
        aM aM1 = paramR.c(str1);
        if (aM1 != null && !aM1.H() && !a(aM1.p(), str5))
          if ((aM1.p().equals("F") || aM1.p().equals("°F")) && (str5.equals("C") || str5.equals("°C"))) {
            str2 = c(str2);
            D.d("MSQ Units Mismatch for " + str1 + "! " + aM1.p() + " found in current configuration, " + str5 + " found in MSQ, values were converted to " + aM1.p() + ".");
          } else if ((str5.equals("F") || str5.equals("°F")) && (aM1.p().equals("C") || aM1.p().equals("°C"))) {
            str2 = d(str2);
            D.d("MSQ Units Mismatch for " + str1 + "! " + aM1.p() + " found in current configuration, " + str5 + " found in MSQ, values were converted to " + aM1.p() + ".");
          } else if (str5.equalsIgnoreCase("AFR") && aM1.p().equalsIgnoreCase("Lambda")) {
            str2 = e(str2);
            b("MSQ Units Mismatch for " + str1 + "! " + aM1.p() + " found in current configuration, " + str5 + " found in MSQ, values were converted to Lambda based on Gasoline 14.7:1.");
          } else if (str5.equalsIgnoreCase("Lambda") && aM1.p().equalsIgnoreCase("AFR")) {
            str2 = f(str2);
            b("MSQ Units Mismatch for " + str1 + "! " + aM1.p() + " found in current configuration, " + str5 + " found in MSQ, values were converted to Afr based on Gasoline 14.7:1.");
          } else if (str5.equalsIgnoreCase(aM1.p()) || str5.equals("INVALID")) {
            D.d("MSQ Units Mismatch for " + str1 + "! " + aM1.p() + " found in current configuration, " + str5 + " found in MSQ, values were not converted to new units.");
          } else {
            b("MSQ Units Mismatch for " + str1 + "! " + aM1.p() + " found in current configuration, " + str5 + " found in MSQ, values were not converted to new units.");
          }  
      } 
      aM aM = paramR.c(str1);
      if (str2 != null && str2.indexOf("\"") != -1) {
        try {
          if (aM.C() && (!aM.N() || !aM.n(paramR.h()) || !bool)) {
            paramR.a(str1, str2);
            this.e.add(aM);
          } 
        } catch (g g) {
          b("Parameter in " + paramString + ", but not valid for current firmware: " + g.getMessage());
        } catch (Exception exception) {
          if (paramBoolean && aM != null)
            b("Value in " + paramString + " '" + str2 + "' for parameter: " + str1 + " is of a type that is not compatible with the current firmware.This will be ignored, please correct manually."); 
        } 
      } else if (aM != null && aM.i().equals("string")) {
        try {
          paramR.a(str1, str2);
          this.e.add(aM);
        } catch (g g) {
          b("Failed to set value for " + str1 + " " + paramString + " value is not valid for current configuration: " + g.getMessage());
        } 
      } else if (str2 != null) {
        boolean bool1 = (str3 == null) ? ((aM != null) ? aM.a() : true) : Integer.parseInt(str3);
        boolean bool2 = (str4 == null) ? ((aM != null) ? aM.m() : true) : Integer.parseInt(str4);
        double[][] arrayOfDouble = new double[bool1][bool2];
        try {
          if (aM != null && aM.C() && !aM.i().equals("string")) {
            try {
              arrayOfDouble = X.a(arrayOfDouble, str2);
            } catch (Exception exception) {
              if (!str1.startsWith("UNALLOCATED_SPACE"))
                D.a("Invalid table data in Constant: " + str1 + ", not loading values."); 
            } 
            A a = aM.c();
            boolean bool3 = false;
            if (aM.i().equals("array") && arrayOfDouble.length > 0 && a.b() > 0 && (arrayOfDouble.length != a.b() || (arrayOfDouble[0]).length != a.a()))
              if (aM.P()) {
                bool3 = true;
                D.d("Unallocated memory changed, skip loading filler Constants.");
              } else if (aM.D()) {
                b(str1 + " array size does not match the currently loaded configuration,\n\trescaled " + paramString + " values to match configuration.");
                arrayOfDouble = I.a(arrayOfDouble, a.b(), a.a());
              } else {
                b(str1 + " array size does not match the currently loaded configuration,\n\tnoSizeMutation set for parameter values transfered to new array size where possible.");
                arrayOfDouble = I.b(arrayOfDouble, a.b(), a.a());
              }  
            if (!bool3 && (!aM.N() || !aM.n(paramR.h()) || !bool)) {
              paramR.a(str1, arrayOfDouble);
              this.e.add(aM);
            } 
          } 
        } catch (g g) {
          b("Failed to set value for " + str1 + " " + paramString + " value is not valid for current configuration: " + g.getMessage());
        } catch (j j) {
          if (!g(str1)) {
            boolean bool3 = false;
            boolean bool4 = false;
            try {
              for (byte b2 = 0; b2 < arrayOfDouble.length; b2++) {
                for (byte b3 = 0; b3 < (arrayOfDouble[0]).length; b3++) {
                  if (arrayOfDouble[b2][b3] > aM.s()) {
                    if (!bool3) {
                      if (bM.i(paramR, str1))
                        b(str1 + " row:" + b2 + ", col:" + b3 + ", One or more value higher than maximum: " + arrayOfDouble[b2][b3] + ", Set to the maximum value: " + aM.s()); 
                      bool3 = true;
                    } 
                    arrayOfDouble[b2][b3] = aM.s();
                  } else if (arrayOfDouble[b2][b3] < aM.a(b2)) {
                    if (!bool4) {
                      b(str1 + " row:" + b2 + ", col:" + b3 + ", One or more value below minimum: " + arrayOfDouble[b2][b3] + ", Set to the minimum value: " + aM.a(b2));
                      bool4 = true;
                    } 
                    arrayOfDouble[b2][b3] = aM.a(b2);
                  } 
                } 
              } 
              paramR.a(str1, arrayOfDouble);
            } catch (Exception exception) {
              b("Failed to set value for " + str1 + " " + paramString + " value is not valid for current configuration: " + exception.getMessage());
            } 
          } 
        } 
      } else {
        D.c("An " + paramString + " value was null for " + str1 + "??? This shouldn't happen.");
      } 
    } 
  }
  
  private void b(String paramString) {
    if (!this.f)
      D.b(paramString); 
  }
  
  public ag b(File paramFile) {
    Document document = null;
    try {
      DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      InputSource inputSource = new InputSource();
      inputSource.setCharacterStream(s.a(paramFile));
      document = documentBuilder.parse(inputSource);
      NodeList nodeList = document.getElementsByTagName("*");
      ag ag = new ag();
      ag.a(paramFile);
      for (byte b = 0; b < nodeList.getLength(); b++) {
        Node node = nodeList.item(b);
        if (node.hasAttributes() && node.getNodeName().equals("bibliography")) {
          NamedNodeMap namedNodeMap = node.getAttributes();
          String str = node.getNodeName();
          for (byte b1 = 0; b1 < namedNodeMap.getLength(); b1++) {
            Node node1 = namedNodeMap.item(b1);
            if (node1.getNodeName() != null && node1.getNodeName().equals("tuneComment")) {
              String str1 = node1.getNodeValue();
              ag.a(str1);
            } else if (node1.getNodeName() != null && node1.getNodeName().equals("writeDate")) {
              String str1 = node1.getNodeValue();
              ag.b(str1);
            } 
          } 
        } else if (node.hasAttributes() && node.getNodeName().equals("versionInfo")) {
          NamedNodeMap namedNodeMap = node.getAttributes();
          String str = node.getNodeName();
          for (byte b1 = 0; b1 < namedNodeMap.getLength(); b1++) {
            Node node1 = namedNodeMap.item(b1);
            if (node1.getNodeName() != null && node1.getNodeName().equals("signature")) {
              String str1 = node1.getNodeValue();
              ag.c(str1);
            } else if (node1.getNodeName() != null && node1.getNodeName().equals("firmwareInfo")) {
              String str1 = node1.getNodeValue();
              if (str1 != null && !str1.isEmpty())
                str1 = URLDecoder.decode(str1, "UTF-8"); 
              ag.e(str1);
            } 
          } 
        } 
      } 
      return ag;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new g("Error loading " + paramFile + ": " + exception.getMessage(), exception);
    } 
  }
  
  private String c(String paramString) {
    if (paramString.indexOf("\n") != -1) {
      String[] arrayOfString = X.c(paramString, "\n");
      String str = "";
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (arrayOfString[b].length() > 0) {
          double d1 = Double.parseDouble(arrayOfString[b]);
          str = str + (d1 * 9.0D / 5.0D + 32.0D) + " ";
        } 
        if (b < arrayOfString.length - 1)
          str = str + "\n"; 
      } 
      return str;
    } 
    double d = Double.parseDouble(paramString);
    return "" + (d * 9.0D / 5.0D + 32.0D);
  }
  
  private String d(String paramString) {
    if (paramString.indexOf("\n") != -1) {
      String[] arrayOfString = X.c(paramString, "\n");
      String str = "";
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (arrayOfString[b].length() > 0) {
          double d1 = Double.parseDouble(arrayOfString[b]);
          str = str + ((d1 - 32.0D) * 5.0D / 9.0D) + " ";
        } 
        if (b < arrayOfString.length - 1)
          str = str + "\n"; 
      } 
      return str;
    } 
    double d = Double.parseDouble(paramString);
    return "" + ((d - 32.0D) * 5.0D / 9.0D);
  }
  
  private String e(String paramString) {
    if (paramString.indexOf("\n") != -1 || paramString.indexOf(" ") != -1) {
      String[] arrayOfString = X.c(paramString, "\n");
      String str = "";
      for (byte b = 0; b < arrayOfString.length; b++) {
        String[] arrayOfString1 = X.c(arrayOfString[b], " ");
        for (byte b1 = 0; arrayOfString1.length > b1; b1++) {
          String str1 = arrayOfString1[b1];
          double d1 = Double.parseDouble(str1);
          str = str + (d1 / 14.7D) + " ";
        } 
        if (b < arrayOfString.length - 1)
          str = str + "\n"; 
      } 
      return str;
    } 
    double d = Double.parseDouble(paramString);
    return "" + (d / 14.7D);
  }
  
  private String f(String paramString) {
    if (paramString.indexOf("\n") != -1 || paramString.indexOf(" ") != -1) {
      String[] arrayOfString = X.c(paramString, "\n");
      String str = "";
      for (byte b = 0; b < arrayOfString.length; b++) {
        String[] arrayOfString1 = X.c(arrayOfString[b], " ");
        for (byte b1 = 0; arrayOfString1.length > b1; b1++) {
          String str1 = arrayOfString1[b1];
          double d1 = Double.parseDouble(str1);
          str = str + (d1 * 14.7D) + " ";
        } 
        if (b < arrayOfString.length - 1)
          str = str + "\n"; 
      } 
      return str;
    } 
    double d = Double.parseDouble(paramString);
    return "" + (d * 14.7D);
  }
  
  public String[] c(File paramFile) {
    Document document = null;
    try {
      ArrayList<String> arrayList = new ArrayList();
      DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      document = documentBuilder.parse(paramFile);
      NodeList nodeList = document.getElementsByTagName("*");
      for (byte b = 0; b < nodeList.getLength(); b++) {
        Node node = nodeList.item(b);
        if (node.hasAttributes() && node.getNodeName().equals("setting"))
          try {
            NamedNodeMap namedNodeMap = node.getAttributes();
            String str = namedNodeMap.getNamedItem("name").getNodeValue();
            arrayList.add(str);
          } catch (Exception exception) {
            b("Could not get setting from node:" + node.toString());
          }  
      } 
      String[] arrayOfString = new String[arrayList.size()];
      return arrayList.<String>toArray(arrayOfString);
    } catch (Exception exception) {
      throw new g("Error retrieving settings from " + paramFile + ": " + exception.getMessage(), exception);
    } 
  }
  
  public void a(File paramFile, String paramString) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(paramFile), "ISO-8859-1"));
    StringBuilder stringBuilder = new StringBuilder();
    String str = null;
    for (str = bufferedReader.readLine(); str != null && !str.contains("<page>"); str = bufferedReader.readLine())
      stringBuilder.append(str).append("\n"); 
    stringBuilder.append(paramString);
    do {
      str = bufferedReader.readLine();
    } while (str != null && !str.contains("</page>"));
    while (true) {
      str = bufferedReader.readLine();
      if (str != null)
        stringBuilder.append(str).append("\n"); 
      if (str == null) {
        bufferedReader.close();
        paramFile.delete();
        ByteBuffer byteBuffer = Charset.forName("ISO-8859-1").encode(stringBuilder.toString());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(paramFile));
        bufferedOutputStream.write(byteBuffer.array());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        return;
      } 
    } 
  }
  
  public String d(File paramFile) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(paramFile), "ISO-8859-1"));
    StringBuilder stringBuilder = new StringBuilder();
    String str = null;
    do {
      str = bufferedReader.readLine();
    } while (str != null && !str.contains("<page>"));
    stringBuilder.append(str).append("\n");
    do {
      str = bufferedReader.readLine();
      stringBuilder.append(str).append("\n");
    } while (str != null && !str.contains("</page>"));
    bufferedReader.close();
    return stringBuilder.toString();
  }
  
  private boolean a(String paramString1, String paramString2) {
    return ((paramString1 == null || paramString1.equals("")) && (paramString2 == null || paramString2.equals(""))) ? true : ((paramString1 == null) ? false : ((paramString2 == null) ? false : paramString1.equals(paramString2)));
  }
  
  public void a(R paramR, String paramString, A paramA) {
    a(paramR, paramString, paramA, null);
  }
  
  public void a(R paramR, String paramString, A paramA, List paramList) {
    bH.aa aa1 = new bH.aa();
    aa1.a();
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    try {
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.newDocument();
      Element element1 = document.createElement(c);
      element1.setAttribute("xmlns", b);
      document.appendChild(element1);
      Element element2 = document.createElement("bibliography");
      element2.setAttribute("author", paramA.a() + " " + paramA.b() + " - EFI Analytics, Inc.");
      element2.setAttribute("writeDate", (new Date()).toString());
      element2.setAttribute("tuneComment", paramR.Q());
      element1.appendChild(element2);
      Element element3 = document.createElement("versionInfo");
      element3.setAttribute("fileFormat", "5.0");
      element3.setAttribute("nPages", "" + paramR.p().e());
      element3.setAttribute("signature", paramR.i());
      String str = (paramR.P() != null) ? paramR.P() : "";
      if (str.isEmpty() && paramR.Z() != null)
        str = paramR.Z(); 
      try {
        if (str.length() == 2) {
          String str1 = Integer.toHexString(str.charAt(0)) + Integer.toHexString(str.charAt(1));
          str = str1.toUpperCase();
        } else {
          str = X.h(str);
          str = URLEncoder.encode(str, "UTF-8");
        } 
      } catch (Exception exception) {
        Logger.getLogger(aa.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
      element3.setAttribute("firmwareInfo", str);
      element1.appendChild(element3);
      int i = paramR.p().e();
      for (byte b = -1; b < i; b++) {
        Element element = document.createElement("page");
        if (b >= 0) {
          element.setAttribute("number", "" + b);
          element.setAttribute("size", "" + (paramR.p().b(b)).length);
        } 
        ArrayList<aM> arrayList = new ArrayList();
        null = paramR.a(b);
        while (null.hasNext())
          arrayList.add(null.next()); 
        for (aM aM : arrayList) {
          if (aM.n(paramR.p()) && (paramList == null || paramList.contains(aM.aL()))) {
            Element element6 = (b < 0) ? document.createElement("pcVariable") : document.createElement("constant");
            element6.setAttribute("name", aM.aL());
            if (aM.i().equals("bits")) {
              element6.setTextContent(aM.f(paramR.p()));
            } else if (aM.i().equals("string")) {
              element6.setTextContent(aM.d(paramR.p()));
            } else if (aM.i().equals("scalar") || aM.i().equals(ca.e) || aM.i().equals(ca.d)) {
              if (aM.p() != null && !aM.p().equals(""))
                element6.setAttribute("units", aM.p()); 
              if (!aM.i().equals("bits"))
                element6.setAttribute("digits", aM.v() + ""); 
              double d = aM.j(paramR.p());
              if (!aM.I()) {
                d = Math.round(d * 1.0E7D) / 1.0E7D;
                element6.setTextContent(Double.toString(d));
              } else {
                element6.setTextContent(Float.toString((float)d));
              } 
            } else if (aM.i().equals("array")) {
              String[][] arrayOfString = new String[aM.a()][aM.m()];
              if (aM.p() != null && !aM.p().equals(""))
                element6.setAttribute("units", aM.p()); 
              if (!aM.i().equals("bits"))
                element6.setAttribute("digits", aM.v() + ""); 
              if (aM.b() > 1)
                element6.setAttribute("rows", "" + aM.c().b()); 
              if (aM.c().b() > 1)
                element6.setAttribute("cols", "" + aM.c().a()); 
              double[][] arrayOfDouble = aM.i(paramR.p());
              for (byte b1 = 0; b1 < arrayOfDouble.length; b1++) {
                for (byte b2 = 0; b2 < (arrayOfDouble[0]).length; b2++) {
                  byte b3;
                  byte b4;
                  if (aM.L()) {
                    b3 = arrayOfDouble.length - b1 - 1;
                    b4 = (arrayOfDouble[0]).length - b2 - 1;
                  } else {
                    b3 = b1;
                    b4 = b2;
                  } 
                  double d = arrayOfDouble[b1][b2];
                  if (!aM.I()) {
                    d = Math.round(d * 1.0E7D) / 1.0E7D;
                    arrayOfString[b3][b4] = "" + d;
                  } else {
                    arrayOfString[b3][b4] = "" + (float)d;
                  } 
                } 
              } 
              String str1 = a(arrayOfString);
              element6.setTextContent(str1);
            } 
            element.appendChild(element6);
          } 
        } 
        element1.appendChild(element);
      } 
      Element element4 = document.createElement("settings");
      element4.setAttribute("Comment", "These setting are only used if this msq is opened without a project.");
      for (r r : paramR.m().values()) {
        Element element = document.createElement("setting");
        element.setAttribute("name", r.aL());
        element.setAttribute("value", r.aL());
        element4.appendChild(element);
      } 
      element1.appendChild(element4);
      Element element5 = document.createElement("userComments");
      element5.setAttribute("Comment", "These are user comments that can be related to a particular setting or dialog.");
      Iterator<String> iterator = paramR.E();
      while (iterator.hasNext()) {
        String str1 = iterator.next();
        if (paramList == null || paramList.contains(str1)) {
          String str2 = paramR.o(str1);
          Element element = document.createElement("userComment");
          element.setAttribute("name", str1);
          element.setAttribute("value", str2);
          element5.appendChild(element);
        } 
      } 
      element1.appendChild(element5);
      try {
        a(paramString, document);
      } catch (Exception exception) {
        try {
          Thread.sleep(100L);
        } catch (Exception exception1) {}
        a(paramString, document);
        D.d("Saved on retry.");
      } 
    } catch (ParserConfigurationException parserConfigurationException) {
      parserConfigurationException.printStackTrace();
      throw new g("Invalid XML parser option. \n" + parserConfigurationException.getMessage(), parserConfigurationException);
    } 
    D.d("Time to save msq: " + aa1.d());
  }
  
  public void b(R paramR, String paramString, A paramA) {
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    try {
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.newDocument();
      Element element1 = document.createElement(c);
      element1.setAttribute("xmlns", b);
      document.appendChild(element1);
      Element element2 = document.createElement("bibliography");
      element2.setAttribute("author", paramA.a() + " " + paramA.b() + " - EFI Analytics, Inc.");
      element2.setAttribute("writeDate", (new Date()).toString());
      element1.appendChild(element2);
      Element element3 = document.createElement("versionInfo");
      element3.setAttribute("fileFormat", "4.0");
      element3.setAttribute("signature", paramR.i());
      String str = "";
      try {
        if (str.length() == 2) {
          String str1 = Integer.toHexString(str.charAt(0)) + Integer.toHexString(str.charAt(1));
          str = str1.toUpperCase();
        } else if (paramR.P() != null) {
          str = URLEncoder.encode(paramR.P(), "UTF-8");
        } 
      } catch (Exception exception) {
        Logger.getLogger(aa.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
      element3.setAttribute("firmwareInfo", str);
      element1.appendChild(element3);
      for (byte b = -1; b < 0; b++) {
        Element element = document.createElement("page");
        element.setAttribute("number", "" + b);
        Iterator<aM> iterator = paramR.a(b);
        while (iterator.hasNext()) {
          aM aM = iterator.next();
          if (aM.n(paramR.p())) {
            Element element4 = document.createElement("constant");
            element4.setAttribute("name", aM.aL());
            if (!aM.i().equals("string") && aM.p() != null && !aM.p().equals(""))
              element4.setAttribute("units", aM.p()); 
            if (!aM.i().equals("string") && !aM.i().equals("bits"))
              element4.setAttribute("digits", aM.v() + ""); 
            if (!aM.i().equals("string") && aM.b() > 1)
              element4.setAttribute("rows", "" + aM.c().b()); 
            if (!aM.i().equals("string") && aM.c().b() > 1)
              element4.setAttribute("cols", "" + aM.c().a()); 
            if (aM.i().equals("bits")) {
              element4.setTextContent(aM.f(paramR.p()));
            } else if (aM.i().equals("string")) {
              element4.setTextContent(aM.d(paramR.p()));
            } else if (aM.i().equals("scalar") || aM.i().equals(ca.e) || aM.i().equals(ca.d)) {
              double d = aM.j(paramR.p());
              d = Math.round(d * 1.0E7D) / 1.0E7D;
              element4.setTextContent(d + "");
            } else if (aM.i().equals("array")) {
              String[][] arrayOfString = new String[aM.a()][aM.m()];
              double[][] arrayOfDouble = aM.i(paramR.p());
              for (byte b1 = 0; b1 < arrayOfDouble.length; b1++) {
                for (byte b2 = 0; b2 < (arrayOfDouble[0]).length; b2++) {
                  double d = arrayOfDouble[b1][b2];
                  d = Math.round(d * 1.0E7D) / 1.0E7D;
                  arrayOfString[b1][b2] = "" + d;
                } 
              } 
              String str1 = a(arrayOfString);
              element4.setTextContent(str1);
            } 
            element.appendChild(element4);
          } 
        } 
        element1.appendChild(element);
      } 
      a(paramString, document);
    } catch (ParserConfigurationException parserConfigurationException) {
      parserConfigurationException.printStackTrace();
      throw new g("Invalid XML parser option. \n" + parserConfigurationException.getMessage(), parserConfigurationException);
    } 
  }
  
  private String a(String[][] paramArrayOfString) {
    return X.a(paramArrayOfString);
  }
  
  private void a(String paramString, Document paramDocument) {
    y y;
    FileOutputStream fileOutputStream = null;
    try {
      File file = new File(paramString);
      if (!file.exists()) {
        D.c("File does not exist, creating new:\n" + paramString);
        file.createNewFile();
      } 
      fileOutputStream = new FileOutputStream(paramString);
      if (d) {
        y y1 = new y(fileOutputStream);
        y1.a("SiJ6!EK&JC%@");
        y = y1;
      } 
      DOMSource dOMSource = new DOMSource(paramDocument);
      StreamResult streamResult = new StreamResult(y);
      String str = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n";
      y.write(str.getBytes());
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      transformer.setOutputProperty("omit-xml-declaration", "yes");
      transformer.setOutputProperty("encoding", "ISO-8859-1");
      transformer.setOutputProperty("indent", "yes");
      transformer.transform(dOMSource, streamResult);
      y.close();
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new g("Error Saving MSQ. Check Log file for details.");
    } finally {
      if (y != null)
        try {
          y.close();
        } catch (Exception exception) {} 
    } 
  }
  
  private boolean g(String paramString) {
    return (paramString.equals("KPaTarg60") || paramString.equals("KPaTarg40") || paramString.equals("KPaTarg10") || paramString.equals("KPaTarg100") || paramString.equals("ipwmTable"));
  }
  
  public List a() {
    return this.e;
  }
  
  public void a(boolean paramBoolean) {
    this.f = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */