package aP;

import G.R;
import G.S;
import G.T;
import G.aA;
import G.aG;
import G.ab;
import G.aj;
import G.bM;
import G.bT;
import G.bU;
import G.bv;
import G.cq;
import G.cu;
import aE.a;
import aE.e;
import bA.c;
import bA.d;
import bA.f;
import bH.A;
import bH.D;
import bH.J;
import bH.X;
import bl.l;
import bq.b;
import c.e;
import com.efiAnalytics.plugin.ApplicationPlugin;
import com.efiAnalytics.tunerStudio.search.B;
import com.efiAnalytics.tunerStudio.search.C;
import com.efiAnalytics.tunerStudio.search.h;
import com.efiAnalytics.tunerStudio.search.l;
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
import r.a;
import r.i;
import s.e;
import s.f;
import s.g;
import x.a;

public final class dB implements S, aG, ab, bU, e {
  public static String a = a.a().a(a.dl, "Toolbar Style");
  
  private String p = a;
  
  public static String b = "Help";
  
  f c = null;
  
  R d = null;
  
  private gQ q = new gQ(this);
  
  d e = null;
  
  S f = new S();
  
  int g = 3;
  
  JFrame h = null;
  
  String[] i = new String[] { "resources/cog.png", "resources/wrench2.png", "resources/tools3.png", "resources/tools2.png", "resources/connecting_rod_32.png" };
  
  int j = 0;
  
  List k = new ArrayList();
  
  List l = new ArrayList();
  
  gT m;
  
  cq n = new dC(this);
  
  e o = new eT(this);
  
  public dB(JFrame paramJFrame, f paramf) {
    this.c = paramf;
    this.h = paramJFrame;
    paramJFrame.setJMenuBar(this.q);
    m();
    c(a.a().c("navigationStyle", a));
    ToolTipManager.sharedInstance().setDismissDelay(12000);
  }
  
  private void m() {
    if (i.a().a("09fewlkm309glkfds09"))
      this.q.add((JMenu)e()); 
    if (!a.a().a(a.cU, a.cV) && !i.a().a("-rewqjmgdlijyre"))
      this.q.add((JMenu)g()); 
    if (!i.a().a("ewq-0rfdrewewr"))
      this.q.add((JMenu)f()); 
    if (!i.a().a(";lgd;lgdhf[p"))
      this.q.add((JMenu)h()); 
    if (!i.a().a("w-0-[-egd;ls"))
      this.q.add((JMenu)i()); 
    this.q.add((JMenu)j());
    boolean bool = UIManager.getLookAndFeel().getName().contains("OS X");
    if (!bool) {
      m m = new m();
      dd.a().a(m);
      this.q.add((Component)m);
      if (!i.a().a("432p'[pgd-0[p")) {
        m.setEnabled(false);
        m.setToolTipText(g.b("Register to enable."));
      } 
    } 
  }
  
  public List b(String paramString) {
    ArrayList<B> arrayList = new ArrayList();
    for (byte b = 0; b < this.q.getMenuCount(); b++) {
      JMenu jMenu = this.q.getMenu(b);
      if (jMenu != null && jMenu.isEnabled()) {
        Component[] arrayOfComponent = jMenu.getMenuComponents();
        for (byte b1 = 0; b1 < arrayOfComponent.length; b1++) {
          B b2 = new B();
          b2.b(jMenu.getText() + " " + g.b("Menu"));
          if (arrayOfComponent[b1] instanceof JMenu) {
            JMenu jMenu1 = (JMenu)arrayOfComponent[b1];
            B b3 = a(jMenu1, paramString);
            if (!b3.isEmpty())
              arrayList.add(b3); 
          } else if (arrayOfComponent[b1] instanceof JMenuItem) {
            JMenuItem jMenuItem = (JMenuItem)arrayOfComponent[b1];
            if (jMenuItem != null && jMenuItem.getText() != null && jMenuItem.getText().contains(paramString)) {
              C c = new C();
              c.a(jMenuItem.getText());
              c.b(paramString);
              c.c(g.b("Menu"));
              c.a((l)new h(jMenuItem));
              b2.add(c);
            } 
          } 
          if (!b2.isEmpty())
            arrayList.add(b2); 
        } 
      } 
    } 
    return arrayList;
  }
  
  private B a(JMenu paramJMenu, String paramString) {
    String str = g.b("Menu: ") + paramJMenu.getText();
    null = new B();
    null.b(str);
    return a(null, paramJMenu, paramString);
  }
  
  private B a(B paramB, JMenu paramJMenu, String paramString) {
    D.c("Looking to children of: " + paramJMenu.getText());
    for (byte b = 0; b < paramJMenu.getItemCount(); b++) {
      JMenuItem jMenuItem = paramJMenu.getItem(b);
      if (jMenuItem != null && jMenuItem.getText() != null && jMenuItem.getText().contains(paramString)) {
        C c = new C();
        c.a(jMenuItem.getText());
        c.b(paramString);
        c.c(g.b("Menu"));
        c.a((l)new h(jMenuItem));
        paramB.add(c);
      } 
    } 
    return paramB;
  }
  
  public void c(String paramString) {
    if (paramString.equals("Wrapping Main Menu") && a.a().c("lookAndFeelClass", "").contains("TinyLookAndFeel"))
      paramString = "Main Menu Style"; 
    if (paramString.equals("MegaTune Style"))
      paramString = "Main Menu Style"; 
    if (paramString.equals(this.p) && this.e != null) {
      D.c("updateMenuStyle ignoring, already set to " + paramString);
      return;
    } 
    this.p = paramString;
    c();
  }
  
  public void c() {
    this.j = 0;
    if (this.e != null)
      n(); 
    if (this.p.equals("Main Menu Style")) {
      if (this.e != null && !this.e.equals(this.q))
        this.h.remove(this.e.getComponent()); 
      this.e = this.q;
      this.g = 3;
    } else if (this.p.equals("Wrapping Main Menu")) {
      if (this.e != null && !this.e.equals(this.q))
        this.h.remove(this.e.getComponent()); 
      this.e = this.q;
      this.g = 3;
    } else {
      String str = a.a().c("tuningToolbarLocation", "North");
      gZ gZ = new gZ(this);
      gZ.setOrientation(str.equals("North") ? 0 : 1);
      this.e = gZ;
      this.g = 0;
      this.h.add(str, this.e.getComponent());
    } 
    p();
    k();
  }
  
  private void n() {
    if (this.m != null)
      gT.a(this.m); 
    this.q.removeAll();
    for (String str : this.e.a().b()) {
      for (int i = this.e.a(str) - 1; i >= 0; i--) {
        f f1 = this.e.a(str, i);
        this.e.a(f1.getComponent());
        f1.f();
      } 
    } 
    m();
  }
  
  private void o() {
    String str = g.b("Upgrade!");
    for (String str1 : T.a().d()) {
      f f1 = a(str1, str);
      if (f1 == null) {
        String str2 = g.b(str);
        f1 = a(str2, false);
        f1.c("resources/upgrade24.png");
        f1.a(new fe(this));
        this.e.a(str1, f1.getComponent(), e(str1));
      } 
    } 
  }
  
  private void p() {
    if (this.d == null)
      return; 
    String[] arrayOfString = T.a().d();
    this.e.a().a();
    for (byte b = 0; b < arrayOfString.length; b++) {
      R r = T.a().c(arrayOfString[b]);
      gF gF = new gF(this, r);
      Iterator<aA> iterator = r.e().b();
      while (iterator.hasNext()) {
        aA aA = iterator.next();
        f f1 = a(arrayOfString[b], g.b(aA.e()));
        if (f1 == null) {
          String str1 = g.b(aA.h());
          if (str1.equals(aA.h()))
            str1 = aA.e(); 
          f1 = a(str1, false);
          try {
            f1.c(d(aA.e()));
          } catch (Exception exception) {
            D.a("Failed to get icon image.");
            exception.printStackTrace();
          } 
          if (aA.aJ() != null && !aA.aJ().equals("")) {
            f1.b(aA.aJ());
            if (f1 instanceof bs)
              ((bs)f1).a(new gS(this, aA.aJ(), r)); 
          } 
          if (aA.i() != null && !aA.i().equals(""))
            f1.b(new gS(this, aA.i(), r)); 
          if (aA.g() != null && !aA.g().equals(""))
            f1.setMnemonic(aA.g().toUpperCase().charAt(0)); 
          this.e.a(arrayOfString[b], f1.getComponent(), e(arrayOfString[b]));
        } 
        f1.a(gF);
        String str = (arrayOfString.length > 1) ? arrayOfString[b] : null;
        a(r, aA, f1, str);
      } 
    } 
    if (this.e.b() > 0 && i.a().a("pokrepopoktrg9034"))
      o(); 
    this.e.a().b(this.d.c());
    d();
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
  
  private void a(R paramR, f paramf, aA paramaA, String paramString) {
    String str = g.a(paramaA.h(), paramaA.e());
    str = (paramString != null && paramString.length() > 0 && paramf.h()) ? (str + " (" + paramString + ")") : str;
    gX gX = new gX(this, str, false);
    Icon icon = a(paramaA);
    if (icon != null)
      gX.setIcon(icon); 
    gX.setActionCommand(paramR.c() + "." + paramaA.d());
    gX.setName("" + paramaA.f());
    if (paramaA.i() != null && !paramaA.i().equals(""))
      gX.b(new gS(this, paramaA.i(), paramR)); 
    if (paramaA.aJ() != null && !paramaA.aJ().equals("")) {
      gX.a(new gS(this, paramaA.aJ(), paramR));
      if (a.a().c(a.bl, a.bm)) {
        String str1 = bM.e(paramR, paramaA.aJ());
        str1 = X.a(str1, 120, "<br>&nbsp;&nbsp;&nbsp;");
        StringBuilder stringBuilder = (new StringBuilder("<html><body>")).append(g.b("Enabled when")).append(": ").append(paramaA.aJ()).append("<br><br>").append(g.b("Friendly")).append(": ").append(str1).append("</body></html>");
        gX.setToolTipText(stringBuilder.toString());
      } 
    } 
    if (paramaA.g() != null && !paramaA.g().equals(""))
      gX.setMnemonic(paramaA.g().charAt(0)); 
    if (paramf.getText().equals(b)) {
      gX.addActionListener(new gJ(this, paramR));
    } else if (!paramaA.b()) {
      gX.addActionListener(new fA(this));
    } 
    paramf.add((Component)gX);
  }
  
  private f a(R paramR, aA paramaA, f paramf, String paramString) {
    Iterator<aA> iterator = paramaA.a();
    while (iterator.hasNext()) {
      aA aA1 = iterator.next();
      if (aA1.c()) {
        paramf.addSeparator();
        continue;
      } 
      if (aA1.b()) {
        String str = g.a(aA1.h(), aA1.e());
        str = (paramString != null && paramString.length() > 0) ? (str + " (" + paramString + ")") : str;
        gW gW = new gW(this, str, false);
        Icon icon = a(aA1);
        if (icon != null)
          gW.setIcon(icon); 
        if (aA1.i() != null && !aA1.i().equals(""))
          gW.b(new gS(this, aA1.i(), paramR)); 
        if (aA1.aJ() != null && !aA1.aJ().equals("")) {
          gW.a(new gS(this, aA1.aJ(), paramR));
          if (i.a().a("lk098oijrepoijrgds98ugoi") && a.a().c(a.bl, a.bm)) {
            String str1 = bM.e(paramR, aA1.aJ());
            str1 = X.a(str1, 120, "<br>&nbsp;&nbsp;&nbsp;");
            StringBuilder stringBuilder = (new StringBuilder("<html><body>")).append(g.b("Enabled when")).append(": ").append(aA1.aJ()).append("<br><br>").append(g.b("Friendly")).append(": ").append(str1).append("</body></html>");
            gW.setToolTipText(stringBuilder.toString());
          } 
        } 
        Iterator<aA> iterator1 = aA1.a();
        while (iterator1.hasNext()) {
          aA aA2 = iterator1.next();
          if (aA2.c()) {
            gW.addSeparator();
            continue;
          } 
          a(paramR, (f)gW, aA2, paramString);
        } 
        paramf.add((Component)gW);
        continue;
      } 
      a(paramR, paramf, aA1, paramString);
    } 
    return paramf;
  }
  
  private int e(String paramString) {
    return this.e.a(paramString) - this.g;
  }
  
  private Icon a(aA paramaA) {
    R r = T.a().c();
    bv bv = r.e().c(paramaA.d());
    aj aj = r.e().b(paramaA.d());
    Object object = null;
    if (paramaA.b()) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/folder16.png"));
      return new ImageIcon(image1);
    } 
    if (bv instanceof G.be || (bv != null && bv.S())) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/table.png"));
      return new ImageIcon(image1);
    } 
    if (bv instanceof G.bm || (bv != null && bv.T())) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/curve.png"));
      return new ImageIcon(image1);
    } 
    if (aj instanceof aj) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/help16.gif"));
      return new ImageIcon(image1);
    } 
    if (bv instanceof G.bi) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/table3d.png"));
      return new ImageIcon(image1);
    } 
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/settings.gif"));
    return new ImageIcon(image);
  }
  
  public f a(String paramString1, String paramString2) {
    byte b;
    for (b = 0; b < this.q.getMenuCount(); b++) {
      f f1 = (f)this.q.getMenu(b);
      if (f1 instanceof f) {
        f f2 = (f)f1;
        if (f2.a().equals(paramString2))
          return f1; 
      } else if (f1 != null && f1.getText().equals(paramString2)) {
        return f1;
      } 
    } 
    for (b = 0; b < this.e.a(paramString1); b++) {
      f f1 = this.e.a(paramString1, b);
      if (f1 instanceof f) {
        f f2 = (f)f1;
        if (f2.a().equals(paramString2))
          return f1; 
      } else if (f1 != null && f1.getText().equals(paramString2)) {
        return f1;
      } 
    } 
    return null;
  }
  
  public f d() {
    int i = a.a().a(a.aH, a.a().o());
    Font font1 = this.q.getFont();
    Font font2 = new Font(font1.getFamily(), font1.getStyle(), i);
    for (String str : T.a().d()) {
      for (byte b = 0; b < this.e.a(str); b++) {
        f f1 = this.e.a(str, b);
        if (f1 instanceof Component) {
          Component component = (Component)f1;
          component.setFont(font2);
        } 
      } 
    } 
    return null;
  }
  
  public a e() {
    gN gN = new gN(this, "File", true);
    gN.setMnemonic('F');
    fM fM = new fM(this);
    gW gW = new gW(this, "Vehicle Projects", true);
    gW.a(this.o);
    gX gX = null;
    if (!i.a().a("4320432porepo09")) {
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
    gX.a(this.o);
    gX.addActionListener(new gt(this));
    gW.add((JMenuItem)gX);
    gW.addSeparator();
    gX = new gX(this, "Create Project Backup", true);
    gX.addActionListener(new dD(this));
    gW.add((JMenuItem)gX);
    gX = new gX(this, "Import Project Backup", true);
    gX.addActionListener(new dO(this));
    gX.a(new dZ(this));
    gW.add((JMenuItem)gX);
    if (Desktop.isDesktopSupported()) {
      gX = new gX(this, "Show Project Folder", true);
      gX.addActionListener(new ek(this));
      gW.add((JMenuItem)gX);
    } 
    gW.addSeparator();
    gX = new gX(this, "Project Properties", true);
    gX.setAccelerator(KeyStroke.getKeyStroke(80, 2));
    gX.a(this.o);
    gX.addActionListener(new ev(this));
    gW.add((JMenuItem)gX);
    gN.add((JMenuItem)gW);
    if (!i.a().a("4320432porepo09")) {
      gX = new gX(this, "New Project", true);
      gX.setAccelerator(KeyStroke.getKeyStroke(78, 8));
      gX.a(fM);
      gX.addActionListener(new eG(this));
      gN.add((JMenuItem)gX);
    } 
    if (!i.a().a("h-0ewkfd[pfd[pew")) {
      gO gO = new gO(this);
      gN.add((JMenuItem)gO);
    } 
    gX = new gX(this, "Open Project", true);
    gX.setAccelerator(KeyStroke.getKeyStroke(79, 8));
    gX.a(fM);
    gX.addActionListener(new eP(this));
    gN.add((JMenuItem)gX);
    gX = new gX(this, "Import Project Backup", true);
    gX.a(fM);
    gX.addActionListener(new eQ(this));
    gN.add((JMenuItem)gX);
    gX.setEnabled(i.a().a("09RGDKDG;LKIGD"));
    gN.addSeparator();
    gX = new gX(this, "Tune Restore Points", true);
    gX.setAccelerator(KeyStroke.getKeyStroke(82, 2));
    gX.addActionListener(new eR(this));
    gN.add((JMenuItem)gX);
    if (i.a().a("-=fds[pfds[pgd-0")) {
      gX.a(this.o);
    } else {
      gX.setEnabled(false);
    } 
    gX = new gX(this, g.b("Load Tune") + " (" + a.cw + ")", true);
    gX.setAccelerator(KeyStroke.getKeyStroke(79, 2));
    gX.addActionListener(new eS(this));
    gN.add((JMenuItem)gX);
    gX = new gX(this, "Save Tune", true);
    gX.setAccelerator(KeyStroke.getKeyStroke(83, 2));
    gX.a(this.o);
    gX.addActionListener(new eU(this));
    gN.add((JMenuItem)gX);
    gX = new gX(this, "Save Tune As", true);
    gX.a(this.o);
    gX.addActionListener(new eV(this));
    gN.add((JMenuItem)gX);
    if (i.a().a("67r67r8yhdrtrbyuk")) {
      gX = new gX(this, "Compare Tune", true);
      gX.setAccelerator(KeyStroke.getKeyStroke(77, 2));
      gX.a(new eW(this));
      gX.addActionListener(new eX(this));
      gN.add((JMenuItem)gX);
    } 
    boolean bool1 = a.a().a(a.da, a.db);
    if (!bool1) {
      gI gI = new gI(this, "Gauge Cluster");
      gI.a(new eY(this));
      gN.add((JMenuItem)gI);
    } 
    boolean bool2 = i.a().a(";LFDS;LFDS0943;L");
    if (bool2) {
      gY gY = new gY(this, "Tuning Views");
      gY.a(new eZ(this));
      gN.add((JMenuItem)gY);
    } 
    fa fa = new fa(this);
    gV gV = new gV(this, "Work Offline", false, false);
    gV.setAccelerator(KeyStroke.getKeyStroke(87, 2));
    gV.a(fa);
    gV.a(new fb(this));
    gV.addActionListener(new fc(this));
    gN.add((JMenuItem)gV);
    gN.addSeparator();
    gX = new gX(this, "Exit", true);
    gX.addActionListener(new fd(this));
    gN.add((JMenuItem)gX);
    return gN;
  }
  
  public a f() {
    gW gW = new gW(this, "Data Logging", true);
    if (this.p.equals("Wrapping Main Menu"))
      gW.b(true); 
    gW.a(this.o);
    gW.setMnemonic('D');
    boolean bool = i.a().a(";'rew-043;lh/lhoi");
    gX gX1 = new gX(this, "Start Logging", true);
    gX1.setAccelerator(KeyStroke.getKeyStroke(76, 2));
    gX1.a(new ff(this));
    gX1.setEnabled(bool);
    gX1.addActionListener(new fg(this));
    gW.add((JMenuItem)gX1);
    gX1 = new gX(this, "Stop", true);
    gX1.setAccelerator(KeyStroke.getKeyStroke(75, 2));
    gX1.a(new fh(this));
    gX1.addActionListener(new fi(this));
    gW.add((JMenuItem)gX1);
    gX gX2 = new gX(this, "Logging Profiles", true);
    if (i.a().a("fg;';'[PD;LSAG")) {
      gX2.a(this.o);
      gX2.addActionListener(new fj(this));
    } else {
      gX2.setEnabled(false);
    } 
    gW.add((JMenuItem)gX2);
    gX gX3 = new gX(this, "Triggered Logging", true);
    if (i.a().a("FDSDSA-0;L;l0") || i.a().a("sa0-0o0os-0o-0DS")) {
      gX3.a(this.o);
      gX3.addActionListener(new fk(this));
    } else {
      gX3.setEnabled(false);
    } 
    gW.add((JMenuItem)gX3);
    gW.addSeparator();
    a a1 = new a(g.b("Data Logging Preferences"));
    a a2 = new a(g.b("Data Log Format"));
    ButtonGroup buttonGroup = new ButtonGroup();
    String str = a.a().c(a.cA, a.cB);
    JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(g.b("ASCII Format") + " (" + a.cs + ")");
    jCheckBoxMenuItem1.setSelected(str.equals(a.cs));
    jCheckBoxMenuItem1.addActionListener(new fl(this));
    a2.add(jCheckBoxMenuItem1);
    buttonGroup.add(jCheckBoxMenuItem1);
    JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem(g.b("Enhanced Logging Format") + " (" + a.cr + ")");
    jCheckBoxMenuItem2.setSelected(str.equals(a.cr));
    jCheckBoxMenuItem2.addActionListener(new fm(this));
    a2.add(jCheckBoxMenuItem2);
    buttonGroup.add(jCheckBoxMenuItem2);
    a1.add((JMenuItem)a2);
    gW.add((JMenuItem)a1);
    if (i.a().a("8754JUREJYFD87")) {
      JMenu jMenu = new JMenu("Data Log Naming");
      String str1 = a.a().c(a.ce, a.cf);
      buttonGroup = new ButtonGroup();
      JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem(g.b("Name Data Logs On Stop"), str1.equals(a.bX));
      jCheckBoxMenuItem3.addActionListener(new fn(this));
      buttonGroup.add(jCheckBoxMenuItem3);
      jMenu.add(jCheckBoxMenuItem3);
      JCheckBoxMenuItem jCheckBoxMenuItem4 = new JCheckBoxMenuItem(g.b("Name Data Logs On Start"), str1.equals(a.bY));
      jCheckBoxMenuItem4.addActionListener(new fo(this));
      buttonGroup.add(jCheckBoxMenuItem4);
      jMenu.add(jCheckBoxMenuItem4);
      JCheckBoxMenuItem jCheckBoxMenuItem5 = new JCheckBoxMenuItem(g.b("Silently Auto Name Log Files"), str1.equals(a.bZ));
      jCheckBoxMenuItem5.addActionListener(new fq(this));
      buttonGroup.add(jCheckBoxMenuItem5);
      jMenu.add(jCheckBoxMenuItem5);
      a1.add(jMenu);
      boolean bool1 = a.a().c(a.ca, a.cb);
      c c = new c(g.b("Show Rename Dialog on SD Download"), true, bool1);
      c.a(new fr(this));
      a1.add((JMenuItem)c);
      if (i.a().a(" 09s98r32-po3q9264")) {
        boolean bool2 = a.a().c(a.ae, a.af);
        c c1 = new c(g.b("Save Tune to Data Log"), true, bool2);
        c1.a(new fs(this));
        c1.addActionListener(new ft(this));
        c1.a(new fu(this));
        c1.setToolTipText(g.b("Enhanced Logging Format") + " (" + a.cr + ") " + g.b("Required"));
        a1.add((JMenuItem)c1);
      } 
    } 
    if (i.a().a("sa0-0o0os-0o-0DS")) {
      gX gX = new gX(this, "Re ARM Logging", true);
      gX.addActionListener(new fv(this));
      gX.setAccelerator(KeyStroke.getKeyStroke(65, 2));
      gX.a(new fw(this));
      gW.add((JMenuItem)gX);
    } 
    if (!a.a().a(a.cY, a.cZ)) {
      gW.addSeparator();
      gW gW1 = new gW(this, "Import / Conversion");
      gX gX4 = new gX(this, "PalmLog Import Utility", true);
      gX4.a(this.o);
      gX4.addActionListener(new fx(this));
      gW1.add((JMenuItem)gX4);
      String str1 = a.a().a(a.dn, "Convert Binary Log (MS3, FRD)");
      gX gX5 = new gX(this, str1, true);
      gX5.a(this.o);
      gX5.addActionListener(new fy(this));
      gW1.add((JMenuItem)gX5);
      gW.add((JMenuItem)gW1);
    } else if (i.a().a("098532oiutewlkjg098")) {
      String str1 = a.a().a(a.dn, "Convert Binary Log (MS3, FRD)");
      gX gX = new gX(this, str1, true);
      gX.a(this.o);
      gX.addActionListener(new fz(this));
      gW.add((JMenuItem)gX);
    } 
    if (i.a().a("6509h;l;lhfoi")) {
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
      gX1.a(this.o);
      gW.add((JMenuItem)gX1);
    } 
    return gW;
  }
  
  public a g() {
    gW gW1 = new gW(this, "Options", true);
    gW1.setMnemonic('P');
    boolean bool1 = i.a().a(";';';'0-=pfpdpd");
    if (!i.a().a("r-0gds-=-=fd43;ds")) {
      gW gW = new gW(this, "Language", true);
      ArrayList arrayList = g.b();
      ButtonGroup buttonGroup1 = new ButtonGroup();
      for (e e1 : arrayList) {
        String str1 = "en";
        String str2 = e1.b();
        if (e1.a().equals(str1))
          str2 = str2 + " (Default)"; 
        JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str2, true);
        buttonGroup1.add(jCheckBoxMenuItem);
        jCheckBoxMenuItem.setActionCommand(e1.a());
        jCheckBoxMenuItem.setSelected(e1.a().equals(a.a().c("viewLanguageCode", str1)));
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
      String str2 = a.a().c("defaultLookAndFeelClass", UIManager.getCrossPlatformLookAndFeelClassName());
      if (lookAndFeelInfo.getClassName().equals(str2))
        str1 = str1 + " (" + g.b("Default") + ")"; 
      if (!str1.equals("Windows Classic") && !str1.startsWith("TinyLookAndFeel")) {
        JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str1, true);
        buttonGroup.add(jCheckBoxMenuItem);
        jCheckBoxMenuItem.setActionCommand(lookAndFeelInfo.getClassName());
        jCheckBoxMenuItem.setSelected(lookAndFeelInfo.getClassName().equals(a.a().c("lookAndFeelClass", str2)));
        jCheckBoxMenuItem.addActionListener(new fG(this));
        gW2.add(jCheckBoxMenuItem);
      } 
    } 
    if (i.a().a("FS-0FDS;L4"))
      gW1.add(gW2.getComponent()); 
    if (!bool1) {
      gW gW5 = new gW(this, "Navigation", true);
      buttonGroup = new ButtonGroup();
      JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(g.b("Main Menu Style"));
      jCheckBoxMenuItem1.setActionCommand("Main Menu Style");
      jCheckBoxMenuItem1.setState(a.a().c("navigationStyle", a).equals("Main Menu Style"));
      buttonGroup.add(jCheckBoxMenuItem1);
      jCheckBoxMenuItem1.addActionListener(new fH(this));
      gW5.add(jCheckBoxMenuItem1);
      if (!a.a().c("lookAndFeelClass", "").contains("TinyLookAndFeel")) {
        jCheckBoxMenuItem1 = new JCheckBoxMenuItem(g.b("Wrapping Main Menu"));
        jCheckBoxMenuItem1.setActionCommand("Wrapping Main Menu");
        jCheckBoxMenuItem1.setState(a.a().c("navigationStyle", a).equals("Wrapping Main Menu"));
        buttonGroup.add(jCheckBoxMenuItem1);
        jCheckBoxMenuItem1.addActionListener(new fI(this));
        gW5.add(jCheckBoxMenuItem1);
      } 
      jCheckBoxMenuItem1 = new JCheckBoxMenuItem(g.b("Toolbar Style"));
      jCheckBoxMenuItem1.setActionCommand("Toolbar Style");
      jCheckBoxMenuItem1.setState(a.a().c("navigationStyle", a).equals("Toolbar Style"));
      buttonGroup.add(jCheckBoxMenuItem1);
      jCheckBoxMenuItem1.addActionListener(new fJ(this));
      gW5.add(jCheckBoxMenuItem1);
      gW gW6 = new gW(this, "Navigation options");
      boolean bool4 = a.a().c(a.bh, true);
      jCheckBoxMenuItem1 = new JCheckBoxMenuItem(g.b("Show Disabled Menu"));
      jCheckBoxMenuItem1.setState(bool4);
      jCheckBoxMenuItem1.addActionListener(new fK(this));
      gW6.add(jCheckBoxMenuItem1);
      gW5.add((JMenuItem)gW6);
      gW1.add((JMenuItem)gW5);
      gW gW7 = new gW(this, "View");
      boolean bool5 = a.a().c(a.bL, a.bM);
      gV gV1 = new gV(this, "Show Gauges on VE Analyze", true, bool5);
      gV1.addActionListener(new fL(this));
      gV1.a(new fN(this));
      gW7.add((JMenuItem)gV1);
      boolean bool6 = a.a().c(a.bN, a.bO);
      gV gV2 = new gV(this, "Show Live Graphs on VE Analyze", true, bool6);
      gV2.addActionListener(new fO(this));
      gV2.a(new fP(this));
      gW7.add((JMenuItem)gV2);
      gW1.add((JMenuItem)gW7);
      boolean bool7 = a.a().c(a.bl, a.bm);
      gV gV3 = new gV(this, "Show Enable Condition in Menu Tooltips", true, bool7);
      gV3.addActionListener(new fQ(this));
      gV3.a(new fR(this));
      gW7.add((JMenuItem)gV3);
      gW1.add((JMenuItem)gW7);
      gW gW8 = new gW(this, "Advanced");
      JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem(g.b("Report INI Warnings"));
      jCheckBoxMenuItem2.addActionListener(new fS(this));
      boolean bool8 = a.a().c(a.bc, a.bd);
      jCheckBoxMenuItem2.setState(bool8);
      gW8.add(jCheckBoxMenuItem2);
      if (J.a()) {
        JMenu jMenu = new JMenu(g.b("Video driver work arounds"));
        ButtonGroup buttonGroup1 = new ButtonGroup();
        JCheckBoxMenuItem jCheckBoxMenuItem4 = new JCheckBoxMenuItem(g.b("Force OpenGL Active"));
        jCheckBoxMenuItem4.addActionListener(new fT(this));
        boolean bool10 = a.a().c(a.F, a.G);
        jCheckBoxMenuItem4.setState(bool10);
        buttonGroup1.add(jCheckBoxMenuItem4);
        jMenu.add(jCheckBoxMenuItem4);
        JCheckBoxMenuItem jCheckBoxMenuItem5 = new JCheckBoxMenuItem(g.b("Disable Direct 3D"));
        jCheckBoxMenuItem5.addActionListener(new fU(this));
        boolean bool11 = a.a().c(a.H, a.I);
        jCheckBoxMenuItem5.setState(bool11);
        buttonGroup1.add(jCheckBoxMenuItem5);
        jMenu.add(jCheckBoxMenuItem5);
        JCheckBoxMenuItem jCheckBoxMenuItem6 = new JCheckBoxMenuItem(g.b("Java Default (D3D Enabled)"));
        jCheckBoxMenuItem6.addActionListener(new fV(this));
        boolean bool = (!bool10 && !bool11) ? true : false;
        jCheckBoxMenuItem6.setState(bool);
        buttonGroup1.add(jCheckBoxMenuItem6);
        jMenu.add(jCheckBoxMenuItem6);
        gW8.add(jMenu);
      } 
      JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem(g.b("Always Allow Multiple Instances"));
      jCheckBoxMenuItem3.addActionListener(new fW(this));
      boolean bool9 = a.a().c(a.bP, a.bQ);
      jCheckBoxMenuItem3.setState(bool9);
      gW8.add(jCheckBoxMenuItem3);
      if (i.a().a("98fg54lklk")) {
        boolean bool = (a.A() != null && a.A().Q()) ? true : false;
        c c = new c(g.b("Run Slave Server"), true, bool);
        c.addActionListener(new fY(this));
        c.a(new fZ(this));
        gW8.add((JMenuItem)c);
        c.a(this.o);
      } 
      gW1.add((JMenuItem)gW8);
    } 
    gW gW3 = new gW(this, "Preferences");
    if (i.a().a(";'GDS0[p'pgd[p")) {
      boolean bool4 = a.a().c(a.bf, a.cP);
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(g.b("Load Last Project on startup"), bool4);
      jCheckBoxMenuItem.addActionListener(new ga(this));
      gW3.add(jCheckBoxMenuItem);
      boolean bool5 = a.a().c(a.bg, false);
      gV gV1 = new gV(this, "Make Dashboards Full Screen", true, bool5);
      gV1.addActionListener(new gb(this));
      gV1.a(new gc(this));
      gV1.a(new gd(this));
      gW3.add((JMenuItem)gV1);
    } 
    gW gW4 = new gW(this, "Settings Dialog Font Size");
    int i = a.a().a(a.aH, a.a().o());
    gE gE = new gE(this);
    int j = a.a().o();
    for (byte b = 8; b < 41; b++) {
      String str = (b == j) ? (b + "(" + g.b("Default") + ")") : (b + "");
      gV gV1 = new gV(this, str, true, (i == b));
      gE.a((JCheckBoxMenuItem)gV1);
      gV1.setActionCommand("" + b);
      gV1.addActionListener(new ge(this));
      gW4.add((JMenuItem)gV1);
    } 
    gW3.add((JMenuItem)gW4);
    if (i.a().a("fv-7rkf74nfd67whn5iuchqj")) {
      gX gX = new gX(this, "Password Caching Timeout", true);
      gX.addActionListener(new gf(this));
      gX.b(new gg(this));
      gW3.add((JMenuItem)gX);
    } 
    if (BinTableView.S()) {
      boolean bool = a.a().a(a.cg, a.ch);
      gV gV1 = new gV(this, g.b("Mouse wheel scroll changes selected Table cells"), true, bool);
      gV1.addActionListener(new gh(this));
      gV1.a(new gj(this));
      gW3.add((JMenuItem)gV1);
    } 
    if (i.a().a("67r67r8yhdrtrbyuk")) {
      boolean bool = a.a().c(a.bu, a.bv);
      gV gV1 = new gV(this, g.b("Perform Difference Report On Connect"), true, bool);
      gV1.addActionListener(new gk(this));
      gV1.a(new gl(this));
      gW3.add((JMenuItem)gV1);
    } 
    boolean bool2 = a.a().c(a.bw, true);
    gV gV = new gV(this, g.b("Automatically Load and Save Current Tune"), true, bool2);
    gV.addActionListener(new gm(this));
    gV.a(new gn(this));
    gW3.add((JMenuItem)gV);
    if (i.a().a(",.fesokdsoi4309")) {
      boolean bool = a.a().c(a.bj, a.bk);
      gV gV1 = new gV(this, g.b("Prompt if CurrentTune altered by other program"), true, bool);
      gV1.addActionListener(new go(this));
      gV1.a(new gp(this));
      gW3.add((JMenuItem)gV1);
    } 
    gW1.add((JMenuItem)gW3);
    if (i.a().a("-=fds[pfds[pgd-0")) {
      gW gW = new gW(this, "Restore Points");
      boolean bool = a.a().c(a.bz, a.bA);
      JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(g.b("Save Restore Point on Close"), bool);
      jCheckBoxMenuItem1.setToolTipText(g.b("When enabled a Restore Point will be created on Project close"));
      jCheckBoxMenuItem1.addActionListener(new gq(this));
      gW.add(jCheckBoxMenuItem1);
      bool = a.a().c(a.bD, a.bE);
      JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem(g.b("Save Restore Point on Connect"), bool);
      jCheckBoxMenuItem2.setToolTipText(g.b("When enabled a Restore Point will be created when connecting to the ECU if it is different from the last restore point"));
      jCheckBoxMenuItem2.addActionListener(new gr(this));
      gW.add(jCheckBoxMenuItem2);
      bool = a.a().c(a.bB, a.bC);
      JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem(g.b("Save Restore Point on Tune Save"), bool);
      jCheckBoxMenuItem3.setToolTipText(g.b("When enabled a Restore Point will be created on Tune Save or CTRL+S"));
      jCheckBoxMenuItem3.addActionListener(new gs(this));
      gW.add(jCheckBoxMenuItem3);
      bool = a.a().c(a.bF, a.bG);
      JCheckBoxMenuItem jCheckBoxMenuItem4 = new JCheckBoxMenuItem(g.b("Save Restore Point on Tune Open"), bool);
      jCheckBoxMenuItem4.setToolTipText(g.b("When enabled a Restore Point will be created when loading a Tune file to a controller"));
      jCheckBoxMenuItem4.addActionListener(new gu(this));
      gW.add(jCheckBoxMenuItem4);
      bool = a.a().c(a.bJ, a.bK);
      JCheckBoxMenuItem jCheckBoxMenuItem5 = new JCheckBoxMenuItem(g.b("Skip when no setting changes"), bool);
      jCheckBoxMenuItem5.setToolTipText(g.b("When enabled a Restore Point will not be saved if a there have been no changes since the last Restore Point"));
      jCheckBoxMenuItem5.addActionListener(new gv(this));
      gW.add(jCheckBoxMenuItem5);
      double d1 = a.a().a(a.bH, a.bI);
      gX gX = new gX(this, g.b("Maximum Megabytes Disk Space") + ": " + X.a(d1), true);
      gX.addActionListener(new gw(this));
      gW.add((JMenuItem)gX);
      gW1.add((JMenuItem)gW);
    } 
    if (!bool1) {
      gW gW = new gW(this, "Performance");
      boolean bool4 = a.a().c(a.bo, true);
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(g.b("Gauge Float down on start"), bool4);
      jCheckBoxMenuItem.setToolTipText(g.b("Enable / Disable gauge float down on project open."));
      jCheckBoxMenuItem.addActionListener(new gx(this));
      gW.add(jCheckBoxMenuItem);
      boolean bool5 = a.a().c(a.bp, false);
      if (bool5) {
        JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(g.b("Run In Lite Mode"), bool5);
        jCheckBoxMenuItem1.setToolTipText(g.b("Turns off features to conserve resources."));
        jCheckBoxMenuItem1.addActionListener(new gy(this));
        if (!i.a().a("poij0um098u8oiukj")) {
          gW.add(jCheckBoxMenuItem1);
          jCheckBoxMenuItem1.setEnabled(false);
          jCheckBoxMenuItem1.setState(false);
        } 
      } 
      if (a.a().b(a.bq, a.br)) {
        boolean bool = a.a().c(a.bs, a.bt);
        JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(g.b("Dash Only Mode"), bool);
        jCheckBoxMenuItem1.setToolTipText(g.b("Disables Tuning functions for faster project load and to conserve resources."));
        jCheckBoxMenuItem1.addActionListener(new gz(this));
        gW.add(jCheckBoxMenuItem1);
      } else {
        a.a().b(a.bq, Boolean.toString(false));
      } 
      if (i.a().a("_(*UR98ewf098u 98EE 2  *(W")) {
        boolean bool = a.a().c(a.aa, a.ab);
        JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(g.b("Prevent Sleep when Online"), bool);
        jCheckBoxMenuItem1.setToolTipText("<html>" + g.b("When active, Screen saver and sleeping will be prevented while online with a controller.") + "<br>" + g.b("When not connected to a controller, sleeping will be allowed."));
        jCheckBoxMenuItem1.addActionListener(new gA(this));
        gW.add(jCheckBoxMenuItem1);
      } 
      gW1.add((JMenuItem)gW);
    } else if (i.a().a("_(*UR98ewf098u 98EE 2  *(W") && i.a().a("_(*UR98ewf098u 98EE 2  *(W")) {
      boolean bool = a.a().c(a.aa, a.ab);
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(g.b("Prevent Sleep when Online"), bool);
      jCheckBoxMenuItem.setToolTipText("<html>" + g.b("When active, Screen saver and sleeping will be prevented while online with a controller.") + "<br>" + g.b("When not connected to a controller, sleeping will be allowed."));
      jCheckBoxMenuItem.addActionListener(new gB(this));
      gW3.add(jCheckBoxMenuItem);
    } 
    if (i.a().a("645fds645fds  fdsd098532#@")) {
      a a = new a("Preferred Units");
      gW1.add((JMenuItem)a);
      boolean bool = a.a().c(a.cc, a.cd);
      c c = new c(g.b("Convert Table Y Axis kPa to PSI"), true, bool);
      c.a(new gC(this));
      c.addActionListener(new gD(this));
      a.add((JMenuItem)c);
    } 
    boolean bool3 = a.a().c(a.J, false);
    if (bool3) {
      JMenuItem jMenuItem = gW1.add(g.b("Enable Registration"));
      jMenuItem.addActionListener(new dE(this));
    } else if (a.a().s()) {
      JMenu jMenu = new JMenu("Run as Edition");
      dF dF = new dF(this);
      String str = a.a().c(a.cn, a.c);
      buttonGroup = new ButtonGroup();
      if (a.do.length > 0) {
        String str1 = a.do[0] + i.c;
        JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str1);
        jCheckBoxMenuItem.setSelected(str.equals(str1));
        buttonGroup.add(jCheckBoxMenuItem);
        jCheckBoxMenuItem.addActionListener(dF);
        jMenu.add(jCheckBoxMenuItem);
      } 
      for (String str1 : a.do) {
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
    String str = g.b("Must Restart for changes to take effect.") + "\n" + g.b("Restart Now?");
    if (bV.a(str, this.h, true))
      f.a().d(this.h); 
  }
  
  public a h() {
    gW gW = new gW(this, "Communications", true);
    gW.setMnemonic('C');
    dG dG = new dG(this);
    gX gX = new gX(this, "Settings", true);
    gX.a(dG);
    gX.addActionListener(new dH(this));
    gW.add((JMenuItem)gX);
    gX = new gX(this, "Data Rate", true);
    if (!i.a().a(" 98 98  0gep9gds09kfg09")) {
      gW.setEnabled(false);
    } else {
      gX.a(dG);
    } 
    gX.addActionListener(new dI(this));
    gW.add((JMenuItem)gX);
    ArrayList arrayList = R.a().b();
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
    if (i.a().a("bd098fsdpokfdslk")) {
      gX = new gX(this, "GPS Configuration", true);
      gX.addActionListener(new dK(this));
      gW.add((JMenuItem)gX);
    } else if (i.a().a("oewtltroh4fs5dslk")) {
      gX = new gX(this, "Enable GPS Support", true);
      gX.addActionListener(new dL(this));
      gW.add((JMenuItem)gX);
    } 
    boolean bool1 = a.a().a(a.dc, a.dd);
    if (!bool1) {
      gX = new gX(this, "Mini Terminal", true);
      gX.addActionListener(new dM(this));
      gW.add((JMenuItem)gX);
    } 
    gV gV = new gV(this, "Verify Data on Burn", false, true);
    gV.a(new dN(this));
    gV.a(new dP(this));
    gV.addActionListener(new dQ(this));
    boolean bool2 = a.a().a(a.de, a.df);
    if (!bool2) {
      gV gV1 = new gV(this, "Comm Debug Log", false, true);
      gV1.a(new dR(this));
      gV1.addActionListener(new dS(this));
      gW.add((JMenuItem)gV1);
    } 
    return gW;
  }
  
  public a i() {
    gW gW1 = new gW(this, "Tools", true);
    gW1.setMnemonic('T');
    String str = a.a().c(a.cE, null);
    boolean bool = (str != null && (str.equalsIgnoreCase("philip.tobin@yahoo.com") || str.equalsIgnoreCase("p_tobin@yahoo.com") || str.equalsIgnoreCase("brian@efianalytics.com") || (a.b.equals("BigComm") && (str.equalsIgnoreCase("kjmeaney@msn.com") || str.equalsIgnoreCase("pmosman@hyconinc.com") || str.equalsIgnoreCase("BigStuff3@comcast.net"))) || (a.b.equals("TunerStudio") && (str.equalsIgnoreCase("agrippo1@verizon.net") || str.equalsIgnoreCase("jsm@jsm-net.demon.co.uk"))))) ? true : false;
    if (i.a().a("GD[PP-0REP")) {
      gX gX1 = new gX(this, "Controller RAM Editor", true);
      gX1.a(new dT(this));
      gX1.addActionListener(new dU(this));
      gW1.add((JMenuItem)gX1);
      gX1 = new gX(this, "Binary Log Viewer", true);
      gX1.addActionListener(new dV(this));
      gW1.add((JMenuItem)gX1);
      gX1 = new gX(this, "Expression Evaluator", true);
      gX1.addActionListener(new dW(this));
      gX1.a(new dX(this));
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
      if (i.a().a("098po;l;lklkjj")) {
        gX1 = new gX(this, "Import ODT Addressing", true);
        gX1.addActionListener(new ec(this));
        gX1.a(new ed(this));
        gW1.add((JMenuItem)gX1);
        gX1 = new gX(this, "Import Cal Addressing", true);
        gX1.addActionListener(new ee(this));
        gX1.a(new ef(this));
        gW1.add((JMenuItem)gX1);
      } 
      gW1.addSeparator();
    } 
    ju ju = new ju();
    gW1.add((JMenuItem)ju);
    if (!i.a().a("09;lgdlgd432;okg0")) {
      gX gX1 = new gX(this, "Protocol Stats", true);
      gX1.addActionListener(new eg(this));
      gX1.b(new eh(this));
      gW1.add((JMenuItem)gX1);
      gW1.addSeparator();
    } 
    if (i.a().a(";LKFDS;LK09")) {
      gX gX1 = new gX(this, "Update / Install Firmware", true);
      gX1.addActionListener(new ei(this));
      gW1.add((JMenuItem)gX1);
    } 
    if (i.a().a("098432lkjgd0932=- ")) {
      gX gX1 = new gX(this, "Manage Ini Tuning Views", true);
      gX1.addActionListener(new ej(this));
      gX1.a(this.o);
      gW1.add((JMenuItem)gX1);
    } 
    gX gX = new gX(this, "Add Custom Channel Wizard", true);
    gX.addActionListener(new el(this));
    if (i.a().a(";lfds09pofs,54w09")) {
      gX.a(new em(this));
    } else {
      gX.setEnabled(false);
      gX.setToolTipText(g.b("Upgrade to enable"));
    } 
    gW1.add((JMenuItem)gX);
    gX = new gX(this, "Custom Channel Editor", true);
    gX.addActionListener(new en(this));
    if (i.a().a(";lfds09pofs,54w09")) {
      gX.a(new eo(this));
    } else {
      gX.setEnabled(false);
      gX.setToolTipText(g.b("Upgrade to enable"));
    } 
    gW1.add((JMenuItem)gX);
    gX = new gX(this, "User Action Editor", true);
    gX.addActionListener(new ep(this));
    if (!i.a().a("poij  fdsz poi9ure895 ms7(")) {
      gX.setEnabled(false);
      gX.setToolTipText(g.b("Upgrade to enable"));
    } 
    gX = new gX(this, "Action Management", true);
    gX.addActionListener(new eq(this));
    if (!i.a().a("poij  fdsz poi9ure895 ms7(")) {
      gX.setEnabled(false);
      gX.setToolTipText(g.b("Upgrade to enable"));
    } else {
      gX.a(this.o);
    } 
    gW1.add((JMenuItem)gX);
    gW gW2 = new gW(this, "Calculators", true);
    if (i.a().a(";oij fds poi fd u ou43t wer3287")) {
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
      gW2.setToolTipText(g.b("Upgrade to enable"));
    } 
    gW1.add((JMenuItem)gW2);
    boolean bool1 = i.a().a("09jtrkgds;okfds");
    if (!i.a().a(";,fes;p9rew;o")) {
      gW gW = new gW(this, a.b + " Plug-ins", true);
      R r = T.a().c();
      String str1 = (r != null) ? r.i() : "";
      byte b = 0;
      for (ApplicationPlugin applicationPlugin : l.a().c()) {
        if (applicationPlugin.displayPlugin(str1) && applicationPlugin.getPluginType() == 2) {
          gX = new gX(this, applicationPlugin.getDisplayName(), true);
          gX.setName(applicationPlugin.getIdName());
          gX.addActionListener(new eu(this));
          if (!bool1)
            gX.setToolTipText(g.b("Application Plugin Support not available in this edition")); 
          gX.a(new gM(this, applicationPlugin));
          gW.add((JMenuItem)gX);
          b++;
        } 
      } 
      if (b == 0) {
        gX = new gX(this, "No Plugins Installed", true);
        gX.setEnabled(false);
        gW.add((JMenuItem)gX);
      } 
      gW.addSeparator();
      gX = new gX(this, "Add or Update a Plugin", true);
      gX.setEnabled(bool1);
      gX.addActionListener(new ew(this));
      gW.add((JMenuItem)gX);
      gX = new gX(this, "Online Plugin Information", true);
      gX.addActionListener(new ex(this));
      gW.add((JMenuItem)gX);
      gW1.add((JMenuItem)gW);
      gW1.addSeparator();
    } 
    if (a.b.equals(i.x) && (a.c.contains("MS") || a.c.contains("RE"))) {
      gX = new gX(this, "Calibrate TPS", false);
      gX.a(new ey(this));
      gX.addActionListener(new ez(this));
      gX.b(new eA(this));
      gW1.add((JMenuItem)gX);
    } 
    return gW1;
  }
  
  private void r() {
    this.c.F();
  }
  
  public a j() {
    gW gW = new gW(this, b, true);
    gW.setMnemonic('H');
    boolean bool1 = a.a().a(a.dg, a.dh);
    if (!bool1) {
      gX gX1 = new gX(this, a.b + " " + g.b(b), true);
      gX1.addActionListener(new eB(this));
      gW.add((JMenuItem)gX1);
      gW.addSeparator();
    } 
    gX gX = new gX(this, "Check For Update", true);
    gX.addActionListener(new eC(this));
    gW.add((JMenuItem)gX);
    boolean bool = (a.a().c(a.cK, false) && A.i().a(a.a().c(a.cF, ""))) ? true : false;
    boolean bool2 = A.i().a(a.a().c(a.cF, ""));
    if (!bool)
      a.a().b(a.aQ, "true"); 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(g.b("Automatic Update Check"), a.a().c(a.aQ, false));
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
    if (i.a().a("87gdjkjd98fes")) {
      gX = new gX(this, "Upgrade for even more Features!", true);
      gX.addActionListener(new eJ(this));
      gW.add((JMenuItem)gX);
    } 
    gW.addSeparator();
    boolean bool3 = a.a().a(a.dj, false);
    if (bool3) {
      gX = new gX(this, "Submit " + a.b + " Review", true);
      gX.addActionListener(new eK(this));
      gW.add((JMenuItem)gX);
    } 
    gX = new gX(this, "Create " + a.b + " Debug Package", true);
    gX.addActionListener(new eL(this));
    gW.add((JMenuItem)gX);
    gX = new gX(this, "About", true);
    gX.addActionListener(new eM(this));
    gW.add((JMenuItem)gX);
    return gW;
  }
  
  public void a(R paramR) {
    if (this.d != null)
      this.d.p().b(this); 
    this.d = paramR;
    n();
    p();
    k();
    this.q.validate();
    if (this.e != null && !this.e.equals(this.q))
      this.e.validate(); 
  }
  
  public void k() {
    if (this.m != null)
      this.m.a(); 
  }
  
  public void c(R paramR) {
    paramR.p().a(this);
  }
  
  public void b(R paramR) {
    n();
    this.e.b(paramR.c());
    p();
    this.d.p().b(this);
    paramR.b(this);
    paramR.C().b(this);
    cu.a().a(this.n);
  }
  
  public void b(boolean paramBoolean) {
    if (!SwingUtilities.isEventDispatchThread()) {
      eN eN = new eN(this, paramBoolean);
      try {
        SwingUtilities.invokeAndWait(eN);
      } catch (InterruptedException|java.lang.reflect.InvocationTargetException interruptedException) {
        Logger.getLogger(dB.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } else {
      this.q.setEnabled(paramBoolean);
      if (this.e != null && this.e.getComponent() != null)
        this.e.getComponent().setEnabled(paramBoolean); 
    } 
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    k();
  }
  
  public void a() {
    b(false);
    eO eO = new eO(this);
    eO.start();
  }
  
  public void a(boolean paramBoolean) {
    b(true);
  }
  
  public boolean a(String paramString, bT parambT) {
    return true;
  }
  
  public void a(String paramString) {}
  
  public void a(a parama, R paramR) {}
  
  public void e_() {
    this.j = 0;
  }
  
  public void a(a parama) {}
  
  public gQ l() {
    return this.q;
  }
  
  public f a(String paramString, boolean paramBoolean) {
    if (this.p.equals("Main Menu Style"))
      return (f)new gW(this, paramString, paramBoolean); 
    if (this.p.equals("Wrapping Main Menu")) {
      gW gW = new gW(this, paramString, paramBoolean);
      gW.b(true);
      return (f)gW;
    } 
    b b = new b(paramString, paramBoolean);
    b.setToolTipText(paramString);
    b.addMouseListener(new gU(this, (f)b));
    this.f.a(b);
    return (f)b;
  }
  
  protected String d(String paramString) {
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
    String str = this.i[this.j % this.i.length];
    this.j++;
    return str;
  }
  
  private gK a(f paramf, boolean paramBoolean) {
    gK gK = (this.k.size() > 0) ? this.k.remove(0) : new gK(this, null);
    gK.a(paramBoolean);
    gK.a(paramf);
    return gK;
  }
  
  private gL b(f paramf, boolean paramBoolean) {
    gL gL = (this.l.size() > 0) ? this.l.remove(0) : new gL(this, null);
    gL.a(paramBoolean);
    gL.a(paramf);
    return gL;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */