package bb;

import A.AInterfaceCharlie;
import A.IO;
import A.AInterfaceGolf;
import A.Threaded;
import A.AInterfaceOscar;
import A.AInterfaceRomeo;
import A.Exception;
import A.IOFile;
import A.AInterfaceVictor;
import A.AInterfaceXray;
import G.R;
import G.T;
import G.bT;
import W.ap;
import W.ar;
import aP.aY;
import aP.ad;
import aV.AvInterfaceWhiskey;
import aW.JPanelExtensionInAwPackage;
import aW.AwInterfacePapa;
import ae.AwInterfacePapa;
import bQ.IOHashMap;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fT;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import AInterfaceRomeo.JPanelExtensionInAwPackage;
import AInterfaceRomeo.i;
import Exception.AInterfaceGolf;

public class UIClose extends JPanel implements AInterfaceOscar, AwInterfacePapa, bc, fT {
  private AwInterfacePapa m;
  
  JPanelExtensionInAwPackage JPanelExtensionInAwPackage;
  
  aY b = null;
  
  private bT n = null;
  
  JLabel AInterfaceCharlie = new JLabel();
  
  JLabel d = new JLabel();
  
  JButton e;
  
  JButton IO;
  
  CardLayout AInterfaceGolf = new CardLayout();
  
  String h = null;
  
  List i = null;
  
  Threaded Threaded = null;
  
  boolean k;
  
  AInterfaceOscar IOHashMap = new i(this);
  
  public UIClose(AwInterfacePapa paramp, boolean paramBoolean) {
    this.m = paramp;
    this.k = paramBoolean;
    setLayout(this.AInterfaceGolf);
    JPanel jPanel1 = Threaded();
    add(jPanel1, "Advanced Connection Settings");
    this.b = new aY();
    this.b.b(true);
    this.b.setVisible(true);
    this.b.JPanelExtensionInAwPackage(this);
    this.b.JPanelExtensionInAwPackage(false);
    this.b.setPreferredSize(new Dimension(eJ.JPanelExtensionInAwPackage(520), eJ.JPanelExtensionInAwPackage(320)));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add((Component)this.b, "Center");
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    JButton jButton = new JButton(AInterfaceGolf.b("Manually set Connection Settings"));
    jButton.addActionListener(new e(this));
    if (paramBoolean) {
      jPanel3.add(jButton);
      jPanel2.add(jPanel3, "South");
    } 
    add(jPanel2, "Detect Connection Settings");
    this.AInterfaceGolf.show(this, "Detect Connection Settings");
    Threaded.JPanelExtensionInAwPackage().JPanelExtensionInAwPackage(this.IOHashMap);
    IO IO = new IO(this);
    IO.start();
  }
  
  public void close() {
    Threaded.JPanelExtensionInAwPackage().b(this.IOHashMap);
  }
  
  public void AInterfaceCharlie() {
    if (this.k) {
      this.AInterfaceGolf.show(this, "Advanced Connection Settings");
      this.b.i();
      this.d.setText(AInterfaceGolf.b("Not Tested"));
    } else {
      d();
    } 
  }
  
  public void d() {
    this.AInterfaceGolf.show(this, "Detect Connection Settings");
    this.b.b();
  }
  
  private JPanel Threaded() {
    JPanel jPanel1 = new JPanel();
    this.JPanelExtensionInAwPackage = new JPanelExtensionInAwPackage(AvInterfaceWhiskey.AInterfaceCharlie(), (AInterfaceGolf)i());
    this.JPanelExtensionInAwPackage.JPanelExtensionInAwPackage(this);
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("Center", (Component)this.JPanelExtensionInAwPackage);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 1, 5, 5));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    this.AInterfaceCharlie.setText(AInterfaceGolf.b("Power on and Click Test"));
    this.e = new JButton(AInterfaceGolf.b("Auto Detect"));
    this.e.addActionListener(new AInterfaceGolf(this));
    jPanel3.add(this.e, "East");
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout(4, 4));
    this.IO = new JButton(AInterfaceGolf.b("Test"));
    this.IO.addActionListener(new h(this));
    jPanel4.add(this.d, "Center");
    jPanel4.add(this.IO, "East");
    jPanel2.add(jPanel4);
    jPanel2.add(jPanel3);
    jPanel1.add("South", jPanel2);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new FlowLayout(1));
    jPanel5.add(jPanel1);
    return jPanel5;
  }
  
  private void k() {
    R AInterfaceRomeo = T.JPanelExtensionInAwPackage().AInterfaceCharlie();
    if (AInterfaceRomeo != null) {
      if (AInterfaceRomeo.C() instanceof IOFile) {
        IOFile IOFile = (IOFile)AInterfaceRomeo.C();
        IO IO = IOFile.JPanelExtensionInAwPackage();
        i().JPanelExtensionInAwPackage(IO);
        this.JPanelExtensionInAwPackage.JPanelExtensionInAwPackage(IO);
      } else if (AInterfaceRomeo.C() instanceof IOHashMap) {
        IOHashMap IOHashMap = (IOHashMap)AInterfaceRomeo.C();
        IO IO = IOHashMap.JPanelExtensionInAwPackage();
        i().JPanelExtensionInAwPackage(IO);
        this.JPanelExtensionInAwPackage.JPanelExtensionInAwPackage(IO);
      } 
    } else {
      AInterfaceVictor.JPanelExtensionInAwPackage().JPanelExtensionInAwPackage((ap)new ar((JPanelExtensionInAwPackage.JPanelExtensionInAwPackage()).an, "FirmwareLoader"));
      try {
        String str = JPanelExtensionInAwPackage.JPanelExtensionInAwPackage().AInterfaceCharlie("firmwareLoaderCiId", AvInterfaceWhiskey.AInterfaceCharlie().b().JPanelExtensionInAwPackage());
        IO IO = AvInterfaceWhiskey.AInterfaceCharlie().JPanelExtensionInAwPackage(str, "DEFAULT_INSTANCE");
        AInterfaceVictor.JPanelExtensionInAwPackage().b("FirmwareLoader", IO);
        i().JPanelExtensionInAwPackage(IO);
        this.JPanelExtensionInAwPackage.JPanelExtensionInAwPackage(IO);
      } catch (InstantiationException instantiationException) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
      } catch (IllegalAccessException illegalAccessException) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
      } 
    } 
  }
  
  public void JPanelExtensionInAwPackage(String paramString1, String paramString2) {
    if (this.JPanelExtensionInAwPackage.b() != null && paramString1.equals("Driver")) {
      JPanelExtensionInAwPackage.JPanelExtensionInAwPackage().b("firmwareLoaderCiId", this.JPanelExtensionInAwPackage.b().h());
      this.m.JPanelExtensionInAwPackage(this.JPanelExtensionInAwPackage.b());
    } else {
      try {
        if (this.m.JPanelExtensionInAwPackage() != null)
          this.m.JPanelExtensionInAwPackage().JPanelExtensionInAwPackage(paramString1, paramString2); 
      } catch (Exception Exception) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, (Throwable)Exception);
      } 
    } 
    if (this.m.JPanelExtensionInAwPackage() != null) {
      ap ap = AInterfaceVictor.JPanelExtensionInAwPackage().AInterfaceCharlie();
      AInterfaceVictor.JPanelExtensionInAwPackage().JPanelExtensionInAwPackage((ap)new ar((JPanelExtensionInAwPackage.JPanelExtensionInAwPackage()).an, "FirmwareLoader"));
      AInterfaceVictor.JPanelExtensionInAwPackage().JPanelExtensionInAwPackage("FirmwareLoader", i().JPanelExtensionInAwPackage());
      AInterfaceVictor.JPanelExtensionInAwPackage().JPanelExtensionInAwPackage(ap);
    } 
  }
  
  public void e() {
    d();
  }
  
  public void IO() {
    AInterfaceXray AInterfaceXray = new AInterfaceXray();
    IO IO = this.JPanelExtensionInAwPackage.b();
    if (IO != null)
      try {
        IO f1 = (IO)IO.getClass().newInstance();
        AInterfaceXray.JPanelExtensionInAwPackage(f1);
        for (AInterfaceRomeo AInterfaceRomeo : AInterfaceXray.d().IOHashMap()) {
          if (AInterfaceRomeo.JPanelExtensionInAwPackage() != 5)
            AInterfaceXray.JPanelExtensionInAwPackage(AInterfaceRomeo.AInterfaceCharlie(), IO.JPanelExtensionInAwPackage(AInterfaceRomeo.AInterfaceCharlie())); 
        } 
        if (i.JPanelExtensionInAwPackage().JPanelExtensionInAwPackage("HF-05[P54;'FD")) {
          String str = "\\x02\\x00\\x00\\x00\\xFF\\x00";
          this.b.JPanelExtensionInAwPackage(AInterfaceXray, str);
        } else {
          this.b.b(AInterfaceXray);
        } 
        this.IO.setEnabled(false);
        this.d.setText(AInterfaceGolf.b("Testing") + ": " + IO.n());
        setCursor(Cursor.getPredefinedCursor(3));
        if (this.Threaded != null)
          this.Threaded.JPanelExtensionInAwPackage(); 
        this.Threaded = new Threaded(this);
        this.Threaded.start();
      } catch (InstantiationException instantiationException) {
      
      } catch (IllegalAccessException illegalAccessException) {} 
  }
  
  public boolean JPanelExtensionInAwPackage(String paramString1, String paramString2, List paramList, bT parambT) {
    if (paramString2.contains(":")) {
      String str = paramString2.substring(0, paramString2.indexOf(":"));
      paramString2 = paramString2.substring(paramString2.indexOf(":") + 1);
    } 
    try {
      IO IO = AvInterfaceWhiskey.AInterfaceCharlie().JPanelExtensionInAwPackage(paramString2, "DEFAULT_INSTANCE");
      for (AInterfaceCharlie AInterfaceCharlie : paramList) {
        try {
          IO.JPanelExtensionInAwPackage(AInterfaceCharlie.JPanelExtensionInAwPackage(), AInterfaceCharlie.b());
        } catch (Exception Exception) {
          Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)Exception);
        } 
      } 
      this.JPanelExtensionInAwPackage.JPanelExtensionInAwPackage(IO);
      this.m.JPanelExtensionInAwPackage(IO);
    } catch (InstantiationException instantiationException) {
      Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
    } 
    this.n = parambT;
    this.h = paramString2;
    this.i = paramList;
    if (parambT.e() != null) {
      this.AInterfaceCharlie.setText(parambT.e().JPanelExtensionInAwPackage());
      this.d.setText(AInterfaceGolf.b("Found") + ": " + parambT.e().JPanelExtensionInAwPackage());
    } 
    if (this.Threaded != null)
      this.Threaded.JPanelExtensionInAwPackage(); 
    this.IO.setEnabled(true);
    setCursor(Cursor.getDefaultCursor());
    return true;
  }
  
  public void b(double paramDouble) {}
  
  public void JPanelExtensionInAwPackage(String paramString) {}
  
  public void JPanelExtensionInAwPackage() {
    this.d.setText("Failed");
  }
  
  public bT AInterfaceGolf() {
    return this.n;
  }
  
  public void h() {
    this.b.i();
  }
  
  public AwInterfacePapa i() {
    if (this.h != null && this.i != null && this.m != null)
      try {
        IO IO = AvInterfaceWhiskey.AInterfaceCharlie().JPanelExtensionInAwPackage(this.h, "DEFAULT_INSTANCE");
        for (AInterfaceCharlie AInterfaceCharlie : this.i) {
          try {
            if (AInterfaceCharlie.b() != null && !IO.JPanelExtensionInAwPackage(AInterfaceCharlie.JPanelExtensionInAwPackage()).equals(AInterfaceCharlie.b()))
              IO.JPanelExtensionInAwPackage(AInterfaceCharlie.JPanelExtensionInAwPackage(), AInterfaceCharlie.b()); 
          } catch (Exception Exception) {
            Logger.getLogger(ad.class.getName()).log(Level.SEVERE, (String)null, (Throwable)Exception);
          } 
        } 
        this.JPanelExtensionInAwPackage.JPanelExtensionInAwPackage(IO);
        this.m.JPanelExtensionInAwPackage(IO);
      } catch (InstantiationException instantiationException) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
      } catch (IllegalAccessException illegalAccessException) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
      }  
    return this.m;
  }
  
  public void JPanelExtensionInAwPackage(AInterfaceXray paramx) {}
  
  public boolean g_() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */