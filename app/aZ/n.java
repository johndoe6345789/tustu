package aZ;

import G.r;
import G.s;
import V.a;
import W.ai;
import bH.D;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import r.j;
import v.e;

public class n extends e implements ai {
  public s[] a() {
    return a(j.a);
  }
  
  public s[] a(String paramString) {
    ArrayList<s> arrayList = new ArrayList();
    Document document = c(paramString);
    try {
      NodeList nodeList = document.getElementsByTagName("*");
      String str = "";
      for (byte b1 = 0; b1 < nodeList.getLength(); b1++) {
        Node node = nodeList.item(b1);
        if (node.getNodeName().equals("settingGroup"))
          try {
            arrayList.add(b(node));
          } catch (Exception exception) {
            D.b("Failed to load Option Group:" + node.toString());
            exception.printStackTrace();
          }  
      } 
      s[] arrayOfS = new s[arrayList.size()];
      byte b2 = 0;
      Iterator<s> iterator = arrayList.iterator();
      while (iterator.hasNext())
        arrayOfS[b2++] = iterator.next(); 
      return arrayOfS;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Failed to load Gauge Cluster " + exception.getMessage(), exception);
    } 
  }
  
  private s b(Node paramNode) {
    s s = new s();
    NamedNodeMap namedNodeMap = paramNode.getAttributes();
    Node node = namedNodeMap.getNamedItem("name");
    s.b(node.getTextContent());
    node = namedNodeMap.getNamedItem("displayName");
    s.c(node.getTextContent());
    NodeList nodeList = paramNode.getChildNodes();
    for (byte b = 0; b < nodeList.getLength(); b++) {
      Node node1 = nodeList.item(b);
      if (node1.getNodeName().equals("configurationOption")) {
        r r = new r();
        NamedNodeMap namedNodeMap1 = node1.getAttributes();
        Node node2 = namedNodeMap1.getNamedItem("name");
        r.v(node2.getTextContent());
        node2 = namedNodeMap1.getNamedItem("displayName");
        r.a(node2.getTextContent());
        node2 = namedNodeMap1.getNamedItem("infoLink");
        if (node2 != null)
          r.b(node2.getTextContent()); 
        node2 = namedNodeMap1.getNamedItem("default");
        if (node2 != null) {
          boolean bool = (node2.getTextContent() != null && node2.getTextContent().equals("true")) ? true : false;
          r.a(bool);
        } 
        s.a(r);
      } 
    } 
    return s;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aZ/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */