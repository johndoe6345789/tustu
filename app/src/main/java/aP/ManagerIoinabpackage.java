package aP;

import A.IO;
import A.Threaded;
import A.AInterfaceOscar;
import A.AInterfaceXray;
import B.Network;
import B.l;
import G.AeInterfaceMikeTostring;
import aB.IOInAbPackage;
import aC.IOInAcPackage;
import aC.IOInAbPackage;
import aD.IOInAcPackage;
import aV.AvInterfaceWhiskey;
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
import r.IOInAcPackage;
import r.RInterfaceIndia;
import s.SComponentGolf;
import z.RInterfaceIndia;

public class ManagerIoinabpackage extends JPanel implements AInterfaceOscar {
  JLabel IOInAcPackage = new JLabel();
  
  JLabel IOInAbPackage = new JLabel(SComponentGolf.IOInAbPackage("Searching for known devices."));
  
  JLabel c = new JLabel(" ");
  
  JLabel d = new JLabel(" ");
  
  JLabel Network = new JLabel(" ");
  
  JLabel IO = new JLabel("Searching on RS232 and USB D2XX, Upgrade for Wireless connectivity.");
  
  JList SComponentGolf = new JList();
  
  DefaultListModel h = new DefaultListModel();
  
  JPanel RInterfaceIndia = null;
  
  dM Threaded = new dM();
  
  JButton k;
  
  JButton l;
  
  JButton m;
  
  ArrayList n = new ArrayList();
  
  JDialog AInterfaceOscar = null;
  
  boolean p = false;
  
  boolean q = false;
  
  private boolean s = true;
  
  private bh t = null;
  
  public static int[] r = new int[] { 21848 };
  
  public ManagerIoinabpackage(Window paramWindow) {
    this();
    IOInAcPackage(paramWindow);
    IOInAbPackage();
  }
  
  public ManagerIoinabpackage() {
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(15, 15));
    jPanel1.setBorder(BorderFactory.createTitledBorder(SComponentGolf.IOInAbPackage("Port Search")));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(15, 15));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/search.gif"));
    ImageIcon imageIcon = new ImageIcon(image);
    this.IOInAcPackage.setIcon(imageIcon);
    this.IOInAcPackage.setMinimumSize(new Dimension(40, 32));
    this.IOInAcPackage.setPreferredSize(new Dimension(40, 32));
    this.IOInAcPackage.setVisible(false);
    jPanel2.add("West", this.IOInAcPackage);
    JLabel jLabel = new JLabel("");
    jLabel.setMinimumSize(new Dimension(16, 32));
    jLabel.setPreferredSize(new Dimension(16, 32));
    jPanel2.add("East", jLabel);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(0, 1));
    jPanel3.add(new JLabel(" "));
    jPanel3.add(this.IOInAbPackage);
    jPanel3.add(this.c);
    jPanel3.add(this.d);
    jPanel3.add(new JLabel(" "));
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add("North", jPanel3);
    this.SComponentGolf.setVisibleRowCount(5);
    this.SComponentGolf.setMinimumSize(eJ.IOInAcPackage(240, 120));
    this.SComponentGolf.setPreferredSize(eJ.IOInAcPackage(240, 120));
    this.SComponentGolf.setBorder(BorderFactory.createLoweredBevelBorder());
    this.SComponentGolf.setModel(this.h);
    this.SComponentGolf.addListSelectionListener(new aZ(this));
    jPanel4.add("Center", this.SComponentGolf);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new GridLayout(0, 1));
    jPanel5.add(this.Network);
    jPanel4.add("South", jPanel5);
    jPanel2.add("Center", jPanel4);
    jPanel1.add("Center", jPanel2);
    this.k = new JButton(SComponentGolf.IOInAbPackage("Internet Find"));
    this.k.setEnabled(false);
    this.k.addActionListener(new ba(this));
    this.l = new JButton(SComponentGolf.IOInAbPackage("Have Local"));
    this.l.setEnabled(false);
    this.l.addActionListener(new bb(this));
    this.m = new JButton(SComponentGolf.IOInAbPackage("Accept"));
    this.m.setEnabled(false);
    this.m.addActionListener(new bc(this));
    JButton jButton = new JButton(SComponentGolf.IOInAbPackage("Cancel"));
    jButton.addActionListener(new bd(this));
    this.RInterfaceIndia = new JPanel();
    this.RInterfaceIndia.setLayout(new FlowLayout(2));
    this.RInterfaceIndia.add(jButton);
    this.RInterfaceIndia.add(this.m);
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new BorderLayout(10, 10));
    jPanel6.add("North", (Component)this.Threaded);
    jPanel6.add("Center", this.RInterfaceIndia);
    jPanel1.add("South", jPanel6);
    jPanel1.add("West", new JLabel("  "));
    add("Center", jPanel1);
  }
  
  public void IOInAbPackage() {
    this.q = false;
    Threaded Threaded = Threaded.IOInAcPackage();
    String str = IOInAcPackage.IOInAcPackage().d("deviceSearchQueryCommands");
    if (str != null && !str.isEmpty())
      Threaded.IOInAbPackage(str); 
    Threaded.IOInAcPackage(this);
    this.h.removeAllElements();
    be be = new be(this);
    be.start();
    for (int RInterfaceIndia : r) {
      Network.IOInAcPackage(RInterfaceIndia).IOInAcPackage(this);
      Network.IOInAcPackage(RInterfaceIndia).IOInAcPackage();
    } 
    this.IOInAcPackage.setVisible(true);
    this.IOInAcPackage.validate();
    this.IOInAcPackage.repaint();
  }
  
  private void Threaded() {
    Threaded Threaded = Threaded.IOInAcPackage();
    List list = c();
    Threaded.IOInAcPackage(list);
  }
  
  public void IOInAbPackage(AInterfaceXray paramx) {
    String str = IOInAcPackage.IOInAcPackage().d("deviceSearchQueryCommands");
    IOInAcPackage(paramx, str);
  }
  
  public void IOInAcPackage(AInterfaceXray paramx, String paramString) {
    ArrayList<AInterfaceXray> arrayList = new ArrayList();
    arrayList.add(paramx);
    Threaded Threaded = Threaded.IOInAcPackage();
    if (paramString != null && !paramString.isEmpty())
      Threaded.IOInAbPackage(paramString); 
    Threaded.IOInAcPackage(this);
    this.h.removeAllElements();
    bf bf = new bf(this, Threaded, arrayList);
    bf.start();
    this.IOInAcPackage.setVisible(true);
    this.IOInAcPackage.validate();
    this.IOInAcPackage.repaint();
  }
  
  public void IOInAcPackage(boolean paramBoolean) {
    this.RInterfaceIndia.setVisible(paramBoolean);
    this.RInterfaceIndia.validate();
  }
  
  public void IOInAcPackage(Window paramWindow) {
    if (this.AInterfaceOscar != null)
      this.AInterfaceOscar.dispose(); 
    this.AInterfaceOscar = new JDialog(paramWindow, SComponentGolf.IOInAbPackage("Detect Device"));
    this.AInterfaceOscar.setLayout(new GridLayout());
    this.AInterfaceOscar.add(this);
    this.AInterfaceOscar.setSize(eJ.IOInAcPackage(750), eJ.IOInAcPackage(360));
    bV.IOInAcPackage(paramWindow, this.AInterfaceOscar);
    this.AInterfaceOscar.setVisible(true);
  }
  
  protected List c() {
    ArrayList<AInterfaceXray> arrayList = new ArrayList();
    if (RInterfaceIndia.IOInAcPackage().IOInAcPackage(";'[PGS0P;'G0[F;"))
      try {
        AInterfaceXray AInterfaceXray = new AInterfaceXray();
        IOInAbPackage IOInAbPackage = (IOInAbPackage)AvInterfaceWhiskey.c().IOInAcPackage(IOInAbPackage.c, "DEFAULT_INSTANCE");
        AInterfaceXray.IOInAcPackage((IO)IOInAbPackage);
        List list = IOInAbPackage.t();
        String str = IOInAcPackage.IOInAcPackage().IOInAcPackage("deviceSearchBaudRates", "115200;9600;");
        String[] arrayOfString = str.split(";");
        for (byte b1 = 0; b1 < arrayOfString.length; b1++)
          AInterfaceXray.IOInAcPackage("Baud Rate", arrayOfString[b1]); 
        for (String str1 : list)
          AInterfaceXray.IOInAcPackage("Device Serial #", str1); 
        AInterfaceXray.IOInAcPackage("Device Serial #");
        arrayList.add(AInterfaceXray);
      } catch (Exception exception) {
        Logger.getLogger(aY.class.getName()).log(Level.WARNING, "Unable to load D2XX driver.", exception);
      } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
        Logger.getLogger(aY.class.getName()).log(Level.WARNING, "Failed to load JSSC Driver", unsatisfiedLinkError);
      }  
    if (RInterfaceIndia.IOInAcPackage().IOInAcPackage("fdsp[pp[ds';'"))
      try {
        AInterfaceXray AInterfaceXray = new AInterfaceXray();
        AInterfaceXray.IOInAcPackage(AvInterfaceWhiskey.c().IOInAcPackage(IOInAcPackage.d, "DEFAULT_INSTANCE"));
        String str = IOInAcPackage.IOInAcPackage().IOInAcPackage("deviceSearchBaudRates", "115200;9600;");
        String[] arrayOfString1 = str.split(";");
        for (byte b1 = 0; b1 < arrayOfString1.length; b1++)
          AInterfaceXray.IOInAcPackage("Baud Rate", arrayOfString1[b1]); 
        RInterfaceIndia RInterfaceIndia = new RInterfaceIndia();
        String[] arrayOfString2 = RInterfaceIndia.IOInAcPackage();
        for (byte b2 = 0; b2 < arrayOfString2.length; b2++)
          AInterfaceXray.IOInAcPackage("Com Port", arrayOfString2[b2]); 
        AInterfaceXray.IOInAcPackage("Com Port");
        arrayList.add(AInterfaceXray);
      } catch (Exception exception) {
        Logger.getLogger(aY.class.getName()).log(Level.WARNING, "Failed to load JSSC Driver", exception);
      } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
        Logger.getLogger(aY.class.getName()).log(Level.WARNING, "Failed to load JSSC Driver", unsatisfiedLinkError);
      }  
    if (RInterfaceIndia.IOInAcPackage().IOInAcPackage("GD;';LFDS-0DSL;") && IOInAbPackage.IOInAcPackage()) {
      this.t = new bh(this, arrayList);
      boolean bool = true;
      if (bool) {
        try {
          RemoteDevice[] arrayOfRemoteDevice = LocalDevice.getLocalDevice().getDiscoveryAgent().retrieveDevices(1);
          if (arrayOfRemoteDevice != null && arrayOfRemoteDevice.length > 0) {
            AInterfaceXray AInterfaceXray = new AInterfaceXray();
            IOInAcPackage IOInAcPackage = (IOInAcPackage)AvInterfaceWhiskey.c().IOInAcPackage(IOInAcPackage.Network, "DEFAULT_INSTANCE");
            AInterfaceXray.IOInAcPackage((IO)IOInAcPackage);
            for (RemoteDevice remoteDevice : arrayOfRemoteDevice) {
              if (remoteDevice.isTrustedDevice())
                AInterfaceXray.IOInAcPackage("Bluetooth Device", remoteDevice.getBluetoothAddress()); 
            } 
            arrayList.add(AInterfaceXray);
          } else {
            this.t.start();
          } 
        } catch (Exception exception) {
          D.d("Failed to detect Bluetooth devices.");
        } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
          Logger.getLogger(aY.class.getName()).log(Level.WARNING, "Failed to load JSSC Driver", unsatisfiedLinkError);
        } 
      } else {
        List list = IOInAbPackage.IOInAcPackage(false);
        try {
          if (list != null && list.size() > 0) {
            AInterfaceXray AInterfaceXray = new AInterfaceXray();
            IOInAcPackage IOInAcPackage = (IOInAcPackage)AvInterfaceWhiskey.c().IOInAcPackage(IOInAcPackage.Network, "DEFAULT_INSTANCE");
            AInterfaceXray.IOInAcPackage((IO)IOInAcPackage);
            for (RemoteDevice remoteDevice : list) {
              String str = remoteDevice.getFriendlyName(false);
              str = X.IOInAbPackage(str, " ", "");
              if (!remoteDevice.isTrustedDevice() && str.toLowerCase().startsWith("efianaly"))
                IOInAbPackage.IOInAcPackage(remoteDevice, "1234"); 
              if (remoteDevice.isTrustedDevice())
                AInterfaceXray.IOInAcPackage("Bluetooth Device", remoteDevice.getBluetoothAddress()); 
            } 
            arrayList.add(AInterfaceXray);
          } 
        } catch (Exception exception) {
          D.d("Failed to detect Bluetooth devices.");
        } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
          Logger.getLogger(aY.class.getName()).log(Level.WARNING, "Failed to load JSSC Driver", unsatisfiedLinkError);
        } 
      } 
    } 
    try {
      if (RInterfaceIndia.IOInAcPackage().IOInAcPackage("LKFDS;LK;lkfs;lk")) {
        AInterfaceXray AInterfaceXray = new AInterfaceXray();
        AInterfaceXray.IOInAcPackage(AvInterfaceWhiskey.c().IOInAcPackage(l.IOInAbPackage, "DEFAULT_INSTANCE"));
        for (byte IOInAbPackage = 0; IOInAbPackage < 2; IOInAbPackage++)
          AInterfaceXray.IOInAcPackage(l.Threaded, "192.168.1.8" + IOInAbPackage); 
        AInterfaceXray.IOInAcPackage(l.k, "2000");
        arrayList.add(AInterfaceXray);
      } 
    } catch (InstantiationException instantiationException) {
      Logger.getLogger(aY.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      Logger.getLogger(aY.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
    } 
    return arrayList;
  }
  
  public void d() {
    Network();
  }
  
  public void Network() {
    Threaded Threaded = Threaded.IOInAcPackage();
    Threaded.IOInAbPackage(this);
    Threaded.IOInAbPackage();
    for (int RInterfaceIndia : r)
      Network.IOInAcPackage(RInterfaceIndia).IOInAbPackage(this); 
    if (this.AInterfaceOscar != null)
      this.AInterfaceOscar.dispose(); 
  }
  
  public void IO() {}
  
  public void SComponentGolf() {}
  
  public void h() {
    AeInterfaceMikeTostring AeInterfaceMikeTostring = k();
    Threaded.IOInAcPackage().IOInAbPackage();
    if (AeInterfaceMikeTostring != null && AeInterfaceMikeTostring.IOInAbPackage() != null && !this.p) {
      m();
      d();
    } else if (this.p && this.s) {
      m();
      d();
    } else {
      bV.d(SComponentGolf.IOInAbPackage("No device has been detected") + "\n" + SComponentGolf.IOInAbPackage("closing, but not setting anything."), this);
    } 
  }
  
  private AeInterfaceMikeTostring k() {
    bi bi = this.SComponentGolf.getSelectedValue();
    return (bi != null) ? bi.IOInAcPackage() : null;
  }
  
  private void l() {
    bi bi = this.SComponentGolf.getSelectedValue();
    if (bi != null) {
      AeInterfaceMikeTostring AeInterfaceMikeTostring = bi.IOInAcPackage();
      if (!IOInAcPackage(AeInterfaceMikeTostring)) {
        this.IOInAbPackage.setText(SComponentGolf.IOInAbPackage("Firmware not loaded."));
        this.c.setText(SComponentGolf.IOInAbPackage("Check help for to learn about loading firmware."));
        D.c("Found IOInAcPackage controller with no firmware at:" + bi.d());
        this.p = true;
      } else {
        String str = AeInterfaceMikeTostring.c();
        str = (str == null) ? AeInterfaceMikeTostring.IOInAbPackage() : str;
        if (str.equals("Unknown"))
          str = "Serial Sig " + AeInterfaceMikeTostring.IOInAbPackage() + " Compatible"; 
        this.IOInAbPackage.setText(SComponentGolf.IOInAbPackage("Found Firmware") + ": " + AeInterfaceMikeTostring.c());
        this.c.setText(SComponentGolf.IOInAbPackage("Serial Signature") + ": " + AeInterfaceMikeTostring.IOInAbPackage());
        this.d.setText(SComponentGolf.IOInAbPackage("On") + ":" + bi.d());
        D.c("Device " + AeInterfaceMikeTostring.c() + ", requiring serial Signature:" + AeInterfaceMikeTostring.IOInAbPackage() + " found at:" + bi.d());
        this.p = false;
      } 
    } else {
      this.IOInAbPackage.setText("");
      this.c.setText("");
      this.d.setText(" ");
    } 
    if (!this.RInterfaceIndia.isVisible()) {
      bg bg = new bg(this);
      SwingUtilities.invokeLater(bg);
    } 
  }
  
  private boolean IOInAcPackage(AeInterfaceMikeTostring parambT) {
    if (parambT != null) {
      byte[] arrayOfByte = parambT.IOInAcPackage();
      if ((arrayOfByte[0] & 0xE0) == 224 && (arrayOfByte[1] & 0xF0) == 0 && arrayOfByte[2] == 62)
        return false; 
    } 
    return true;
  }
  
  public void IOInAcPackage() {
    if (!this.q) {
      this.l.setEnabled(true);
      this.k.setEnabled(true);
      this.IOInAbPackage.setText(SComponentGolf.IOInAbPackage("No Controller found."));
      this.c.setText(SComponentGolf.IOInAbPackage("Check your connections and be sure you have COM port drivers installed."));
      this.d.setText(SComponentGolf.IOInAbPackage("Consult your serial cable provider for the correct drivers."));
      D.c("Device not found");
      this.Network.setText(SComponentGolf.IOInAbPackage("If your Controller is not attached, you can configure it manually to work offline."));
    } 
  }
  
  public void IOInAbPackage(double paramDouble) {
    this.Threaded.IOInAcPackage(paramDouble);
    if (paramDouble == 1.0D) {
      this.Network.setText(SComponentGolf.IOInAbPackage("Device Search Complete! Controllers found:") + " " + this.h.size());
      this.IOInAcPackage.setIcon((Icon)null);
    } 
  }
  
  public void IOInAcPackage(String paramString) {
    this.Network.setText(paramString);
  }
  
  public void IOInAcPackage(AInterfaceOscar paramo) {
    if (!this.n.contains(paramo))
      this.n.add(paramo); 
  }
  
  public void IOInAbPackage(AInterfaceOscar paramo) {
    this.n.remove(paramo);
  }
  
  private void m() {
    if (this.SComponentGolf.getSelectedValue() != null) {
      bi bi = this.SComponentGolf.getSelectedValue();
      for (AInterfaceOscar o1 : this.n)
        o1.IOInAcPackage(bi.d(), bi.IOInAbPackage(), bi.c(), bi.IOInAcPackage()); 
    } 
  }
  
  public boolean IOInAcPackage(String paramString1, String paramString2, List paramList, AeInterfaceMikeTostring parambT) {
    this.q = true;
    this.m.setEnabled(true);
    bi bi = new bi(this, paramString2, paramList, paramString1, parambT);
    if (!this.h.contains(bi)) {
      this.h.addElement(bi);
      if (this.SComponentGolf.getSelectedIndex() < 0)
        this.SComponentGolf.setSelectedIndex(0); 
      this.Network.setText(SComponentGolf.IOInAbPackage("Devices found:") + " " + this.h.size() + " - " + SComponentGolf.IOInAbPackage("Searching for other controllers.."));
    } 
    return true;
  }
  
  public void IOInAbPackage(boolean paramBoolean) {
    this.s = paramBoolean;
  }
  
  public void RInterfaceIndia() {
    Threaded Threaded = Threaded.IOInAcPackage();
    Threaded.IOInAbPackage();
    this.IOInAcPackage.setVisible(false);
    if (this.SComponentGolf.getSelectedIndex() >= 0)
      this.SComponentGolf.setSelectedIndex(this.SComponentGolf.getSelectedIndex()); 
    this.t = null;
    Threaded.IOInAcPackage().d();
  }
  
  public void IOInAcPackage(AInterfaceXray paramx) {
    if (paramx != null && paramx.d() instanceof IOInAcPackage && this.t != null)
      this.t.start(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */