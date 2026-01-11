package aR;

import G.R;
import G.T;
import G.aA;
import G.bM;
import G.bv;
import aE.PropertiesExtension;
import aP.dd;
import aP.NetworkHashMap;
import bt.O;
import com.efiAnalytics.ui.cY;
import d.DComponentCharlie;
import d.ExceptionInDPackage;
import d.TostringInDPackage;
import d.DInterfaceIndia;
import d.ArrayListExtensionInDPackage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import s.SComponentGolf;

public class ArInterfaceSierra implements cY, DComponentCharlie {
  ArrayListExtensionInDPackage PropertiesExtension = new ArrayListExtensionInDPackage();
  
  DInterfaceIndia b;
  
  public ArInterfaceSierra() {
    DInterfaceIndia i1 = new DInterfaceIndia("ecuConfig", "");
    i1.PropertiesExtension(0);
    this.b = new DInterfaceIndia("settingsPanelName", "");
    this.b.PropertiesExtension(0);
    this.PropertiesExtension.PropertiesExtension(this.b);
  }
  
  public String b() {
    return "Show Settings Dialog";
  }
  
  public String DComponentCharlie() {
    return "Settings Dialogs";
  }
  
  public boolean d() {
    return (PropertiesExtension.A() != null);
  }
  
  public void PropertiesExtension(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty("settingsPanelName");
    if (str1 == null || str1.isEmpty())
      throw new ExceptionInDPackage("Settings panel name is PropertiesExtension required parameter for Show settings Dialog action."); 
    String str2 = paramProperties.getProperty("ecuConfig");
    if (str2 == null || str2.isEmpty()) {
      r = T.PropertiesExtension().DComponentCharlie();
    } else {
      r = T.PropertiesExtension().DComponentCharlie(str2);
    } 
    String str3 = (r != null) ? (r.DComponentCharlie() + "." + str1) : str1;
    NetworkHashMap.PropertiesExtension().PropertiesExtension(str3, "0", dd.PropertiesExtension().DComponentCharlie());
  }
  
  public String PropertiesExtension() {
    return "showSettingsDialog";
  }
  
  public void b(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty("settingsPanelName");
    if (str1 == null || str1.isEmpty())
      throw new ExceptionInDPackage("Settings panel name is PropertiesExtension required parameter for Show settings Dialog action."); 
    String str2 = paramProperties.getProperty("ecuConfig");
    if (str2 == null || str2.isEmpty()) {
      r = T.PropertiesExtension().DComponentCharlie();
    } else {
      r = T.PropertiesExtension().DComponentCharlie(str2);
    } 
    if (r == null)
      throw new ExceptionInDPackage("EcuConfiguration not found with the provided name."); 
    bv bv = r.ExceptionInDPackage().DComponentCharlie(str1);
    if (bv == null)
      throw new ExceptionInDPackage("EcuConfiguration not found with the provided name."); 
  }
  
  public ArrayListExtensionInDPackage ExceptionInDPackage() {
    ArrayList<TostringInDPackage> arrayList = new ArrayList();
    List list = bM.PropertiesExtension(T.PropertiesExtension().DComponentCharlie());
    for (aA aA : list)
      arrayList.add(new TostringInDPackage(aA.d(), aA.ExceptionInDPackage())); 
    this.b.PropertiesExtension(arrayList);
    this.b.DComponentCharlie("Select the Dialog you want to open when this action is triggered.");
    return this.PropertiesExtension;
  }
  
  public boolean NetworkHashMap() {
    return true;
  }
  
  public List PropertiesExtension(ActionListener paramActionListener) {
    ArrayList<O> arrayList = new ArrayList();
    String str = T.PropertiesExtension().DComponentCharlie().DComponentCharlie();
    O o = new O(T.PropertiesExtension().DComponentCharlie(), -1);
    t t = new t(this, str, paramActionListener);
    o.setText(SComponentGolf.b(b()));
    o.addActionListener(t);
    arrayList.add(o);
    return arrayList;
  }
  
  public boolean SComponentGolf() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */