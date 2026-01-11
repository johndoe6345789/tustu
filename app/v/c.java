package v;

import V.a;
import bH.D;
import bH.X;
import bH.aa;
import bH.t;
import bI.d;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.SingleChannelDashComponent;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.ac;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.apps.ts.dashboard.x;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import r.a;
import r.j;

public class c extends e {
  File a;
  
  File b;
  
  private static boolean c = false;
  
  public c(File paramFile) {
    this.a = paramFile;
    this.b = j.F();
  }
  
  public void a(String paramString, Z paramZ) {
    aa aa = new aa();
    aa.a();
    File file = new File(paramString);
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    long l = System.currentTimeMillis();
    try {
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.newDocument();
      Element element1 = document.createElement("dsh");
      element1.setAttribute("xmlns", "http://www.EFIAnalytics.com/:dsh");
      document.appendChild(element1);
      Element element2 = document.createElement("bibliography");
      element2.setAttribute("author", a.b + " " + a.a + " - EFI Analytics - support@efianalytics.com");
      element2.setAttribute("company", "EFI Analytics, © 2007 - " + Calendar.getInstance().get(1) + ", All Rights Reserved.");
      element2.setAttribute("writeDate", (new Date()).toString());
      element1.appendChild(element2);
      Element element3 = document.createElement("versionInfo");
      element3.setAttribute("fileFormat", "3.0");
      element3.setAttribute("firmwareSignature", paramZ.d());
      element1.appendChild(element3);
      Element element4 = document.createElement("gaugeCluster");
      element4.setAttribute("clusterBackgroundColor", "" + paramZ.a().getRGB());
      element4.setAttribute("backgroundDitherColor", "" + ((paramZ.g() != null) ? (String)Integer.valueOf(paramZ.g().getRGB()) : ""));
      if (paramZ.b() == null || paramZ.b().equals("")) {
        element4.setAttribute("clusterBackgroundImageFileName", "");
      } else {
        a(document, element4, "mainDashBackgroundImage", new File(paramZ.b()));
        element4.setAttribute("clusterBackgroundImageFileName", "mainDashBackgroundImage");
      } 
      element4.setAttribute("clusterBackgroundImageStyle", "" + paramZ.e());
      element4.setAttribute("antiAliasing", Boolean.toString(paramZ.f()));
      element4.setAttribute("forceAspect", Boolean.toString(paramZ.h()));
      element4.setAttribute("forceAspectWidth", Double.toString(paramZ.i()));
      element4.setAttribute("forceAspectHeight", Double.toString(paramZ.j()));
      Component[] arrayOfComponent = paramZ.c();
      HashMap hashMap = b.a(arrayOfComponent);
      for (String str1 : hashMap.keySet()) {
        File file1 = new File(str1);
        String str2 = (String)hashMap.get(str1);
        a(document, element4, str2, file1);
      } 
      for (byte b = 0; b < arrayOfComponent.length; b++) {
        if (arrayOfComponent[b] instanceof s) {
          s s = (s)arrayOfComponent[b];
          synchronized (s) {
            a(document, element4, s);
          } 
        } 
      } 
      element1.appendChild(element4);
      a(paramString, document);
      b.a(hashMap, arrayOfComponent);
      D.d("Time to load non-cached dashboard: " + aa.d() + " ms. file:" + file.getName());
    } catch (a a) {
      throw a;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error Saving Dashboard. Check Log file for details.");
    } 
    a(file, paramZ);
  }
  
  private void a(File paramFile, Z paramZ) {
    if (c) {
      aa aa = new aa();
      aa.a();
      synchronized (paramZ) {
        try {
          String str = t.c(paramFile);
          D.c("Time to get file checksum: " + aa.d());
          ac ac = null;
          for (Component component : paramZ.c()) {
            if (component instanceof s) {
              s s = (s)component;
              s.invalidatePainter();
              if (ac == null && s.myGaugeContainer() != null)
                ac = s.myGaugeContainer(); 
              s.myGaugeContainer(null);
            } 
          } 
          aa.a();
          X.c.a().a(paramZ, str, paramFile.getParentFile());
          for (Component component : paramZ.c()) {
            if (component instanceof s) {
              s s = (s)component;
              s.myGaugeContainer(ac);
            } 
          } 
        } catch (IOException iOException) {
          Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, iOException);
        } 
        D.c("Time to save cache file: " + aa.d() + "ms, file: " + paramFile.getName());
      } 
    } 
  }
  
  public void a(String paramString, ArrayList paramArrayList) {
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    try {
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.newDocument();
      Element element1 = document.createElement("gauge");
      element1.setAttribute("xmlns", "http://www.EFIAnalytics.com/:gauge");
      document.appendChild(element1);
      Element element2 = document.createElement("bibliography");
      element2.setAttribute("author", a.b + " " + a.a + " - Phil Tobin - p_tobin@yahoo.com");
      element2.setAttribute("company", "EFI Analytics, © 2007 - 2015, All Rights Reserved.");
      element2.setAttribute("writeDate", (new Date()).toString());
      element1.appendChild(element2);
      Element element3 = document.createElement("versionInfo");
      element3.setAttribute("fileFormat", "1.0");
      element1.appendChild(element3);
      s[] arrayOfS = (s[])paramArrayList.toArray((Object[])new s[paramArrayList.size()]);
      HashMap hashMap = b.a((Component[])arrayOfS);
      for (String str1 : hashMap.keySet()) {
        File file = new File(str1);
        String str2 = (String)hashMap.get(str1);
        a(document, element1, str2, file);
      } 
      for (s s : paramArrayList) {
        Element element = document.createElement("gauge");
        a(document, element, s);
        element1.appendChild(element);
      } 
      a(paramString, document);
      b.a(hashMap, (Component[])arrayOfS);
    } catch (a a) {
      throw a;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error Saving Dashboard. Check Log file for details.");
    } 
  }
  
  public Document a(Document paramDocument, Element paramElement, s params) {
    try {
      Element element = paramDocument.createElement("dashComp");
      element = a(paramDocument, element, params);
      paramElement.appendChild(element);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error Saving DashboardComponent. Check Log file for details.");
    } 
    return paramDocument;
  }
  
  private Z a(File paramFile) {
    if (c) {
      aa aa = new aa();
      aa.a();
      try {
        String str = t.c(paramFile);
        Z z = (Z)X.c.a().a(str, paramFile.getParentFile());
        for (Component component : z.c()) {
          if (component instanceof Gauge)
            ((Gauge)component).initializeExpressionMonitors(); 
        } 
        return z;
      } catch (Exception exception) {
        D.d("Did not load cached dash: " + exception.getMessage());
        return null;
      } finally {
        D.d("Time to check / load cached dash: " + aa.d() + ", file: " + paramFile.getName());
      } 
    } 
    return null;
  }
  
  public Z a(String paramString) {
    File file = new File(paramString);
    Z z = a(file);
    if (z != null)
      return z; 
    z = new Z();
    ArrayList<s> arrayList = new ArrayList();
    Document document = null;
    aa aa = new aa();
    aa.a();
    try {
      DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      document = documentBuilder.parse(file);
      NodeList nodeList = document.getElementsByTagName("*");
      HashMap<Object, Object> hashMap = new HashMap<>();
      for (byte b1 = 0; b1 < nodeList.getLength(); b1++) {
        Node node = nodeList.item(b1);
        if (node.hasAttributes() && node.getNodeName().equals("gaugeCluster")) {
          NamedNodeMap namedNodeMap = node.getAttributes();
          String str = node.getNodeName();
          for (byte b = 0; b < namedNodeMap.getLength(); b++) {
            Node node1 = namedNodeMap.item(b);
            if (node1.getNodeName() != null && node1.getNodeName().equals("clusterBackgroundColor")) {
              z.a(e(node1.getNodeValue()));
            } else if (node1.getNodeName() != null && node1.getNodeName().equals("backgroundDitherColor")) {
              String str1 = node1.getNodeValue();
              if (str1 != null && !str1.equals(""))
                z.b(e(str1)); 
            } else if (node1.getNodeName() != null && node1.getNodeName().equals("clusterBackgroundImageFileName")) {
              z.a(node1.getNodeValue());
            } else if (node1.getNodeName() != null && node1.getNodeName().equals("clusterBackgroundImageStyle")) {
              z.c(node1.getNodeValue());
            } else if (node1.getNodeName() != null && node1.getNodeName().equals("antiAliasing")) {
              z.a(node1.getNodeValue().equals("true"));
            } else if (node1.getNodeName() != null && node1.getNodeName().equals("forceAspect")) {
              z.b(node1.getNodeValue().equals("true"));
            } else if (node1.getNodeName() != null && node1.getNodeName().equals("forceAspectWidth")) {
              z.a(Double.parseDouble(node1.getNodeValue()));
            } else if (node1.getNodeName() != null && node1.getNodeName().equals("forceAspectHeight")) {
              z.b(Double.parseDouble(node1.getNodeValue()));
            } 
          } 
        } 
        if (node.hasAttributes() && node.getNodeName().equals("versionInfo")) {
          NamedNodeMap namedNodeMap = node.getAttributes();
          String str = node.getNodeName();
          for (byte b = 0; b < namedNodeMap.getLength(); b++) {
            Node node1 = namedNodeMap.item(b);
            if (node1.getNodeName() != null && node1.getNodeName().equals("firmwareSignature"))
              z.b(node1.getNodeValue()); 
            if (node1.getNodeName() != null && node1.getNodeName().equals("fileFormat"))
              try {
                double d = Double.parseDouble(node1.getNodeValue());
                if (d > 3.0D) {
                  a a = new a("The format version of Dash file: " + d + " is higher than \nthe maximum supported by this version application: " + 3.0D + "\nWill continue loading, but there may be issues.\nFile name:\n" + paramString);
                  D.a("Unsupported Dash File Version.", (Exception)a, null);
                } 
              } catch (Exception exception) {
                D.a(exception);
                D.a("Error parsing .dash format version: " + node1.getNodeValue());
              }  
          } 
        } 
        if (node.getNodeName().equals("imageFile"))
          try {
            d d = c(node);
            hashMap.put(d.a, d.b.getAbsolutePath());
          } catch (IOException iOException) {
            D.a("Failed to load Dashboard Image. ", iOException, null);
          }  
        if (node.getNodeName().equals("dashComp"))
          try {
            s s = b(node);
            if (s instanceof SingleChannelDashComponent) {
              SingleChannelDashComponent singleChannelDashComponent = (SingleChannelDashComponent)s;
              String str = d(singleChannelDashComponent.getOutputChannel());
              singleChannelDashComponent.setOutputChannel(str);
            } 
            arrayList.add(s);
          } catch (Exception exception) {
            D.b("Failed to load Gauge:" + node.toString());
          }  
      } 
      Component[] arrayOfComponent = new Component[arrayList.size()];
      byte b2 = 0;
      Iterator<s> iterator = arrayList.iterator();
      while (iterator.hasNext())
        arrayOfComponent[b2++] = (Component)iterator.next(); 
      arrayOfComponent = b.b(hashMap, arrayOfComponent);
      if (z.b() != null && !z.b().equals("")) {
        String str1 = z.b();
        String str2 = (String)hashMap.get(str1);
        z.a(str2);
      } 
      z.a(arrayOfComponent);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Failed to load Gauge Cluster " + exception.getMessage(), exception);
    } finally {
      D.d("Time to load uncached dash: " + aa.d() + "ms, file: " + file.getName());
    } 
    a(file, z);
    return z;
  }
  
  public ArrayList b(String paramString) {
    BufferedInputStream bufferedInputStream = null;
    try {
      File file = new File(paramString);
      bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
      return a(bufferedInputStream);
    } catch (FileNotFoundException fileNotFoundException) {
      throw new a("File Not Found:\n" + paramString);
    } finally {
      try {
        if (bufferedInputStream != null)
          bufferedInputStream.close(); 
      } catch (IOException iOException) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, iOException);
      } 
    } 
  }
  
  public ArrayList a(InputStream paramInputStream) {
    Document document = null;
    ArrayList<s> arrayList = new ArrayList();
    try {
      DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      document = documentBuilder.parse(paramInputStream);
      NodeList nodeList = document.getElementsByTagName("*");
      String str = "";
      HashMap<Object, Object> hashMap = new HashMap<>();
      for (byte b1 = 0; b1 < nodeList.getLength(); b1++) {
        Node node = nodeList.item(b1);
        if (node.getNodeName().equals("imageFile"))
          try {
            d d = c(node);
            hashMap.put(d.a, d.b.getAbsolutePath());
          } catch (IOException iOException) {
            D.a("Failed to load Dashboard Image. ", iOException, null);
          }  
        if (node.getNodeName().equals("dashComp"))
          try {
            s s = b(node);
            if (s instanceof SingleChannelDashComponent) {
              SingleChannelDashComponent singleChannelDashComponent = (SingleChannelDashComponent)s;
              String str1 = d(singleChannelDashComponent.getOutputChannel());
              singleChannelDashComponent.setOutputChannel(str1);
            } 
            arrayList.add(s);
          } catch (Exception exception) {
            D.b("Failed to load Gauge:" + node.toString());
          }  
      } 
      Component[] arrayOfComponent = new Component[arrayList.size()];
      byte b2 = 0;
      Iterator<s> iterator = arrayList.iterator();
      while (iterator.hasNext())
        arrayOfComponent[b2++] = (Component)iterator.next(); 
      b.b(hashMap, arrayOfComponent);
      if (arrayList.size() > 0)
        return arrayList; 
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Failed to load Gauge Cluster " + exception.getMessage(), exception);
    } 
    return null;
  }
  
  private s b(Node paramNode) {
    return (s)a(paramNode);
  }
  
  private String d(String paramString) {
    return X.e(paramString);
  }
  
  private Color e(String paramString) {
    try {
      int i = Integer.parseInt(paramString);
      return new Color(i);
    } catch (Exception exception) {
      D.b("Error loading Color, intVal=" + paramString + ", lightGray returned.");
      return Color.lightGray;
    } 
  }
  
  private Document a(Document paramDocument, Element paramElement, String paramString, File paramFile) {
    try {
      if (paramFile != null && paramFile.exists()) {
        String str = paramFile.getName().substring(paramFile.getName().lastIndexOf(".") + 1);
        Element element = paramDocument.createElement("imageFile");
        element.setAttribute("type", str);
        element.setAttribute("imageId", paramString);
        element.setAttribute("fileName", paramFile.getName());
        element.setTextContent(d.a(paramFile));
        paramElement.appendChild(element);
      } else {
        D.b("Image not found for Image ID: " + paramString + ", looking in: " + paramFile.getAbsolutePath());
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error Saving Dashboard Image. Check Log file for details.");
    } 
    return paramDocument;
  }
  
  private d c(Node paramNode) {
    File file;
    String str1 = a(paramNode, "type");
    String str2 = a(paramNode, "fileName");
    String str3 = a(paramNode, "imageId");
    if (f(str1)) {
      file = new File(this.b, str2);
    } else {
      file = new File(this.a, str2);
    } 
    d.a(paramNode.getTextContent(), file);
    return new d(this, str3, file);
  }
  
  private boolean f(String paramString) {
    return paramString.toLowerCase().startsWith("ttf");
  }
  
  public static void a(boolean paramBoolean) {
    c = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/v/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */