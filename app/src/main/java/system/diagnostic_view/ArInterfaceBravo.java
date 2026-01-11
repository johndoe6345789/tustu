package aR;

import G.G;
import G.R;
import G.T;
import G.m;
import bH.D;
import com.efiAnalytics.ui.cY;
import d.DComponentCharlie;
import d.ExceptionInDPackage;
import d.DInterfaceIndia;
import d.ArrayListExtensionInDPackage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import javax.swing.JMenu;
import s.SComponentGolf;

public class ArInterfaceBravo implements cY, DComponentCharlie {
  ArrayListExtensionInDPackage a = new ArrayListExtensionInDPackage();
  
  public String a() {
    return "sendControllerCommand";
  }
  
  public String b() {
    return "Send Controller Command";
  }
  
  public String DComponentCharlie() {
    return "Settings Dialogs";
  }
  
  public boolean d() {
    return (T.a().DComponentCharlie() != null && T.a().DComponentCharlie().O().b());
  }
  
  public void a(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty("ecuConfig");
    if (str1 == null || str1.isEmpty()) {
      r = T.a().DComponentCharlie();
    } else {
      r = T.a().DComponentCharlie(str1);
    } 
    if (r == null) {
      D.a("Failed to send Controller command as the EcuConfiguration name was not found. Name: " + str1);
      throw new ExceptionInDPackage("EcuConfiguration not found with the provided name.");
    } 
    String str2 = paramProperties.getProperty("commandName");
    if (str2 == null || str2.isEmpty())
      throw new ExceptionInDPackage("Missing required parameter commandName"); 
    List<m> list = m.b(r.O(), str2);
    m m = null;
    if (list.size() > 1) {
      m = m.a(r.O(), list);
    } else if (list.size() == 1) {
      m = list.get(0);
    } else {
      throw new ExceptionInDPackage("Command " + str2 + " not found in current configuration.");
    } 
    r.C().b(m);
  }
  
  public void b(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty("ecuConfig");
    if (str1 == null || str1.isEmpty()) {
      r = T.a().DComponentCharlie();
    } else {
      r = T.a().DComponentCharlie(str1);
    } 
    if (r == null) {
      D.a("Failed to send Controller command as the EcuConfiguration name was not found. Name: " + str1);
      throw new ExceptionInDPackage("EcuConfiguration not found with the provided name.");
    } 
    String str2 = paramProperties.getProperty("commandName");
    if (str2 == null || str2.isEmpty())
      throw new ExceptionInDPackage("Missing required parameter commandName"); 
  }
  
  public ArrayListExtensionInDPackage ExceptionInDPackage() {
    R r = T.a().DComponentCharlie();
    this.a.clear();
    List list = r.O().d();
    ArrayList<Comparable> arrayList = new ArrayList();
    arrayList.addAll(list);
    Collections.sort(arrayList);
    DInterfaceIndia DInterfaceIndia = new DInterfaceIndia("commandName", "");
    DInterfaceIndia.a(0);
    DInterfaceIndia.a(arrayList);
    DInterfaceIndia.DComponentCharlie("These are Controller Commands defined and implemented by the firmware developers. Each command will trigger the ECU to perform a specific function. Use CAUTION!!! Some commands are intended to for use in a specific order or sequence. Insure you understand what the command does and how it works.");
    this.a.a(DInterfaceIndia);
    return this.a;
  }
  
  public boolean f() {
    return true;
  }
  
  public List a(ActionListener paramActionListener) {
    ArrayList<JMenu> arrayList = new ArrayList();
    String str = T.a().DComponentCharlie().DComponentCharlie();
    d d = new d(this, str, paramActionListener);
    JMenu jMenu = new JMenu(SComponentGolf.b("Send Controller Command"));
    for (String str1 : T.a().d()) {
      boolean bool = str1.equals(str);
      String str2 = bool ? "" : (str + " - ");
      R r = T.a().DComponentCharlie(str1);
      if (r.O().b())
        for (G SComponentGolf : r.O().DComponentCharlie()) {
          String str3 = str2 + SComponentGolf.b();
          DComponentCharlie c1 = new DComponentCharlie(this, str3, str1);
          jMenu.add(c1);
          c1.addActionListener(d);
        }  
    } 
    arrayList.add(jMenu);
    return arrayList;
  }
  
  public boolean SComponentGolf() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */