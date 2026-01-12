package aP;

import A.AInterfaceCharlie;
import A.AInterfaceDelta;
import A.AInterfaceGolf;
import A.AInterfaceHotel;
import A.AInterfaceOscar;
import A.AInterfacePapa;
import A.AInterfaceRomeo;
import A.AInterfaceVictor;
import A.AInterfaceXray;
import A.Exception;
import A.IO;
import A.Threaded;
import AInterfaceRomeo.IOInBPackage;
import AInterfaceRomeo.Threaded;
import B.IOInBPackage;
import B.ZInterfaceIndia;
import Exception.AInterfaceGolf;
import G.AInterfaceOscar;
import G.AeInterfaceMikeTostring;
import G.ArrayListInGPackage;
import G.J;
import G.R;
import G.T;
import G.l;
import G.m;
import G.n;
import V.IOInBPackage;
import W.Properties;
import W.WInterfaceAp;
import aD.IOInBPackage;
import aE.IOInBPackage;
import aV.AvInterfaceWhiskey;
import aW.AInterfacePapa;
import aW.IOInBPackage;
import ae.AInterfaceOscar;
import bQ.Threaded;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import z.AInterfaceCharlie;
import z.AInterfaceDelta;
import z.SerialPortEventListenerUsingRXTXCommDriver;
import z.ZInterfaceIndia;

public class ManagerIoinbpackage extends JPanel implements AInterfaceOscar, n, AInterfacePapa {
  JDialog IOInBPackage = null;

  JComboBox b = null;

  JComboBox AInterfaceCharlie = null;

  JComboBox AInterfaceDelta = null;

  JComboBox SerialPortEventListenerUsingRXTXCommDriver = null;

  JLabel IO = new JLabel();

  JButton AInterfaceGolf = new JButton(AInterfaceGolf.b("Test Port"));

  JButton AInterfaceHotel = new JButton(AInterfaceGolf.b("Detect"));

  R ZInterfaceIndia = null;

  ZInterfaceIndia Threaded = new ZInterfaceIndia();

  String k = "";

  String l = "";

  String m = "";

  IOInBPackage n;

  J AInterfaceOscar = null;

  WInterfaceAp AInterfacePapa = (WInterfaceAp) new Properties(new Properties(), "TempCommSettings");

  aY q = null;

  JPanel AInterfaceRomeo = null;

  JPanel Exception = null;

  private String u = AInterfaceGolf.b("Scanning Ports") + "...";

  private static String AInterfaceVictor = "LegacyComSettings";

  private static String AvInterfaceWhiskey = "MegaSquirtComSettings";

  boolean t = false;

  public ManagerIoinbpackage() {
    this((R) null);
  }

  public ManagerIoinbpackage(R paramR) {
    this.ZInterfaceIndia = paramR;
    TitledBorder titledBorder =
        BorderFactory.createTitledBorder(
            BorderFactory.createEtchedBorder(0), AInterfaceGolf.b("Communication Settings"));
    setBorder(titledBorder);
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(15, 15));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 2));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(0, 1));
    JPanel jPanel4 = new JPanel();
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    jPanel4.setLayout(new GridLayout(0, 1, 2, 2));
    JLabel jLabel = new JLabel();
    jLabel.setText(AInterfaceGolf.b("Configuration") + ":");
    boolean bool = false;
    if (bool) jPanel3.add(jLabel);
    this.b = new JComboBox();
    k();
    T t = T.IOInBPackage();
    if (t.AInterfaceCharlie() != null)
      this.b.setSelectedItem(t.AInterfaceCharlie().AInterfaceCharlie());
    this.b.addActionListener(new ae(this));
    jPanel5.add("North", this.b);
    if (bool && this.b.getItemCount() > 0) jPanel4.add(jPanel5);
    jPanel5 = new JPanel();
    byte b1 = 0;
    jPanel5.setLayout(new BorderLayout());
    jLabel = new JLabel();
    jLabel.setText(AInterfaceGolf.b("Driver") + ":");
    this.AInterfaceCharlie = new JComboBox();
    this.AInterfaceCharlie.setEditable(false);
    String str = IOInBPackage.ba;
    Iterator<AInterfaceDelta> iterator = AInterfaceCharlie.IOInBPackage().b();
    while (iterator.hasNext()) {
      AInterfaceDelta AInterfaceDelta = iterator.next();
      an an = new an(this, AInterfaceDelta);
      this.AInterfaceCharlie.addItem(an);
      b1++;
      if (AInterfaceDelta.IOInBPackage().equals(str)) {
        an.IOInBPackage(AInterfaceDelta.b() + " (" + AInterfaceGolf.b("Default") + ")");
        this.AInterfaceCharlie.setSelectedItem(an);
      }
    }
    this.AInterfaceCharlie.addActionListener(new af(this));
    jPanel5.add("South", this.AInterfaceCharlie);
    if (b1 > 1) {
      jPanel3.add(jLabel);
      jPanel4.add(jPanel5);
    }
    jPanel2.add(jPanel3);
    jPanel2.add(jPanel4);
    jPanel1.add("North", jPanel2);
    jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(0, 1));
    jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(0, 1, 2, 2));
    this.AInterfaceRomeo = new JPanel();
    this.AInterfaceRomeo.setLayout(new CardLayout());
    this.Exception = new JPanel();
    this.Exception.setLayout(new GridLayout(1, 1));
    this.AInterfaceRomeo.add(this.Exception, AvInterfaceWhiskey);
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new BorderLayout());
    JPanel jPanel7 = new JPanel();
    jPanel7.setLayout(new FlowLayout(1));
    jPanel7.setBorder(BorderFactory.createTitledBorder(AInterfaceGolf.b("Connection Type")));
    jPanel7.add(new JLabel(AInterfaceGolf.b("RS232 Serial Port")));
    jPanel6.add("North", jPanel7);
    JPanel jPanel8 = new JPanel();
    jPanel8.setLayout(new BorderLayout());
    jPanel8.setBorder(BorderFactory.createTitledBorder(AInterfaceGolf.b("Connection Settings")));
    JPanel jPanel9 = new JPanel();
    jPanel9.setLayout(new GridLayout(0, 2, 2, 2));
    jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    jLabel = new JLabel();
    jLabel.setText(AInterfaceGolf.b("Port") + ":");
    jPanel3.add(jLabel);
    this.SerialPortEventListenerUsingRXTXCommDriver = new JComboBox();
    this.SerialPortEventListenerUsingRXTXCommDriver.setEditable(true);
    this.SerialPortEventListenerUsingRXTXCommDriver.addItem(this.u);
    (new ao(this)).start();
    this.SerialPortEventListenerUsingRXTXCommDriver.addActionListener(new ag(this));
    jPanel5.add("South", this.SerialPortEventListenerUsingRXTXCommDriver);
    jPanel4.add(jPanel5);
    jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    jLabel = new JLabel();
    jLabel.setText(AInterfaceGolf.b("Baud Rate") + ":");
    jPanel3.add(jLabel);
    this.AInterfaceDelta = new JComboBox();
    String[] arrayOfString = this.Threaded.AInterfaceCharlie();
    for (byte b2 = 0; b2 < arrayOfString.length; b2++)
      this.AInterfaceDelta.addItem(arrayOfString[b2]);
    if (this.ZInterfaceIndia != null && IOInBPackage.A() != null) {
      this.AInterfaceDelta.setSelectedItem(
          IOInBPackage.A().m(this.ZInterfaceIndia.AInterfaceCharlie()));
    } else {
      this.AInterfaceDelta.setSelectedItem(IOInBPackage.AInterfaceCharlie);
    }
    this.AInterfaceDelta.addActionListener(new ah(this));
    jPanel5.add("North", this.AInterfaceDelta);
    jPanel4.add(jPanel5);
    jPanel9.add(jPanel3);
    jPanel9.add(jPanel4);
    JPanel jPanel10 = new JPanel();
    jPanel10.setLayout(new BorderLayout());
    jPanel10.add("North", jPanel9);
    jPanel8.add("Center", jPanel10);
    jPanel6.add("Center", jPanel8);
    this.AInterfaceRomeo.add(jPanel6, AInterfaceVictor);
    jPanel1.add("Center", this.AInterfaceRomeo);
    add("Center", jPanel1);
    JPanel jPanel11 = new JPanel();
    jPanel11.setLayout(new GridLayout(1, 2));
    jPanel11.add(this.IO);
    JPanel jPanel12 = new JPanel();
    jPanel11.add(jPanel12);
    this.AInterfaceGolf.addActionListener(new ai(this));
    jPanel12.add(this.AInterfaceGolf);
    jPanel12.add(this.AInterfaceHotel);
    this.AInterfaceHotel.addActionListener(new aj(this));
    IOInBPackage(false);
    add("South", jPanel11);
    ((CardLayout) this.AInterfaceRomeo.getLayout()).show(this.AInterfaceRomeo, AvInterfaceWhiskey);
    try {
      b((String) this.b.getSelectedItem());
    } catch (IOInBPackage a1) {
      Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
    }
    AInterfaceDelta.IOInBPackage().IOInBPackage(true);
  }

  private void m() {
    an an = (an) this.AInterfaceCharlie.getSelectedItem();
    if (an.IOInBPackage()
        .IOInBPackage()
        .equals(AInterfaceCharlie.SerialPortEventListenerUsingRXTXCommDriver)) {
      this.SerialPortEventListenerUsingRXTXCommDriver.setEnabled(false);
    } else {
      this.SerialPortEventListenerUsingRXTXCommDriver.setEnabled(true);
    }
    ZInterfaceIndia i1 = null;
    if (IOInBPackage.A() != null) i1 = Threaded.AInterfaceDelta(new File(IOInBPackage.A().t()));
    this.AInterfaceOscar =
        AInterfaceCharlie.IOInBPackage()
            .IOInBPackage(
                this.ZInterfaceIndia,
                an.IOInBPackage().IOInBPackage(),
                AvInterfaceWhiskey.AInterfaceCharlie(),
                i1,
                null);
    if (this.AInterfaceOscar instanceof AInterfaceGolf) {
      IO IO = this.n.b();
      this.n.IOInBPackage(IO);
      ((CardLayout) this.AInterfaceRomeo.getLayout())
          .show(this.AInterfaceRomeo, AvInterfaceWhiskey);
    } else {
      ((CardLayout) this.AInterfaceRomeo.getLayout()).show(this.AInterfaceRomeo, AInterfaceVictor);
    }
    n();
  }

  private void n() {
    this.IO.setText(AInterfaceGolf.b("Not tested"));
  }

  public void b() {
    setCursor(Cursor.getPredefinedCursor(3));
    this.AInterfaceGolf.setEnabled(false);
    String[] arrayOfString = this.Threaded.IOInBPackage();
    this.SerialPortEventListenerUsingRXTXCommDriver.removeAllItems();
    for (byte b = 0; b < arrayOfString.length; b++)
      this.SerialPortEventListenerUsingRXTXCommDriver.addItem(arrayOfString[b]);
    if (this.ZInterfaceIndia != null && IOInBPackage.A() != null) {
      this.SerialPortEventListenerUsingRXTXCommDriver.setSelectedItem(
          IOInBPackage.A().n(this.ZInterfaceIndia.AInterfaceCharlie()));
    } else if (bV.AInterfaceDelta()) {
      this.SerialPortEventListenerUsingRXTXCommDriver.setSelectedItem("COM1");
    } else if (this.SerialPortEventListenerUsingRXTXCommDriver.getItemCount() > 0) {
      this.SerialPortEventListenerUsingRXTXCommDriver.setSelectedIndex(0);
    }
    this.AInterfaceGolf.setEnabled(true);
    setCursor(Cursor.getDefaultCursor());
  }

  public void b(String paramString) {
    if (paramString == null) return;
    T t = T.IOInBPackage();
    R AInterfaceRomeo = t.AInterfaceCharlie(paramString);
    if (AInterfaceRomeo == null)
      throw new IOInBPackage("Ecu Configuration " + paramString + " not currently loaded.");
    IOInBPackage(AInterfaceRomeo);
  }

  public void IOInBPackage(R paramR) {
    if (paramR == null) throw new IOInBPackage("Ecu Configuration not valid.");
    this.ZInterfaceIndia = paramR;
    ak ak = new ak(this, paramR);
    this.t = true;
    ak.start();
    IOInBPackage(this.b, this.ZInterfaceIndia.AInterfaceCharlie());
    IOInBPackage(this.AInterfaceDelta, this.ZInterfaceIndia.O().AInterfaceRomeo() + "");
    IOInBPackage(
        this.SerialPortEventListenerUsingRXTXCommDriver, this.ZInterfaceIndia.O().Exception());
    this.k = this.ZInterfaceIndia.O().Exception();
    this.l = this.ZInterfaceIndia.O().AInterfaceRomeo() + "";
    if (paramR.C() != null) {
      this.m = paramR.C().n();
    } else {
      this.m = IOInBPackage.aC;
    }
    this.n =
        new IOInBPackage(
            AvInterfaceWhiskey.AInterfaceCharlie(),
            (AInterfaceGolf) AInterfaceVictor.IOInBPackage().IOInBPackage(paramR));
    this.Exception.removeAll();
    this.Exception.add((Component) this.n);
    this.n.IOInBPackage(this);
    m();
    if (paramR.C() instanceof AInterfaceGolf) {
      AInterfaceGolf AInterfaceGolf = (AInterfaceGolf) paramR.C();
      IO IO = AInterfaceGolf.IOInBPackage();
      if (IO != null) {
        IOInBPackage(IO);
      } else if (AvInterfaceWhiskey.AInterfaceCharlie().b() != null) {
        try {
          IO =
              AvInterfaceWhiskey.AInterfaceCharlie()
                  .b()
                  .AInterfaceCharlie(paramR.AInterfaceCharlie());
        } catch (InstantiationException instantiationException) {
          Logger.getLogger(ad.class.getName())
              .log(Level.SEVERE, (String) null, instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          Logger.getLogger(ad.class.getName())
              .log(Level.SEVERE, (String) null, illegalAccessException);
        }
      }
      this.n.IOInBPackage(IO);
    }
  }

  private void IOInBPackage(JComboBox paramJComboBox, String paramString) {
    paramJComboBox.setSelectedItem(paramString);
  }

  public void AInterfaceCharlie() {
    WInterfaceAp ap1 = new WInterfaceAp(this, this);
    ap1.start();
  }

  public String AInterfaceDelta() {
    return (String) this.AInterfaceDelta.getSelectedItem();
  }

  public String IO() {
    return (String) this.SerialPortEventListenerUsingRXTXCommDriver.getSelectedItem();
  }

  public String AInterfaceGolf() {
    an an = (an) this.AInterfaceCharlie.getSelectedItem();
    return an.IOInBPackage().IOInBPackage();
  }

  public void AInterfaceCharlie(String paramString) {
    for (byte b = 0; b < this.AInterfaceCharlie.getItemCount(); b++) {
      Object object = this.AInterfaceCharlie.getItemAt(b);
      if (object != null && object instanceof an) {
        an an = this.AInterfaceCharlie.getItemAt(b);
        if (paramString.equals(an.IOInBPackage().IOInBPackage())) {
          this.AInterfaceCharlie.setSelectedItem(an);
          this.m = paramString;
          return;
        }
      }
    }
  }

  public void AInterfaceHotel() {
    if (this.ZInterfaceIndia != null && this.ZInterfaceIndia.C() instanceof AInterfaceGolf) {
      AInterfaceGolf AInterfaceGolf = (AInterfaceGolf) this.ZInterfaceIndia.C();
      IO IO = AInterfaceGolf.IOInBPackage();
      b(IO);
    }
    if (this.ZInterfaceIndia != null && this.t)
      try {
        this.ZInterfaceIndia.C().AInterfaceDelta();
      } catch (l l) {
        Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String) null, (Throwable) l);
      }
    ZInterfaceIndia();
  }

  public synchronized void ZInterfaceIndia() {
    if (this.IOInBPackage != null) this.IOInBPackage.dispose();
    Threaded Threaded = Threaded.IOInBPackage();
    Threaded.b(this);
    AInterfaceDelta.IOInBPackage().IOInBPackage(false);
  }

  public void IOInBPackage(Component paramComponent) {
    this.IOInBPackage =
        new JDialog(bV.IOInBPackage(paramComponent), AInterfaceGolf.b("Communication Settings"));
    this.IOInBPackage.add("Center", this);
    JButton jButton1 = new JButton(AInterfaceGolf.b("Cancel"));
    jButton1.addActionListener(new al(this));
    JButton jButton2 = new JButton(AInterfaceGolf.b("Accept"));
    jButton2.addActionListener(new am(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (bV.AInterfaceDelta()) {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    } else {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    }
    this.IOInBPackage.add("South", jPanel);
    this.IOInBPackage.pack();
    bV.IOInBPackage(bV.IOInBPackage(paramComponent), this.IOInBPackage);
    this.IOInBPackage.setVisible(true);
    validate();
    this.IOInBPackage.pack();
    this.IOInBPackage.setResizable(false);
  }

  public void IOInBPackage(boolean paramBoolean) {
    this.AInterfaceHotel.setEnabled(paramBoolean);
    this.AInterfaceHotel.setVisible(paramBoolean);
  }

  public void Threaded() {
    IOInBPackage a1 = IOInBPackage.A();
    IOInBPackage(a1);
  }

  public void IOInBPackage(IOInBPackage parama) {
    this.ZInterfaceIndia.O().Threaded((String) this.AInterfaceDelta.getSelectedItem());
    this.ZInterfaceIndia.O()
        .k((String) this.SerialPortEventListenerUsingRXTXCommDriver.getSelectedItem());
    String str = AInterfaceGolf();
    if (parama != null && parama.u().equals(this.b.getSelectedItem())) {
      parama.IOInBPackage(
          (String) this.b.getSelectedItem(), (String) this.AInterfaceDelta.getSelectedItem());
      parama.b(
          (String) this.b.getSelectedItem(),
          (String) this.SerialPortEventListenerUsingRXTXCommDriver.getSelectedItem());
      parama.AInterfaceCharlie(this.ZInterfaceIndia.AInterfaceCharlie(), str);
    }
    if (this.ZInterfaceIndia.C() instanceof SerialPortEventListenerUsingRXTXCommDriver) {
      SerialPortEventListenerUsingRXTXCommDriver SerialPortEventListenerUsingRXTXCommDriver =
          (SerialPortEventListenerUsingRXTXCommDriver) this.ZInterfaceIndia.C();
      String str1 = SerialPortEventListenerUsingRXTXCommDriver.IO();
      String str2 = SerialPortEventListenerUsingRXTXCommDriver.AInterfaceGolf();
      if (!this.AInterfaceDelta.getSelectedItem().equals(str1)
          || !str2.endsWith(
              (String) this.SerialPortEventListenerUsingRXTXCommDriver.getSelectedItem()))
        this.ZInterfaceIndia.C().AInterfaceCharlie();
    }
    if (this.AInterfaceOscar instanceof bQ.l)
      try {
        IO IO = this.n.b();
        Threaded.IOInBPackage()
            .IOInBPackage(this.ZInterfaceIndia.AInterfaceCharlie(), IO.AInterfaceHotel());
        List list = IO.l();
        for (AInterfaceRomeo AInterfaceRomeo : list) {
          IO.IOInBPackage(
              AInterfaceRomeo.AInterfaceCharlie(),
              this.n.IOInBPackage(AInterfaceRomeo.AInterfaceCharlie()));
          if (AInterfaceRomeo.AInterfaceCharlie().equals("Baud Rate")) {
            parama.IOInBPackage(
                (String) this.b.getSelectedItem(),
                this.n.IOInBPackage(AInterfaceRomeo.AInterfaceCharlie()).toString());
            this.ZInterfaceIndia.O()
                .Threaded(this.n.IOInBPackage(AInterfaceRomeo.AInterfaceCharlie()).toString());
          }
        }
        Threaded.IOInBPackage().IOInBPackage(this.ZInterfaceIndia.AInterfaceCharlie(), IO);
        AInterfacePapa.IOInBPackage((AInterfaceHotel) this.AInterfaceOscar, IO);
        if (IO instanceof IOInBPackage && IOInBPackage.A() != null) {
          ZInterfaceIndia i1 = Threaded.AInterfaceDelta(new File(IOInBPackage.A().t()));
          if (i1 != null) {
            IOInBPackage a1 = (IOInBPackage) IO;
            i1.AInterfaceDelta(a1.IOInBPackage());
            Threaded.IOInBPackage(new File(IOInBPackage.A().t()), i1);
          }
        }
      } catch (l l) {
        bV.AInterfaceDelta(l.getMessage(), this);
        Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String) null, (Throwable) l);
      } catch (Exception Exception) {
        bV.AInterfaceDelta(Exception.getMessage(), this);
        Logger.getLogger(ad.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) Exception);
      }
    if (this.AInterfaceOscar instanceof AInterfaceHotel)
      try {
        IO IO = this.n.b();
        AInterfaceVictor.IOInBPackage()
            .IOInBPackage(this.ZInterfaceIndia.AInterfaceCharlie(), IO.AInterfaceHotel());
        List list = IO.l();
        for (AInterfaceRomeo AInterfaceRomeo : list) {
          IO.IOInBPackage(
              AInterfaceRomeo.AInterfaceCharlie(),
              this.n.IOInBPackage(AInterfaceRomeo.AInterfaceCharlie()));
          if (AInterfaceRomeo.AInterfaceCharlie().equals("Baud Rate")) {
            parama.IOInBPackage(
                (String) this.b.getSelectedItem(),
                this.n.IOInBPackage(AInterfaceRomeo.AInterfaceCharlie()).toString());
            this.ZInterfaceIndia.O()
                .Threaded(this.n.IOInBPackage(AInterfaceRomeo.AInterfaceCharlie()).toString());
          }
        }
        AInterfaceVictor.IOInBPackage().IOInBPackage(this.ZInterfaceIndia.AInterfaceCharlie(), IO);
        AInterfacePapa.IOInBPackage((AInterfaceHotel) this.AInterfaceOscar, IO);
      } catch (l l) {
        bV.AInterfaceDelta(l.getMessage(), this);
        Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String) null, (Throwable) l);
      } catch (Exception Exception) {
        bV.AInterfaceDelta(Exception.getMessage(), this);
        Logger.getLogger(ad.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) Exception);
      }
    if (this.AInterfaceOscar != null && !this.AInterfaceOscar.equals(this.ZInterfaceIndia.C())) {
      this.ZInterfaceIndia.C().AInterfaceCharlie();
      this.ZInterfaceIndia.b(this.AInterfaceOscar);
    }
  }

  private synchronized void AInterfaceOscar() {
    boolean bool = this.ZInterfaceIndia.O().G();
    this.ZInterfaceIndia.O().AInterfaceDelta(true);
    if (this.AInterfaceOscar instanceof SerialPortEventListenerUsingRXTXCommDriver) {
      boolean bool1 = true;
      if (!bool1) {
        SerialPortEventListenerUsingRXTXCommDriver SerialPortEventListenerUsingRXTXCommDriver =
            (SerialPortEventListenerUsingRXTXCommDriver) this.AInterfaceOscar;
        setCursor(Cursor.getPredefinedCursor(3));
        this.AInterfaceGolf.setEnabled(false);
        m m =
            m.IOInBPackage(
                (String) this.SerialPortEventListenerUsingRXTXCommDriver.getSelectedItem(),
                (String) this.AInterfaceDelta.getSelectedItem());
        m.b(this);
        this.IO.setText("");
        SerialPortEventListenerUsingRXTXCommDriver.b(m);
        SerialPortEventListenerUsingRXTXCommDriver.AInterfaceCharlie();
        SerialPortEventListenerUsingRXTXCommDriver.l();
        if (this.IO.getText().equals("")) this.IO.setText(AInterfaceGolf.b("Failed") + "!");
        this.AInterfaceGolf.setEnabled(true);
        setCursor(Cursor.getDefaultCursor());
      } else {
        IO IO = null;
        try {
          IO =
              AvInterfaceWhiskey.AInterfaceCharlie()
                  .IOInBPackage(
                      IOInBPackage.AInterfaceDelta, this.ZInterfaceIndia.AInterfaceCharlie());
          IO.IOInBPackage("Baud Rate", this.AInterfaceDelta.getSelectedItem());
          IO.IOInBPackage(
              "Com Port", this.SerialPortEventListenerUsingRXTXCommDriver.getSelectedItem());
          ZInterfaceIndia i1 = null;
          if (IOInBPackage.A() != null)
            i1 = Threaded.AInterfaceDelta(new File(IOInBPackage.A().t()));
          J Threaded =
              AInterfaceCharlie.IOInBPackage()
                  .IOInBPackage(
                      this.ZInterfaceIndia,
                      AInterfaceCharlie.SerialPortEventListenerUsingRXTXCommDriver,
                      AvInterfaceWhiskey.AInterfaceCharlie(),
                      i1,
                      null);
          AInterfacePapa.IOInBPackage((AInterfaceHotel) Threaded, IO);
          setCursor(Cursor.getPredefinedCursor(3));
          this.AInterfaceGolf.setEnabled(false);
          m m =
              m.IOInBPackage(
                  (String) this.SerialPortEventListenerUsingRXTXCommDriver.getSelectedItem(),
                  (String) this.AInterfaceDelta.getSelectedItem());
          m.b(this);
          this.IO.setText("");
          Threaded.b(m);
          if (this.IO.getText().equals("")) this.IO.setText(AInterfaceGolf.b("Failed") + "!");
          this.AInterfaceGolf.setEnabled(true);
          setCursor(Cursor.getDefaultCursor());
        } catch (l l) {
          bV.AInterfaceDelta(l.getMessage(), this);
          Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String) null, (Throwable) l);
        } catch (Exception Exception) {
          bV.AInterfaceDelta(Exception.getMessage(), this);
          Logger.getLogger(ad.class.getName())
              .log(Level.SEVERE, (String) null, (Throwable) Exception);
        } catch (InstantiationException instantiationException) {
          bV.AInterfaceDelta(
              AInterfaceGolf.b(
                  "Application Error testing port. Your port may work fine, try it without"
                      + " testing."),
              this);
          Logger.getLogger(ad.class.getName())
              .log(Level.SEVERE, (String) null, instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          bV.AInterfaceDelta(
              AInterfaceGolf.b(
                  "Application Error testing port. Your port may work fine, try it without"
                      + " testing."),
              this);
          Logger.getLogger(ad.class.getName())
              .log(Level.SEVERE, (String) null, illegalAccessException);
        } finally {
          if (IO != null)
            try {
              IO.AInterfaceGolf();
            } catch (Exception exception) {
            }
        }
      }
    } else if (this.AInterfaceOscar instanceof AInterfaceGolf) {
      IO IO = null;
      try {
        IO = this.n.b();
        List list = IO.l();
        for (AInterfaceRomeo AInterfaceRomeo : list)
          IO.IOInBPackage(
              AInterfaceRomeo.AInterfaceCharlie(),
              this.n.IOInBPackage(AInterfaceRomeo.AInterfaceCharlie()));
        AInterfacePapa.IOInBPackage((AInterfaceHotel) this.AInterfaceOscar, IO);
        setCursor(Cursor.getPredefinedCursor(3));
        this.AInterfaceGolf.setEnabled(false);
        m m =
            m.IOInBPackage(
                (String) this.SerialPortEventListenerUsingRXTXCommDriver.getSelectedItem(),
                (String) this.AInterfaceDelta.getSelectedItem());
        m.b(this);
        this.IO.setText("");
        this.AInterfaceOscar.b(m);
        if (this.IO.getText().equals("")) this.IO.setText(AInterfaceGolf.b("Failed") + "!");
        this.AInterfaceGolf.setEnabled(true);
        setCursor(Cursor.getDefaultCursor());
      } catch (l l) {
        bV.AInterfaceDelta(l.getMessage(), this);
        Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String) null, (Throwable) l);
      } catch (Exception Exception) {
        bV.AInterfaceDelta(Exception.getMessage(), this);
        Logger.getLogger(ad.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) Exception);
      } finally {
        if (IO != null)
          try {
            IO.AInterfaceGolf();
          } catch (Exception exception) {
          }
      }
    }
    this.ZInterfaceIndia.O().AInterfaceDelta(bool);
  }

  public void IOInBPackage(double paramDouble) {}

  public synchronized void IOInBPackage(AInterfaceOscar paramo) {
    ArrayListInGPackage.IOInBPackage().SerialPortEventListenerUsingRXTXCommDriver();
    if (paramo.IOInBPackage() == 1) {
      this.IO.setText(AInterfaceGolf.b("Successful") + "!!!");
    } else {
      this.IO.setText(AInterfaceGolf.b("Failed") + "!");
      this.IO.repaint();
    }
    this.AInterfaceGolf.setEnabled(true);
    setCursor(Cursor.getDefaultCursor());
    notify();
  }

  public boolean IOInBPackage(
      String paramString1, String paramString2, List paramList, AeInterfaceMikeTostring parambT) {
    try {
      if (!AInterfaceOscar.IOInBPackage(parambT)) {
        String str =
            AInterfaceGolf.b("A Controller was found on")
                + " "
                + paramString1
                + ".\n"
                + AInterfaceGolf.b("However, there appears to be no Firmware loaded.")
                + "\n"
                + AInterfaceGolf.b(
                    "Please check help for information on getting and installing firmware.")
                + "\n\n"
                + AInterfaceGolf.b("You must have firmware installed to connect.");
        bV.AInterfaceDelta(str, this);
      }
      if (paramString2.contains(":")) {
        String str = paramString2.substring(0, paramString2.indexOf(":"));
        if (!AInterfaceCharlie.IOInBPackage().IOInBPackage(str)) {
          String str1 =
              AInterfaceGolf.b(
                  "The Controller found requires IOInBPackage driver that is not available in this"
                      + " edition of the application.");
          bV.AInterfaceDelta(str1, this);
          return false;
        }
        paramString2 = paramString2.substring(paramString2.indexOf(":") + 1, paramString2.length());
        AInterfaceCharlie(str);
      }
      IO IO =
          AvInterfaceWhiskey.AInterfaceCharlie()
              .IOInBPackage(paramString2, this.ZInterfaceIndia.AInterfaceCharlie());
      for (AInterfaceCharlie AInterfaceCharlie : paramList) {
        try {
          IO.IOInBPackage(AInterfaceCharlie.IOInBPackage(), AInterfaceCharlie.b());
        } catch (Exception Exception) {
          Logger.getLogger(ad.class.getName())
              .log(Level.SEVERE, (String) null, (Throwable) Exception);
        }
      }
      this.n.IOInBPackage(IO);
    } catch (InstantiationException instantiationException) {
      Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String) null, instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String) null, illegalAccessException);
    }
    if (paramString2.equals(IOInBPackage.AInterfaceDelta)) {
      AInterfaceCharlie(AInterfaceCharlie.IOInBPackage);
      for (AInterfaceCharlie AInterfaceCharlie : paramList) {
        if (AInterfaceCharlie.IOInBPackage().equals("Baud Rate")) {
          IOInBPackage(this.AInterfaceDelta, AInterfaceCharlie.b().toString());
          continue;
        }
        if (AInterfaceCharlie.IOInBPackage().equals("Com Port")) {
          IOInBPackage(
              this.SerialPortEventListenerUsingRXTXCommDriver, AInterfaceCharlie.b().toString());
          continue;
        }
        if (AInterfaceCharlie.IOInBPackage().equals("2nd Com Port"))
          IOInBPackage(
              this.SerialPortEventListenerUsingRXTXCommDriver, AInterfaceCharlie.b().toString());
      }
    }
    return true;
  }

  public void b(double paramDouble) {}

  public void IOInBPackage() {}

  public void k() {
    this.b.removeAllItems();
    T t = T.IOInBPackage();
    String[] arrayOfString = t.AInterfaceDelta();
    if (this.ZInterfaceIndia == null) this.ZInterfaceIndia = t.AInterfaceCharlie();
    for (byte b = 0; b < arrayOfString.length; b++) this.b.addItem(arrayOfString[b]);
  }

  public void SerialPortEventListenerUsingRXTXCommDriver() {
    ArrayListInGPackage.IOInBPackage().AInterfaceDelta();
  }

  public void l() {
    if (this.q != null) {
      this.q.SerialPortEventListenerUsingRXTXCommDriver();
      this.q = null;
    }
    this.q = new aY(bV.b(this));
    this.q.setVisible(true);
    this.q.IOInBPackage(this);
  }

  public void IOInBPackage(String paramString) {}

  private void IOInBPackage(IO paramf) {
    try {
      IOInBPackage(paramf, this.AInterfacePapa);
    } catch (Exception exception) {
      Logger.getLogger(ad.class.getName())
          .log(Level.WARNING, "Failed to capture ControllerInterface setting", exception);
    }
    IO f1 = this.n.b(paramf.AInterfaceHotel());
    if (f1 != null) b(f1, this.AInterfacePapa);
  }

  private void b(IO paramf) {
    b(paramf, this.AInterfacePapa);
  }

  private WInterfaceAp IOInBPackage(IO paramf, WInterfaceAp paramap) {
    String str = paramf.AInterfaceHotel();
    List list = paramf.l();
    for (AInterfaceRomeo AInterfaceRomeo : list) {
      Object object = paramf.IOInBPackage(AInterfaceRomeo.AInterfaceCharlie());
      if (object != null) {
        paramap.IOInBPackage(str + AInterfaceRomeo.AInterfaceCharlie(), object.toString());
        continue;
      }
      paramap.IOInBPackage(AInterfaceRomeo.AInterfaceCharlie(), "");
    }
    return paramap;
  }

  private void b(IO paramf, WInterfaceAp paramap) {
    String str = paramf.AInterfaceHotel();
    List list = paramf.l();
    for (AInterfaceRomeo AInterfaceRomeo : list) {
      Object object = paramf.IOInBPackage(AInterfaceRomeo.AInterfaceCharlie());
      object = (object != null) ? object : "";
      String str1 = paramap.b(str + AInterfaceRomeo.AInterfaceCharlie(), object.toString());
      try {
        paramf.IOInBPackage(AInterfaceRomeo.AInterfaceCharlie(), str1);
      } catch (Exception exception) {
        Logger.getLogger(ad.class.getName())
            .log(Level.WARNING, "Unable to set ControllerInterface setting", exception);
      }
    }
  }

  public void IOInBPackage(String paramString1, String paramString2) {
    n();
  }

  public void IOInBPackage(AInterfaceXray paramx) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
