package v;

import V.ExceptionInVPackage;
import bH.D;
import bH.X;
import bH.aa;
import bH.t;
import bI.BiInterfaceDelta;
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
import r.ExceptionInVPackage;
import r.ThreadedFile;

public class IOInVPackage extends e {
  File ExceptionInVPackage;

  File b;

  private static boolean c = false;

  public IOInVPackage(File paramFile) {
    this.ExceptionInVPackage = paramFile;
    this.b = ThreadedFile.F();
  }

  public void ExceptionInVPackage(String paramString, Z paramZ) {
    aa aa = new aa();
    aa.ExceptionInVPackage();
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
      element2.setAttribute(
          "author",
          ExceptionInVPackage.b
              + " "
              + ExceptionInVPackage.ExceptionInVPackage
              + " - EFI Analytics - support@efianalytics.com");
      element2.setAttribute(
          "company",
          "EFI Analytics, © 2007 - " + Calendar.getInstance().get(1) + ", All Rights Reserved.");
      element2.setAttribute("writeDate", (new Date()).toString());
      element1.appendChild(element2);
      Element element3 = document.createElement("versionInfo");
      element3.setAttribute("fileFormat", "3.0");
      element3.setAttribute("firmwareSignature", paramZ.BiInterfaceDelta());
      element1.appendChild(element3);
      Element element4 = document.createElement("gaugeCluster");
      element4.setAttribute("clusterBackgroundColor", "" + paramZ.ExceptionInVPackage().getRGB());
      element4.setAttribute(
          "backgroundDitherColor",
          "" + ((paramZ.g() != null) ? (String) Integer.valueOf(paramZ.g().getRGB()) : ""));
      if (paramZ.b() == null || paramZ.b().equals("")) {
        element4.setAttribute("clusterBackgroundImageFileName", "");
      } else {
        ExceptionInVPackage(document, element4, "mainDashBackgroundImage", new File(paramZ.b()));
        element4.setAttribute("clusterBackgroundImageFileName", "mainDashBackgroundImage");
      }
      element4.setAttribute("clusterBackgroundImageStyle", "" + paramZ.e());
      element4.setAttribute("antiAliasing", Boolean.toString(paramZ.f()));
      element4.setAttribute("forceAspect", Boolean.toString(paramZ.h()));
      element4.setAttribute("forceAspectWidth", Double.toString(paramZ.i()));
      element4.setAttribute("forceAspectHeight", Double.toString(paramZ.ThreadedFile()));
      Component[] arrayOfComponent = paramZ.c();
      HashMap hashMap = b.ExceptionInVPackage(arrayOfComponent);
      for (String str1 : hashMap.keySet()) {
        File file1 = new File(str1);
        String str2 = (String) hashMap.get(str1);
        ExceptionInVPackage(document, element4, str2, file1);
      }
      for (byte b = 0; b < arrayOfComponent.length; b++) {
        if (arrayOfComponent[b] instanceof s) {
          s s = (s) arrayOfComponent[b];
          synchronized (s) {
            ExceptionInVPackage(document, element4, s);
          }
        }
      }
      element1.appendChild(element4);
      ExceptionInVPackage(paramString, document);
      b.ExceptionInVPackage(hashMap, arrayOfComponent);
      D.BiInterfaceDelta(
          "Time to load non-cached dashboard: "
              + aa.BiInterfaceDelta()
              + " ms. file:"
              + file.getName());
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      throw ExceptionInVPackage;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Error Saving Dashboard. Check Log file for details.");
    }
    ExceptionInVPackage(file, paramZ);
  }

  private void ExceptionInVPackage(File paramFile, Z paramZ) {
    if (c) {
      aa aa = new aa();
      aa.ExceptionInVPackage();
      synchronized (paramZ) {
        try {
          String str = t.c(paramFile);
          D.c("Time to get file checksum: " + aa.BiInterfaceDelta());
          ac ac = null;
          for (Component component : paramZ.c()) {
            if (component instanceof s) {
              s s = (s) component;
              s.invalidatePainter();
              if (ac == null && s.myGaugeContainer() != null) ac = s.myGaugeContainer();
              s.myGaugeContainer(null);
            }
          }
          aa.ExceptionInVPackage();
          X.c.ExceptionInVPackage().ExceptionInVPackage(paramZ, str, paramFile.getParentFile());
          for (Component component : paramZ.c()) {
            if (component instanceof s) {
              s s = (s) component;
              s.myGaugeContainer(ac);
            }
          }
        } catch (IOException iOException) {
          Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String) null, iOException);
        }
        D.c(
            "Time to save cache file: "
                + aa.BiInterfaceDelta()
                + "ms, file: "
                + paramFile.getName());
      }
    }
  }

  public void ExceptionInVPackage(String paramString, ArrayList paramArrayList) {
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    try {
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.newDocument();
      Element element1 = document.createElement("gauge");
      element1.setAttribute("xmlns", "http://www.EFIAnalytics.com/:gauge");
      document.appendChild(element1);
      Element element2 = document.createElement("bibliography");
      element2.setAttribute(
          "author",
          ExceptionInVPackage.b
              + " "
              + ExceptionInVPackage.ExceptionInVPackage
              + " - Phil Tobin - p_tobin@yahoo.com");
      element2.setAttribute("company", "EFI Analytics, © 2007 - 2015, All Rights Reserved.");
      element2.setAttribute("writeDate", (new Date()).toString());
      element1.appendChild(element2);
      Element element3 = document.createElement("versionInfo");
      element3.setAttribute("fileFormat", "1.0");
      element1.appendChild(element3);
      s[] arrayOfS = (s[]) paramArrayList.toArray((Object[]) new s[paramArrayList.size()]);
      HashMap hashMap = b.ExceptionInVPackage((Component[]) arrayOfS);
      for (String str1 : hashMap.keySet()) {
        File file = new File(str1);
        String str2 = (String) hashMap.get(str1);
        ExceptionInVPackage(document, element1, str2, file);
      }
      for (s s : paramArrayList) {
        Element element = document.createElement("gauge");
        ExceptionInVPackage(document, element, s);
        element1.appendChild(element);
      }
      ExceptionInVPackage(paramString, document);
      b.ExceptionInVPackage(hashMap, (Component[]) arrayOfS);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      throw ExceptionInVPackage;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Error Saving Dashboard. Check Log file for details.");
    }
  }

  public Document ExceptionInVPackage(Document paramDocument, Element paramElement, s params) {
    try {
      Element element = paramDocument.createElement("dashComp");
      element = ExceptionInVPackage(paramDocument, element, params);
      paramElement.appendChild(element);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Error Saving DashboardComponent. Check Log file for details.");
    }
    return paramDocument;
  }

  private Z ExceptionInVPackage(File paramFile) {
    if (c) {
      aa aa = new aa();
      aa.ExceptionInVPackage();
      try {
        String str = t.c(paramFile);
        Z z = (Z) X.c.ExceptionInVPackage().ExceptionInVPackage(str, paramFile.getParentFile());
        for (Component component : z.c()) {
          if (component instanceof Gauge) ((Gauge) component).initializeExpressionMonitors();
        }
        return z;
      } catch (Exception exception) {
        D.BiInterfaceDelta("Did not load cached dash: " + exception.getMessage());
        return null;
      } finally {
        D.BiInterfaceDelta(
            "Time to check / load cached dash: "
                + aa.BiInterfaceDelta()
                + ", file: "
                + paramFile.getName());
      }
    }
    return null;
  }

  public Z ExceptionInVPackage(String paramString) {
    File file = new File(paramString);
    Z z = ExceptionInVPackage(file);
    if (z != null) return z;
    z = new Z();
    ArrayList<s> arrayList = new ArrayList();
    Document document = null;
    aa aa = new aa();
    aa.ExceptionInVPackage();
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
            if (node1.getNodeName() != null
                && node1.getNodeName().equals("clusterBackgroundColor")) {
              z.ExceptionInVPackage(e(node1.getNodeValue()));
            } else if (node1.getNodeName() != null
                && node1.getNodeName().equals("backgroundDitherColor")) {
              String str1 = node1.getNodeValue();
              if (str1 != null && !str1.equals("")) z.b(e(str1));
            } else if (node1.getNodeName() != null
                && node1.getNodeName().equals("clusterBackgroundImageFileName")) {
              z.ExceptionInVPackage(node1.getNodeValue());
            } else if (node1.getNodeName() != null
                && node1.getNodeName().equals("clusterBackgroundImageStyle")) {
              z.c(node1.getNodeValue());
            } else if (node1.getNodeName() != null && node1.getNodeName().equals("antiAliasing")) {
              z.ExceptionInVPackage(node1.getNodeValue().equals("true"));
            } else if (node1.getNodeName() != null && node1.getNodeName().equals("forceAspect")) {
              z.b(node1.getNodeValue().equals("true"));
            } else if (node1.getNodeName() != null
                && node1.getNodeName().equals("forceAspectWidth")) {
              z.ExceptionInVPackage(Double.parseDouble(node1.getNodeValue()));
            } else if (node1.getNodeName() != null
                && node1.getNodeName().equals("forceAspectHeight")) {
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
                double BiInterfaceDelta = Double.parseDouble(node1.getNodeValue());
                if (BiInterfaceDelta > 3.0D) {
                  ExceptionInVPackage ExceptionInVPackage =
                      new ExceptionInVPackage(
                          "The format version of Dash file: "
                              + BiInterfaceDelta
                              + " is higher than \n"
                              + "the maximum supported by this version application: "
                              + 3.0D
                              + "\nWill continue loading, but there may be issues.\nFile name:\n"
                              + paramString);
                  D.ExceptionInVPackage(
                      "Unsupported Dash File Version.", (Exception) ExceptionInVPackage, null);
                }
              } catch (Exception exception) {
                D.ExceptionInVPackage(exception);
                D.ExceptionInVPackage(
                    "Error parsing .dash format version: " + node1.getNodeValue());
              }
          }
        }
        if (node.getNodeName().equals("imageFile"))
          try {
            BiInterfaceDelta BiInterfaceDelta = c(node);
            hashMap.put(BiInterfaceDelta.ExceptionInVPackage, BiInterfaceDelta.b.getAbsolutePath());
          } catch (IOException iOException) {
            D.ExceptionInVPackage("Failed to load Dashboard Image. ", iOException, null);
          }
        if (node.getNodeName().equals("dashComp"))
          try {
            s s = b(node);
            if (s instanceof SingleChannelDashComponent) {
              SingleChannelDashComponent singleChannelDashComponent =
                  (SingleChannelDashComponent) s;
              String str = BiInterfaceDelta(singleChannelDashComponent.getOutputChannel());
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
      while (iterator.hasNext()) arrayOfComponent[b2++] = (Component) iterator.next();
      arrayOfComponent = b.b(hashMap, arrayOfComponent);
      if (z.b() != null && !z.b().equals("")) {
        String str1 = z.b();
        String str2 = (String) hashMap.get(str1);
        z.ExceptionInVPackage(str2);
      }
      z.ExceptionInVPackage(arrayOfComponent);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage(
          "Failed to load Gauge Cluster " + exception.getMessage(), exception);
    } finally {
      D.BiInterfaceDelta(
          "Time to load uncached dash: " + aa.BiInterfaceDelta() + "ms, file: " + file.getName());
    }
    ExceptionInVPackage(file, z);
    return z;
  }

  public ArrayList b(String paramString) {
    BufferedInputStream bufferedInputStream = null;
    try {
      File file = new File(paramString);
      bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
      return ExceptionInVPackage(bufferedInputStream);
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("File Not Found:\n" + paramString);
    } finally {
      try {
        if (bufferedInputStream != null) bufferedInputStream.close();
      } catch (IOException iOException) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String) null, iOException);
      }
    }
  }

  public ArrayList ExceptionInVPackage(InputStream paramInputStream) {
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
            BiInterfaceDelta BiInterfaceDelta = c(node);
            hashMap.put(BiInterfaceDelta.ExceptionInVPackage, BiInterfaceDelta.b.getAbsolutePath());
          } catch (IOException iOException) {
            D.ExceptionInVPackage("Failed to load Dashboard Image. ", iOException, null);
          }
        if (node.getNodeName().equals("dashComp"))
          try {
            s s = b(node);
            if (s instanceof SingleChannelDashComponent) {
              SingleChannelDashComponent singleChannelDashComponent =
                  (SingleChannelDashComponent) s;
              String str1 = BiInterfaceDelta(singleChannelDashComponent.getOutputChannel());
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
      while (iterator.hasNext()) arrayOfComponent[b2++] = (Component) iterator.next();
      b.b(hashMap, arrayOfComponent);
      if (arrayList.size() > 0) return arrayList;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage(
          "Failed to load Gauge Cluster " + exception.getMessage(), exception);
    }
    return null;
  }

  private s b(Node paramNode) {
    return (s) ExceptionInVPackage(paramNode);
  }

  private String BiInterfaceDelta(String paramString) {
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

  private Document ExceptionInVPackage(
      Document paramDocument, Element paramElement, String paramString, File paramFile) {
    try {
      if (paramFile != null && paramFile.exists()) {
        String str = paramFile.getName().substring(paramFile.getName().lastIndexOf(".") + 1);
        Element element = paramDocument.createElement("imageFile");
        element.setAttribute("type", str);
        element.setAttribute("imageId", paramString);
        element.setAttribute("fileName", paramFile.getName());
        element.setTextContent(BiInterfaceDelta.ExceptionInVPackage(paramFile));
        paramElement.appendChild(element);
      } else {
        D.b(
            "Image not found for Image ID: "
                + paramString
                + ", looking in: "
                + paramFile.getAbsolutePath());
      }
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Error Saving Dashboard Image. Check Log file for details.");
    }
    return paramDocument;
  }

  private BiInterfaceDelta c(Node paramNode) {
    File file;
    String str1 = ExceptionInVPackage(paramNode, "type");
    String str2 = ExceptionInVPackage(paramNode, "fileName");
    String str3 = ExceptionInVPackage(paramNode, "imageId");
    if (f(str1)) {
      file = new File(this.b, str2);
    } else {
      file = new File(this.ExceptionInVPackage, str2);
    }
    BiInterfaceDelta.ExceptionInVPackage(paramNode.getTextContent(), file);
    return new BiInterfaceDelta(this, str3, file);
  }

  private boolean f(String paramString) {
    return paramString.toLowerCase().startsWith("ttf");
  }

  public static void ExceptionInVPackage(boolean paramBoolean) {
    c = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/v/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
