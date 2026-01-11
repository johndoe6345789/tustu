package bt;

import BgInterfaceGolf.R;
import BgInterfaceGolf.aM;
import BgInterfaceGolf.aN;
import BgInterfaceGolf.aR;
import BgInterfaceGolf.bJ;
import BgInterfaceGolf.bK;
import BgInterfaceGolf.bL;
import BgInterfaceGolf.BgInterfaceIndia;
import P.PInterfaceAlpha;
import P.PInterfaceBravo;
import V.PInterfaceAlpha;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import bG.BgInterfaceFoxtrot;
import bG.BgInterfaceGolf;
import bG.PInterfaceAlpha;
import bG.BgInterfaceCharlie;
import bG.BgInterfaceIndia;
import bG.BgInterfaceLima;
import bG.JComponentExtensionPaint;
import bG.JToolBarExtensionInBgPackage;
import bH.D;
import bH.p;
import BgInterfaceCharlie.d;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import r.BgInterfaceIndia;
import r.ExceptionExtensionGetmessage;
import s.ExceptionPrintstacktrace;

public class bB extends ExceptionPrintstacktrace implements aN, h, d, bc {
  R PInterfaceAlpha = null;
  
  JComponentExtensionPaint PInterfaceBravo = null;
  
  bL BgInterfaceCharlie = null;
  
  aM d = null;
  
  aM e = null;
  
  aM f = null;
  
  aM ExceptionPrintstacktrace = null;
  
  BgInterfaceGolf h = null;
  
  BgInterfaceLima BgInterfaceIndia = (BgInterfaceLima)new PInterfaceAlpha(60, 2);
  
  bJ ExceptionExtensionGetmessage;
  
  aN k;
  
  JLabel BgInterfaceLima = new JLabel("-------");
  
  JToolBarExtensionInBgPackage JComponentExtensionPaint = null;
  
  public bB(R paramR, bJ parambJ) {
    this.PInterfaceAlpha = paramR;
    this.ExceptionExtensionGetmessage = parambJ;
    setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), parambJ.M()));
    this.PInterfaceBravo = new JComponentExtensionPaint();
    this.PInterfaceBravo.setName(parambJ.aL());
    this.PInterfaceBravo.PInterfaceAlpha(new bC(this));
    setLayout(new BorderLayout());
    if (parambJ.PInterfaceBravo() != null)
      setPreferredSize(new Dimension(parambJ.PInterfaceBravo().PInterfaceAlpha(), parambJ.PInterfaceBravo().PInterfaceBravo())); 
    add("Center", (Component)this.PInterfaceBravo);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    add("North", jPanel1);
    if (parambJ.BgInterfaceCharlie() && BgInterfaceIndia.PInterfaceAlpha().PInterfaceAlpha("09PO;L'RE4")) {
      this.JComponentExtensionPaint = new JToolBarExtensionInBgPackage(this.PInterfaceBravo);
      add("East", (Component)this.JComponentExtensionPaint);
      this.PInterfaceBravo.PInterfaceAlpha(true);
      JMenuBar jMenuBar = new JMenuBar();
      jPanel1.add("North", jMenuBar);
      jMenuBar.add(BgInterfaceCharlie());
      jMenuBar.add(this.JComponentExtensionPaint.PInterfaceAlpha());
    } else if (parambJ.BgInterfaceCharlie()) {
      JMenuBar jMenuBar = new JMenuBar();
      jMenuBar.add(BgInterfaceCharlie());
      jPanel1.add("North", jMenuBar);
    } 
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 1));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add("West", new JLabel(ExceptionPrintstacktrace.PInterfaceBravo("Teeth: sensor to missing tooth @ TDC") + ": ", 4));
    jPanel3.add("Center", this.BgInterfaceLima);
    jPanel2.add(jPanel3);
    jPanel1.add("South", jPanel2);
    f();
    this.k = new bD(this);
    for (bK bK : parambJ.PInterfaceAlpha()) {
      try {
        BgInterfaceIndia.PInterfaceAlpha(this.PInterfaceAlpha, bK.PInterfaceAlpha(), this.k);
      } catch (PInterfaceAlpha PInterfaceAlpha) {
        bV.d(PInterfaceAlpha.getLocalizedMessage(), this);
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)PInterfaceAlpha);
      } 
    } 
  }
  
  private JMenu BgInterfaceCharlie() {
    JMenu jMenu = new JMenu(ExceptionPrintstacktrace.PInterfaceBravo("File"));
    JMenuItem jMenuItem1 = new JMenuItem(ExceptionPrintstacktrace.PInterfaceBravo("Load Wheel Pattern"));
    jMenuItem1.addActionListener(new bE(this));
    jMenu.add(jMenuItem1);
    JMenuItem jMenuItem2 = new JMenuItem(ExceptionPrintstacktrace.PInterfaceBravo("Save Wheel Pattern"));
    jMenuItem2.addActionListener(new bF(this));
    jMenu.add(jMenuItem2);
    return jMenu;
  }
  
  private void d() {
    String[] arrayOfString = { "wheel" };
    String str = bV.PInterfaceAlpha(this, "Save Wheel Pattern", arrayOfString, "", ExceptionExtensionGetmessage.e().getAbsolutePath());
    if (str != null && !str.isEmpty()) {
      if (!str.toLowerCase().endsWith(".wheel"))
        str = str + ".wheel"; 
      try {
        BgInterfaceFoxtrot f = new BgInterfaceFoxtrot();
        File file = new File(str);
        ExceptionExtensionGetmessage.PInterfaceBravo(file);
        f.PInterfaceAlpha(file, this.PInterfaceBravo.e().PInterfaceAlpha());
      } catch (IOException iOException) {
        bV.d(ExceptionPrintstacktrace.PInterfaceBravo("Unable to save wheel pattern.") + "\n" + iOException.getLocalizedMessage(), this);
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, iOException);
      } 
    } 
  }
  
  private void e() {
    String[] arrayOfString = { "wheel" };
    String str = bV.PInterfaceBravo(this, "Load Wheel Pattern", arrayOfString, "", ExceptionExtensionGetmessage.e().getAbsolutePath());
    if (str != null && !str.isEmpty() && str.toLowerCase().endsWith(".wheel"))
      try {
        BgInterfaceFoxtrot f = new BgInterfaceFoxtrot();
        File file = new File(str);
        ExceptionExtensionGetmessage.PInterfaceBravo(file);
        List list = f.PInterfaceAlpha(file);
        if (this.PInterfaceBravo.e() instanceof BgInterfaceIndia) {
          BgInterfaceIndia BgInterfaceIndia = (BgInterfaceIndia)this.PInterfaceBravo.e();
          BgInterfaceIndia.PInterfaceAlpha(list);
        } 
      } catch (IOException iOException) {
        bV.d(ExceptionPrintstacktrace.PInterfaceBravo("Unable to load wheel pattern.") + "\n" + iOException.getLocalizedMessage(), this);
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, iOException);
      }  
  }
  
  private void f() {
    for (bK bK : this.ExceptionExtensionGetmessage.PInterfaceAlpha()) {
      boolean bool = false;
      try {
        bool = (bK.PInterfaceAlpha() == null || bK.PInterfaceAlpha().isEmpty() || p.PInterfaceAlpha(bK.PInterfaceAlpha(), this.PInterfaceAlpha)) ? true : false;
      } catch (ExceptionPrintstacktrace g1) {
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
      } 
      if (bool) {
        bL bL1 = bK.PInterfaceBravo();
        PInterfaceAlpha(bL1);
        break;
      } 
    } 
    ExceptionPrintstacktrace();
  }
  
  public void PInterfaceAlpha(bL parambL) {
    this.BgInterfaceCharlie = parambL;
    aR.PInterfaceAlpha().PInterfaceAlpha(this);
    if (parambL instanceof PInterfaceBravo) {
      PInterfaceAlpha((PInterfaceBravo)parambL);
    } else if (parambL instanceof PInterfaceAlpha) {
      PInterfaceAlpha((PInterfaceAlpha)parambL);
    } else if (parambL instanceof P.BgInterfaceCharlie) {
    
    } 
  }
  
  public void PInterfaceAlpha(PInterfaceAlpha parama) {
    if (this.h != null)
      this.h.BgInterfaceCharlie(); 
    try {
      this.h = (BgInterfaceGolf)new BgInterfaceCharlie(this.PInterfaceAlpha, parama, this.PInterfaceBravo);
    } catch (ExceptionPrintstacktrace g1) {
      bV.d(ExceptionPrintstacktrace.PInterfaceBravo("Failed to set Wheel pattern") + "\n" + g1.getMessage(), this);
      Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
    } 
    if (parama.d() != null) {
      this.d = this.PInterfaceAlpha.BgInterfaceCharlie(parama.d());
      try {
        aR.PInterfaceAlpha().PInterfaceAlpha(this.PInterfaceAlpha.BgInterfaceCharlie(), this.d.aL(), this);
      } catch (Exception exception) {
        D.PInterfaceAlpha("Failed to subscribe to parameter: " + parama.d());
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
    } 
    if (parama.BgInterfaceCharlie() != null) {
      this.ExceptionPrintstacktrace = this.PInterfaceAlpha.BgInterfaceCharlie(parama.BgInterfaceCharlie());
      try {
        aR.PInterfaceAlpha().PInterfaceAlpha(this.PInterfaceAlpha.BgInterfaceCharlie(), this.ExceptionPrintstacktrace.aL(), this);
      } catch (Exception exception) {
        D.PInterfaceAlpha("Failed to subscribe to parameter: " + parama.BgInterfaceCharlie());
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
    } 
  }
  
  public void PInterfaceAlpha(PInterfaceBravo paramb) {
    this.d = this.PInterfaceAlpha.BgInterfaceCharlie(paramb.PInterfaceBravo());
    this.e = this.PInterfaceAlpha.BgInterfaceCharlie(paramb.BgInterfaceCharlie());
    this.f = this.PInterfaceAlpha.BgInterfaceCharlie(paramb.d());
    this.ExceptionPrintstacktrace = this.PInterfaceAlpha.BgInterfaceCharlie(paramb.e());
    try {
      aR.PInterfaceAlpha().PInterfaceAlpha(this.PInterfaceAlpha.BgInterfaceCharlie(), this.d.aL(), this);
    } catch (Exception exception) {
      D.PInterfaceAlpha("Failed to subscribe to parameter: " + paramb.PInterfaceBravo());
      Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    try {
      aR.PInterfaceAlpha().PInterfaceAlpha(this.PInterfaceAlpha.BgInterfaceCharlie(), this.e.aL(), this);
    } catch (Exception exception) {
      D.PInterfaceAlpha("Failed to subscribe to parameter: " + paramb.BgInterfaceCharlie());
      Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    try {
      aR.PInterfaceAlpha().PInterfaceAlpha(this.PInterfaceAlpha.BgInterfaceCharlie(), this.f.aL(), this);
    } catch (Exception exception) {
      D.PInterfaceAlpha("Failed to subscribe to parameter: " + paramb.d());
      Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    try {
      aR.PInterfaceAlpha().PInterfaceAlpha(this.PInterfaceAlpha.BgInterfaceCharlie(), this.ExceptionPrintstacktrace.aL(), this);
    } catch (Exception exception) {
      D.PInterfaceAlpha("Failed to subscribe to parameter: " + paramb.e());
      Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
  }
  
  public void close() {
    aR.PInterfaceAlpha().PInterfaceAlpha(this);
    aR.PInterfaceAlpha().PInterfaceAlpha(this.k);
  }
  
  public void PInterfaceAlpha(String paramString1, String paramString2) {
    if (this.d != null && paramString2.equals(this.d.aL()))
      h(); 
    if (this.e != null && paramString2.equals(this.e.aL()))
      BgInterfaceIndia(); 
    if (this.f != null && paramString2.equals(this.f.aL()))
      BgInterfaceIndia(); 
    if (this.ExceptionPrintstacktrace != null && paramString2.equals(this.ExceptionPrintstacktrace.aL()))
      ExceptionExtensionGetmessage(); 
  }
  
  private void ExceptionPrintstacktrace() {
    h();
    BgInterfaceIndia();
    ExceptionExtensionGetmessage();
  }
  
  private void h() {
    if (this.d != null)
      try {
        double d1 = this.d.ExceptionExtensionGetmessage(this.PInterfaceAlpha.h());
        this.PInterfaceBravo.PInterfaceAlpha(d1);
        this.PInterfaceBravo.repaint();
        this.BgInterfaceLima.setText(this.PInterfaceBravo.PInterfaceBravo() + "");
      } catch (ExceptionPrintstacktrace g1) {
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
        D.PInterfaceAlpha("Failed to get Offset Angle", (Exception)g1, this);
      }  
  }
  
  private void BgInterfaceIndia() {
    if (this.e != null && this.f != null)
      try {
        int BgInterfaceIndia = (int)Math.round(this.e.ExceptionExtensionGetmessage(this.PInterfaceAlpha.h()));
        int ExceptionExtensionGetmessage = (int)Math.round(this.f.ExceptionExtensionGetmessage(this.PInterfaceAlpha.h()));
        if (this.BgInterfaceIndia instanceof PInterfaceAlpha) {
          ((PInterfaceAlpha)this.BgInterfaceIndia).PInterfaceAlpha(BgInterfaceIndia, ExceptionExtensionGetmessage);
          this.PInterfaceBravo.PInterfaceAlpha(this.BgInterfaceIndia);
          this.BgInterfaceLima.setText(this.PInterfaceBravo.PInterfaceBravo() + "");
          this.PInterfaceBravo.repaint();
        } 
      } catch (ExceptionPrintstacktrace g1) {
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
        D.PInterfaceAlpha("Failed to set Tooth Pattern", (Exception)g1, this);
      }  
  }
  
  private void ExceptionExtensionGetmessage() {
    if (this.ExceptionPrintstacktrace != null)
      try {
        if (this.ExceptionPrintstacktrace != null) {
          int BgInterfaceIndia = (int)Math.round(this.ExceptionPrintstacktrace.ExceptionExtensionGetmessage(this.PInterfaceAlpha.h()));
          this.PInterfaceBravo.PInterfaceAlpha(BgInterfaceIndia);
          this.BgInterfaceLima.setText(this.PInterfaceBravo.PInterfaceBravo() + "");
        } 
        this.PInterfaceBravo.repaint();
      } catch (ExceptionPrintstacktrace g1) {
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
        D.PInterfaceAlpha("Failed to set Input Capture Point on Trigger Wheel image", (Exception)g1, this);
      }  
  }
  
  public void PInterfaceAlpha(double paramDouble) {
    if (this.d != null) {
      if (paramDouble > this.d.s())
        paramDouble = this.d.s(); 
      if (paramDouble < this.d.r())
        paramDouble = this.d.r(); 
      try {
        this.d.PInterfaceAlpha(this.PInterfaceAlpha.p(), paramDouble);
      } catch (ExceptionPrintstacktrace g1) {
        D.PInterfaceAlpha("Unable to set Offset Angle.", (Exception)g1, this);
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        D.PInterfaceAlpha("Trigger Wheel Value out of bounds.", (Exception)ExceptionExtensionGetmessage, this);
      } 
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.PInterfaceBravo.setEnabled(paramBoolean);
    super.setEnabled(paramBoolean);
  }
  
  public void PInterfaceAlpha() {
    try {
      if (a_() != null) {
        boolean bool = p.PInterfaceAlpha(a_(), this.PInterfaceAlpha);
        setEnabled(bool);
      } 
    } catch (ExceptionPrintstacktrace g1) {
      Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
    } 
  }
  
  public R b_() {
    return this.PInterfaceAlpha;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */