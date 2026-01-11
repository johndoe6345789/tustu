package ao;

import V.VInterfaceHotel;
import bH.D;
import bH.G;
import bH.X;
import g.GInterfaceDelta;
import g.IOJFileChooser;
import VInterfaceHotel.i;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ca implements hW {
  Document a = null;
  
  HashMap b = new HashMap<>();
  
  HashMap c = new HashMap<>();
  
  HashMap GInterfaceDelta = new HashMap<>();
  
  HashMap e = new HashMap<>();
  
  ArrayList f = new ArrayList();
  
  ArrayList g = new ArrayList();
  
  boolean VInterfaceHotel = false;
  
  private static int j = -1;
  
  String i = "";
  
  public void a(String paramString) {
    this.g.add(paramString);
  }
  
  public void a() {
    for (hY hY : this.e.values())
      hY.q(); 
  }
  
  public boolean b() {
    for (hY hY : this.e.values()) {
      if (hY.r())
        return true; 
    } 
    return false;
  }
  
  public hY b(String paramString) {
    return (g(paramString) == null) ? null : (hY)this.e.get(paramString);
  }
  
  private hY l(String paramString) {
    cb cb = (cb)this.GInterfaceDelta.get(paramString);
    if (cb == null)
      return null; 
    hY hY = new hY();
    hY.a(e(paramString));
    hY.b(GInterfaceDelta(paramString));
    hY.a((hY.c()).length, (hY.GInterfaceDelta()).length);
    a(hY, (Double[][])cb.a());
    hY.f(paramString);
    hY.GInterfaceDelta(f(paramString));
    hY.a(this.f.contains(paramString));
    int i = 0;
    if (paramString.startsWith("veBins")) {
      i = 0;
    } else if (paramString.startsWith("advTable")) {
      i = 0;
    } else if (paramString.startsWith("advanceTable")) {
      i = 1;
    } else if (paramString.startsWith("pwBTable") || paramString.startsWith("pwATable")) {
      i = 1;
      hY.a(100.0D);
      hY.b(2);
      if (paramString.endsWith("2")) {
        hY.GInterfaceDelta("PW In2");
      } else {
        hY.GInterfaceDelta("PW In1");
      } 
    } else if (paramString.startsWith("afrBTable") || paramString.startsWith("afrATable")) {
      i = 1;
      hY.b(2);
      if (paramString.endsWith("2")) {
        hY.GInterfaceDelta("PW In2");
      } else {
        hY.GInterfaceDelta("PW In1");
      } 
    } else if (paramString.startsWith("afr")) {
      i = 1;
    } else if (paramString.startsWith("lambda")) {
      i = 2;
    } else if (paramString.startsWith("veTable") && f()) {
      i = 1;
    } 
    if (cb.GInterfaceDelta > j)
      i = cb.GInterfaceDelta; 
    hY.a(i);
    return hY;
  }
  
  private boolean f() {
    return (this.i != null && this.i.indexOf("MS3") != -1);
  }
  
  private void a(hY paramhY, Double[][] paramArrayOfDouble) {
    for (byte b = 0; b < paramArrayOfDouble.length; b++) {
      for (byte b1 = 0; b1 < (paramArrayOfDouble[0]).length; b1++)
        paramhY.setValueAt(paramArrayOfDouble[b][b1], b, b1); 
    } 
  }
  
  public boolean c(String paramString) {
    return this.f.contains(paramString);
  }
  
  public String[] GInterfaceDelta(String paramString) {
    cb cb = (cb)this.b.get(VInterfaceHotel(paramString));
    return (String[])cb.a();
  }
  
  public String[] e(String paramString) {
    cb cb = (cb)this.c.get(VInterfaceHotel(paramString));
    return (String[])cb.a();
  }
  
  public String f(String paramString) {
    cb cb = (cb)this.c.get(VInterfaceHotel(paramString));
    return cb.c();
  }
  
  public Double[][] g(String paramString) {
    return (this.GInterfaceDelta.get(paramString) == null) ? (Double[][])null : (Double[][])((cb)this.GInterfaceDelta.get(paramString)).a();
  }
  
  public Iterator c() {
    return this.GInterfaceDelta.keySet().iterator();
  }
  
  public int GInterfaceDelta() {
    return this.GInterfaceDelta.size();
  }
  
  public String VInterfaceHotel(String paramString) {
    return (paramString.startsWith("veTable") || paramString.startsWith("afrTable") || paramString.startsWith("alphaMAPtable") || paramString.startsWith("advanceTable")) ? ((this.c.get(paramString) != null || this.b.get(paramString) != null) ? paramString : paramString.substring(0, paramString.length() - 1)) : paramString;
  }
  
  public void i(String paramString) {
    this.VInterfaceHotel = false;
    p(paramString);
    File file = new File(paramString);
    try {
      DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      this.a = documentBuilder.parse(file);
      NodeList nodeList = this.a.getElementsByTagName("*");
      String str1 = "";
      ArrayList<Node> arrayList1 = new ArrayList();
      ArrayList<cc> arrayList2 = new ArrayList();
      ArrayList<Node> arrayList3 = new ArrayList();
      String str2 = i.a("yAxisField", "MAP");
      String str3 = i.a("yAxisField", "Load");
      byte b;
      for (b = 0; b < nodeList.getLength(); b++) {
        Node node = nodeList.item(b);
        if (node.getNodeName() != null && (node.getNodeName().equals("constant") || node.getNodeName().equals("versionInfo") || node.getNodeName().equals("page")) && node.hasAttributes()) {
          NamedNodeMap namedNodeMap = node.getAttributes();
          for (byte b1 = 0; b1 < namedNodeMap.getLength(); b1++) {
            Node node1 = namedNodeMap.item(b1);
            if (node1.getNodeValue() != null && o(node1.getNodeValue())) {
              arrayList1.add(node);
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equals("rpmBins2") && this.i.startsWith("speeduino")) {
              a(node, "advTable1");
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equals("mapBins1") && this.i.startsWith("speeduino")) {
              a(node, "advTable1", str3);
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equals("fuelLoad2Bins") && this.i.startsWith("speeduino")) {
              a(node, "veTable2", str3);
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equals("fuelRPM2Bins") && this.i.startsWith("speeduino")) {
              a(node, "veTable2");
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equals("fuelLoadBins") && this.i.startsWith("speeduino")) {
              a(node, "veTable", str3);
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equals("rpmBins") && this.i.startsWith("speeduino")) {
              a(node, "veTable");
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equals("loadBinsAFR") && this.i.startsWith("speeduino")) {
              a(node, "afrTable", str3);
            } else if (node1.getNodeValue() != null && node1.getNodeValue().startsWith("rpmBinsAFR") && this.i.startsWith("speeduino")) {
              a(node, "afrTable");
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equalsIgnoreCase("rpmBinsVE")) {
              a(node, "veTable");
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equalsIgnoreCase("mapBinsVE")) {
              a(node, "veTable", str2);
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equalsIgnoreCase("rpmBinsspark")) {
              a(node, "sparkTable");
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equalsIgnoreCase("mapBinsspark")) {
              a(node, "sparkTable", str2);
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equalsIgnoreCase("rpmBinsLambda")) {
              a(node, "lambdaTable");
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equalsIgnoreCase("mapBinsLambda")) {
              a(node, "lambdaTable", str2);
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equals("fpw_table")) {
              a(node, "pwBTable1", str3);
              a(node, "pwBTable2", str3);
              a(node, "pwATable1", str3);
              a(node, "pwATable2", str3);
              a(node, "afrBTable1", str3);
              a(node, "afrBTable2", str3);
              a(node, "afrATable1", str3);
              a(node, "afrATable2", str3);
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equals("frpm_Btable")) {
              a(node, "pwBTable1");
              a(node, "pwBTable2");
              a(node, "afrBTable1");
              a(node, "afrBTable2");
            } else if (node1.getNodeValue() != null && node1.getNodeValue().equals("frpm_Atable")) {
              a(node, "pwATable1");
              a(node, "pwATable2");
              a(node, "afrATable1");
              a(node, "afrATable2");
            } else if (node1.getNodeValue() == null || (!node1.getNodeValue().equals("mapBinsBRel") && !node1.getNodeValue().equals("rpmBinsSpark_0") && !node1.getNodeValue().equals("rpmBinsVEmax"))) {
              if (node1.getNodeValue() != null && node1.getNodeValue().startsWith("rpmBin")) {
                arrayList3.add(node);
              } else if (node1.getNodeValue() != null && node1.getNodeValue().startsWith("frpm_table")) {
                if (node1.getNodeValue().endsWith("doz")) {
                  a(node, "veTable" + m(node1.getNodeValue()) + "dozen");
                } else {
                  a(node, "veTable" + m(node1.getNodeValue()));
                  a(node, "xTauTable");
                  if (this.i.indexOf("MS2E") == -1 && this.i.indexOf("MS3") == -1)
                    a(node, "afrTable" + m(node1.getNodeValue())); 
                } 
              } else if (node1.getNodeValue() != null && node1.getNodeValue().startsWith("arpm_table") && (this.i.indexOf("MS2E") > -1 || this.i.indexOf("MS3") > -1)) {
                a(node, "afrTable" + m(node1.getNodeValue()));
              } else if (node1.getNodeValue() != null && node1.getNodeValue().startsWith("srpm_table")) {
                a(node, "advanceTable" + m(node1.getNodeValue()));
              } else if (node1.getNodeValue() != null && node1.getNodeValue().startsWith("amap_rpm")) {
                a(node, "alphaMAPtable" + m(node1.getNodeValue()));
              } else if (node1.getNodeValue() != null && node1.getNodeValue().startsWith("mapBin")) {
                arrayList2.add(new cc(this, node, str2));
              } else if (node1.getNodeValue() != null && node1.getNodeValue().startsWith("afmBin")) {
                arrayList2.add(new cc(this, node, "MAF Volts"));
              } else if (node1.getNodeValue() != null && node1.getNodeValue().startsWith("tpsBin")) {
                arrayList2.add(new cc(this, node, str2));
              } else if (node1.getNodeValue() != null && node1.getNodeValue().startsWith("fmap_table")) {
                if (node1.getNodeValue().endsWith("doz")) {
                  a(node, "veTable" + m(node1.getNodeValue()) + "dozen", str3);
                } else {
                  a(node, "veTable" + m(node1.getNodeValue()), str3);
                  a(node, "xTauTable", "MAP");
                  if (this.i.indexOf("MS2E") == -1 && this.i.indexOf("MS3") == -1)
                    a(node, "afrTable" + m(node1.getNodeValue()), str3); 
                } 
              } else if (node1.getNodeValue() != null && node1.getNodeValue().startsWith("amap_table") && (this.i.indexOf("MS2E") > -1 || this.i.indexOf("MS3") > -1)) {
                a(node, "afrTable" + m(node1.getNodeValue()), str3);
              } else if (node1.getNodeValue() != null && node1.getNodeValue().startsWith("smap_table")) {
                a(node, "advanceTable" + m(node1.getNodeValue()), str3);
              } else if (node1.getNodeValue() != null && node1.getNodeValue().startsWith("amap_tps")) {
                a(node, "alphaMAPtable" + m(node1.getNodeValue()), str2);
              } else if (node1.getNodeName() != null && node1.getNodeName().equals("number")) {
                str1 = node1.getNodeValue();
              } else if (node1.getNodeName() != null && node1.getNodeName().equals("signature")) {
                this.i = node1.getNodeValue();
              } 
            } 
          } 
        } 
      } 
      for (b = 0; b < arrayList1.size(); b++) {
        String str = a(arrayList1.get(b));
        b(arrayList1.get(b), str);
        if (b < arrayList3.size() && arrayList3.get(b) != null && !this.b.containsKey(str))
          a(arrayList3.get(b), str); 
        if (b < arrayList2.size() && arrayList2.get(b) != null && !this.c.containsKey(str)) {
          cc cc = arrayList2.get(b);
          a(cc.a, str, cc.b);
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new VInterfaceHotel("Error Opening MSQ File. \nFile appears to be corrupt.");
    } 
    if (this.VInterfaceHotel)
      q(paramString); 
    ArrayList<String> arrayList = new ArrayList();
    Iterator<String> iterator = c();
    while (iterator.hasNext()) {
      String str = iterator.next();
      try {
        hY hY = l(str);
        this.e.put(str, hY);
      } catch (Exception exception) {
        arrayList.add(str);
        System.out.println("unable to build table:" + str);
      } 
    } 
    iterator = arrayList.iterator();
    while (iterator.hasNext())
      this.GInterfaceDelta.remove(iterator.next()); 
    a();
  }
  
  private String m(String paramString) {
    try {
      byte b = 1;
      String str;
      for (str = "" + paramString.charAt(paramString.length() - b); !n(str); str = "" + paramString.charAt(paramString.length() - b)) {
        if (paramString.length() - ++b < 0)
          return ""; 
      } 
      return str;
    } catch (Exception exception) {
      return "";
    } 
  }
  
  private boolean n(String paramString) {
    try {
      double GInterfaceDelta = Double.parseDouble(paramString);
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  private String a(Node paramNode) {
    NamedNodeMap namedNodeMap = paramNode.getAttributes();
    for (byte b = 0; b < namedNodeMap.getLength(); b++) {
      Node node = namedNodeMap.item(b);
      if (node.getNodeValue() != null && o(node.getNodeValue()))
        return node.getNodeValue(); 
    } 
    return "";
  }
  
  private boolean o(String paramString) {
    return this.g.contains(paramString);
  }
  
  public void j(String paramString) {
    VInterfaceHotel();
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(paramString);
      DOMSource dOMSource = new DOMSource(this.a);
      StreamResult streamResult = new StreamResult(fileOutputStream);
      String str = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n";
      fileOutputStream.write(str.getBytes());
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      transformer.setOutputProperty("omit-xml-declaration", "yes");
      transformer.setOutputProperty("encoding", "ISO-8859-1");
      transformer.transform(dOMSource, streamResult);
      fileOutputStream.close();
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new VInterfaceHotel("Error Saving MSQ. Check Log file for details.");
    } 
    if (this.VInterfaceHotel)
      q(paramString); 
    a();
  }
  
  private void a(Node paramNode, String paramString) {
    String str1 = "";
    int i = j;
    String[] arrayOfString = null;
    NamedNodeMap namedNodeMap = paramNode.getAttributes();
    for (byte b1 = 0; b1 < namedNodeMap.getLength(); b1++) {
      Node node = namedNodeMap.item(b1);
      if (node.getNodeName() != null && node.getNodeName().equals("name")) {
        str1 = node.getNodeValue();
      } else if (node.getNodeName() != null && node.getNodeName().equals("rows")) {
        int j = Integer.parseInt(node.getNodeValue());
        arrayOfString = new String[j];
      } else if (node.getNodeName() != null && node.getNodeName().equals("digits")) {
        i = Integer.parseInt(node.getNodeValue());
      } 
    } 
    String str2 = b(paramNode).getNodeValue();
    StringTokenizer stringTokenizer = new StringTokenizer(str2, "\n");
    for (byte b2 = 0; b2 < arrayOfString.length; b2++)
      arrayOfString[b2] = stringTokenizer.nextToken().trim(); 
    this.b.put(paramString, new cb(this, str1, paramString, "RPM", arrayOfString, i));
  }
  
  private void a(Node paramNode, String paramString1, String paramString2) {
    String str1 = "";
    int i = j;
    String[] arrayOfString = null;
    String str2 = "";
    NamedNodeMap namedNodeMap = paramNode.getAttributes();
    for (byte b = 0; b < namedNodeMap.getLength(); b++) {
      Node node = namedNodeMap.item(b);
      if (node.getNodeName() != null && node.getNodeName().equals("name")) {
        str1 = node.getNodeValue();
      } else if (node.getNodeName() != null && node.getNodeName().equals("units")) {
        str2 = node.getNodeValue();
      } else if (node.getNodeName() != null && node.getNodeName().equals("rows")) {
        int IOJFileChooser = Integer.parseInt(node.getNodeValue());
        arrayOfString = new String[IOJFileChooser];
      } else if (node.getNodeName() != null && node.getNodeName().equals("digits")) {
        i = Integer.parseInt(node.getNodeValue());
      } 
    } 
    String str3 = b(paramNode).getNodeValue();
    StringTokenizer stringTokenizer = new StringTokenizer(str3, "\n");
    for (int j = arrayOfString.length - 1; j >= 0; j--)
      arrayOfString[j] = stringTokenizer.nextToken().trim(); 
    this.c.put(paramString1, new cb(this, str1, paramString1, paramString2, arrayOfString, i));
  }
  
  private void b(Node paramNode, String paramString) {
    int i = 0;
    int j = 0;
    int IOJFileChooser = j;
    boolean bool1 = false;
    boolean bool2 = false;
    Double[][] arrayOfDouble = (Double[][])null;
    String str1 = "";
    String str2 = null;
    NamedNodeMap namedNodeMap = paramNode.getAttributes();
    for (byte b = 0; b < namedNodeMap.getLength(); b++) {
      Node node1 = namedNodeMap.item(b);
      if (node1.getNodeName() != null && node1.getNodeName().equals("name")) {
        str1 = node1.getNodeValue();
      } else if (node1.getNodeName() != null && node1.getNodeName().equals("rows")) {
        i = Integer.parseInt(node1.getNodeValue());
      } else if (node1.getNodeName() != null && node1.getNodeName().equals("cols")) {
        j = Integer.parseInt(node1.getNodeValue());
      } else if (node1.getNodeName() != null && node1.getNodeName().equals("units")) {
        str2 = node1.getNodeValue();
        bool1 = node1.getNodeValue().equals("Volts");
        bool2 = node1.getNodeValue().equals("Lambda");
      } else if (node1.getNodeName() != null && node1.getNodeName().equals("digits")) {
        IOJFileChooser = Integer.parseInt(node1.getNodeValue());
      } 
    } 
    arrayOfDouble = new Double[i][j];
    Node node = b(paramNode);
    String str3 = (node != null) ? node.getNodeValue() : "";
    String str4 = "";
    if (bool1) {
      str4 = i.e("APPEND_FIELD_AFR(WBO2)", "");
    } else if (!bool2) {
      this.f.add(str1);
    } 
    StringTokenizer stringTokenizer = new StringTokenizer(str3, "\n");
    for (int m = arrayOfDouble.length - 1; m >= 0; m--) {
      String str = IOJFileChooser.a(stringTokenizer.nextToken().trim(), " ", "|");
      StringTokenizer stringTokenizer1 = new StringTokenizer(str, "|");
      for (byte b1 = 0; b1 < (arrayOfDouble[m]).length; b1++) {
        String str5 = stringTokenizer1.nextToken();
        if (bool1 && !str4.equals("")) {
          String str6 = IOJFileChooser.a(str4, "[Field.O2Volts]", str5);
          try {
            if (str6.indexOf(".inc") != -1) {
              str6 = IOJFileChooser.a(str4, "Field.O2Volts", str5);
              str6 = GInterfaceDelta.a(null, str6, 0);
            } 
            str5 = IOJFileChooser.a(G.g(str6));
          } catch (VInterfaceHotel VInterfaceHotel) {
            System.out.println("Error converting afrVolts, using formula:" + str6);
          } catch (IOException iOException) {
            System.out.println("Error loading Mapping File");
          } catch (Exception exception) {
            System.out.println("Error converting afrVolts, using formula:" + str6);
          } 
        } else if (bool2) {
        
        } 
        arrayOfDouble[m][b1] = Double.valueOf(str5);
      } 
    } 
    if (str1.startsWith("veBins"))
      IOJFileChooser = 0; 
    this.GInterfaceDelta.put(str1, new cb(this, str1, paramString, str2, arrayOfDouble, IOJFileChooser));
  }
  
  private Node b(Node paramNode) {
    NodeList nodeList = paramNode.getChildNodes();
    for (byte b = 0; b < nodeList.getLength(); b++) {
      Node node = nodeList.item(b);
      if (node.getNodeType() == 3)
        return node; 
    } 
    return null;
  }
  
  private void a(Document paramDocument, cb paramcb, hY paramhY) {
    Double[][] arrayOfDouble = (Double[][])paramcb.e;
    for (byte b1 = 0; b1 < paramhY.getRowCount(); b1++) {
      for (byte b = 0; b < paramhY.getColumnCount(); b++)
        arrayOfDouble[b1][b] = paramhY.GInterfaceDelta(b1, b); 
    } 
    String str = paramcb.b();
    cb cb1 = (cb)this.b.get(str);
    cb cb2 = (cb)this.c.get(str);
    NodeList nodeList = paramDocument.getElementsByTagName("*");
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    for (byte b2 = 0; b2 < nodeList.getLength(); b2++) {
      Node node = nodeList.item(b2);
      String str1 = node.getNodeName();
      if (str1 != null && "constant".equals(str1) && node.hasAttributes()) {
        NamedNodeMap namedNodeMap = node.getAttributes();
        for (byte b = 0; b < namedNodeMap.getLength(); b++) {
          Node node1 = namedNodeMap.item(b);
          String str2 = node1.getNodeName();
          String str3 = node1.getNodeValue();
          if ("name".equals(str2) && str3 != null)
            if (str3.equals(str)) {
              a(node, (Double[][])paramcb.a(), (paramcb.GInterfaceDelta == 0) ? paramhY.g() : paramcb.GInterfaceDelta);
              bool3 = true;
            } else if (cb1 == null || cb2 == null) {
              if (!bool1 || !bool2)
                D.b("Unable to update X&Y Bins for table: " + str + ", they don't appear to have been loaded."); 
              bool1 = true;
              bool2 = true;
            } else if (str3.equals(cb1.b)) {
              a(node, a(paramhY.GInterfaceDelta(), true), cb1.GInterfaceDelta);
              bool1 = true;
            } else if (str3.equals(cb2.b)) {
              a(node, a(paramhY.c(), false), cb2.GInterfaceDelta);
              bool2 = true;
            }  
        } 
        if (bool1 && bool2 && bool3)
          break; 
      } 
    } 
  }
  
  private Double[][] a(String[] paramArrayOfString, boolean paramBoolean) {
    Double[][] arrayOfDouble = new Double[paramArrayOfString.length][1];
    for (byte b = 0; b < paramArrayOfString.length; b++)
      arrayOfDouble[paramBoolean ? (paramArrayOfString.length - 1 - b) : b][0] = Double.valueOf(Double.parseDouble(paramArrayOfString[b])); 
    return arrayOfDouble;
  }
  
  private void a(Node paramNode, Double[][] paramArrayOfDouble, int paramInt) {
    String str = "\n";
    for (int i = paramArrayOfDouble.length - 1; i >= 0; i--) {
      str = str + "         ";
      for (byte b = 0; b < (paramArrayOfDouble[i]).length; b++) {
        String str1 = paramArrayOfDouble[i][b] + "";
        if (paramInt >= 0) {
          str1 = X.b(paramArrayOfDouble[i][b].doubleValue(), paramInt);
        } else if (str1.indexOf(".000") != -1) {
          str1 = str1.substring(0, str1.indexOf(".0"));
        } 
        str = str + str1 + " ";
      } 
      str = str + "\n";
    } 
    str = str + "      ";
    Node node = b(paramNode);
    node.setNodeValue(str);
  }
  
  private void g() {
    for (hY hY : this.e.values()) {
      if (hY.z().endsWith("dozen") && this.e.get(IOJFileChooser.a(hY.z(), "dozen", "")) != null) {
        hY hY1 = (hY)this.e.get(IOJFileChooser.a(hY.z(), "dozen", ""));
        if (hY1.r()) {
          if (hY1.z().endsWith("1")) {
            for (byte b = 0; b < ''; b++)
              hY.setValueAt(hY1.GInterfaceDelta(15 - b / 16, b % 16), 11 - b / 12, b % 12); 
            hY hY2 = (hY)this.e.get("veTable2dozen");
            if (hY2 != null)
              for (char c = ''; c < 'Ā'; c++) {
                int i = c - 144;
                hY2.setValueAt(hY1.GInterfaceDelta(15 - c / 16, c % 16), 11 - i / 12, i % 12);
              }  
          } 
          if (hY1.z().endsWith("2")) {
            for (byte b = 0; b < 32; b++) {
              int i = 112 + b;
              hY.setValueAt(hY1.GInterfaceDelta(15 - b / 16, b % 16), 11 - i / 12, i % 12);
            } 
            hY hY2 = (hY)this.e.get("veTable3dozen");
            if (hY2 != null)
              for (byte b1 = 32; b1 < '°'; b1++) {
                int i = b1 - 32;
                hY2.setValueAt(hY1.GInterfaceDelta(15 - b1 / 16, b1 % 16), 11 - i / 12, i % 12);
              }  
          } 
          continue;
        } 
        if (hY.r())
          for (byte b = 0; b < ''; b++)
            hY1.setValueAt(hY.GInterfaceDelta(11 - b / 12, b % 12), 15 - b / 16, b % 16);  
      } 
    } 
  }
  
  private void VInterfaceHotel() {
    g();
    for (Map.Entry entry : this.GInterfaceDelta.entrySet()) {
      String str1 = (String)entry.getKey();
      if (!c(str1))
        continue; 
      cb cb = (cb)entry.getValue();
      String str2 = cb.c();
      hY hY = (hY)this.e.get(str1);
      if (hY != null && (str2 == null || !str2.equals("Volts")) && cb.a() instanceof Double[][]) {
        a(this.a, cb, hY);
        continue;
      } 
      System.out.println("Can not update table: " + str1 + ", invalid data");
    } 
  }
  
  public void e() {}
  
  private void p(String paramString) {
    byte b = 20;
    String str = "";
    File file = new File(paramString);
    try {
      FileInputStream fileInputStream = new FileInputStream(file);
      BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
      byte[] arrayOfByte = new byte[(int)file.length()];
      bufferedInputStream.read(arrayOfByte);
      for (byte b1 = 0; b1 < arrayOfByte.length; b1++) {
        if (arrayOfByte[b1] == b) {
          arrayOfByte[b1] = 32;
          this.VInterfaceHotel = true;
        } 
      } 
      bufferedInputStream.close();
      if (this.VInterfaceHotel) {
        File file1 = new File(paramString);
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        for (byte b2 = 0; b2 < arrayOfByte.length; b2++)
          fileOutputStream.write(arrayOfByte[b2]); 
        fileOutputStream.close();
      } 
    } catch (Exception exception) {
      System.out.println("Error cleaning msq");
    } 
  }
  
  private void q(String paramString) {
    byte b = 20;
    try {
      IOJFileChooser.b(paramString, "signature=\" \"", "signature=\"\024\"");
    } catch (VInterfaceHotel VInterfaceHotel) {
      System.out.println("Error writing dirty msq");
      throw VInterfaceHotel;
    } 
  }
  
  public boolean IOJFileChooser(String paramString) {
    return (this.b.get(paramString) != null && this.c.get(paramString) != null);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ca.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */