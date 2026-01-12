package ao;

import V.ExceptionInVPackage;
import V.VInterfaceHotel;
import VInterfaceHotel.IComponentBravo;
import VInterfaceHotel.g;
import VInterfaceHotel.i;
import W.B;
import W.C;
import W.n;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cS;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.w;
import g.IOJFileChooser;
import i.ExceptionInVPackage;
import i.IComponentBravo;
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

public class hE extends JPanel implements B, id, ExceptionInVPackage, IComponentBravo {
  hZ ExceptionInVPackage = null;

  hZ IComponentBravo = null;

  private hW u = null;

  private File v = null;

  hN c = null;

  hN d = null;

  n e = null;

  String f = "";

  String[] g = new String[] {"MAP", "MAP"};

  final int VInterfaceHotel = 0;

  final int i = 1;

  boolean j = true;

  JButton IOJFileChooser = null;

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
    int i = i.IComponentBravo("prefFontSize", eJ.ExceptionInVPackage(10));
    hP hP = new hP(this);
    this.ExceptionInVPackage = new hZ();
    this.ExceptionInVPackage.ExceptionInVPackage(hP);
    dQ dQ = new dQ(i.f(), "tuningTable1");
    this.ExceptionInVPackage.VInterfaceHotel().ExceptionInVPackage((et) dQ);
    this.ExceptionInVPackage.c(i);
    this.s.add((Component) this.ExceptionInVPackage);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1, eJ.ExceptionInVPackage(5), 0));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 0, eJ.ExceptionInVPackage(2), eJ.ExceptionInVPackage(3)));
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
    jPanel3.setLayout(new GridLayout(1, 0, eJ.ExceptionInVPackage(2), eJ.ExceptionInVPackage(3)));
    this.IOJFileChooser = new JButton(t);
    this.IOJFileChooser.addActionListener(new hI(this));
    jPanel3.add(this.IOJFileChooser);
    this.IOJFileChooser.setEnabled(
        IComponentBravo.ExceptionInVPackage().ExceptionInVPackage("veAnalyze"));
    this.m = new JButton("Save Tune As");
    this.m.setToolTipText("Save Tune to ExceptionInVPackage new file");
    this.m.addActionListener(new hJ(this));
    jPanel3.add(this.m);
    this.d = new hN(this);
    this.d.addItemListener(new hK(this));
    jPanel3.add(this.d);
    jPanel1.add(jPanel3);
    this.s.add(jPanel1);
    this.IComponentBravo = new hZ();
    this.IComponentBravo.ExceptionInVPackage(hP);
    dQ = new dQ(i.f(), "tuningTable2");
    this.IComponentBravo.VInterfaceHotel().ExceptionInVPackage((et) dQ);
    this.IComponentBravo.c(i);
    this.s.add((Component) this.IComponentBravo);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(1, 1));
    jPanel4.add(this.o);
    this.s.add(jPanel4);
    boolean bool = false;
    if (!bool) {
      JPanel jPanel = new JPanel();
      jPanel.setMinimumSize(
          new Dimension(eJ.ExceptionInVPackage(150), eJ.ExceptionInVPackage(200)));
      jPanel.setPreferredSize(
          new Dimension(eJ.ExceptionInVPackage(150), eJ.ExceptionInVPackage(300)));
    } else {
      fK fK = new fK();
      add("Center", fK);
      dQ dQ1 = new dQ(i.e, "mainViewScatter1_");
      fK.ExceptionInVPackage((et) dQ1);
    }
    IComponentBravo(false);
  }

  public void ExceptionInVPackage(Component paramComponent) {
    this.s.remove(this.o);
    this.s.add(paramComponent);
    this.s.add(this.o);
  }

  public void ExceptionInVPackage(boolean paramBoolean) {
    this.j = paramBoolean;
    if (paramBoolean) {
      this.s.remove(this.o);
      this.s.add((Component) this.IComponentBravo);
      this.s.add(this.o);
    } else {
      this.s.remove((Component) this.IComponentBravo);
    }
    IComponentBravo(isVisible());
  }

  public JPanel c() {
    return this.s;
  }

  public void IComponentBravo(boolean paramBoolean) {
    this.ExceptionInVPackage.setVisible(paramBoolean);
    this.c.setVisible(paramBoolean);
    this.IOJFileChooser.setVisible(paramBoolean);
    this.o.setVisible(paramBoolean);
    this.m.setVisible(paramBoolean);
    this.l.setVisible(paramBoolean);
    if (this.j) {
      this.IComponentBravo.setVisible(paramBoolean);
      this.d.setVisible(paramBoolean);
    } else {
      this.IComponentBravo.setVisible(false);
      this.d.setVisible(false);
    }
  }

  public void d() {
    String str = i.e("lastVeFile", "");
    if (!str.equals("") && (new File(str)).exists())
      try {
        IComponentBravo(str);
      } catch (Exception exception) {
        Logger.getLogger(hE.class.getName()).log(Level.SEVERE, (String) null, exception);
        bV.d(
            "Unable to open file:\n" + str + "\n \nError Message:\n" + exception.getMessage(),
            this);
      }
  }

  private String n() {
    String str = i.e("lastVeFile", "");
    if (str.length() == 0) {
      str = System.getProperty("user.home") + File.separator;
      str = i.e("lastFileDir", str);
      File file = new File(str);
      if (file.exists() && file.getName().equals("DataLogs")) file = file.getParentFile();
      return file.getAbsolutePath();
    }
    return (str.indexOf(File.separator) != -1)
        ? str.substring(0, str.lastIndexOf(File.separator))
        : str;
  }

  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    dimension.height = 200;
    return dimension;
  }

  public void ExceptionInVPackage(int paramInt, String paramString) {
    if (paramString == null) return;
    hW hW1 = m();
    if (hW1 == null) return;
    hZ hZ1 = (paramInt == 1) ? this.IComponentBravo : this.ExceptionInVPackage;
    hY hY = hW1.IComponentBravo(paramString);
    if (hY == null) return;
    int i = i.ExceptionInVPackage("prefFontSize", eJ.ExceptionInVPackage(10));
    hZ1.ExceptionInVPackage(hY);
    hZ1.f().setToolTipText(hY.v());
    hZ1.ExceptionInVPackage("<html>" + paramString + "<br>" + this.f + "</html>");
    hZ1.IComponentBravo(paramString);
    if (hW1.IOJFileChooser(paramString)) hZ1.IComponentBravo(true);
    invalidate();
    hZ1.IOJFileChooser();
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

  public void ExceptionInVPackage(hW paramhW, hN paramhN) {
    paramhN.removeAll();
    if (paramhW != null) hQ.ExceptionInVPackage(paramhW, paramhN, (String) null);
  }

  public void e() {
    if (!g()) return;
    String[] arrayOfString1 = o();
    String str = n();
    String[] arrayOfString2 =
        bV.ExceptionInVPackage(
            this, "Open Tune settings file", arrayOfString1, (String) null, str, true, null, true);
    if (arrayOfString2 != null && arrayOfString2.length > 0) {
      this.f = arrayOfString2[0];
      try {
        IComponentBravo(this.f);
      } catch (ExceptionInVPackage a1) {
        Logger.getLogger(hE.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
        bV.d("Unable to open file:\n" + this.f + "\n \nError Message:\n" + a1.getMessage(), this);
      }
    }
  }

  public void f() {
    if (!g()) return;
    if (!c(this.e)) return;
    String str1 = this.c.IComponentBravo();
    if (str1.toLowerCase().indexOf("ve") == -1
        && str1.indexOf("Fuel") == -1
        && str1.indexOf("pwATable") == -1
        && str1.indexOf("pwBTable") == -1) {
      IOJFileChooser.ExceptionInVPackage(
          "Please set top table to the VE table you wish to analyze.", this);
      return;
    }
    String str2 = g.ExceptionInVPackage().ExceptionInVPackage(g.d);
    if (this.e.ExceptionInVPackage(str2).f() < 100.0D
        && !IOJFileChooser.ExceptionInVPackage(
            "RPM Very low, You probably want to select RPM x 100 from the Options Menu.\n"
                + "Continue anyway?",
            this,
            true)) return;
    if (this.e.ExceptionInVPackage(str2).f() > 20000.0D
        && !IOJFileChooser.ExceptionInVPackage(
            "RPM Very High, You probably want to unselect RPM x 100 from the Options Menu.\n"
                + "Continue anyway?",
            this,
            true)) return;
    String str3 = "";
    String str4 = str1.substring(str1.length() - 1);
    for (byte b1 = 0; b1 < this.c.c(); b1++) {
      String str = this.c.IComponentBravo(b1).toLowerCase();
      if ((str.toLowerCase().startsWith("afr")
              || str.toLowerCase().startsWith("lambda")
              || str.toLowerCase().startsWith("target afr")
              || str.toLowerCase().startsWith("target lambda"))
          && this.c.IComponentBravo(b1).indexOf(str4) != -1) str3 = this.c.IComponentBravo(b1);
    }
    hY hY = null;
    try {
      if (!i.e("lastVeAnalysisAfrTable", "").equals("Default AFR")) hY = m().IComponentBravo(str3);
    } catch (Exception exception) {
    }
    String str5 = this.ExceptionInVPackage.g().v();
    if (str5 == null || str5.equals("") || this.e.ExceptionInVPackage(str5) == null) {
      str5 = i.ExceptionInVPackage("yAxisField", g.ExceptionInVPackage().ExceptionInVPackage(g.j));
      this.ExceptionInVPackage.g().d(str5);
    }
    this.n =
        new eK(
            m(),
            (hY) this.ExceptionInVPackage.g(),
            hY,
            this.e,
            IOJFileChooser.ExceptionInVPackage(this),
            "VE Analyze");
    Point point = IOJFileChooser.ExceptionInVPackage(this).getLocation();
    this.n.setLocation(point.x + 100, point.y + 50);
    this.n.ExceptionInVPackage(this);
    this.n.setVisible(true);
  }

  public boolean g() {
    String str = System.getProperty("java.specification.version");
    if (str == null || str.equals("")) {
      IOJFileChooser.ExceptionInVPackage(
          "Failed to detect Java Version, 1.4 or greater required for Tuning Console. Will try to"
              + " load.",
          this);
      return true;
    }
    double d = Double.parseDouble(str);
    if (d < 1.4D) {
      IOJFileChooser.ExceptionInVPackage(
          "Java Version "
              + str
              + " detected, \n"
              + "JRE version 1.4 or greater required for Tuning Console. \n"
              + "Please upgrade JRE to use this feature. \n"
              + "Updated JRE can be found at https://www.java.com/en/download/",
          this);
      return false;
    }
    return true;
  }

  public void ExceptionInVPackage(String paramString) {
    byte b1 = 65;
    if (paramString != null && paramString.length() > b1) {
      int i = b1 - 19;
      paramString =
          paramString.substring(0, 10)
              + " .... "
              + paramString.substring(paramString.length() - i, paramString.length());
    }
    this.o.setText(paramString);
  }

  public boolean VInterfaceHotel() {
    return (m() != null && m().IComponentBravo());
  }

  public void i() {
    this.ExceptionInVPackage.j();
    if (this.IComponentBravo != null) this.IComponentBravo.j();
  }

  public void ExceptionInVPackage(File paramFile) {
    if (bV.ExceptionInVPackage(
        "File "
            + paramFile.getName()
            + " has been modified outside this application.\nReload the file now?",
        this,
        true))
      try {
        IComponentBravo(paramFile.getAbsolutePath());
      } catch (ExceptionInVPackage a1) {
        Logger.getLogger(hE.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
      }
  }

  public void IComponentBravo(String paramString) {
    hE hE1 = this;
    hL hL = new hL(this, paramString, hE1);
    hL.run();
  }

  public void j() {
    ExceptionInVPackage("");
    IComponentBravo((hW) null);
    ExceptionInVPackage((hW) null, this.c);
    ExceptionInVPackage((hW) null, this.d);
    IComponentBravo(true);
    i.c("lastVeFile", "");
    if (this.n != null && this.n.isVisible()) {
      this.n.setVisible(false);
      this.n.dispose();
    }
    if (this.v != null) {
      C.ExceptionInVPackage().e(this.v);
      this.v = null;
    }
  }

  public void ExceptionInVPackage(hW paramhW) {
    ExceptionInVPackage(this.f);
    IComponentBravo(paramhW);
    ExceptionInVPackage(m(), this.c);
    ExceptionInVPackage(m(), this.d);
    IComponentBravo(true);
    if (this.c.c() > 0) {
      if (!this.c.IComponentBravo(i.ExceptionInVPackage("lastTable1", "veBins1"))
          && !this.c.IComponentBravo("veTable1")
          && !this.c.IComponentBravo("veBins1")
          && !this.c.IComponentBravo("fuelTable")) this.c.ExceptionInVPackage(0);
      ExceptionInVPackage(0, this.c.IComponentBravo(this.c.d()));
    }
    if (this.d.c() > 1) {
      if (!this.d.IComponentBravo(i.e("lastTable2", "advTable1"))
          && !this.d.IComponentBravo("advanceTable")
          && !this.d.IComponentBravo("advTable1")
          && !this.d.IComponentBravo("afrTable1")
          && !this.d.IComponentBravo("o2Table")) this.d.ExceptionInVPackage(1);
      ExceptionInVPackage(1, this.d.IComponentBravo(this.d.d()));
    }
    i.c("lastVeFile", this.f);
    if (this.n != null && this.n.isVisible()) {
      this.n.setVisible(false);
      this.n.dispose();
    }
    IComponentBravo(hx.ExceptionInVPackage().p());
    i();
    paramhW.ExceptionInVPackage();
  }

  private String[] o() {
    String str = i.ExceptionInVPackage("tuneFileExtensions", "msq;tune");
    return str.split(";");
  }

  private boolean c(String paramString) {
    String[] arrayOfString = o();
    for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
      if (paramString.toLowerCase().indexOf("." + arrayOfString[b1]) != -1) return true;
    }
    return false;
  }

  public void IOJFileChooser() {
    String[] arrayOfString = o();
    String str = this.f;
    str =
        IOJFileChooser.ExceptionInVPackage(
            this, "Save Tune Configuration file", arrayOfString, this.f, false);
    if (str == null || str.equals("")) return;
    if (!c(str))
      if (this.q == null || this.q.equals("")) {
        str = str + "." + arrayOfString[0];
      } else {
        str = str + "." + this.q;
      }
    this.f = str;
    if (m() == null) {
      IOJFileChooser.ExceptionInVPackage(
          "Unable to save this "
              + arrayOfString[0]
              + " file.\nIt is most likely corrupt.\nTry saving ExceptionInVPackage new "
              + arrayOfString[0]
              + " from ExceptionInVPackage supported tuning application.\n"
              + "If this problem persists please report it.",
          this);
      return;
    }
    try {
      m().j(this.f);
    } catch (VInterfaceHotel VInterfaceHotel) {
      System.out.println("Error Saving File.");
      VInterfaceHotel.printStackTrace();
      IOJFileChooser.ExceptionInVPackage("Error saving msq file.\nSee log file for details.", this);
      return;
    }
    ExceptionInVPackage(this.f);
    ExceptionInVPackage(0, this.c.IComponentBravo(this.c.d()));
    if (this.d != null && this.d.isVisible())
      ExceptionInVPackage(1, this.d.IComponentBravo(this.d.d()));
    i.c("lastVeFile", this.f);
    cS.ExceptionInVPackage().ExceptionInVPackage(this);
  }

  public void l() {
    if (m() == null) {
      IOJFileChooser.ExceptionInVPackage(
          "No Tune Settings loaded.\nPlease open an valid Tune Settings file.", this);
      return;
    }
    try {
      C.ExceptionInVPackage().c(this.v);
      m().j(this.f);
      C.ExceptionInVPackage().d(this.v);
    } catch (VInterfaceHotel VInterfaceHotel) {
      System.out.println("Error Saving File.");
      VInterfaceHotel.printStackTrace();
      IOJFileChooser.ExceptionInVPackage(
          "Error saving Tune Settings file.\nSee log file for details.", this);
      return;
    }
    m().ExceptionInVPackage();
    ExceptionInVPackage(0, this.c.IComponentBravo(this.c.d()));
    if (this.d != null && this.d.isVisible())
      ExceptionInVPackage(1, this.d.IComponentBravo(this.d.d()));
    cS.ExceptionInVPackage().ExceptionInVPackage(this);
  }

  public void IComponentBravo(int paramInt) {
    if (this.e == null
        || !isVisible()
        || this.ExceptionInVPackage == null
        || !this.ExceptionInVPackage.isVisible()) return;
    String str1 = "";
    String str2 = "";
    try {
      if (this.e.ExceptionInVPackage(this.ExceptionInVPackage.g().v()) == null && !this.r) {
        String str = i.ExceptionInVPackage("yAxisField", "");
        if (str.equals("") || str.equals(this.ExceptionInVPackage.g().v())) {
          IOJFileChooser.ExceptionInVPackage(
              "The Y Axis fields \""
                  + this.ExceptionInVPackage.g().v()
                  + "\" not found in current data log.\n"
                  + "Set the correct Y axis field from \"Options\" Menu for table highlighting\n"
                  + "and VE Analysis to work correctly.",
              this);
          this.r = true;
        } else {
          Iterator<String> iterator = m().c();
          while (iterator.hasNext()) {
            hY hY = m().IComponentBravo(iterator.next());
            if (this.e.ExceptionInVPackage(hY.v()) == null) hY.d(str);
          }
        }
      }
      String str3 = g.ExceptionInVPackage().ExceptionInVPackage(g.d);
      String str4 = this.ExceptionInVPackage.g().v();
      if (this.e.ExceptionInVPackage(str4) == null) str4 = i.ExceptionInVPackage("yAxisField", "");
      String str5 = this.IComponentBravo.g().v();
      if (this.e.ExceptionInVPackage(str5) == null)
        str5 = i.ExceptionInVPackage("yAxisField", "MAP");
      if (this.e.ExceptionInVPackage(str5) == null)
        str5 = i.ExceptionInVPackage("yAxisField", "Load");
      if (this.e.ExceptionInVPackage(str3) != null && this.e.ExceptionInVPackage(str4) != null) {
        str2 = Float.toString(this.e.ExceptionInVPackage(str3).d(paramInt));
        str1 = Float.toString(this.e.ExceptionInVPackage(str4).d(paramInt));
        this.ExceptionInVPackage.VInterfaceHotel().ExceptionInVPackage(str1, str2);
        int i = this.ExceptionInVPackage.VInterfaceHotel().J();
        String[] arrayOfString1 = new String[i];
        String[] arrayOfString2 = new String[i];
        for (byte b1 = 0; b1 < i && paramInt - b1 > 0; b1++) {
          arrayOfString1[b1] = Float.toString(this.e.ExceptionInVPackage(str4).d(paramInt - b1));
          arrayOfString2[b1] = Float.toString(this.e.ExceptionInVPackage(str3).d(paramInt - b1));
        }
        this.ExceptionInVPackage.VInterfaceHotel()
            .ExceptionInVPackage(arrayOfString2, arrayOfString1);
        this.ExceptionInVPackage.VInterfaceHotel().repaint();
      }
      if (this.e.ExceptionInVPackage(str3) != null && this.e.ExceptionInVPackage(str5) != null) {
        str1 = Float.toString(this.e.ExceptionInVPackage(str5).d(paramInt));
        this.IComponentBravo.VInterfaceHotel().ExceptionInVPackage(str1, str2);
        int i = this.IComponentBravo.VInterfaceHotel().J();
        String[] arrayOfString1 = new String[i];
        String[] arrayOfString2 = new String[i];
        for (byte b1 = 0; b1 < i && paramInt - b1 > 0; b1++) {
          arrayOfString1[b1] = Float.toString(this.e.ExceptionInVPackage(str5).d(paramInt - b1));
          arrayOfString2[b1] = Float.toString(this.e.ExceptionInVPackage(str3).d(paramInt - b1));
        }
        this.IComponentBravo.VInterfaceHotel().ExceptionInVPackage(arrayOfString2, arrayOfString1);
        this.IComponentBravo.VInterfaceHotel().repaint();
      }
    } catch (Exception exception) {
      System.out.println("yVal=" + str1 + ", rpm=" + str2 + ", index=" + paramInt);
      exception.printStackTrace();
    }
  }

  public void ExceptionInVPackage(String paramString, hY paramhY) {
    hY hY1 = m().IComponentBravo(paramString);
    for (byte b1 = 0; b1 < paramhY.getRowCount(); b1++) {
      for (byte b2 = 0; b2 < paramhY.getColumnCount(); b2++)
        hY1.setValueAt(paramhY.d(b1, b2), b1, b2);
    }
    hY1.C();
    this.ExceptionInVPackage.VInterfaceHotel().repaint();
    this.IComponentBravo.VInterfaceHotel().repaint();
  }

  public void ExceptionInVPackage(double paramDouble) {}

  public void ExceptionInVPackage(n paramn) {
    this.e = paramn;
    if (m() != null) m().e();
    if (this.n != null && this.n.isShowing()) this.n.IComponentBravo(false);
  }

  public void ExceptionInVPackage() {}

  public void IComponentBravo(n paramn) {}

  public void ExceptionInVPackage(int paramInt) {
    if (this.n != null && this.n.isVisible()) this.n.ExceptionInVPackage(paramInt);
    if (!isVisible()) return;
    IComponentBravo(paramInt);
  }

  public void IComponentBravo() {}

  void c(int paramInt) {
    if (this.ExceptionInVPackage != null && this.c.c() > 0) {
      this.ExceptionInVPackage.c(paramInt);
      String str = this.c.IComponentBravo();
      int i = (this.c.d() + 1) % this.c.c();
      ExceptionInVPackage(0, this.c.IComponentBravo(i));
      ExceptionInVPackage(0, str);
    }
    if (this.IComponentBravo != null && this.d.c() > 0) {
      this.IComponentBravo.c(paramInt);
      String str = this.d.IComponentBravo();
      int i = (this.d.d() + 1) % this.d.c();
      ExceptionInVPackage(1, this.d.IComponentBravo(i));
      ExceptionInVPackage(1, str);
    }
  }

  private boolean c(n paramn) {
    String str1 = g.ExceptionInVPackage().ExceptionInVPackage(g.c);
    String str2 = g.ExceptionInVPackage().ExceptionInVPackage(g.VInterfaceHotel);
    String str3 = g.ExceptionInVPackage().ExceptionInVPackage(g.i);
    String str4 = g.ExceptionInVPackage().ExceptionInVPackage(g.IComponentBravo);
    String str5 = g.ExceptionInVPackage().ExceptionInVPackage(g.d);
    String str6 = g.ExceptionInVPackage().ExceptionInVPackage(g.e);
    String str7 = this.ExceptionInVPackage.g().v();
    if (str7 == null || str7.equals("") || paramn.ExceptionInVPackage(str7) == null)
      str7 = i.ExceptionInVPackage("yAxisField", g.ExceptionInVPackage().ExceptionInVPackage(g.j));
    String str8 = "";
    if (str5 == null
        || paramn.ExceptionInVPackage(str5) == null
        || str7 == null
        || paramn.ExceptionInVPackage(str7) == null
        || ((str2 == null || paramn.ExceptionInVPackage(str2) == null)
            && (str4 == null || paramn.ExceptionInVPackage(str4) == null)
            && (str3 == null || paramn.ExceptionInVPackage(str3) == null))) {
      str8 =
          str8
              + "The following fields are required for VE Analyze to work best:\n"
              + str5
              + "\n"
              + str2
              + " or "
              + str3
              + "\n"
              + str7
              + "\n\nAlso to improve results please log these additional fields:\n"
              + str6
              + "\n"
              + str1
              + "\n";
      if (i.c.startsWith(IComponentBravo.e)) str8 = str8 + "dMAP_Corr";
      bV.d(str8, this);
      return false;
    }
    if ((str6 == null || paramn.ExceptionInVPackage(str6) == null) && !str7.equals("PW In1")) {
      str8 =
          "The field used to determine the amount of EGO correction the ECU is applying \""
              + str6
              + "\"\n"
              + "Was not found in the currently loaded Log File. If you run VE Analyze it will"
              + " assume\n"
              + "there is no EGO correction being applied by the ECU.\n\n"
              + "To correct this, either load ExceptionInVPackage log file with the field \""
              + str6
              + "\" \n"
              + "OR\n"
              + "Check to make sure the correct \"Field Naming (ECU)\" option is selected \n"
              + "under the Options Menu. It may be another field name that is appropriate for your"
              + " ECU";
      bV.d(str8, this);
    }
    return true;
  }

  public Dimension getPreferredSize() {
    return (i.e(i.N, i.R).equals(i.P) && this.ExceptionInVPackage != null)
        ? this.ExceptionInVPackage.getPreferredSize()
        : super.getPreferredSize();
  }

  private List ExceptionInVPackage(List<w> paramList, Container paramContainer) {
    for (Component component : paramContainer.getComponents()) {
      if (component instanceof w) {
        paramList.add((w) component);
      } else if (component instanceof Container) {
        ExceptionInVPackage(paramList, (Container) component);
      }
    }
    return paramList;
  }

  private List p() {
    return ExceptionInVPackage(new ArrayList(), this.s);
  }

  public hW m() {
    return this.u;
  }

  public void IComponentBravo(hW paramhW) {
    this.u = paramhW;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
