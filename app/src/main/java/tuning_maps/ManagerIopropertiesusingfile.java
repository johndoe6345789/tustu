package aP;

import G.R;
import G.ArrayList;
import G.Manager;
import G.GComponentAj;
import G.EqualsInGPackage;
import G.ExceptionprintstacktraceInGPackage;
import G.GComponentBq;
import G.ArrayListExceptionprintstacktraceInGPackage;
import ai.EqualsInAiPackage;
import bA.JMenuItemExtensionInBaPackage;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import r.IOPropertiesUsingFile;
import r.RInterfaceIndia;
import s.SComponentGolf;
import x.IOPropertiesUsingFile;

public class ManagerIopropertiesusingfile extends JMenuBar {
  ArrayList IOPropertiesUsingFile = null;
  
  ArrayListExceptionprintstacktraceInGPackage EqualsInAiPackage = null;
  
  R c = null;
  
  public ManagerIopropertiesusingfile() {}
  
  public ManagerIopropertiesusingfile(R paramR, ArrayListExceptionprintstacktraceInGPackage parambv, ArrayList paramArrayList) {
    this.c = paramR;
    IOPropertiesUsingFile(paramR, parambv, paramArrayList);
  }
  
  public void IOPropertiesUsingFile(R paramR, ArrayListExceptionprintstacktraceInGPackage parambv, ArrayList paramArrayList) {
    this.IOPropertiesUsingFile = paramArrayList;
    this.EqualsInAiPackage = parambv;
    List list1 = parambv.JMenuItemExtensionInBaPackage();
    List list2 = parambv.U();
    if (list1.size() > 0 && RInterfaceIndia.IOPropertiesUsingFile().IOPropertiesUsingFile("hlk;rd;tporg;'gd")) {
      IOPropertiesUsingFile IOPropertiesUsingFile = c(SComponentGolf.EqualsInAiPackage("File"));
      IOPropertiesUsingFile.setMnemonic('F');
      IOPropertiesUsingFile(IOPropertiesUsingFile);
    } 
    if (list1.size() > 0) {
      IOPropertiesUsingFile IOPropertiesUsingFile = c(SComponentGolf.EqualsInAiPackage("View"));
      IOPropertiesUsingFile.setMnemonic('V');
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(SComponentGolf.EqualsInAiPackage("Show Lower Help Pane"));
      boolean bool = IOPropertiesUsingFile.IOPropertiesUsingFile().c(IOPropertiesUsingFile.ci, IOPropertiesUsingFile.cj);
      jCheckBoxMenuItem.setSelected(bool);
      IOPropertiesUsingFile.add(jCheckBoxMenuItem);
      jCheckBoxMenuItem.addActionListener(new bm(this));
    } 
    if (!list2.isEmpty() || (parambv.aa() != null && !parambv.aa().isEmpty())) {
      IOPropertiesUsingFile IOPropertiesUsingFile = c(SComponentGolf.EqualsInAiPackage("Tools"));
      IOPropertiesUsingFile.setMnemonic('T');
      boolean bool = false;
      for (EqualsInGPackage EqualsInGPackage : list2) {
        IOPropertiesUsingFile(IOPropertiesUsingFile, EqualsInGPackage);
        bool = true;
      } 
      String str = parambv.aa();
      if (str != null && !str.isEmpty() && RInterfaceIndia.IOPropertiesUsingFile().IOPropertiesUsingFile("fv-7rkf74nfd67whn5iuchqj")) {
        String str1;
        if (bool)
          IOPropertiesUsingFile.addSeparator(); 
        Manager Manager = paramR.c(parambv.aa());
        boolean bool1 = false;
        try {
          bool1 = (Manager.j(paramR.h()) != 0.0D) ? true : false;
        } catch (Exception exception) {
          D.c("Faied to get Password value.");
        } 
        if (bool1) {
          str1 = "Change Dialog Password";
        } else {
          str1 = "Password Protect Dialog";
        } 
        JMenuItemExtensionInBaPackage JMenuItemExtensionInBaPackage = new JMenuItemExtensionInBaPackage(SComponentGolf.EqualsInAiPackage(str1), true);
        JMenuItemExtensionInBaPackage.addActionListener(new bo(this, IOPropertiesUsingFile, paramR, parambv));
        IOPropertiesUsingFile.add((JMenuItem)JMenuItemExtensionInBaPackage);
        if (bool1) {
          JMenuItemExtensionInBaPackage e1 = new JMenuItemExtensionInBaPackage(SComponentGolf.EqualsInAiPackage("Clear Dialog Password."), true);
          e1.addActionListener(new bp(this, paramR, parambv, IOPropertiesUsingFile, e1));
          e1.IOPropertiesUsingFile(new GComponentBq(this, parambv));
          IOPropertiesUsingFile.add((JMenuItem)e1);
        } 
      } 
    } 
    ArrayList arrayList = parambv.O();
    if (parambv.J() > 0 || arrayList.size() > 0 || paramArrayList.size() > 0) {
      if (parambv.J() > 0) {
        Iterator<ArrayList> iterator = parambv.I();
        while (iterator.hasNext()) {
          ArrayList ArrayList = iterator.next();
          String str = SComponentGolf.EqualsInAiPackage(ArrayList.JMenuItemExtensionInBaPackage());
          IOPropertiesUsingFile IOPropertiesUsingFile = c(str);
          IOPropertiesUsingFile(IOPropertiesUsingFile, ArrayList);
        } 
      } 
      if (arrayList.size() > 0 || paramArrayList.size() > 0) {
        IOPropertiesUsingFile IOPropertiesUsingFile = new IOPropertiesUsingFile(SComponentGolf.EqualsInAiPackage("Help"));
        IOPropertiesUsingFile.setMnemonic('H');
        add((JMenu)IOPropertiesUsingFile);
        for (EqualsInAiPackage EqualsInAiPackage : paramArrayList) {
          JMenuItem jMenuItem = new JMenuItem(EqualsInAiPackage.IOPropertiesUsingFile());
          jMenuItem.setActionCommand(EqualsInAiPackage.EqualsInAiPackage());
          jMenuItem.addActionListener(new br(this));
          IOPropertiesUsingFile.add(jMenuItem);
        } 
        if (IOPropertiesUsingFile.getItemCount() > 0)
          IOPropertiesUsingFile.addSeparator(); 
        for (String str : arrayList) {
          GComponentAj GComponentAj = paramR.JMenuItemExtensionInBaPackage().EqualsInAiPackage(str);
          if (GComponentAj != null) {
            JMenuItem jMenuItem = new JMenuItem(SComponentGolf.EqualsInAiPackage(GComponentAj.d()));
            jMenuItem.setActionCommand(GComponentAj.IOPropertiesUsingFile());
            jMenuItem.addActionListener(new bs(this));
            IOPropertiesUsingFile.add(jMenuItem);
            continue;
          } 
          D.EqualsInAiPackage("helpTopic " + str + " is set for dialog, but not found in ini.");
        } 
      } 
    } 
  }
  
  private void IOPropertiesUsingFile(IOPropertiesUsingFile parama) {
    String str = SComponentGolf.EqualsInAiPackage("Save dialog settings");
    JMenuItemExtensionInBaPackage JMenuItemExtensionInBaPackage = new JMenuItemExtensionInBaPackage(str, true);
    JMenuItemExtensionInBaPackage.setMnemonic('S');
    JMenuItemExtensionInBaPackage.setActionCommand("savePartial");
    JMenuItemExtensionInBaPackage.setName("savePartial");
    JMenuItemExtensionInBaPackage.addActionListener(new bt(this));
    parama.add((JMenuItem)JMenuItemExtensionInBaPackage);
    str = SComponentGolf.EqualsInAiPackage("Load dialog settings");
    JMenuItemExtensionInBaPackage = new JMenuItemExtensionInBaPackage(str, true);
    JMenuItemExtensionInBaPackage.setMnemonic('L');
    JMenuItemExtensionInBaPackage.setActionCommand("loadPartial");
    JMenuItemExtensionInBaPackage.setName("loadPartial");
    JMenuItemExtensionInBaPackage.addActionListener(new bu(this));
    parama.add((JMenuItem)JMenuItemExtensionInBaPackage);
  }
  
  public void IOPropertiesUsingFile(IOPropertiesUsingFile parama, ArrayList paramaA) {
    Iterator<ArrayList> iterator = paramaA.IOPropertiesUsingFile();
    while (iterator.hasNext()) {
      ArrayList aA1 = iterator.next();
      if (aA1.EqualsInAiPackage()) {
        IOPropertiesUsingFile a1 = new IOPropertiesUsingFile(SComponentGolf.EqualsInAiPackage(aA1.JMenuItemExtensionInBaPackage()));
        a1.EqualsInAiPackage(a1.d());
        IOPropertiesUsingFile(a1, aA1);
        parama.add((JMenuItem)a1);
        continue;
      } 
      if (aA1.c()) {
        parama.addSeparator();
        continue;
      } 
      String str = SComponentGolf.EqualsInAiPackage(aA1.JMenuItemExtensionInBaPackage());
      JMenuItemExtensionInBaPackage JMenuItemExtensionInBaPackage = new JMenuItemExtensionInBaPackage(str, true);
      JMenuItemExtensionInBaPackage.setActionCommand(aA1.d());
      JMenuItemExtensionInBaPackage.setName(aA1.f() + "");
      JMenuItemExtensionInBaPackage.addActionListener(new ArrayListExceptionprintstacktraceInGPackage(this));
      parama.add((JMenuItem)JMenuItemExtensionInBaPackage);
    } 
  }
  
  public void IOPropertiesUsingFile(IOPropertiesUsingFile parama, EqualsInGPackage parambI) {
    JMenuItemExtensionInBaPackage JMenuItemExtensionInBaPackage;
    String str = SComponentGolf.EqualsInAiPackage(parambI.EqualsInAiPackage());
    if (RInterfaceIndia.IOPropertiesUsingFile().IOPropertiesUsingFile(".ewqlfdds/JMenuItemExtensionInBaPackage;ewropglk")) {
      JMenuItemExtensionInBaPackage = new JMenuItemExtensionInBaPackage(str, true);
      JMenuItemExtensionInBaPackage.setActionCommand(parambI.IOPropertiesUsingFile());
      JMenuItemExtensionInBaPackage.setName(parambI.aL());
      JMenuItemExtensionInBaPackage.addActionListener(new bx(this, this.c, parambI));
      if (parambI.aJ() != null)
        JMenuItemExtensionInBaPackage.IOPropertiesUsingFile(new bw(this, parambI.aJ(), this.c)); 
    } else {
      JMenuItemExtensionInBaPackage = new JMenuItemExtensionInBaPackage("Enable " + str, true);
      JMenuItemExtensionInBaPackage.addActionListener(new bn(this));
    } 
    if (!RInterfaceIndia.IOPropertiesUsingFile().IOPropertiesUsingFile("-0o4togd;'fdshlew"))
      parama.add((JMenuItem)JMenuItemExtensionInBaPackage); 
  }
  
  private IOPropertiesUsingFile c(String paramString) {
    for (byte EqualsInAiPackage = 0; EqualsInAiPackage < getMenuCount(); EqualsInAiPackage++) {
      IOPropertiesUsingFile a1 = (IOPropertiesUsingFile)getMenu(EqualsInAiPackage);
      if (a1 != null && a1.getText().equals(paramString))
        return a1; 
    } 
    IOPropertiesUsingFile IOPropertiesUsingFile = new IOPropertiesUsingFile(paramString);
    add((JMenu)IOPropertiesUsingFile);
    return IOPropertiesUsingFile;
  }
  
  public void IOPropertiesUsingFile(String paramString) {
    f.IOPropertiesUsingFile().IOPropertiesUsingFile(this.c, paramString, bV.IOPropertiesUsingFile(this));
  }
  
  public void EqualsInAiPackage(String paramString) {
    if (this.IOPropertiesUsingFile == null) {
      D.c("helpRefs is null, can not show app help");
      return;
    } 
    EqualsInAiPackage EqualsInAiPackage = null;
    for (EqualsInAiPackage b1 : this.IOPropertiesUsingFile) {
      if (b1.EqualsInAiPackage().equals(paramString)) {
        EqualsInAiPackage = b1;
        break;
      } 
    } 
    if (EqualsInAiPackage == null)
      EqualsInAiPackage = new EqualsInAiPackage("Application Help", paramString); 
    f.IOPropertiesUsingFile().IOPropertiesUsingFile(EqualsInAiPackage, bV.IOPropertiesUsingFile(this));
  }
  
  private void IOPropertiesUsingFile() {
    List list = ExceptionprintstacktraceInGPackage.c(this.c, this.EqualsInAiPackage);
    String str = (this.EqualsInAiPackage.aL() != null) ? this.EqualsInAiPackage.aL() : "";
    f.IOPropertiesUsingFile().IOPropertiesUsingFile(this.c, str, list);
  }
  
  private void EqualsInAiPackage() {
    List list1 = this.EqualsInAiPackage.JMenuItemExtensionInBaPackage();
    List list2 = ExceptionprintstacktraceInGPackage.c(this.c, this.EqualsInAiPackage);
    if (list2.size() > list1.size()) {
      String str = "The settings within this dialog have dependencies on additional settings not in thie dialog.\nTo insure the settings in this dialog are loaded correctly\nthe following additional settings should be loaded also:\n";
      for (String str1 : list2) {
        if (!list1.contains(str1)) {
          GComponentBq GComponentBq = ExceptionprintstacktraceInGPackage.d(this.c, str1);
          String str2 = (GComponentBq == null) ? str1 : GComponentBq.l();
          str = str + str2 + "\n";
        } 
      } 
      String[] arrayOfString = { "Include Additional Dependencies", "Load Only Dialog Settings" };
      boolean bool = bV.IOPropertiesUsingFile(str, "Load Dialog Settings", bV.EqualsInAiPackage(this), arrayOfString);
      if (bool)
        list1 = list2; 
    } 
    f.IOPropertiesUsingFile().IOPropertiesUsingFile(dd.IOPropertiesUsingFile().c(), this.c, list1);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */