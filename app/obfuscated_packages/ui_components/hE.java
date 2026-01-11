package ao;

import V.a;
import V.h;
import W.B;
import W.C;
import W.n;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cS;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.w;
import g.k;
import h.b;
import h.g;
import h.i;
import i.a;
import i.b;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class hE extends JPanel implements B, id, a, b {
  hZ a = null;
  
  hZ b = null;
  
  private hW u = null;
  
  private File v = null;
  
  hN c = null;
  
  hN d = null;
  
  n e = null;
  
  String f = "";
  
  String[] g = new String[] { "MAP", "MAP" };
  
  final int h = 0;
  
  final int i = 1;
  
  boolean j = true;
  
  JButton k = null;
  
  JButton l = null;
  
  JButton m = null;
  
  eK n = null;
  
  hM o = new hM(this);
  
  JScrollPane p = new JScrollPane();
  
  String q = null;
  
  boolean r = false;
  
  hO s = null;
  
  public static String t = "VE Analyze";
  
  public hE() {
    this.s = new hO(this);
    setLayout(new BorderLayout(2, 2));
    this.p.setHorizontalScrollBarPolicy(31);
    this.p.setVerticalScrollBarPolicy(22);
    this.p.setViewportView(this.s);
    add("Center", this.p);
    setName("Table Tuner");
    this.s.setLayout(new BoxLayout(this.s, 1));
    int i = i.b("prefFontSize", eJ.a(10));
    hP hP = new hP(this);
    this.a = new hZ();
    this.a.a(hP);
    dQ dQ = new dQ(i.f(), "tuningTable1");
    this.a.h().a((et)dQ);
    this.a.c(i);
    this.s.add((Component)this.a);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1, eJ.a(5), 0));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 0, eJ.a(2), eJ.a(3)));
    JButton jButton = new JButton("Open Tune");
    jButton.setToolTipText("Open Tune File");
    jButton.addActionListener(new hF(this));
    jPanel2.add(jButton);
    this.l = new JButton("Save Tune");
    this.l.setToolTipText("Save Tune File Changes");
    this.l.addActionListener(new hG(this));
    jPanel2.add(this.l);
    this.c = new hN(this);
    this.c.addItemListener(new hH(this));
    jPanel2.add(this.c);
    jPanel1.add(jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(1, 0, eJ.a(2), eJ.a(3)));
    this.k = new JButton(t);
    this.k.addActionListener(new hI(this));
    jPanel3.add(this.k);
    this.k.setEnabled(b.a().a("veAnalyze"));
    this.m = new JButton("Save Tune As");
    this.m.setToolTipText("Save Tune to a new file");
    this.m.addActionListener(new hJ(this));
    jPanel3.add(this.m);
    this.d = new hN(this);
    this.d.addItemListener(new hK(this));
    jPanel3.add(this.d);
    jPanel1.add(jPanel3);
    this.s.add(jPanel1);
    this.b = new hZ();
    this.b.a(hP);
    dQ = new dQ(i.f(), "tuningTable2");
    this.b.h().a((et)dQ);
    this.b.c(i);
    this.s.add((Component)this.b);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(1, 1));
    jPanel4.add(this.o);
    this.s.add(jPanel4);
    boolean bool = false;
    if (!bool) {
      JPanel jPanel = new JPanel();
      jPanel.setMinimumSize(new Dimension(eJ.a(150), eJ.a(200)));
      jPanel.setPreferredSize(new Dimension(eJ.a(150), eJ.a(300)));
    } else {
      fK fK = new fK();
      add("Center", fK);
      dQ dQ1 = new dQ(i.e, "mainViewScatter1_");
      fK.a((et)dQ1);
    } 
    b(false);
  }
  
  public void a(Component paramComponent) {
    this.s.remove(this.o);
    this.s.add(paramComponent);
    this.s.add(this.o);
  }
  
  public void a(boolean paramBoolean) {
    this.j = paramBoolean;
    if (paramBoolean) {
      this.s.remove(this.o);
      this.s.add((Component)this.b);
      this.s.add(this.o);
    } else {
      this.s.remove((Component)this.b);
    } 
    b(isVisible());
  }
  
  public JPanel c() {
    return this.s;
  }
  
  public void b(boolean paramBoolean) {
    this.a.setVisible(paramBoolean);
    this.c.setVisible(paramBoolean);
    this.k.setVisible(paramBoolean);
    this.o.setVisible(paramBoolean);
    this.m.setVisible(paramBoolean);
    this.l.setVisible(paramBoolean);
    if (this.j) {
      this.b.setVisible(paramBoolean);
      this.d.setVisible(paramBoolean);
    } else {
      this.b.setVisible(false);
      this.d.setVisible(false);
    } 
  }
  
  public void d() {
    String str = i.e("lastVeFile", "");
    if (!str.equals("") && (new File(str)).exists())
      try {
        b(str);
      } catch (Exception exception) {
        Logger.getLogger(hE.class.getName()).log(Level.SEVERE, (String)null, exception);
        bV.d("Unable to open file:\n" + str + "\n \nError Message:\n" + exception.getMessage(), this);
      }  
  }
  
  private String n() {
    String str = i.e("lastVeFile", "");
    if (str.length() == 0) {
      str = System.getProperty("user.home") + File.separator;
      str = i.e("lastFileDir", str);
      File file = new File(str);
      if (file.exists() && file.getName().equals("DataLogs"))
        file = file.getParentFile(); 
      return file.getAbsolutePath();
    } 
    return (str.indexOf(File.separator) != -1) ? str.substring(0, str.lastIndexOf(File.separator)) : str;
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    dimension.height = 200;
    return dimension;
  }
  
  public void a(int paramInt, String paramString) {
    if (paramString == null)
      return; 
    hW hW1 = m();
    if (hW1 == null)
      return; 
    hZ hZ1 = (paramInt == 1) ? this.b : this.a;
    hY hY = hW1.b(paramString);
    if (hY == null)
      return; 
    int i = i.a("prefFontSize", eJ.a(10));
    hZ1.a(hY);
    hZ1.f().setToolTipText(hY.v());
    hZ1.a("<html>" + paramString + "<br>" + this.f + "</html>");
    hZ1.b(paramString);
    if (hW1.k(paramString))
      hZ1.b(true); 
    invalidate();
    hZ1.k();
    hZ1.c(i);
    hZ1.setName(paramString);
    if (getParent() != null) {
      getParent().validate();
      getParent().doLayout();
    } 
    doLayout();
    i.c((paramInt == 1) ? "lastTable2" : "lastTable1", paramString);
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt4 < (getMinimumSize()).height) {
      super.setBounds(paramInt1, paramInt2, paramInt3, (getMinimumSize()).height);
    } else {
      super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
  }
  
  public void setSize(int paramInt1, int paramInt2) {
    if (paramInt2 < (getMinimumSize()).height) {
      super.setSize(paramInt1, (getMinimumSize()).height);
    } else {
      super.setSize(paramInt1, paramInt2);
    } 
  }
  
  public void a(hW paramhW, hN paramhN) {
    paramhN.removeAll();
    if (paramhW != null)
      hQ.a(paramhW, paramhN, (String)null); 
  }
  
  public void e() {
    if (!g())
      return; 
    String[] arrayOfString1 = o();
    String str = n();
    String[] arrayOfString2 = bV.a(this, "Open Tune settings file", arrayOfString1, (String)null, str, true, null, true);
    if (arrayOfString2 != null && arrayOfString2.length > 0) {
      this.f = arrayOfString2[0];
      try {
        b(this.f);
      } catch (a a1) {
        Logger.getLogger(hE.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        bV.d("Unable to open file:\n" + this.f + "\n \nError Message:\n" + a1.getMessage(), this);
      } 
    } 
  }
  
  public void f() {
    if (!g())
      return; 
    if (!c(this.e))
      return; 
    String str1 = this.c.b();
    if (str1.toLowerCase().indexOf("ve") == -1 && str1.indexOf("Fuel") == -1 && str1.indexOf("pwATable") == -1 && str1.indexOf("pwBTable") == -1) {
      k.a("Please set top table to the VE table you wish to analyze.", this);
      return;
    } 
    String str2 = g.a().a(g.d);
    if (this.e.a(str2).f() < 100.0D && !k.a("RPM Very low, You probably want to select RPM x 100 from the Options Menu.\nContinue anyway?", this, true))
      return; 
    if (this.e.a(str2).f() > 20000.0D && !k.a("RPM Very High, You probably want to unselect RPM x 100 from the Options Menu.\nContinue anyway?", this, true))
      return; 
    String str3 = "";
    String str4 = str1.substring(str1.length() - 1);
    for (byte b1 = 0; b1 < this.c.c(); b1++) {
      String str = this.c.b(b1).toLowerCase();
      if ((str.toLowerCase().startsWith("afr") || str.toLowerCase().startsWith("lambda") || str.toLowerCase().startsWith("target afr") || str.toLowerCase().startsWith("target lambda")) && this.c.b(b1).indexOf(str4) != -1)
        str3 = this.c.b(b1); 
    } 
    hY hY = null;
    try {
      if (!i.e("lastVeAnalysisAfrTable", "").equals("Default AFR"))
        hY = m().b(str3); 
    } catch (Exception exception) {}
    String str5 = this.a.g().v();
    if (str5 == null || str5.equals("") || this.e.a(str5) == null) {
      str5 = i.a("yAxisField", g.a().a(g.j));
      this.a.g().d(str5);
    } 
    this.n = new eK(m(), (hY)this.a.g(), hY, this.e, k.a(this), "VE Analyze");
    Point point = k.a(this).getLocation();
    this.n.setLocation(point.x + 100, point.y + 50);
    this.n.a(this);
    this.n.setVisible(true);
  }
  
  public boolean g() {
    String str = System.getProperty("java.specification.version");
    if (str == null || str.equals("")) {
      k.a("Failed to detect Java Version, 1.4 or greater required for Tuning Console. Will try to load.", this);
      return true;
    } 
    double d = Double.parseDouble(str);
    if (d < 1.4D) {
      k.a("Java Version " + str + " detected, \nJRE version 1.4 or greater required for Tuning Console. \nPlease upgrade JRE to use this feature. \nUpdated JRE can be found at https://www.java.com/en/download/", this);
      return false;
    } 
    return true;
  }
  
  public void a(String paramString) {
    byte b1 = 65;
    if (paramString != null && paramString.length() > b1) {
      int i = b1 - 19;
      paramString = paramString.substring(0, 10) + " .... " + paramString.substring(paramString.length() - i, paramString.length());
    } 
    this.o.setText(paramString);
  }
  
  public boolean h() {
    return (m() != null && m().b());
  }
  
  public void i() {
    this.a.j();
    if (this.b != null)
      this.b.j(); 
  }
  
  public void a(File paramFile) {
    if (bV.a("File " + paramFile.getName() + " has been modified outside this application.\nReload the file now?", this, true))
      try {
        b(paramFile.getAbsolutePath());
      } catch (a a1) {
        Logger.getLogger(hE.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      }  
  }
  
  public void b(String paramString) {
    hE hE1 = this;
    hL hL = new hL(this, paramString, hE1);
    hL.run();
  }
  
  public void j() {
    a("");
    b((hW)null);
    a((hW)null, this.c);
    a((hW)null, this.d);
    b(true);
    i.c("lastVeFile", "");
    if (this.n != null && this.n.isVisible()) {
      this.n.setVisible(false);
      this.n.dispose();
    } 
    if (this.v != null) {
      C.a().e(this.v);
      this.v = null;
    } 
  }
  
  public void a(hW paramhW) {
    a(this.f);
    b(paramhW);
    a(m(), this.c);
    a(m(), this.d);
    b(true);
    if (this.c.c() > 0) {
      if (!this.c.b(i.a("lastTable1", "veBins1")) && !this.c.b("veTable1") && !this.c.b("veBins1") && !this.c.b("fuelTable"))
        this.c.a(0); 
      a(0, this.c.b(this.c.d()));
    } 
    if (this.d.c() > 1) {
      if (!this.d.b(i.e("lastTable2", "advTable1")) && !this.d.b("advanceTable") && !this.d.b("advTable1") && !this.d.b("afrTable1") && !this.d.b("o2Table"))
        this.d.a(1); 
      a(1, this.d.b(this.d.d()));
    } 
    i.c("lastVeFile", this.f);
    if (this.n != null && this.n.isVisible()) {
      this.n.setVisible(false);
      this.n.dispose();
    } 
    b(hx.a().p());
    i();
    paramhW.a();
  }
  
  private String[] o() {
    String str = i.a("tuneFileExtensions", "msq;tune");
    return str.split(";");
  }
  
  private boolean c(String paramString) {
    String[] arrayOfString = o();
    for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
      if (paramString.toLowerCase().indexOf("." + arrayOfString[b1]) != -1)
        return true; 
    } 
    return false;
  }
  
  public void k() {
    String[] arrayOfString = o();
    String str = this.f;
    str = k.a(this, "Save Tune Configuration file", arrayOfString, this.f, false);
    if (str == null || str.equals(""))
      return; 
    if (!c(str))
      if (this.q == null || this.q.equals("")) {
        str = str + "." + arrayOfString[0];
      } else {
        str = str + "." + this.q;
      }  
    this.f = str;
    if (m() == null) {
      k.a("Unable to save this " + arrayOfString[0] + " file.\nIt is most likely corrupt.\nTry saving a new " + arrayOfString[0] + " from a supported tuning application.\nIf this problem persists please report it.", this);
      return;
    } 
    try {
      m().j(this.f);
    } catch (h h) {
      System.out.println("Error Saving File.");
      h.printStackTrace();
      k.a("Error saving msq file.\nSee log file for details.", this);
      return;
    } 
    a(this.f);
    a(0, this.c.b(this.c.d()));
    if (this.d != null && this.d.isVisible())
      a(1, this.d.b(this.d.d())); 
    i.c("lastVeFile", this.f);
    cS.a().a(this);
  }
  
  public void l() {
    if (m() == null) {
      k.a("No Tune Settings loaded.\nPlease open an valid Tune Settings file.", this);
      return;
    } 
    try {
      C.a().c(this.v);
      m().j(this.f);
      C.a().d(this.v);
    } catch (h h) {
      System.out.println("Error Saving File.");
      h.printStackTrace();
      k.a("Error saving Tune Settings file.\nSee log file for details.", this);
      return;
    } 
    m().a();
    a(0, this.c.b(this.c.d()));
    if (this.d != null && this.d.isVisible())
      a(1, this.d.b(this.d.d())); 
    cS.a().a(this);
  }
  
  public void b(int paramInt) {
    if (this.e == null || !isVisible() || this.a == null || !this.a.isVisible())
      return; 
    String str1 = "";
    String str2 = "";
    try {
      if (this.e.a(this.a.g().v()) == null && !this.r) {
        String str = i.a("yAxisField", "");
        if (str.equals("") || str.equals(this.a.g().v())) {
          k.a("The Y Axis fields \"" + this.a.g().v() + "\" not found in current data log.\nSet the correct Y axis field from \"Options\" Menu for table highlighting\nand VE Analysis to work correctly.", this);
          this.r = true;
        } else {
          Iterator<String> iterator = m().c();
          while (iterator.hasNext()) {
            hY hY = m().b(iterator.next());
            if (this.e.a(hY.v()) == null)
              hY.d(str); 
          } 
        } 
      } 
      String str3 = g.a().a(g.d);
      String str4 = this.a.g().v();
      if (this.e.a(str4) == null)
        str4 = i.a("yAxisField", ""); 
      String str5 = this.b.g().v();
      if (this.e.a(str5) == null)
        str5 = i.a("yAxisField", "MAP"); 
      if (this.e.a(str5) == null)
        str5 = i.a("yAxisField", "Load"); 
      if (this.e.a(str3) != null && this.e.a(str4) != null) {
        str2 = Float.toString(this.e.a(str3).d(paramInt));
        str1 = Float.toString(this.e.a(str4).d(paramInt));
        this.a.h().a(str1, str2);
        int i = this.a.h().J();
        String[] arrayOfString1 = new String[i];
        String[] arrayOfString2 = new String[i];
        for (byte b1 = 0; b1 < i && paramInt - b1 > 0; b1++) {
          arrayOfString1[b1] = Float.toString(this.e.a(str4).d(paramInt - b1));
          arrayOfString2[b1] = Float.toString(this.e.a(str3).d(paramInt - b1));
        } 
        this.a.h().a(arrayOfString2, arrayOfString1);
        this.a.h().repaint();
      } 
      if (this.e.a(str3) != null && this.e.a(str5) != null) {
        str1 = Float.toString(this.e.a(str5).d(paramInt));
        this.b.h().a(str1, str2);
        int i = this.b.h().J();
        String[] arrayOfString1 = new String[i];
        String[] arrayOfString2 = new String[i];
        for (byte b1 = 0; b1 < i && paramInt - b1 > 0; b1++) {
          arrayOfString1[b1] = Float.toString(this.e.a(str5).d(paramInt - b1));
          arrayOfString2[b1] = Float.toString(this.e.a(str3).d(paramInt - b1));
        } 
        this.b.h().a(arrayOfString2, arrayOfString1);
        this.b.h().repaint();
      } 
    } catch (Exception exception) {
      System.out.println("yVal=" + str1 + ", rpm=" + str2 + ", index=" + paramInt);
      exception.printStackTrace();
    } 
  }
  
  public void a(String paramString, hY paramhY) {
    hY hY1 = m().b(paramString);
    for (byte b1 = 0; b1 < paramhY.getRowCount(); b1++) {
      for (byte b2 = 0; b2 < paramhY.getColumnCount(); b2++)
        hY1.setValueAt(paramhY.d(b1, b2), b1, b2); 
    } 
    hY1.C();
    this.a.h().repaint();
    this.b.h().repaint();
  }
  
  public void a(double paramDouble) {}
  
  public void a(n paramn) {
    this.e = paramn;
    if (m() != null)
      m().e(); 
    if (this.n != null && this.n.isShowing())
      this.n.b(false); 
  }
  
  public void a() {}
  
  public void b(n paramn) {}
  
  public void a(int paramInt) {
    if (this.n != null && this.n.isVisible())
      this.n.a(paramInt); 
    if (!isVisible())
      return; 
    b(paramInt);
  }
  
  public void b() {}
  
  void c(int paramInt) {
    if (this.a != null && this.c.c() > 0) {
      this.a.c(paramInt);
      String str = this.c.b();
      int i = (this.c.d() + 1) % this.c.c();
      a(0, this.c.b(i));
      a(0, str);
    } 
    if (this.b != null && this.d.c() > 0) {
      this.b.c(paramInt);
      String str = this.d.b();
      int i = (this.d.d() + 1) % this.d.c();
      a(1, this.d.b(i));
      a(1, str);
    } 
  }
  
  private boolean c(n paramn) {
    String str1 = g.a().a(g.c);
    String str2 = g.a().a(g.h);
    String str3 = g.a().a(g.i);
    String str4 = g.a().a(g.b);
    String str5 = g.a().a(g.d);
    String str6 = g.a().a(g.e);
    String str7 = this.a.g().v();
    if (str7 == null || str7.equals("") || paramn.a(str7) == null)
      str7 = i.a("yAxisField", g.a().a(g.j)); 
    String str8 = "";
    if (str5 == null || paramn.a(str5) == null || str7 == null || paramn.a(str7) == null || ((str2 == null || paramn.a(str2) == null) && (str4 == null || paramn.a(str4) == null) && (str3 == null || paramn.a(str3) == null))) {
      str8 = str8 + "The following fields are required for VE Analyze to work best:\n" + str5 + "\n" + str2 + " or " + str3 + "\n" + str7 + "\n\nAlso to improve results please log these additional fields:\n" + str6 + "\n" + str1 + "\n";
      if (i.c.startsWith(b.e))
        str8 = str8 + "dMAP_Corr"; 
      bV.d(str8, this);
      return false;
    } 
    if ((str6 == null || paramn.a(str6) == null) && !str7.equals("PW In1")) {
      str8 = "The field used to determine the amount of EGO correction the ECU is applying \"" + str6 + "\"\nWas not found in the currently loaded Log File. If you run VE Analyze it will assume\nthere is no EGO correction being applied by the ECU.\n\nTo correct this, either load a log file with the field \"" + str6 + "\" \nOR\nCheck to make sure the correct \"Field Naming (ECU)\" option is selected \nunder the Options Menu. It may be another field name that is appropriate for your ECU";
      bV.d(str8, this);
    } 
    return true;
  }
  
  public Dimension getPreferredSize() {
    return (i.e(i.N, i.R).equals(i.P) && this.a != null) ? this.a.getPreferredSize() : super.getPreferredSize();
  }
  
  private List a(List<w> paramList, Container paramContainer) {
    for (Component component : paramContainer.getComponents()) {
      if (component instanceof w) {
        paramList.add((w)component);
      } else if (component instanceof Container) {
        a(paramList, (Container)component);
      } 
    } 
    return paramList;
  }
  
  private List p() {
    return a(new ArrayList(), this.s);
  }
  
  public hW m() {
    return this.u;
  }
  
  public void b(hW paramhW) {
    this.u = paramhW;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */