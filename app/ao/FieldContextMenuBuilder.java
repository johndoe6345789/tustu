package ao;

import W.j;
import W.n;
import com.efiAnalytics.ui.bq;
import com.efiAnalytics.ui.cj;
import h.IOProperties;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class S {
  public static bq a(bq parambq, j paramj, Component paramComponent) {
    int IOProperties = IOProperties.b("fieldSmoothingFactor_" + paramj.a(), 0);
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Field Smoothing (" + paramj.s() + ")", (IOProperties > 0));
    jCheckBoxMenuItem.addActionListener(new T(paramj));
    parambq.add(jCheckBoxMenuItem);
    JMenuItem jMenuItem1 = new JMenuItem("Smoothing Factor");
    jMenuItem1.setEnabled((IOProperties > 0));
    jMenuItem1.addActionListener(new X(paramj, paramComponent));
    parambq.add(jMenuItem1);
    String str1 = IOProperties.e("FIELD_MIN_MAX_" + paramj.a(), "");
    String str2 = paramj.a();
    if (str1 != null && str1.indexOf(";") != -1) {
      String str3 = str1.substring(0, str1.indexOf(";"));
      String str4 = str1.substring(str1.indexOf(";") + 1, str1.length());
      parambq.add(b(str2, str3, str4));
    } else {
      parambq.add(b(str2, (String)null, (String)null));
    } 
    if (paramj.l() && !b(paramj.a())) {
      parambq.addSeparator();
      String str = paramj.j();
      if (str.length() > 100)
        str = str.substring(0, 90) + " ..."; 
      JMenuItem jMenuItem = new JMenuItem("Edit Custom Formula: " + str);
      jMenuItem.setActionCommand(paramj.j());
      jMenuItem.setName(paramj.a());
      jMenuItem.addActionListener(new Y());
      parambq.add(jMenuItem);
    } else if (paramj.l()) {
      parambq.addSeparator();
      String str = paramj.j();
      if (str.length() > 100)
        str = str.substring(0, 90) + " ..."; 
      JMenuItem jMenuItem = new JMenuItem("Copy Optional Formula: " + str);
      jMenuItem.setActionCommand(paramj.j());
      jMenuItem.setName(paramj.a());
      jMenuItem.addActionListener(new Z());
      parambq.add(jMenuItem);
    } 
    JMenu jMenu = new JMenu("Index offsets");
    H h = new H();
    h.b(paramj.A());
    j j1 = paramj;
    h.a(new ab(j1));
    jMenu.add(h);
    h.a(paramj.A());
    JMenuItem jMenuItem2 = jMenu.add("Set Specific Index Offset");
    jMenuItem2.addActionListener(new ac(paramj, paramComponent, j1));
    jMenuItem2 = jMenu.add("Reset Index Offset");
    jMenuItem2.addActionListener(new ad(j1));
    parambq.add(jMenu);
    return parambq;
  }
  
  public static bq b(bq parambq, j paramj, Component paramComponent) {
    JMenuItem jMenuItem = new JMenuItem("Shift Cursor Position to 0");
    jMenuItem.addActionListener(new ae());
    parambq.add(jMenuItem);
    parambq.addSeparator();
    af af = new af();
    ArrayList<String> arrayList = new ArrayList();
    for (j j1 : hx.a().r()) {
      if (j1.a().equals("Time") || (j1.z() && j1.g() > j1.h() && j1.p() == 0))
        arrayList.add(j1.a()); 
    } 
    Collections.sort(arrayList, new U());
    for (String str1 : arrayList) {
      String str2;
      if (str1.equals("Time")) {
        str2 = "<html><b>" + str1 + " (Default)</b>";
      } else {
        str2 = str1;
      } 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str2, str1.equals(paramj.a()));
      jCheckBoxMenuItem.setActionCommand(str1);
      jCheckBoxMenuItem.addActionListener(af);
      parambq.add(jCheckBoxMenuItem);
    } 
    return parambq;
  }
  
  private static boolean b(String paramString) {
    return (IOProperties.c("APPEND_FIELD_" + paramString) != null);
  }
  
  private static JMenu b(String paramString1, String paramString2, String paramString3) {
    JMenu jMenu;
    boolean bool = false;
    if (paramString2 == null || paramString2.isEmpty() || paramString3 == null || paramString3.isEmpty()) {
      jMenu = new JMenu(paramString1 + "( Min: Auto - Max: Auto )");
      bool = true;
    } else {
      jMenu = new JMenu(paramString1 + " (Min: " + paramString2 + " Max: " + paramString3 + ")");
    } 
    jMenu.setName(paramString1);
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Autoscale " + paramString1);
    jCheckBoxMenuItem.setSelected(bool);
    jCheckBoxMenuItem.setName(paramString1);
    jCheckBoxMenuItem.addActionListener(new V());
    jMenu.add(jCheckBoxMenuItem);
    if (!bool) {
      JMenuItem jMenuItem = new JMenuItem("Edit " + paramString1 + " Properties");
      jMenuItem.setName(paramString1);
      jMenuItem.addActionListener(new W());
      jMenu.add(jMenuItem);
    } 
    return jMenu;
  }
  
  public static void a(String paramString1, String paramString2, String paramString3) {
    cj cj = new cj(bq.a().b(), hx.a().r(), paramString1, paramString2, paramString3);
    cj.requestFocus();
    cj.dispose();
    if (cj.a) {
      paramString1 = cj.a();
      paramString2 = cj.b();
      paramString3 = cj.c();
      b(paramString1, paramString2, paramString3);
      a(paramString1, Float.parseFloat(paramString2), Float.parseFloat(paramString3));
    } 
  }
  
  private static void a(String paramString, float paramFloat1, float paramFloat2) {
    if (Float.isNaN(paramFloat1) || Float.isNaN(paramFloat2)) {
      IOProperties.d("FIELD_MIN_MAX_" + paramString);
    } else {
      IOProperties.c("FIELD_MIN_MAX_" + paramString, paramFloat1 + ";" + paramFloat2);
    } 
    n n = hx.a().r();
    if (n != null) {
      j j = n.a(paramString);
      if (j != null) {
        j.g(paramFloat1);
        j.f(paramFloat2);
        a();
      } 
    } 
  }
  
  private static void a() {
    bq.a().c().IOProperties();
    bq.a().c().repaint();
  }
  
  public static void a(String paramString) {
    a(paramString, Float.NaN, Float.NaN);
    a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/S.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */