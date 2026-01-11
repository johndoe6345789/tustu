package ao;

import bH.X;
import com.efiAnalytics.ui.bq;
import h.i;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class O {
  public static bq a(bq parambq, String paramString, List paramList1, List paramList2, Component paramComponent) {
    JMenuItem jMenuItem = new JMenuItem("Save " + paramString + " Fields As");
    jMenuItem.addActionListener(new P(paramList2, paramString, paramComponent));
    parambq.add(jMenuItem);
    JMenu jMenu = new JMenu("Delete Field group");
    List list = a();
    Q q = new Q(paramComponent);
    for (String str : list) {
      jMenuItem = jMenu.add(str);
      jMenuItem.addActionListener(q);
      jMenuItem.setName(str);
    } 
    parambq.add(jMenu);
    parambq.addSeparator();
    R r = new R(paramList1);
    for (String str : a()) {
      jMenuItem = parambq.add(str);
      jMenuItem.addActionListener(r);
      jMenuItem.setName(str);
    } 
    return parambq;
  }
  
  public static void a(List<JComboBox> paramList, String paramString) {
    List list = a(paramString);
    for (byte b = 0; b < paramList.size(); b++) {
      if (list.size() > b) {
        ((JComboBox)paramList.get(b)).setSelectedItem(list.get(b));
      } else {
        ((JComboBox)paramList.get(b)).setSelectedItem(" ");
      } 
    } 
  }
  
  public static void a(String paramString, List paramList) {
    String str = "";
    for (String str1 : paramList)
      str = str + str1 + ","; 
    if (str.endsWith(","))
      str = str.substring(0, str.length() - 1); 
    i.c("GRAPH_FIELD_GROUP_NAME_" + paramString, str);
  }
  
  public static List a() {
    ArrayList<String> arrayList = new ArrayList();
    String[] arrayOfString = i.e("GRAPH_FIELD_GROUP_NAME_");
    for (String str : arrayOfString)
      arrayList.add(X.b(str, "GRAPH_FIELD_GROUP_NAME_", "")); 
    return arrayList;
  }
  
  public static List a(String paramString) {
    String str = i.f("GRAPH_FIELD_GROUP_NAME_" + paramString, "");
    ArrayList<String> arrayList = new ArrayList();
    String[] arrayOfString = str.split(",");
    for (String str1 : arrayOfString)
      arrayList.add(str1); 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/O.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */