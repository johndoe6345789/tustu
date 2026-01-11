package aP;

import G.R;
import G.S;
import G.T;
import G.ArrayList;
import G.GInterfaceAg;
import G.GInterfaceAb;
import G.GComponentAj;
import G.ExceptionprintstacktraceInGPackage;
import G.AeInterfaceMikeTostring;
import G.GInterfaceBu;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.GComponentCq;
import G.ManagerUsingArrayList;
import aE.PropertiesExtension;
import aE.AeInterfaceEcho;
import bA.JCheckBoxMenuItemExtension;
import bA.BaInterfaceDelta;
import bA.BaInterfaceFoxtrot;
import bH.A;
import bH.D;
import bH.J;
import bH.X;
import bl.ApplicationPluginExtension;
import bq.ManagerUsingJPopupMenu;
import JCheckBoxMenuItemExtension.AeInterfaceEcho;
import com.efiAnalytics.plugin.ApplicationPlugin;
import com.efiAnalytics.tunerStudio.search.B;
import com.efiAnalytics.tunerStudio.search.C;
import com.efiAnalytics.tunerStudio.search.h;
import com.efiAnalytics.tunerStudio.search.ApplicationPluginExtension;
import com.efiAnalytics.tunerStudio.search.m;
import com.efiAnalytics.ui.BinTableView;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bs;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import r.PropertiesExtension;
import r.RInterfaceIndia;
import s.AeInterfaceEcho;
import s.BaInterfaceFoxtrot;
import s.SComponentGolf;
import x.PropertiesExtension;

public final class ManagerManagerusingjpopupmenu implements S, GInterfaceAg, GInterfaceAb, GInterfaceBu, AeInterfaceEcho {
  public static String PropertiesExtension = PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.dl, "Toolbar Style");
  
  private String p = PropertiesExtension;
  
  public static String ManagerUsingJPopupMenu = "Help";
  
  BaInterfaceFoxtrot JCheckBoxMenuItemExtension = null;
  
  R BaInterfaceDelta = null;
  
  private gQ q = new gQ(this);
  
  BaInterfaceDelta AeInterfaceEcho = null;
  
  S BaInterfaceFoxtrot = new S();
  
  int SComponentGolf = 3;
  
  JFrame h = null;
  
  String[] RInterfaceIndia = new String[] { "resources/cog.png", "resources/wrench2.png", "resources/tools3.png", "resources/tools2.png", "resources/connecting_rod_32.png" };
  
  int j = 0;
  
  List k = new ArrayList();
  
  List ApplicationPluginExtension = new ArrayList();
  
  gT m;
  
  GComponentCq n = new dC(this);
  
  AeInterfaceEcho o = new eT(this);
  
  public ManagerManagerusingjpopupmenu(JFrame paramJFrame, BaInterfaceFoxtrot paramf) {
    this.JCheckBoxMenuItemExtension = paramf;
    this.h = paramJFrame;
    paramJFrame.setJMenuBar(this.q);
    m();
    JCheckBoxMenuItemExtension(PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension("navigationStyle", PropertiesExtension));
    ToolTipManager.sharedInstance().setDismissDelay(12000);
  }
  
  private void m() {
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("09fewlkm309glkfds09"))
      this.q.add((JMenu)AeInterfaceEcho()); 
    if (!PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.cU, PropertiesExtension.cV) && !RInterfaceIndia.PropertiesExtension().PropertiesExtension("-rewqjmgdlijyre"))
      this.q.add((JMenu)SComponentGolf()); 
    if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension("ewq-0rfdrewewr"))
      this.q.add((JMenu)BaInterfaceFoxtrot()); 
    if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension(";lgd;lgdhf[p"))
      this.q.add((JMenu)h()); 
    if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension("w-0-[-egd;ls"))
      this.q.add((JMenu)RInterfaceIndia()); 
    this.q.add((JMenu)j());
    boolean bool = UIManager.getLookAndFeel().getName().contains("OS X");
    if (!bool) {
      m m = new m();
      dd.PropertiesExtension().PropertiesExtension(m);
      this.q.add((Component)m);
      if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension("432p'[pgd-0[p")) {
        m.setEnabled(false);
        m.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("Register to enable."));
      } 
    } 
  }
  
  public List ManagerUsingJPopupMenu(String paramString) {
    ArrayList<B> arrayList = new ArrayList();
    for (byte ManagerUsingJPopupMenu = 0; ManagerUsingJPopupMenu < this.q.getMenuCount(); ManagerUsingJPopupMenu++) {
      JMenu jMenu = this.q.getMenu(ManagerUsingJPopupMenu);
      if (jMenu != null && jMenu.isEnabled()) {
        Component[] arrayOfComponent = jMenu.getMenuComponents();
        for (byte b1 = 0; b1 < arrayOfComponent.length; b1++) {
          B b2 = new B();
          b2.ManagerUsingJPopupMenu(jMenu.getText() + " " + SComponentGolf.ManagerUsingJPopupMenu("Menu"));
          if (arrayOfComponent[b1] instanceof JMenu) {
            JMenu jMenu1 = (JMenu)arrayOfComponent[b1];
            B b3 = PropertiesExtension(jMenu1, paramString);
            if (!b3.isEmpty())
              arrayList.add(b3); 
          } else if (arrayOfComponent[b1] instanceof JMenuItem) {
            JMenuItem jMenuItem = (JMenuItem)arrayOfComponent[b1];
            if (jMenuItem != null && jMenuItem.getText() != null && jMenuItem.getText().contains(paramString)) {
              C JCheckBoxMenuItemExtension = new C();
              JCheckBoxMenuItemExtension.PropertiesExtension(jMenuItem.getText());
              JCheckBoxMenuItemExtension.ManagerUsingJPopupMenu(paramString);
              JCheckBoxMenuItemExtension.JCheckBoxMenuItemExtension(SComponentGolf.ManagerUsingJPopupMenu("Menu"));
              JCheckBoxMenuItemExtension.PropertiesExtension((ApplicationPluginExtension)new h(jMenuItem));
              b2.add(JCheckBoxMenuItemExtension);
            } 
          } 
          if (!b2.isEmpty())
            arrayList.add(b2); 
        } 
      } 
    } 
    return arrayList;
  }
  
  private B PropertiesExtension(JMenu paramJMenu, String paramString) {
    String str = SComponentGolf.ManagerUsingJPopupMenu("Menu: ") + paramJMenu.getText();
    null = new B();
    null.ManagerUsingJPopupMenu(str);
    return PropertiesExtension(null, paramJMenu, paramString);
  }
  
  private B PropertiesExtension(B paramB, JMenu paramJMenu, String paramString) {
    D.JCheckBoxMenuItemExtension("Looking to children of: " + paramJMenu.getText());
    for (byte ManagerUsingJPopupMenu = 0; ManagerUsingJPopupMenu < paramJMenu.getItemCount(); ManagerUsingJPopupMenu++) {
      JMenuItem jMenuItem = paramJMenu.getItem(ManagerUsingJPopupMenu);
      if (jMenuItem != null && jMenuItem.getText() != null && jMenuItem.getText().contains(paramString)) {
        C JCheckBoxMenuItemExtension = new C();
        JCheckBoxMenuItemExtension.PropertiesExtension(jMenuItem.getText());
        JCheckBoxMenuItemExtension.ManagerUsingJPopupMenu(paramString);
        JCheckBoxMenuItemExtension.JCheckBoxMenuItemExtension(SComponentGolf.ManagerUsingJPopupMenu("Menu"));
        JCheckBoxMenuItemExtension.PropertiesExtension((ApplicationPluginExtension)new h(jMenuItem));
        paramB.add(JCheckBoxMenuItemExtension);
      } 
    } 
    return paramB;
  }
  
  public void JCheckBoxMenuItemExtension(String paramString) {
    if (paramString.equals("Wrapping Main Menu") && PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension("lookAndFeelClass", "").contains("TinyLookAndFeel"))
      paramString = "Main Menu Style"; 
    if (paramString.equals("MegaTune Style"))
      paramString = "Main Menu Style"; 
    if (paramString.equals(this.p) && this.AeInterfaceEcho != null) {
      D.JCheckBoxMenuItemExtension("updateMenuStyle ignoring, already set to " + paramString);
      return;
    } 
    this.p = paramString;
    JCheckBoxMenuItemExtension();
  }
  
  public void JCheckBoxMenuItemExtension() {
    this.j = 0;
    if (this.AeInterfaceEcho != null)
      n(); 
    if (this.p.equals("Main Menu Style")) {
      if (this.AeInterfaceEcho != null && !this.AeInterfaceEcho.equals(this.q))
        this.h.remove(this.AeInterfaceEcho.getComponent()); 
      this.AeInterfaceEcho = this.q;
      this.SComponentGolf = 3;
    } else if (this.p.equals("Wrapping Main Menu")) {
      if (this.AeInterfaceEcho != null && !this.AeInterfaceEcho.equals(this.q))
        this.h.remove(this.AeInterfaceEcho.getComponent()); 
      this.AeInterfaceEcho = this.q;
      this.SComponentGolf = 3;
    } else {
      String str = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension("tuningToolbarLocation", "North");
      gZ gZ = new gZ(this);
      gZ.setOrientation(str.equals("North") ? 0 : 1);
      this.AeInterfaceEcho = gZ;
      this.SComponentGolf = 0;
      this.h.add(str, this.AeInterfaceEcho.getComponent());
    } 
    p();
    k();
  }
  
  private void n() {
    if (this.m != null)
      gT.PropertiesExtension(this.m); 
    this.q.removeAll();
    for (String str : this.AeInterfaceEcho.PropertiesExtension().ManagerUsingJPopupMenu()) {
      for (int RInterfaceIndia = this.AeInterfaceEcho.PropertiesExtension(str) - 1; RInterfaceIndia >= 0; RInterfaceIndia--) {
        BaInterfaceFoxtrot f1 = this.AeInterfaceEcho.PropertiesExtension(str, RInterfaceIndia);
        this.AeInterfaceEcho.PropertiesExtension(f1.getComponent());
        f1.BaInterfaceFoxtrot();
      } 
    } 
    m();
  }
  
  private void o() {
    String str = SComponentGolf.ManagerUsingJPopupMenu("Upgrade!");
    for (String str1 : T.PropertiesExtension().BaInterfaceDelta()) {
      BaInterfaceFoxtrot f1 = PropertiesExtension(str1, str);
      if (f1 == null) {
        String str2 = SComponentGolf.ManagerUsingJPopupMenu(str);
        f1 = PropertiesExtension(str2, false);
        f1.JCheckBoxMenuItemExtension("resources/upgrade24.png");
        f1.PropertiesExtension(new fe(this));
        this.AeInterfaceEcho.PropertiesExtension(str1, f1.getComponent(), AeInterfaceEcho(str1));
      } 
    } 
  }
  
  private void p() {
    if (this.BaInterfaceDelta == null)
      return; 
    String[] arrayOfString = T.PropertiesExtension().BaInterfaceDelta();
    this.AeInterfaceEcho.PropertiesExtension().PropertiesExtension();
    for (byte ManagerUsingJPopupMenu = 0; ManagerUsingJPopupMenu < arrayOfString.length; ManagerUsingJPopupMenu++) {
      R r = T.PropertiesExtension().JCheckBoxMenuItemExtension(arrayOfString[ManagerUsingJPopupMenu]);
      gF gF = new gF(this, r);
      Iterator<ArrayList> iterator = r.AeInterfaceEcho().ManagerUsingJPopupMenu();
      while (iterator.hasNext()) {
        ArrayList ArrayList = iterator.next();
        BaInterfaceFoxtrot f1 = PropertiesExtension(arrayOfString[ManagerUsingJPopupMenu], SComponentGolf.ManagerUsingJPopupMenu(ArrayList.AeInterfaceEcho()));
        if (f1 == null) {
          String str1 = SComponentGolf.ManagerUsingJPopupMenu(ArrayList.h());
          if (str1.equals(ArrayList.h()))
            str1 = ArrayList.AeInterfaceEcho(); 
          f1 = PropertiesExtension(str1, false);
          try {
            f1.JCheckBoxMenuItemExtension(BaInterfaceDelta(ArrayList.AeInterfaceEcho()));
          } catch (Exception exception) {
            D.PropertiesExtension("Failed to get icon image.");
            exception.printStackTrace();
          } 
          if (ArrayList.aJ() != null && !ArrayList.aJ().equals("")) {
            f1.ManagerUsingJPopupMenu(ArrayList.aJ());
            if (f1 instanceof bs)
              ((bs)f1).PropertiesExtension(new gS(this, ArrayList.aJ(), r)); 
          } 
          if (ArrayList.RInterfaceIndia() != null && !ArrayList.RInterfaceIndia().equals(""))
            f1.ManagerUsingJPopupMenu(new gS(this, ArrayList.RInterfaceIndia(), r)); 
          if (ArrayList.SComponentGolf() != null && !ArrayList.SComponentGolf().equals(""))
            f1.setMnemonic(ArrayList.SComponentGolf().toUpperCase().charAt(0)); 
          this.AeInterfaceEcho.PropertiesExtension(arrayOfString[ManagerUsingJPopupMenu], f1.getComponent(), AeInterfaceEcho(arrayOfString[ManagerUsingJPopupMenu]));
        } 
        f1.PropertiesExtension(gF);
        String str = (arrayOfString.length > 1) ? arrayOfString[ManagerUsingJPopupMenu] : null;
        PropertiesExtension(r, ArrayList, f1, str);
      } 
    } 
    if (this.AeInterfaceEcho.ManagerUsingJPopupMenu() > 0 && RInterfaceIndia.PropertiesExtension().PropertiesExtension("pokrepopoktrg9034"))
      o(); 
    this.AeInterfaceEcho.PropertiesExtension().ManagerUsingJPopupMenu(this.BaInterfaceDelta.JCheckBoxMenuItemExtension());
    BaInterfaceDelta();
    fp fp = new fp(this);
    try {
      if (SwingUtilities.isEventDispatchThread()) {
        fp.run();
      } else {
        SwingUtilities.invokeAndWait(fp);
      } 
    } catch (Exception exception) {
      Logger.getLogger(dB.class.getName()).log(Level.SEVERE, "Failed to invoke menu topdown start", exception);
    } 
  }
  
  private void PropertiesExtension(R paramR, BaInterfaceFoxtrot paramf, ArrayList paramaA, String paramString) {
    String str = SComponentGolf.PropertiesExtension(paramaA.h(), paramaA.AeInterfaceEcho());
    str = (paramString != null && paramString.length() > 0 && paramf.h()) ? (str + " (" + paramString + ")") : str;
    gX gX = new gX(this, str, false);
    Icon icon = PropertiesExtension(paramaA);
    if (icon != null)
      gX.setIcon(icon); 
    gX.setActionCommand(paramR.JCheckBoxMenuItemExtension() + "." + paramaA.BaInterfaceDelta());
    gX.setName("" + paramaA.BaInterfaceFoxtrot());
    if (paramaA.RInterfaceIndia() != null && !paramaA.RInterfaceIndia().equals(""))
      gX.ManagerUsingJPopupMenu(new gS(this, paramaA.RInterfaceIndia(), paramR)); 
    if (paramaA.aJ() != null && !paramaA.aJ().equals("")) {
      gX.PropertiesExtension(new gS(this, paramaA.aJ(), paramR));
      if (PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bl, PropertiesExtension.bm)) {
        String str1 = ExceptionprintstacktraceInGPackage.AeInterfaceEcho(paramR, paramaA.aJ());
        str1 = X.PropertiesExtension(str1, 120, "<br>&nbsp;&nbsp;&nbsp;");
        StringBuilder stringBuilder = (new StringBuilder("<html><body>")).append(SComponentGolf.ManagerUsingJPopupMenu("Enabled when")).append(": ").append(paramaA.aJ()).append("<br><br>").append(SComponentGolf.ManagerUsingJPopupMenu("Friendly")).append(": ").append(str1).append("</body></html>");
        gX.setToolTipText(stringBuilder.toString());
      } 
    } 
    if (paramaA.SComponentGolf() != null && !paramaA.SComponentGolf().equals(""))
      gX.setMnemonic(paramaA.SComponentGolf().charAt(0)); 
    if (paramf.getText().equals(ManagerUsingJPopupMenu)) {
      gX.addActionListener(new gJ(this, paramR));
    } else if (!paramaA.ManagerUsingJPopupMenu()) {
      gX.addActionListener(new fA(this));
    } 
    paramf.add((Component)gX);
  }
  
  private BaInterfaceFoxtrot PropertiesExtension(R paramR, ArrayList paramaA, BaInterfaceFoxtrot paramf, String paramString) {
    Iterator<ArrayList> iterator = paramaA.PropertiesExtension();
    while (iterator.hasNext()) {
      ArrayList aA1 = iterator.next();
      if (aA1.JCheckBoxMenuItemExtension()) {
        paramf.addSeparator();
        continue;
      } 
      if (aA1.ManagerUsingJPopupMenu()) {
        String str = SComponentGolf.PropertiesExtension(aA1.h(), aA1.AeInterfaceEcho());
        str = (paramString != null && paramString.length() > 0) ? (str + " (" + paramString + ")") : str;
        gW gW = new gW(this, str, false);
        Icon icon = PropertiesExtension(aA1);
        if (icon != null)
          gW.setIcon(icon); 
        if (aA1.RInterfaceIndia() != null && !aA1.RInterfaceIndia().equals(""))
          gW.ManagerUsingJPopupMenu(new gS(this, aA1.RInterfaceIndia(), paramR)); 
        if (aA1.aJ() != null && !aA1.aJ().equals("")) {
          gW.PropertiesExtension(new gS(this, aA1.aJ(), paramR));
          if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("lk098oijrepoijrgds98ugoi") && PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bl, PropertiesExtension.bm)) {
            String str1 = ExceptionprintstacktraceInGPackage.AeInterfaceEcho(paramR, aA1.aJ());
            str1 = X.PropertiesExtension(str1, 120, "<br>&nbsp;&nbsp;&nbsp;");
            StringBuilder stringBuilder = (new StringBuilder("<html><body>")).append(SComponentGolf.ManagerUsingJPopupMenu("Enabled when")).append(": ").append(aA1.aJ()).append("<br><br>").append(SComponentGolf.ManagerUsingJPopupMenu("Friendly")).append(": ").append(str1).append("</body></html>");
            gW.setToolTipText(stringBuilder.toString());
          } 
        } 
        Iterator<ArrayList> iterator1 = aA1.PropertiesExtension();
        while (iterator1.hasNext()) {
          ArrayList aA2 = iterator1.next();
          if (aA2.JCheckBoxMenuItemExtension()) {
            gW.addSeparator();
            continue;
          } 
          PropertiesExtension(paramR, (BaInterfaceFoxtrot)gW, aA2, paramString);
        } 
        paramf.add((Component)gW);
        continue;
      } 
      PropertiesExtension(paramR, paramf, aA1, paramString);
    } 
    return paramf;
  }
  
  private int AeInterfaceEcho(String paramString) {
    return this.AeInterfaceEcho.PropertiesExtension(paramString) - this.SComponentGolf;
  }
  
  private Icon PropertiesExtension(ArrayList paramaA) {
    R r = T.PropertiesExtension().JCheckBoxMenuItemExtension();
    ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = r.AeInterfaceEcho().JCheckBoxMenuItemExtension(paramaA.BaInterfaceDelta());
    GComponentAj GComponentAj = r.AeInterfaceEcho().ManagerUsingJPopupMenu(paramaA.BaInterfaceDelta());
    Object object = null;
    if (paramaA.ManagerUsingJPopupMenu()) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/folder16.png"));
      return new ImageIcon(image1);
    } 
    if (ArrayListExceptionprintstacktraceInGPackage instanceof G.be || (ArrayListExceptionprintstacktraceInGPackage != null && ArrayListExceptionprintstacktraceInGPackage.S())) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/table.png"));
      return new ImageIcon(image1);
    } 
    if (ArrayListExceptionprintstacktraceInGPackage instanceof G.bm || (ArrayListExceptionprintstacktraceInGPackage != null && ArrayListExceptionprintstacktraceInGPackage.T())) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/curve.png"));
      return new ImageIcon(image1);
    } 
    if (GComponentAj instanceof GComponentAj) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/help16.gif"));
      return new ImageIcon(image1);
    } 
    if (ArrayListExceptionprintstacktraceInGPackage instanceof G.bi) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/table3d.png"));
      return new ImageIcon(image1);
    } 
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/settings.gif"));
    return new ImageIcon(image);
  }
  
  public BaInterfaceFoxtrot PropertiesExtension(String paramString1, String paramString2) {
    byte ManagerUsingJPopupMenu;
    for (ManagerUsingJPopupMenu = 0; ManagerUsingJPopupMenu < this.q.getMenuCount(); ManagerUsingJPopupMenu++) {
      BaInterfaceFoxtrot f1 = (BaInterfaceFoxtrot)this.q.getMenu(ManagerUsingJPopupMenu);
      if (f1 instanceof BaInterfaceFoxtrot) {
        BaInterfaceFoxtrot f2 = (BaInterfaceFoxtrot)f1;
        if (f2.PropertiesExtension().equals(paramString2))
          return f1; 
      } else if (f1 != null && f1.getText().equals(paramString2)) {
        return f1;
      } 
    } 
    for (ManagerUsingJPopupMenu = 0; ManagerUsingJPopupMenu < this.AeInterfaceEcho.PropertiesExtension(paramString1); ManagerUsingJPopupMenu++) {
      BaInterfaceFoxtrot f1 = this.AeInterfaceEcho.PropertiesExtension(paramString1, ManagerUsingJPopupMenu);
      if (f1 instanceof BaInterfaceFoxtrot) {
        BaInterfaceFoxtrot f2 = (BaInterfaceFoxtrot)f1;
        if (f2.PropertiesExtension().equals(paramString2))
          return f1; 
      } else if (f1 != null && f1.getText().equals(paramString2)) {
        return f1;
      } 
    } 
    return null;
  }
  
  public BaInterfaceFoxtrot BaInterfaceDelta() {
    int RInterfaceIndia = PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.aH, PropertiesExtension.PropertiesExtension().o());
    Font font1 = this.q.getFont();
    Font font2 = new Font(font1.getFamily(), font1.getStyle(), RInterfaceIndia);
    for (String str : T.PropertiesExtension().BaInterfaceDelta()) {
      for (byte ManagerUsingJPopupMenu = 0; ManagerUsingJPopupMenu < this.AeInterfaceEcho.PropertiesExtension(str); ManagerUsingJPopupMenu++) {
        BaInterfaceFoxtrot f1 = this.AeInterfaceEcho.PropertiesExtension(str, ManagerUsingJPopupMenu);
        if (f1 instanceof Component) {
          Component component = (Component)f1;
          component.setFont(font2);
        } 
      } 
    } 
    return null;
  }
  
  public PropertiesExtension AeInterfaceEcho() {
    gN gN = new gN(this, "File", true);
    gN.setMnemonic('F');
    fM fM = new fM(this);
    gW gW = new gW(this, "Vehicle Projects", true);
    gW.PropertiesExtension(this.o);
    gX gX = null;
    if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension("4320432porepo09")) {
      gX = new gX(this, "New Project", true);
      gX.setAccelerator(KeyStroke.getKeyStroke(78, 8));
      gX.addActionListener(new fX(this));
      gW.add((JMenuItem)gX);
    } 
    gX = new gX(this, "Open Project", true);
    gX.setAccelerator(KeyStroke.getKeyStroke(79, 8));
    gX.addActionListener(new gi(this));
    gW.add((JMenuItem)gX);
    gX = new gX(this, "Close Project", true);
    gX.setAccelerator(KeyStroke.getKeyStroke(88, 8));
    gX.PropertiesExtension(this.o);
    gX.addActionListener(new gt(this));
    gW.add((JMenuItem)gX);
    gW.addSeparator();
    gX = new gX(this, "Create Project Backup", true);
    gX.addActionListener(new dD(this));
    gW.add((JMenuItem)gX);
    gX = new gX(this, "Import Project Backup", true);
    gX.addActionListener(new dO(this));
    gX.PropertiesExtension(new dZ(this));
    gW.add((JMenuItem)gX);
    if (Desktop.isDesktopSupported()) {
      gX = new gX(this, "Show Project Folder", true);
      gX.addActionListener(new ek(this));
      gW.add((JMenuItem)gX);
    } 
    gW.addSeparator();
    gX = new gX(this, "Project Properties", true);
    gX.setAccelerator(KeyStroke.getKeyStroke(80, 2));
    gX.PropertiesExtension(this.o);
    gX.addActionListener(new ev(this));
    gW.add((JMenuItem)gX);
    gN.add((JMenuItem)gW);
    if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension("4320432porepo09")) {
      gX = new gX(this, "New Project", true);
      gX.setAccelerator(KeyStroke.getKeyStroke(78, 8));
      gX.PropertiesExtension(fM);
      gX.addActionListener(new eG(this));
      gN.add((JMenuItem)gX);
    } 
    if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension("h-0ewkfd[pfd[pew")) {
      gO gO = new gO(this);
      gN.add((JMenuItem)gO);
    } 
    gX = new gX(this, "Open Project", true);
    gX.setAccelerator(KeyStroke.getKeyStroke(79, 8));
    gX.PropertiesExtension(fM);
    gX.addActionListener(new eP(this));
    gN.add((JMenuItem)gX);
    gX = new gX(this, "Import Project Backup", true);
    gX.PropertiesExtension(fM);
    gX.addActionListener(new eQ(this));
    gN.add((JMenuItem)gX);
    gX.setEnabled(RInterfaceIndia.PropertiesExtension().PropertiesExtension("09RGDKDG;LKIGD"));
    gN.addSeparator();
    gX = new gX(this, "Tune Restore Points", true);
    gX.setAccelerator(KeyStroke.getKeyStroke(82, 2));
    gX.addActionListener(new eR(this));
    gN.add((JMenuItem)gX);
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("-=fds[pfds[pgd-0")) {
      gX.PropertiesExtension(this.o);
    } else {
      gX.setEnabled(false);
    } 
    gX = new gX(this, SComponentGolf.ManagerUsingJPopupMenu("Load Tune") + " (" + PropertiesExtension.cw + ")", true);
    gX.setAccelerator(KeyStroke.getKeyStroke(79, 2));
    gX.addActionListener(new eS(this));
    gN.add((JMenuItem)gX);
    gX = new gX(this, "Save Tune", true);
    gX.setAccelerator(KeyStroke.getKeyStroke(83, 2));
    gX.PropertiesExtension(this.o);
    gX.addActionListener(new eU(this));
    gN.add((JMenuItem)gX);
    gX = new gX(this, "Save Tune As", true);
    gX.PropertiesExtension(this.o);
    gX.addActionListener(new eV(this));
    gN.add((JMenuItem)gX);
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("67r67r8yhdrtrbyuk")) {
      gX = new gX(this, "Compare Tune", true);
      gX.setAccelerator(KeyStroke.getKeyStroke(77, 2));
      gX.PropertiesExtension(new eW(this));
      gX.addActionListener(new eX(this));
      gN.add((JMenuItem)gX);
    } 
    boolean bool1 = PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.da, PropertiesExtension.db);
    if (!bool1) {
      gI gI = new gI(this, "Gauge Cluster");
      gI.PropertiesExtension(new eY(this));
      gN.add((JMenuItem)gI);
    } 
    boolean bool2 = RInterfaceIndia.PropertiesExtension().PropertiesExtension(";LFDS;LFDS0943;L");
    if (bool2) {
      gY gY = new gY(this, "Tuning Views");
      gY.PropertiesExtension(new eZ(this));
      gN.add((JMenuItem)gY);
    } 
    fa fa = new fa(this);
    gV gV = new gV(this, "Work Offline", false, false);
    gV.setAccelerator(KeyStroke.getKeyStroke(87, 2));
    gV.PropertiesExtension(fa);
    gV.PropertiesExtension(new fb(this));
    gV.addActionListener(new fc(this));
    gN.add((JMenuItem)gV);
    gN.addSeparator();
    gX = new gX(this, "Exit", true);
    gX.addActionListener(new fd(this));
    gN.add((JMenuItem)gX);
    return gN;
  }
  
  public PropertiesExtension BaInterfaceFoxtrot() {
    gW gW = new gW(this, "Data Logging", true);
    if (this.p.equals("Wrapping Main Menu"))
      gW.ManagerUsingJPopupMenu(true); 
    gW.PropertiesExtension(this.o);
    gW.setMnemonic('D');
    boolean bool = RInterfaceIndia.PropertiesExtension().PropertiesExtension(";'rew-043;lh/lhoi");
    gX gX1 = new gX(this, "Start Logging", true);
    gX1.setAccelerator(KeyStroke.getKeyStroke(76, 2));
    gX1.PropertiesExtension(new ff(this));
    gX1.setEnabled(bool);
    gX1.addActionListener(new fg(this));
    gW.add((JMenuItem)gX1);
    gX1 = new gX(this, "Stop", true);
    gX1.setAccelerator(KeyStroke.getKeyStroke(75, 2));
    gX1.PropertiesExtension(new fh(this));
    gX1.addActionListener(new fi(this));
    gW.add((JMenuItem)gX1);
    gX gX2 = new gX(this, "Logging Profiles", true);
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("fg;';'[PD;LSAG")) {
      gX2.PropertiesExtension(this.o);
      gX2.addActionListener(new fj(this));
    } else {
      gX2.setEnabled(false);
    } 
    gW.add((JMenuItem)gX2);
    gX gX3 = new gX(this, "Triggered Logging", true);
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("FDSDSA-0;L;l0") || RInterfaceIndia.PropertiesExtension().PropertiesExtension("sa0-0o0os-0o-0DS")) {
      gX3.PropertiesExtension(this.o);
      gX3.addActionListener(new fk(this));
    } else {
      gX3.setEnabled(false);
    } 
    gW.add((JMenuItem)gX3);
    gW.addSeparator();
    PropertiesExtension a1 = new PropertiesExtension(SComponentGolf.ManagerUsingJPopupMenu("Data Logging Preferences"));
    PropertiesExtension a2 = new PropertiesExtension(SComponentGolf.ManagerUsingJPopupMenu("Data Log Format"));
    ButtonGroup buttonGroup = new ButtonGroup();
    String str = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.cA, PropertiesExtension.cB);
    JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("ASCII Format") + " (" + PropertiesExtension.cs + ")");
    jCheckBoxMenuItem1.setSelected(str.equals(PropertiesExtension.cs));
    jCheckBoxMenuItem1.addActionListener(new fl(this));
    a2.add(jCheckBoxMenuItem1);
    buttonGroup.add(jCheckBoxMenuItem1);
    JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Enhanced Logging Format") + " (" + PropertiesExtension.cr + ")");
    jCheckBoxMenuItem2.setSelected(str.equals(PropertiesExtension.cr));
    jCheckBoxMenuItem2.addActionListener(new fm(this));
    a2.add(jCheckBoxMenuItem2);
    buttonGroup.add(jCheckBoxMenuItem2);
    a1.add((JMenuItem)a2);
    gW.add((JMenuItem)a1);
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("8754JUREJYFD87")) {
      JMenu jMenu = new JMenu("Data Log Naming");
      String str1 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.ce, PropertiesExtension.cf);
      buttonGroup = new ButtonGroup();
      JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Name Data Logs On Stop"), str1.equals(PropertiesExtension.bX));
      jCheckBoxMenuItem3.addActionListener(new fn(this));
      buttonGroup.add(jCheckBoxMenuItem3);
      jMenu.add(jCheckBoxMenuItem3);
      JCheckBoxMenuItem jCheckBoxMenuItem4 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Name Data Logs On Start"), str1.equals(PropertiesExtension.bY));
      jCheckBoxMenuItem4.addActionListener(new fo(this));
      buttonGroup.add(jCheckBoxMenuItem4);
      jMenu.add(jCheckBoxMenuItem4);
      JCheckBoxMenuItem jCheckBoxMenuItem5 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Silently Auto Name Log Files"), str1.equals(PropertiesExtension.bZ));
      jCheckBoxMenuItem5.addActionListener(new fq(this));
      buttonGroup.add(jCheckBoxMenuItem5);
      jMenu.add(jCheckBoxMenuItem5);
      a1.add(jMenu);
      boolean bool1 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.ca, PropertiesExtension.cb);
      JCheckBoxMenuItemExtension JCheckBoxMenuItemExtension = new JCheckBoxMenuItemExtension(SComponentGolf.ManagerUsingJPopupMenu("Show Rename Dialog on SD Download"), true, bool1);
      JCheckBoxMenuItemExtension.PropertiesExtension(new fr(this));
      a1.add((JMenuItem)JCheckBoxMenuItemExtension);
      if (RInterfaceIndia.PropertiesExtension().PropertiesExtension(" 09s98r32-po3q9264")) {
        boolean bool2 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.ae, PropertiesExtension.af);
        JCheckBoxMenuItemExtension c1 = new JCheckBoxMenuItemExtension(SComponentGolf.ManagerUsingJPopupMenu("Save Tune to Data Log"), true, bool2);
        c1.PropertiesExtension(new fs(this));
        c1.addActionListener(new ft(this));
        c1.PropertiesExtension(new fu(this));
        c1.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("Enhanced Logging Format") + " (" + PropertiesExtension.cr + ") " + SComponentGolf.ManagerUsingJPopupMenu("Required"));
        a1.add((JMenuItem)c1);
      } 
    } 
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("sa0-0o0os-0o-0DS")) {
      gX gX = new gX(this, "Re ARM Logging", true);
      gX.addActionListener(new fv(this));
      gX.setAccelerator(KeyStroke.getKeyStroke(65, 2));
      gX.PropertiesExtension(new fw(this));
      gW.add((JMenuItem)gX);
    } 
    if (!PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.cY, PropertiesExtension.cZ)) {
      gW.addSeparator();
      gW gW1 = new gW(this, "Import / Conversion");
      gX gX4 = new gX(this, "PalmLog Import Utility", true);
      gX4.PropertiesExtension(this.o);
      gX4.addActionListener(new fx(this));
      gW1.add((JMenuItem)gX4);
      String str1 = PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.dn, "Convert Binary Log (MS3, FRD)");
      gX gX5 = new gX(this, str1, true);
      gX5.PropertiesExtension(this.o);
      gX5.addActionListener(new fy(this));
      gW1.add((JMenuItem)gX5);
      gW.add((JMenuItem)gW1);
    } else if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("098532oiutewlkjg098")) {
      String str1 = PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.dn, "Convert Binary Log (MS3, FRD)");
      gX gX = new gX(this, str1, true);
      gX.PropertiesExtension(this.o);
      gX.addActionListener(new fz(this));
      gW.add((JMenuItem)gX);
    } 
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("6509h;ApplicationPluginExtension;lhfoi")) {
      gX1 = new gX(this, "Audio Recording Configuration", true);
      gX1.addActionListener(new fB(this));
      gW.add((JMenuItem)gX1);
    } 
    gX1 = new gX(this, "View with MegaLogViewer", true);
    gX1.setAccelerator(KeyStroke.getKeyStroke(86, 8));
    gX1.addMouseListener(new fC(this));
    gW.add((JMenuItem)gX1);
    if (Desktop.isDesktopSupported()) {
      gX1 = new gX(this, "Show DataLog Folder", true);
      gX1.setAccelerator(KeyStroke.getKeyStroke(76, 8));
      gX1.addActionListener(new fE(this));
      gX1.PropertiesExtension(this.o);
      gW.add((JMenuItem)gX1);
    } 
    return gW;
  }
  
  public PropertiesExtension SComponentGolf() {
    gW gW1 = new gW(this, "Options", true);
    gW1.setMnemonic('P');
    boolean bool1 = RInterfaceIndia.PropertiesExtension().PropertiesExtension(";';';'0-=pfpdpd");
    if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension("r-0gds-=-=fd43;ds")) {
      gW gW = new gW(this, "Language", true);
      ArrayList arrayList = SComponentGolf.ManagerUsingJPopupMenu();
      ButtonGroup buttonGroup1 = new ButtonGroup();
      for (AeInterfaceEcho e1 : arrayList) {
        String str1 = "en";
        String str2 = e1.ManagerUsingJPopupMenu();
        if (e1.PropertiesExtension().equals(str1))
          str2 = str2 + " (Default)"; 
        JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str2, true);
        buttonGroup1.add(jCheckBoxMenuItem);
        jCheckBoxMenuItem.setActionCommand(e1.PropertiesExtension());
        jCheckBoxMenuItem.setSelected(e1.PropertiesExtension().equals(PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension("viewLanguageCode", str1)));
        jCheckBoxMenuItem.addActionListener(new fF(this));
        gW.add(jCheckBoxMenuItem);
      } 
      gW1.add(gW.getComponent());
    } 
    gW gW2 = new gW(this, "Look and Feel", true);
    UIManager.LookAndFeelInfo[] arrayOfLookAndFeelInfo = UIManager.getInstalledLookAndFeels();
    ButtonGroup buttonGroup = new ButtonGroup();
    for (UIManager.LookAndFeelInfo lookAndFeelInfo : arrayOfLookAndFeelInfo) {
      String str1 = lookAndFeelInfo.getName();
      String str2 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension("defaultLookAndFeelClass", UIManager.getCrossPlatformLookAndFeelClassName());
      if (lookAndFeelInfo.getClassName().equals(str2))
        str1 = str1 + " (" + SComponentGolf.ManagerUsingJPopupMenu("Default") + ")"; 
      if (!str1.equals("Windows Classic") && !str1.startsWith("TinyLookAndFeel")) {
        JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str1, true);
        buttonGroup.add(jCheckBoxMenuItem);
        jCheckBoxMenuItem.setActionCommand(lookAndFeelInfo.getClassName());
        jCheckBoxMenuItem.setSelected(lookAndFeelInfo.getClassName().equals(PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension("lookAndFeelClass", str2)));
        jCheckBoxMenuItem.addActionListener(new fG(this));
        gW2.add(jCheckBoxMenuItem);
      } 
    } 
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("FS-0FDS;L4"))
      gW1.add(gW2.getComponent()); 
    if (!bool1) {
      gW gW5 = new gW(this, "Navigation", true);
      buttonGroup = new ButtonGroup();
      JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Main Menu Style"));
      jCheckBoxMenuItem1.setActionCommand("Main Menu Style");
      jCheckBoxMenuItem1.setState(PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension("navigationStyle", PropertiesExtension).equals("Main Menu Style"));
      buttonGroup.add(jCheckBoxMenuItem1);
      jCheckBoxMenuItem1.addActionListener(new fH(this));
      gW5.add(jCheckBoxMenuItem1);
      if (!PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension("lookAndFeelClass", "").contains("TinyLookAndFeel")) {
        jCheckBoxMenuItem1 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Wrapping Main Menu"));
        jCheckBoxMenuItem1.setActionCommand("Wrapping Main Menu");
        jCheckBoxMenuItem1.setState(PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension("navigationStyle", PropertiesExtension).equals("Wrapping Main Menu"));
        buttonGroup.add(jCheckBoxMenuItem1);
        jCheckBoxMenuItem1.addActionListener(new fI(this));
        gW5.add(jCheckBoxMenuItem1);
      } 
      jCheckBoxMenuItem1 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Toolbar Style"));
      jCheckBoxMenuItem1.setActionCommand("Toolbar Style");
      jCheckBoxMenuItem1.setState(PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension("navigationStyle", PropertiesExtension).equals("Toolbar Style"));
      buttonGroup.add(jCheckBoxMenuItem1);
      jCheckBoxMenuItem1.addActionListener(new fJ(this));
      gW5.add(jCheckBoxMenuItem1);
      gW gW6 = new gW(this, "Navigation options");
      boolean bool4 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bh, true);
      jCheckBoxMenuItem1 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Show Disabled Menu"));
      jCheckBoxMenuItem1.setState(bool4);
      jCheckBoxMenuItem1.addActionListener(new fK(this));
      gW6.add(jCheckBoxMenuItem1);
      gW5.add((JMenuItem)gW6);
      gW1.add((JMenuItem)gW5);
      gW gW7 = new gW(this, "View");
      boolean bool5 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bL, PropertiesExtension.ExceptionprintstacktraceInGPackage);
      gV gV1 = new gV(this, "Show Gauges on VE Analyze", true, bool5);
      gV1.addActionListener(new fL(this));
      gV1.PropertiesExtension(new fN(this));
      gW7.add((JMenuItem)gV1);
      boolean bool6 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bN, PropertiesExtension.bO);
      gV gV2 = new gV(this, "Show Live Graphs on VE Analyze", true, bool6);
      gV2.addActionListener(new fO(this));
      gV2.PropertiesExtension(new fP(this));
      gW7.add((JMenuItem)gV2);
      gW1.add((JMenuItem)gW7);
      boolean bool7 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bl, PropertiesExtension.bm);
      gV gV3 = new gV(this, "Show Enable Condition in Menu Tooltips", true, bool7);
      gV3.addActionListener(new fQ(this));
      gV3.PropertiesExtension(new fR(this));
      gW7.add((JMenuItem)gV3);
      gW1.add((JMenuItem)gW7);
      gW gW8 = new gW(this, "Advanced");
      JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Report INI Warnings"));
      jCheckBoxMenuItem2.addActionListener(new fS(this));
      boolean bool8 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bc, PropertiesExtension.bd);
      jCheckBoxMenuItem2.setState(bool8);
      gW8.add(jCheckBoxMenuItem2);
      if (J.PropertiesExtension()) {
        JMenu jMenu = new JMenu(SComponentGolf.ManagerUsingJPopupMenu("Video driver work arounds"));
        ButtonGroup buttonGroup1 = new ButtonGroup();
        JCheckBoxMenuItem jCheckBoxMenuItem4 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Force OpenGL Active"));
        jCheckBoxMenuItem4.addActionListener(new fT(this));
        boolean bool10 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.F, PropertiesExtension.G);
        jCheckBoxMenuItem4.setState(bool10);
        buttonGroup1.add(jCheckBoxMenuItem4);
        jMenu.add(jCheckBoxMenuItem4);
        JCheckBoxMenuItem jCheckBoxMenuItem5 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Disable Direct 3D"));
        jCheckBoxMenuItem5.addActionListener(new fU(this));
        boolean bool11 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.H, PropertiesExtension.I);
        jCheckBoxMenuItem5.setState(bool11);
        buttonGroup1.add(jCheckBoxMenuItem5);
        jMenu.add(jCheckBoxMenuItem5);
        JCheckBoxMenuItem jCheckBoxMenuItem6 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Java Default (D3D Enabled)"));
        jCheckBoxMenuItem6.addActionListener(new fV(this));
        boolean bool = (!bool10 && !bool11) ? true : false;
        jCheckBoxMenuItem6.setState(bool);
        buttonGroup1.add(jCheckBoxMenuItem6);
        jMenu.add(jCheckBoxMenuItem6);
        gW8.add(jMenu);
      } 
      JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Always Allow Multiple Instances"));
      jCheckBoxMenuItem3.addActionListener(new fW(this));
      boolean bool9 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bP, PropertiesExtension.bQ);
      jCheckBoxMenuItem3.setState(bool9);
      gW8.add(jCheckBoxMenuItem3);
      if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("98fg54lklk")) {
        boolean bool = (PropertiesExtension.A() != null && PropertiesExtension.A().Q()) ? true : false;
        JCheckBoxMenuItemExtension JCheckBoxMenuItemExtension = new JCheckBoxMenuItemExtension(SComponentGolf.ManagerUsingJPopupMenu("Run Slave Server"), true, bool);
        JCheckBoxMenuItemExtension.addActionListener(new fY(this));
        JCheckBoxMenuItemExtension.PropertiesExtension(new fZ(this));
        gW8.add((JMenuItem)JCheckBoxMenuItemExtension);
        JCheckBoxMenuItemExtension.PropertiesExtension(this.o);
      } 
      gW1.add((JMenuItem)gW8);
    } 
    gW gW3 = new gW(this, "Preferences");
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension(";'GDS0[p'pgd[p")) {
      boolean bool4 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bf, PropertiesExtension.cP);
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Load Last Project on startup"), bool4);
      jCheckBoxMenuItem.addActionListener(new ga(this));
      gW3.add(jCheckBoxMenuItem);
      boolean bool5 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bg, false);
      gV gV1 = new gV(this, "Make Dashboards Full Screen", true, bool5);
      gV1.addActionListener(new gb(this));
      gV1.PropertiesExtension(new gc(this));
      gV1.PropertiesExtension(new gd(this));
      gW3.add((JMenuItem)gV1);
    } 
    gW gW4 = new gW(this, "Settings Dialog Font Size");
    int RInterfaceIndia = PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.aH, PropertiesExtension.PropertiesExtension().o());
    gE gE = new gE(this);
    int j = PropertiesExtension.PropertiesExtension().o();
    for (byte ManagerUsingJPopupMenu = 8; ManagerUsingJPopupMenu < 41; ManagerUsingJPopupMenu++) {
      String str = (ManagerUsingJPopupMenu == j) ? (ManagerUsingJPopupMenu + "(" + SComponentGolf.ManagerUsingJPopupMenu("Default") + ")") : (ManagerUsingJPopupMenu + "");
      gV gV1 = new gV(this, str, true, (RInterfaceIndia == ManagerUsingJPopupMenu));
      gE.PropertiesExtension((JCheckBoxMenuItem)gV1);
      gV1.setActionCommand("" + ManagerUsingJPopupMenu);
      gV1.addActionListener(new ge(this));
      gW4.add((JMenuItem)gV1);
    } 
    gW3.add((JMenuItem)gW4);
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("fv-7rkf74nfd67whn5iuchqj")) {
      gX gX = new gX(this, "Password Caching Timeout", true);
      gX.addActionListener(new gf(this));
      gX.ManagerUsingJPopupMenu(new gg(this));
      gW3.add((JMenuItem)gX);
    } 
    if (BinTableView.S()) {
      boolean bool = PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.cg, PropertiesExtension.ch);
      gV gV1 = new gV(this, SComponentGolf.ManagerUsingJPopupMenu("Mouse wheel scroll changes selected Table cells"), true, bool);
      gV1.addActionListener(new gh(this));
      gV1.PropertiesExtension(new gj(this));
      gW3.add((JMenuItem)gV1);
    } 
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("67r67r8yhdrtrbyuk")) {
      boolean bool = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bu, PropertiesExtension.ArrayListExceptionprintstacktraceInGPackage);
      gV gV1 = new gV(this, SComponentGolf.ManagerUsingJPopupMenu("Perform Difference Report On Connect"), true, bool);
      gV1.addActionListener(new gk(this));
      gV1.PropertiesExtension(new gl(this));
      gW3.add((JMenuItem)gV1);
    } 
    boolean bool2 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bw, true);
    gV gV = new gV(this, SComponentGolf.ManagerUsingJPopupMenu("Automatically Load and Save Current Tune"), true, bool2);
    gV.addActionListener(new gm(this));
    gV.PropertiesExtension(new gn(this));
    gW3.add((JMenuItem)gV);
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension(",.fesokdsoi4309")) {
      boolean bool = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bj, PropertiesExtension.bk);
      gV gV1 = new gV(this, SComponentGolf.ManagerUsingJPopupMenu("Prompt if CurrentTune altered by other program"), true, bool);
      gV1.addActionListener(new go(this));
      gV1.PropertiesExtension(new gp(this));
      gW3.add((JMenuItem)gV1);
    } 
    gW1.add((JMenuItem)gW3);
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("-=fds[pfds[pgd-0")) {
      gW gW = new gW(this, "Restore Points");
      boolean bool = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bz, PropertiesExtension.bA);
      JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Save Restore Point on Close"), bool);
      jCheckBoxMenuItem1.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("When enabled PropertiesExtension Restore Point will be created on Project close"));
      jCheckBoxMenuItem1.addActionListener(new gq(this));
      gW.add(jCheckBoxMenuItem1);
      bool = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bD, PropertiesExtension.bE);
      JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Save Restore Point on Connect"), bool);
      jCheckBoxMenuItem2.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("When enabled PropertiesExtension Restore Point will be created when connecting to the ECU if it is different from the last restore point"));
      jCheckBoxMenuItem2.addActionListener(new gr(this));
      gW.add(jCheckBoxMenuItem2);
      bool = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bB, PropertiesExtension.bC);
      JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Save Restore Point on Tune Save"), bool);
      jCheckBoxMenuItem3.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("When enabled PropertiesExtension Restore Point will be created on Tune Save or CTRL+S"));
      jCheckBoxMenuItem3.addActionListener(new gs(this));
      gW.add(jCheckBoxMenuItem3);
      bool = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bF, PropertiesExtension.bG);
      JCheckBoxMenuItem jCheckBoxMenuItem4 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Save Restore Point on Tune Open"), bool);
      jCheckBoxMenuItem4.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("When enabled PropertiesExtension Restore Point will be created when loading PropertiesExtension Tune file to PropertiesExtension controller"));
      jCheckBoxMenuItem4.addActionListener(new gu(this));
      gW.add(jCheckBoxMenuItem4);
      bool = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bJ, PropertiesExtension.bK);
      JCheckBoxMenuItem jCheckBoxMenuItem5 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Skip when no setting changes"), bool);
      jCheckBoxMenuItem5.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("When enabled PropertiesExtension Restore Point will not be saved if PropertiesExtension there have been no changes since the last Restore Point"));
      jCheckBoxMenuItem5.addActionListener(new gv(this));
      gW.add(jCheckBoxMenuItem5);
      double d1 = PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.bH, PropertiesExtension.bI);
      gX gX = new gX(this, SComponentGolf.ManagerUsingJPopupMenu("Maximum Megabytes Disk Space") + ": " + X.PropertiesExtension(d1), true);
      gX.addActionListener(new gw(this));
      gW.add((JMenuItem)gX);
      gW1.add((JMenuItem)gW);
    } 
    if (!bool1) {
      gW gW = new gW(this, "Performance");
      boolean bool4 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bo, true);
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Gauge Float down on start"), bool4);
      jCheckBoxMenuItem.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("Enable / Disable gauge float down on project open."));
      jCheckBoxMenuItem.addActionListener(new gx(this));
      gW.add(jCheckBoxMenuItem);
      boolean bool5 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bp, false);
      if (bool5) {
        JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Run In Lite Mode"), bool5);
        jCheckBoxMenuItem1.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("Turns off features to conserve resources."));
        jCheckBoxMenuItem1.addActionListener(new gy(this));
        if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension("poij0um098u8oiukj")) {
          gW.add(jCheckBoxMenuItem1);
          jCheckBoxMenuItem1.setEnabled(false);
          jCheckBoxMenuItem1.setState(false);
        } 
      } 
      if (PropertiesExtension.PropertiesExtension().ManagerUsingJPopupMenu(PropertiesExtension.bq, PropertiesExtension.br)) {
        boolean bool = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.bs, PropertiesExtension.bt);
        JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Dash Only Mode"), bool);
        jCheckBoxMenuItem1.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("Disables Tuning functions for faster project load and to conserve resources."));
        jCheckBoxMenuItem1.addActionListener(new gz(this));
        gW.add(jCheckBoxMenuItem1);
      } else {
        PropertiesExtension.PropertiesExtension().ManagerUsingJPopupMenu(PropertiesExtension.bq, Boolean.toString(false));
      } 
      if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("_(*UR98ewf098u 98EE 2  *(W")) {
        boolean bool = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.aa, PropertiesExtension.GInterfaceAb);
        JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Prevent Sleep when Online"), bool);
        jCheckBoxMenuItem1.setToolTipText("<html>" + SComponentGolf.ManagerUsingJPopupMenu("When active, Screen saver and sleeping will be prevented while online with PropertiesExtension controller.") + "<br>" + SComponentGolf.ManagerUsingJPopupMenu("When not connected to PropertiesExtension controller, sleeping will be allowed."));
        jCheckBoxMenuItem1.addActionListener(new gA(this));
        gW.add(jCheckBoxMenuItem1);
      } 
      gW1.add((JMenuItem)gW);
    } else if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("_(*UR98ewf098u 98EE 2  *(W") && RInterfaceIndia.PropertiesExtension().PropertiesExtension("_(*UR98ewf098u 98EE 2  *(W")) {
      boolean bool = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.aa, PropertiesExtension.GInterfaceAb);
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Prevent Sleep when Online"), bool);
      jCheckBoxMenuItem.setToolTipText("<html>" + SComponentGolf.ManagerUsingJPopupMenu("When active, Screen saver and sleeping will be prevented while online with PropertiesExtension controller.") + "<br>" + SComponentGolf.ManagerUsingJPopupMenu("When not connected to PropertiesExtension controller, sleeping will be allowed."));
      jCheckBoxMenuItem.addActionListener(new gB(this));
      gW3.add(jCheckBoxMenuItem);
    } 
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("645fds645fds  fdsd098532#@")) {
      PropertiesExtension PropertiesExtension = new PropertiesExtension("Preferred Units");
      gW1.add((JMenuItem)PropertiesExtension);
      boolean bool = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.cc, PropertiesExtension.cd);
      JCheckBoxMenuItemExtension JCheckBoxMenuItemExtension = new JCheckBoxMenuItemExtension(SComponentGolf.ManagerUsingJPopupMenu("Convert Table Y Axis kPa to PSI"), true, bool);
      JCheckBoxMenuItemExtension.PropertiesExtension(new gC(this));
      JCheckBoxMenuItemExtension.addActionListener(new gD(this));
      PropertiesExtension.add((JMenuItem)JCheckBoxMenuItemExtension);
    } 
    boolean bool3 = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.J, false);
    if (bool3) {
      JMenuItem jMenuItem = gW1.add(SComponentGolf.ManagerUsingJPopupMenu("Enable Registration"));
      jMenuItem.addActionListener(new dE(this));
    } else if (PropertiesExtension.PropertiesExtension().s()) {
      JMenu jMenu = new JMenu("Run as Edition");
      dF dF = new dF(this);
      String str = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.cn, PropertiesExtension.JCheckBoxMenuItemExtension);
      buttonGroup = new ButtonGroup();
      if (PropertiesExtension.do.length > 0) {
        String str1 = PropertiesExtension.do[0] + RInterfaceIndia.JCheckBoxMenuItemExtension;
        JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str1);
        jCheckBoxMenuItem.setSelected(str.equals(str1));
        buttonGroup.add(jCheckBoxMenuItem);
        jCheckBoxMenuItem.addActionListener(dF);
        jMenu.add(jCheckBoxMenuItem);
      } 
      for (String str1 : PropertiesExtension.do) {
        JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str1);
        jCheckBoxMenuItem.setSelected(str.equals(str1));
        buttonGroup.add(jCheckBoxMenuItem);
        jCheckBoxMenuItem.addActionListener(dF);
        jMenu.add(jCheckBoxMenuItem);
      } 
      gW1.add(jMenu);
    } 
    return gW1;
  }
  
  private void q() {
    String str = SComponentGolf.ManagerUsingJPopupMenu("Must Restart for changes to take effect.") + "\n" + SComponentGolf.ManagerUsingJPopupMenu("Restart Now?");
    if (bV.PropertiesExtension(str, this.h, true))
      BaInterfaceFoxtrot.PropertiesExtension().BaInterfaceDelta(this.h); 
  }
  
  public PropertiesExtension h() {
    gW gW = new gW(this, "Communications", true);
    gW.setMnemonic('C');
    dG dG = new dG(this);
    gX gX = new gX(this, "Settings", true);
    gX.PropertiesExtension(dG);
    gX.addActionListener(new dH(this));
    gW.add((JMenuItem)gX);
    gX = new gX(this, "Data Rate", true);
    if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension(" 98 98  0gep9gds09kfg09")) {
      gW.setEnabled(false);
    } else {
      gX.PropertiesExtension(dG);
    } 
    gX.addActionListener(new dI(this));
    gW.add((JMenuItem)gX);
    ArrayList arrayList = R.PropertiesExtension().ManagerUsingJPopupMenu();
    if (!arrayList.isEmpty()) {
      gW gW1 = new gW(this, "Disabled COM Ports");
      for (String str : arrayList) {
        gX = new gX(this, str, true);
        gX.setName(str);
        gX.addActionListener(new dJ(this));
        gW1.add((JMenuItem)gX);
      } 
      gW.add((JMenuItem)gW1);
    } 
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("bd098fsdpokfdslk")) {
      gX = new gX(this, "GPS Configuration", true);
      gX.addActionListener(new dK(this));
      gW.add((JMenuItem)gX);
    } else if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("oewtltroh4fs5dslk")) {
      gX = new gX(this, "Enable GPS Support", true);
      gX.addActionListener(new dL(this));
      gW.add((JMenuItem)gX);
    } 
    boolean bool1 = PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.dc, PropertiesExtension.dd);
    if (!bool1) {
      gX = new gX(this, "Mini Terminal", true);
      gX.addActionListener(new dM(this));
      gW.add((JMenuItem)gX);
    } 
    gV gV = new gV(this, "Verify Data on Burn", false, true);
    gV.PropertiesExtension(new dN(this));
    gV.PropertiesExtension(new dP(this));
    gV.addActionListener(new dQ(this));
    boolean bool2 = PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.de, PropertiesExtension.df);
    if (!bool2) {
      gV gV1 = new gV(this, "Comm Debug Log", false, true);
      gV1.PropertiesExtension(new dR(this));
      gV1.addActionListener(new dS(this));
      gW.add((JMenuItem)gV1);
    } 
    return gW;
  }
  
  public PropertiesExtension RInterfaceIndia() {
    gW gW1 = new gW(this, "Tools", true);
    gW1.setMnemonic('T');
    String str = PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.cE, null);
    boolean bool = (str != null && (str.equalsIgnoreCase("philip.tobin@yahoo.com") || str.equalsIgnoreCase("p_tobin@yahoo.com") || str.equalsIgnoreCase("brian@efianalytics.com") || (PropertiesExtension.ManagerUsingJPopupMenu.equals("BigComm") && (str.equalsIgnoreCase("kjmeaney@msn.com") || str.equalsIgnoreCase("pmosman@hyconinc.com") || str.equalsIgnoreCase("BigStuff3@comcast.net"))) || (PropertiesExtension.ManagerUsingJPopupMenu.equals("TunerStudio") && (str.equalsIgnoreCase("agrippo1@verizon.net") || str.equalsIgnoreCase("jsm@jsm-net.demon.co.uk"))))) ? true : false;
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("GD[PP-0REP")) {
      gX gX1 = new gX(this, "Controller RAM Editor", true);
      gX1.PropertiesExtension(new dT(this));
      gX1.addActionListener(new dU(this));
      gW1.add((JMenuItem)gX1);
      gX1 = new gX(this, "Binary Log Viewer", true);
      gX1.addActionListener(new dV(this));
      gW1.add((JMenuItem)gX1);
      gX1 = new gX(this, "Expression Evaluator", true);
      gX1.addActionListener(new dW(this));
      gX1.PropertiesExtension(new dX(this));
      gW1.add((JMenuItem)gX1);
      gX1 = new gX(this, "Binary Diff Report", true);
      gX1.addActionListener(new dY(this));
      gW1.add((JMenuItem)gX1);
      gX1 = new gX(this, "Memory Address Report", true);
      gX1.addActionListener(new ea(this));
      gW1.add((JMenuItem)gX1);
      gX1 = new gX(this, "Encrypt / Decrypt INI File", true);
      gX1.addActionListener(new eb(this));
      gW1.add((JMenuItem)gX1);
      if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("098po;ApplicationPluginExtension;lklkjj")) {
        gX1 = new gX(this, "Import ODT Addressing", true);
        gX1.addActionListener(new ec(this));
        gX1.PropertiesExtension(new ed(this));
        gW1.add((JMenuItem)gX1);
        gX1 = new gX(this, "Import Cal Addressing", true);
        gX1.addActionListener(new ee(this));
        gX1.PropertiesExtension(new ef(this));
        gW1.add((JMenuItem)gX1);
      } 
      gW1.addSeparator();
    } 
    ju ju = new ju();
    gW1.add((JMenuItem)ju);
    if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension("09;lgdlgd432;okg0")) {
      gX gX1 = new gX(this, "Protocol Stats", true);
      gX1.addActionListener(new eg(this));
      gX1.ManagerUsingJPopupMenu(new eh(this));
      gW1.add((JMenuItem)gX1);
      gW1.addSeparator();
    } 
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension(";LKFDS;LK09")) {
      gX gX1 = new gX(this, "Update / Install Firmware", true);
      gX1.addActionListener(new ei(this));
      gW1.add((JMenuItem)gX1);
    } 
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("098432lkjgd0932=- ")) {
      gX gX1 = new gX(this, "Manage Ini Tuning Views", true);
      gX1.addActionListener(new ej(this));
      gX1.PropertiesExtension(this.o);
      gW1.add((JMenuItem)gX1);
    } 
    gX gX = new gX(this, "Add Custom Channel Wizard", true);
    gX.addActionListener(new el(this));
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension(";lfds09pofs,54w09")) {
      gX.PropertiesExtension(new em(this));
    } else {
      gX.setEnabled(false);
      gX.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("Upgrade to enable"));
    } 
    gW1.add((JMenuItem)gX);
    gX = new gX(this, "Custom Channel Editor", true);
    gX.addActionListener(new en(this));
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension(";lfds09pofs,54w09")) {
      gX.PropertiesExtension(new eo(this));
    } else {
      gX.setEnabled(false);
      gX.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("Upgrade to enable"));
    } 
    gW1.add((JMenuItem)gX);
    gX = new gX(this, "User Action Editor", true);
    gX.addActionListener(new ep(this));
    if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension("poij  fdsz poi9ure895 ms7(")) {
      gX.setEnabled(false);
      gX.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("Upgrade to enable"));
    } 
    gX = new gX(this, "Action Management", true);
    gX.addActionListener(new eq(this));
    if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension("poij  fdsz poi9ure895 ms7(")) {
      gX.setEnabled(false);
      gX.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("Upgrade to enable"));
    } else {
      gX.PropertiesExtension(this.o);
    } 
    gW1.add((JMenuItem)gX);
    gW gW2 = new gW(this, "Calculators", true);
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension(";oij fds poi fd u ou43t wer3287")) {
      gX = new gX(this, "Calculator", true);
      gX.addActionListener(new er(this));
      gW2.add((JMenuItem)gX);
      gX = new gX(this, "Linear Two Point Calculator", true);
      gX.addActionListener(new es(this));
      gW2.add((JMenuItem)gX);
      gX = new gX(this, "Unit Conversion Calculator", true);
      gX.addActionListener(new et(this));
      gW2.add((JMenuItem)gX);
    } else {
      gW2.setEnabled(false);
      gW2.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("Upgrade to enable"));
    } 
    gW1.add((JMenuItem)gW2);
    boolean bool1 = RInterfaceIndia.PropertiesExtension().PropertiesExtension("09jtrkgds;okfds");
    if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension(";,fes;p9rew;o")) {
      gW gW = new gW(this, PropertiesExtension.ManagerUsingJPopupMenu + " Plug-ins", true);
      R r = T.PropertiesExtension().JCheckBoxMenuItemExtension();
      String str1 = (r != null) ? r.RInterfaceIndia() : "";
      byte ManagerUsingJPopupMenu = 0;
      for (ApplicationPlugin applicationPlugin : ApplicationPluginExtension.PropertiesExtension().JCheckBoxMenuItemExtension()) {
        if (applicationPlugin.displayPlugin(str1) && applicationPlugin.getPluginType() == 2) {
          gX = new gX(this, applicationPlugin.getDisplayName(), true);
          gX.setName(applicationPlugin.getIdName());
          gX.addActionListener(new eu(this));
          if (!bool1)
            gX.setToolTipText(SComponentGolf.ManagerUsingJPopupMenu("Application Plugin Support not available in this edition")); 
          gX.PropertiesExtension(new gM(this, applicationPlugin));
          gW.add((JMenuItem)gX);
          ManagerUsingJPopupMenu++;
        } 
      } 
      if (ManagerUsingJPopupMenu == 0) {
        gX = new gX(this, "No Plugins Installed", true);
        gX.setEnabled(false);
        gW.add((JMenuItem)gX);
      } 
      gW.addSeparator();
      gX = new gX(this, "Add or Update PropertiesExtension Plugin", true);
      gX.setEnabled(bool1);
      gX.addActionListener(new ew(this));
      gW.add((JMenuItem)gX);
      gX = new gX(this, "Online Plugin Information", true);
      gX.addActionListener(new ex(this));
      gW.add((JMenuItem)gX);
      gW1.add((JMenuItem)gW);
      gW1.addSeparator();
    } 
    if (PropertiesExtension.ManagerUsingJPopupMenu.equals(RInterfaceIndia.x) && (PropertiesExtension.JCheckBoxMenuItemExtension.contains("MS") || PropertiesExtension.JCheckBoxMenuItemExtension.contains("RE"))) {
      gX = new gX(this, "Calibrate TPS", false);
      gX.PropertiesExtension(new ey(this));
      gX.addActionListener(new ez(this));
      gX.ManagerUsingJPopupMenu(new eA(this));
      gW1.add((JMenuItem)gX);
    } 
    return gW1;
  }
  
  private void r() {
    this.JCheckBoxMenuItemExtension.F();
  }
  
  public PropertiesExtension j() {
    gW gW = new gW(this, ManagerUsingJPopupMenu, true);
    gW.setMnemonic('H');
    boolean bool1 = PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.dg, PropertiesExtension.dh);
    if (!bool1) {
      gX gX1 = new gX(this, PropertiesExtension.ManagerUsingJPopupMenu + " " + SComponentGolf.ManagerUsingJPopupMenu(ManagerUsingJPopupMenu), true);
      gX1.addActionListener(new eB(this));
      gW.add((JMenuItem)gX1);
      gW.addSeparator();
    } 
    gX gX = new gX(this, "Check For Update", true);
    gX.addActionListener(new eC(this));
    gW.add((JMenuItem)gX);
    boolean bool = (PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.cK, false) && A.RInterfaceIndia().PropertiesExtension(PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.cF, ""))) ? true : false;
    boolean bool2 = A.RInterfaceIndia().PropertiesExtension(PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.cF, ""));
    if (!bool)
      PropertiesExtension.PropertiesExtension().ManagerUsingJPopupMenu(PropertiesExtension.aQ, "true"); 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(SComponentGolf.ManagerUsingJPopupMenu("Automatic Update Check"), PropertiesExtension.PropertiesExtension().JCheckBoxMenuItemExtension(PropertiesExtension.aQ, false));
    jCheckBoxMenuItem.setEnabled(bool);
    jCheckBoxMenuItem.addItemListener(new eD(this));
    gW.add(jCheckBoxMenuItem);
    if (!bool2) {
      gX = new gX(this, "Enter Registration", true);
      gX.addActionListener(new eE(this));
      gW.add((JMenuItem)gX);
      gX = new gX(this, "Upgrade for more features!", true);
      gX.addActionListener(new eF(this));
      gW.add((JMenuItem)gX);
    } else {
      gX = new gX(this, "Update Registration", true);
      gX.addActionListener(new eH(this));
      gW.add((JMenuItem)gX);
      gX = new gX(this, "Remove Registration Information", true);
      gX.addActionListener(new eI(this));
      gW.add((JMenuItem)gX);
    } 
    if (RInterfaceIndia.PropertiesExtension().PropertiesExtension("87gdjkjd98fes")) {
      gX = new gX(this, "Upgrade for even more Features!", true);
      gX.addActionListener(new eJ(this));
      gW.add((JMenuItem)gX);
    } 
    gW.addSeparator();
    boolean bool3 = PropertiesExtension.PropertiesExtension().PropertiesExtension(PropertiesExtension.dj, false);
    if (bool3) {
      gX = new gX(this, "Submit " + PropertiesExtension.ManagerUsingJPopupMenu + " Review", true);
      gX.addActionListener(new eK(this));
      gW.add((JMenuItem)gX);
    } 
    gX = new gX(this, "Create " + PropertiesExtension.ManagerUsingJPopupMenu + " Debug Package", true);
    gX.addActionListener(new eL(this));
    gW.add((JMenuItem)gX);
    gX = new gX(this, "About", true);
    gX.addActionListener(new eM(this));
    gW.add((JMenuItem)gX);
    return gW;
  }
  
  public void PropertiesExtension(R paramR) {
    if (this.BaInterfaceDelta != null)
      this.BaInterfaceDelta.p().ManagerUsingJPopupMenu(this); 
    this.BaInterfaceDelta = paramR;
    n();
    p();
    k();
    this.q.validate();
    if (this.AeInterfaceEcho != null && !this.AeInterfaceEcho.equals(this.q))
      this.AeInterfaceEcho.validate(); 
  }
  
  public void k() {
    if (this.m != null)
      this.m.PropertiesExtension(); 
  }
  
  public void JCheckBoxMenuItemExtension(R paramR) {
    paramR.p().PropertiesExtension(this);
  }
  
  public void ManagerUsingJPopupMenu(R paramR) {
    n();
    this.AeInterfaceEcho.ManagerUsingJPopupMenu(paramR.JCheckBoxMenuItemExtension());
    p();
    this.BaInterfaceDelta.p().ManagerUsingJPopupMenu(this);
    paramR.ManagerUsingJPopupMenu(this);
    paramR.C().ManagerUsingJPopupMenu(this);
    ManagerUsingArrayList.PropertiesExtension().PropertiesExtension(this.n);
  }
  
  public void ManagerUsingJPopupMenu(boolean paramBoolean) {
    if (!SwingUtilities.isEventDispatchThread()) {
      eN eN = new eN(this, paramBoolean);
      try {
        SwingUtilities.invokeAndWait(eN);
      } catch (InterruptedException|java.lang.reflect.InvocationTargetException interruptedException) {
        Logger.getLogger(dB.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } else {
      this.q.setEnabled(paramBoolean);
      if (this.AeInterfaceEcho != null && this.AeInterfaceEcho.getComponent() != null)
        this.AeInterfaceEcho.getComponent().setEnabled(paramBoolean); 
    } 
  }
  
  public void PropertiesExtension(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    k();
  }
  
  public void PropertiesExtension() {
    ManagerUsingJPopupMenu(false);
    eO eO = new eO(this);
    eO.start();
  }
  
  public void PropertiesExtension(boolean paramBoolean) {
    ManagerUsingJPopupMenu(true);
  }
  
  public boolean PropertiesExtension(String paramString, AeInterfaceMikeTostring parambT) {
    return true;
  }
  
  public void PropertiesExtension(String paramString) {}
  
  public void PropertiesExtension(PropertiesExtension parama, R paramR) {}
  
  public void e_() {
    this.j = 0;
  }
  
  public void PropertiesExtension(PropertiesExtension parama) {}
  
  public gQ ApplicationPluginExtension() {
    return this.q;
  }
  
  public BaInterfaceFoxtrot PropertiesExtension(String paramString, boolean paramBoolean) {
    if (this.p.equals("Main Menu Style"))
      return (BaInterfaceFoxtrot)new gW(this, paramString, paramBoolean); 
    if (this.p.equals("Wrapping Main Menu")) {
      gW gW = new gW(this, paramString, paramBoolean);
      gW.ManagerUsingJPopupMenu(true);
      return (BaInterfaceFoxtrot)gW;
    } 
    ManagerUsingJPopupMenu ManagerUsingJPopupMenu = new ManagerUsingJPopupMenu(paramString, paramBoolean);
    ManagerUsingJPopupMenu.setToolTipText(paramString);
    ManagerUsingJPopupMenu.addMouseListener(new gU(this, (BaInterfaceFoxtrot)ManagerUsingJPopupMenu));
    this.BaInterfaceFoxtrot.PropertiesExtension(ManagerUsingJPopupMenu);
    return (BaInterfaceFoxtrot)ManagerUsingJPopupMenu;
  }
  
  protected String BaInterfaceDelta(String paramString) {
    if (paramString.contains("Spark") || paramString.contains("Igni") || paramString.contains("spark") || paramString.contains("igni"))
      return "resources/sparkplug32.png"; 
    if (paramString.contains("Fuel") || paramString.contains("Inj"))
      return "resources/injector2.png"; 
    if (paramString.contains("Controller"))
      return "resources/Circuit32.png"; 
    if (paramString.contains("Shift") || paramString.contains("Trans"))
      return "resources/Shifter32.png"; 
    if (paramString.contains("Boost") || paramString.contains("Turbo"))
      return "resources/turbocharger1.png"; 
    if (paramString.contains("Nitrous") || paramString.contains("NOS"))
      return "resources/nitrous.png"; 
    if (paramString.contains("Advanced"))
      return "resources/two-gears.png"; 
    if (paramString.contains("Table"))
      return "resources/tableFeather.png"; 
    if (paramString.contains("SR2") || paramString.toLowerCase().contains("traction"))
      return "resources/traction_32.png"; 
    if (paramString.toLowerCase().contains("log"))
      return "resources/graph_32a.png"; 
    if (paramString.toLowerCase().contains("line"))
      return "resources/dragTree_32.png"; 
    if (paramString.toLowerCase().contains("e85"))
      return "resources/gaspump_32.png"; 
    if (paramString.toLowerCase().contains("afr"))
      return "resources/O2Sensor4_64.png"; 
    if (paramString.toLowerCase().contains("start"))
      return "resources/crank_64.png"; 
    if (paramString.toLowerCase().contains("accel"))
      return "resources/accel_pedal_64.png"; 
    if (paramString.contains("ICF"))
      return "resources/icon-piston_64.png"; 
    if (paramString.contains("CAN"))
      return "resources/Network_64.png"; 
    String str = this.RInterfaceIndia[this.j % this.RInterfaceIndia.length];
    this.j++;
    return str;
  }
  
  private gK PropertiesExtension(BaInterfaceFoxtrot paramf, boolean paramBoolean) {
    gK gK = (this.k.size() > 0) ? this.k.remove(0) : new gK(this, null);
    gK.PropertiesExtension(paramBoolean);
    gK.PropertiesExtension(paramf);
    return gK;
  }
  
  private gL ManagerUsingJPopupMenu(BaInterfaceFoxtrot paramf, boolean paramBoolean) {
    gL gL = (this.ApplicationPluginExtension.size() > 0) ? this.ApplicationPluginExtension.remove(0) : new gL(this, null);
    gL.PropertiesExtension(paramBoolean);
    gL.PropertiesExtension(paramf);
    return gL;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */