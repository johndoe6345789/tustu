package aP;

import A.f;
import A.j;
import A.o;
import A.x;
import B.e;
import B.l;
import G.bT;
import aB.b;
import aC.a;
import aC.b;
import aD.a;
import aV.w;
import bH.D;
import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.dM;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import r.a;
import r.i;
import s.g;
import z.i;

public class aY extends JPanel implements o {
  JLabel a = new JLabel();
  
  JLabel b = new JLabel(g.b("Searching for known devices."));
  
  JLabel c = new JLabel(" ");
  
  JLabel d = new JLabel(" ");
  
  JLabel e = new JLabel(" ");
  
  JLabel f = new JLabel("Searching on RS232 and USB D2XX, Upgrade for Wireless connectivity.");
  
  JList g = new JList();
  
  DefaultListModel h = new DefaultListModel();
  
  JPanel i = null;
  
  dM j = new dM();
  
  JButton k;
  
  JButton l;
  
  JButton m;
  
  ArrayList n = new ArrayList();
  
  JDialog o = null;
  
  boolean p = false;
  
  boolean q = false;
  
  private boolean s = true;
  
  private bh t = null;
  
  public static int[] r = new int[] { 21848 };
  
  public aY(Window paramWindow) {
    this();
    a(paramWindow);
    b();
  }
  
  public aY() {
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(15, 15));
    jPanel1.setBorder(BorderFactory.createTitledBorder(g.b("Port Search")));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(15, 15));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/search.gif"));
    ImageIcon imageIcon = new ImageIcon(image);
    this.a.setIcon(imageIcon);
    this.a.setMinimumSize(new Dimension(40, 32));
    this.a.setPreferredSize(new Dimension(40, 32));
    this.a.setVisible(false);
    jPanel2.add("West", this.a);
    JLabel jLabel = new JLabel("");
    jLabel.setMinimumSize(new Dimension(16, 32));
    jLabel.setPreferredSize(new Dimension(16, 32));
    jPanel2.add("East", jLabel);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(0, 1));
    jPanel3.add(new JLabel(" "));
    jPanel3.add(this.b);
    jPanel3.add(this.c);
    jPanel3.add(this.d);
    jPanel3.add(new JLabel(" "));
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add("North", jPanel3);
    this.g.setVisibleRowCount(5);
    this.g.setMinimumSize(eJ.a(240, 120));
    this.g.setPreferredSize(eJ.a(240, 120));
    this.g.setBorder(BorderFactory.createLoweredBevelBorder());
    this.g.setModel(this.h);
    this.g.addListSelectionListener(new aZ(this));
    jPanel4.add("Center", this.g);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new GridLayout(0, 1));
    jPanel5.add(this.e);
    jPanel4.add("South", jPanel5);
    jPanel2.add("Center", jPanel4);
    jPanel1.add("Center", jPanel2);
    this.k = new JButton(g.b("Internet Find"));
    this.k.setEnabled(false);
    this.k.addActionListener(new ba(this));
    this.l = new JButton(g.b("Have Local"));
    this.l.setEnabled(false);
    this.l.addActionListener(new bb(this));
    this.m = new JButton(g.b("Accept"));
    this.m.setEnabled(false);
    this.m.addActionListener(new bc(this));
    JButton jButton = new JButton(g.b("Cancel"));
    jButton.addActionListener(new bd(this));
    this.i = new JPanel();
    this.i.setLayout(new FlowLayout(2));
    this.i.add(jButton);
    this.i.add(this.m);
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new BorderLayout(10, 10));
    jPanel6.add("North", (Component)this.j);
    jPanel6.add("Center", this.i);
    jPanel1.add("South", jPanel6);
    jPanel1.add("West", new JLabel("  "));
    add("Center", jPanel1);
  }
  
  public void b() {
    this.q = false;
    j j = j.a();
    String str = a.a().d("deviceSearchQueryCommands");
    if (str != null && !str.isEmpty())
      j.b(str); 
    j.a(this);
    this.h.removeAllElements();
    be be = new be(this);
    be.start();
    for (int i : r) {
      e.a(i).a(this);
      e.a(i).a();
    } 
    this.a.setVisible(true);
    this.a.validate();
    this.a.repaint();
  }
  
  private void j() {
    j j = j.a();
    List list = c();
    j.a(list);
  }
  
  public void b(x paramx) {
    String str = a.a().d("deviceSearchQueryCommands");
    a(paramx, str);
  }
  
  public void a(x paramx, String paramString) {
    ArrayList<x> arrayList = new ArrayList();
    arrayList.add(paramx);
    j j = j.a();
    if (paramString != null && !paramString.isEmpty())
      j.b(paramString); 
    j.a(this);
    this.h.removeAllElements();
    bf bf = new bf(this, j, arrayList);
    bf.start();
    this.a.setVisible(true);
    this.a.validate();
    this.a.repaint();
  }
  
  public void a(boolean paramBoolean) {
    this.i.setVisible(paramBoolean);
    this.i.validate();
  }
  
  public void a(Window paramWindow) {
    if (this.o != null)
      this.o.dispose(); 
    this.o = new JDialog(paramWindow, g.b("Detect Device"));
    this.o.setLayout(new GridLayout());
    this.o.add(this);
    this.o.setSize(eJ.a(750), eJ.a(360));
    bV.a(paramWindow, this.o);
    this.o.setVisible(true);
  }
  
  protected List c() {
    ArrayList<x> arrayList = new ArrayList();
    if (i.a().a(";'[PGS0P;'G0[F;"))
      try {
        x x = new x();
        b b = (b)w.c().a(b.c, "DEFAULT_INSTANCE");
        x.a((f)b);
        List list = b.t();
        String str = a.a().a("deviceSearchBaudRates", "115200;9600;");
        String[] arrayOfString = str.split(";");
        for (byte b1 = 0; b1 < arrayOfString.length; b1++)
          x.a("Baud Rate", arrayOfString[b1]); 
        for (String str1 : list)
          x.a("Device Serial #", str1); 
        x.a("Device Serial #");
        arrayList.add(x);
      } catch (Exception exception) {
        Logger.getLogger(aY.class.getName()).log(Level.WARNING, "Unable to load D2XX driver.", exception);
      } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
        Logger.getLogger(aY.class.getName()).log(Level.WARNING, "Failed to load JSSC Driver", unsatisfiedLinkError);
      }  
    if (i.a().a("fdsp[pp[ds';'"))
      try {
        x x = new x();
        x.a(w.c().a(a.d, "DEFAULT_INSTANCE"));
        String str = a.a().a("deviceSearchBaudRates", "115200;9600;");
        String[] arrayOfString1 = str.split(";");
        for (byte b1 = 0; b1 < arrayOfString1.length; b1++)
          x.a("Baud Rate", arrayOfString1[b1]); 
        i i = new i();
        String[] arrayOfString2 = i.a();
        for (byte b2 = 0; b2 < arrayOfString2.length; b2++)
          x.a("Com Port", arrayOfString2[b2]); 
        x.a("Com Port");
        arrayList.add(x);
      } catch (Exception exception) {
        Logger.getLogger(aY.class.getName()).log(Level.WARNING, "Failed to load JSSC Driver", exception);
      } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
        Logger.getLogger(aY.class.getName()).log(Level.WARNING, "Failed to load JSSC Driver", unsatisfiedLinkError);
      }  
    if (i.a().a("GD;';LFDS-0DSL;") && b.a()) {
      this.t = new bh(this, arrayList);
      boolean bool = true;
      if (bool) {
        try {
          RemoteDevice[] arrayOfRemoteDevice = LocalDevice.getLocalDevice().getDiscoveryAgent().retrieveDevices(1);
          if (arrayOfRemoteDevice != null && arrayOfRemoteDevice.length > 0) {
            x x = new x();
            a a = (a)w.c().a(a.e, "DEFAULT_INSTANCE");
            x.a((f)a);
            for (RemoteDevice remoteDevice : arrayOfRemoteDevice) {
              if (remoteDevice.isTrustedDevice())
                x.a("Bluetooth Device", remoteDevice.getBluetoothAddress()); 
            } 
            arrayList.add(x);
          } else {
            this.t.start();
          } 
        } catch (Exception exception) {
          D.d("Failed to detect Bluetooth devices.");
        } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
          Logger.getLogger(aY.class.getName()).log(Level.WARNING, "Failed to load JSSC Driver", unsatisfiedLinkError);
        } 
      } else {
        List list = b.a(false);
        try {
          if (list != null && list.size() > 0) {
            x x = new x();
            a a = (a)w.c().a(a.e, "DEFAULT_INSTANCE");
            x.a((f)a);
            for (RemoteDevice remoteDevice : list) {
              String str = remoteDevice.getFriendlyName(false);
              str = X.b(str, " ", "");
              if (!remoteDevice.isTrustedDevice() && str.toLowerCase().startsWith("efianaly"))
                b.a(remoteDevice, "1234"); 
              if (remoteDevice.isTrustedDevice())
                x.a("Bluetooth Device", remoteDevice.getBluetoothAddress()); 
            } 
            arrayList.add(x);
          } 
        } catch (Exception exception) {
          D.d("Failed to detect Bluetooth devices.");
        } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
          Logger.getLogger(aY.class.getName()).log(Level.WARNING, "Failed to load JSSC Driver", unsatisfiedLinkError);
        } 
      } 
    } 
    try {
      if (i.a().a("LKFDS;LK;lkfs;lk")) {
        x x = new x();
        x.a(w.c().a(l.b, "DEFAULT_INSTANCE"));
        for (byte b = 0; b < 2; b++)
          x.a(l.j, "192.168.1.8" + b); 
        x.a(l.k, "2000");
        arrayList.add(x);
      } 
    } catch (InstantiationException instantiationException) {
      Logger.getLogger(aY.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      Logger.getLogger(aY.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
    } 
    return arrayList;
  }
  
  public void d() {
    e();
  }
  
  public void e() {
    j j = j.a();
    j.b(this);
    j.b();
    for (int i : r)
      e.a(i).b(this); 
    if (this.o != null)
      this.o.dispose(); 
  }
  
  public void f() {}
  
  public void g() {}
  
  public void h() {
    bT bT = k();
    j.a().b();
    if (bT != null && bT.b() != null && !this.p) {
      m();
      d();
    } else if (this.p && this.s) {
      m();
      d();
    } else {
      bV.d(g.b("No device has been detected") + "\n" + g.b("closing, but not setting anything."), this);
    } 
  }
  
  private bT k() {
    bi bi = this.g.getSelectedValue();
    return (bi != null) ? bi.a() : null;
  }
  
  private void l() {
    bi bi = this.g.getSelectedValue();
    if (bi != null) {
      bT bT = bi.a();
      if (!a(bT)) {
        this.b.setText(g.b("Firmware not loaded."));
        this.c.setText(g.b("Check help for to learn about loading firmware."));
        D.c("Found a controller with no firmware at:" + bi.d());
        this.p = true;
      } else {
        String str = bT.c();
        str = (str == null) ? bT.b() : str;
        if (str.equals("Unknown"))
          str = "Serial Sig " + bT.b() + " Compatible"; 
        this.b.setText(g.b("Found Firmware") + ": " + bT.c());
        this.c.setText(g.b("Serial Signature") + ": " + bT.b());
        this.d.setText(g.b("On") + ":" + bi.d());
        D.c("Device " + bT.c() + ", requiring serial Signature:" + bT.b() + " found at:" + bi.d());
        this.p = false;
      } 
    } else {
      this.b.setText("");
      this.c.setText("");
      this.d.setText(" ");
    } 
    if (!this.i.isVisible()) {
      bg bg = new bg(this);
      SwingUtilities.invokeLater(bg);
    } 
  }
  
  private boolean a(bT parambT) {
    if (parambT != null) {
      byte[] arrayOfByte = parambT.a();
      if ((arrayOfByte[0] & 0xE0) == 224 && (arrayOfByte[1] & 0xF0) == 0 && arrayOfByte[2] == 62)
        return false; 
    } 
    return true;
  }
  
  public void a() {
    if (!this.q) {
      this.l.setEnabled(true);
      this.k.setEnabled(true);
      this.b.setText(g.b("No Controller found."));
      this.c.setText(g.b("Check your connections and be sure you have COM port drivers installed."));
      this.d.setText(g.b("Consult your serial cable provider for the correct drivers."));
      D.c("Device not found");
      this.e.setText(g.b("If your Controller is not attached, you can configure it manually to work offline."));
    } 
  }
  
  public void b(double paramDouble) {
    this.j.a(paramDouble);
    if (paramDouble == 1.0D) {
      this.e.setText(g.b("Device Search Complete! Controllers found:") + " " + this.h.size());
      this.a.setIcon((Icon)null);
    } 
  }
  
  public void a(String paramString) {
    this.e.setText(paramString);
  }
  
  public void a(o paramo) {
    if (!this.n.contains(paramo))
      this.n.add(paramo); 
  }
  
  public void b(o paramo) {
    this.n.remove(paramo);
  }
  
  private void m() {
    if (this.g.getSelectedValue() != null) {
      bi bi = this.g.getSelectedValue();
      for (o o1 : this.n)
        o1.a(bi.d(), bi.b(), bi.c(), bi.a()); 
    } 
  }
  
  public boolean a(String paramString1, String paramString2, List paramList, bT parambT) {
    this.q = true;
    this.m.setEnabled(true);
    bi bi = new bi(this, paramString2, paramList, paramString1, parambT);
    if (!this.h.contains(bi)) {
      this.h.addElement(bi);
      if (this.g.getSelectedIndex() < 0)
        this.g.setSelectedIndex(0); 
      this.e.setText(g.b("Devices found:") + " " + this.h.size() + " - " + g.b("Searching for other controllers.."));
    } 
    return true;
  }
  
  public void b(boolean paramBoolean) {
    this.s = paramBoolean;
  }
  
  public void i() {
    j j = j.a();
    j.b();
    this.a.setVisible(false);
    if (this.g.getSelectedIndex() >= 0)
      this.g.setSelectedIndex(this.g.getSelectedIndex()); 
    this.t = null;
    j.a().d();
  }
  
  public void a(x paramx) {
    if (paramx != null && paramx.d() instanceof a && this.t != null)
      this.t.start(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */