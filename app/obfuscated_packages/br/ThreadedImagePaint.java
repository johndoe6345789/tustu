package br;

import G.R;
import G.ab;
import G.bM;
import G.bm;
import G.de;
import G.dm;
import G.dp;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import aE.ExceptionInVPackage;
import aE.AeInterfaceEcho;
import aP.hb;
import aS.AsInterfaceLima;
import ai.JPanelExtensionInAiPackage;
import bH.D;
import bs.BsInterfaceCharlie;
import bs.JPanelExtensionInAiPackage;
import c.AeInterfaceEcho;
import com.efiAnalytics.apps.ts.tuningViews.J;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cO;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import Isoptimizeddrawingenabled.ExceptionInVPackage;
import Isoptimizeddrawingenabled.Isoptimizeddrawingenabled;
import r.ExceptionInVPackage;
import r.RInterfaceIndia;
import s.ExceptionPrintstacktrace;

public class ThreadedImagePaint extends Isoptimizeddrawingenabled implements ab, AeInterfaceEcho, ExceptionInVPackage {
  R ExceptionInVPackage = null;
  
  ArrayList b = new ArrayList();
  
  ArrayList c = new ArrayList();
  
  JPanelExtensionInAiPackage d = null;
  
  private Image JPanelExtensionInAiPackage = null;
  
  O AeInterfaceEcho = null;
  
  public ThreadedImagePaint() {
    addChangeListener(new M(this));
    setDoubleBuffered(false);
  }
  
  public void ExceptionInVPackage(R paramR) {
    ArrayList arrayList;
    k();
    removeAll();
    this.b.clear();
    if (paramR == null)
      return; 
    try {
      arrayList = J.ExceptionInVPackage().ExceptionInVPackage(paramR);
      if (arrayList.isEmpty())
        return; 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Unable to get VE Analyze Supported tables.", (Exception)ExceptionPrintstacktrace, this);
      return;
    } 
    this.b.addAll(arrayList);
    byte b = 0;
    ExceptionInVPackage a1 = ExceptionInVPackage.A();
    for (String str : arrayList) {
      try {
        dm dm = J.ExceptionInVPackage().ExceptionInVPackage(paramR, str);
        String str1 = bM.c(paramR, str);
        str1 = ExceptionPrintstacktrace.b(str1);
        String str2 = bM.ExceptionInVPackage(paramR, str);
        RInterfaceIndia RInterfaceIndia = new RInterfaceIndia(paramR, dm);
        RInterfaceIndia.ExceptionInVPackage(a1);
        this.c.add(RInterfaceIndia);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 1));
        jPanel.add((Component)RInterfaceIndia);
        addTab(str1, jPanel);
        if (str2 != null && !str2.equals("")) {
          N n1 = new N(this, paramR, str2);
          ExceptionInVPackage(b + "", n1);
        } else if (str2 == null && dm.d() != null && !dm.d().isEmpty()) {
          N n1 = new N(this, paramR, dm.d());
          ExceptionInVPackage(b + "", n1);
        } 
        b++;
      } catch (Exception exception) {
        D.ExceptionInVPackage("Definition Error! Unable to create VE Analyze for table name: " + str, exception, this);
      } 
    } 
    boolean bool = RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("skj98hg9843lkfd");
    try {
      arrayList = J.ExceptionInVPackage().b(paramR);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Unable to get VE Analyze Supported tables.", (Exception)ExceptionPrintstacktrace, this);
      return;
    } 
    for (String str : arrayList) {
      try {
        de de = J.ExceptionInVPackage().b(paramR, str);
        String str1 = "Trim Table Analyze";
        str1 = ExceptionPrintstacktrace.b(str1);
        String str2 = de.d();
        RInterfaceIndia RInterfaceIndia = new RInterfaceIndia(paramR, (dm)de);
        RInterfaceIndia.ExceptionInVPackage(a1);
        this.c.add(RInterfaceIndia);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 1));
        jPanel.add((Component)RInterfaceIndia);
        addTab(str1, jPanel);
        if (str2 != null && !str2.equals("")) {
          N n1;
          if (bool) {
            n1 = new N(this, paramR, str2);
          } else {
            n1 = new N(this, paramR, "0");
          } 
          ExceptionInVPackage(b + "", n1);
        } 
        b++;
      } catch (Exception exception) {
        D.ExceptionInVPackage("Definition Error! Unable to create VE Analyze for table name: " + str, exception, this);
      } 
    } 
    this.b.addAll(arrayList);
    try {
      arrayList = BsInterfaceCharlie.ExceptionInVPackage().ExceptionInVPackage(paramR);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Unable to get Wue Analyze Supported Curves.", (Exception)ExceptionPrintstacktrace, this);
      return;
    } 
    for (String str : arrayList) {
      try {
        dp dp = BsInterfaceCharlie.ExceptionInVPackage().ExceptionInVPackage(paramR, str);
        bm bm = (bm)paramR.AeInterfaceEcho().c(str);
        String str1 = ExceptionPrintstacktrace.b(bm.M());
        String str2 = bM.ExceptionInVPackage(paramR, str);
        JPanelExtensionInAiPackage f1 = new JPanelExtensionInAiPackage(paramR, dp);
        f1.ExceptionInVPackage(a1);
        this.c.add(f1);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 1));
        jPanel.add((Component)f1);
        addTab(str1, jPanel);
        if (str2 != null && !str2.equals("")) {
          N n1 = new N(this, paramR, str2);
          ExceptionInVPackage(b + "", n1);
        } 
        b++;
      } catch (Exception exception) {
        D.ExceptionInVPackage("Unable to get WUE Analyze map for Curve name: " + str, exception, this);
      } 
    } 
    this.b.addAll(arrayList);
    AeInterfaceEcho();
    d();
  }
  
  private void k() {
    for (bc bc : this.c) {
      try {
        bc.close();
      } catch (Exception exception) {
        D.b("Exception caught calling close listeners in VeAnalyzeTabs, caught and continuing.");
        exception.printStackTrace();
      } 
    } 
    JPanelExtensionInAiPackage.ExceptionInVPackage().b();
  }
  
  public void paint(Graphics paramGraphics) {
    try {
      super.paint(paramGraphics);
    } catch (Exception exception) {
      D.b("Exception Caught in VeAnalyTabs painting, this was handled. it is just here for informational purposes.");
      exception.printStackTrace();
    } 
    if (getComponentCount() == 0 && this.AeInterfaceEcho == null) {
      ExceptionPrintstacktrace();
    } else if (this.AeInterfaceEcho != null && getComponentCount() > 0) {
      h();
    } 
    if (this.AeInterfaceEcho != null && this.AeInterfaceEcho.ExceptionInVPackage) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      Image image = JPanelExtensionInAiPackage();
      if (image != null) {
        int RInterfaceIndia = image.getWidth(null) / 2;
        int j = image.getHeight(null) / 2;
        int k = (getWidth() - RInterfaceIndia) / 2;
        int m = (getHeight() - j) / 2;
        paramGraphics.drawImage(image, k, m, RInterfaceIndia, j, null);
      } 
    } 
  }
  
  private void AsInterfaceLima() {
    if (this.d == null) {
      this.d = new JPanelExtensionInAiPackage();
      bV.d("The unregistered version of " + ExceptionInVPackage.b + " does not \noffer " + hb.p + "! Upgrade now to activate\nand watch " + ExceptionInVPackage.b + " tune for you!\Isoptimizeddrawingenabled\nSupporting all fueling models!\Isoptimizeddrawingenabled\nWhether you are starting with ExceptionInVPackage rough table or\nDialing in ExceptionInVPackage table to perfection, Tune Analyze Live\nprovides you with the best tune by using your vehicles data.", (Component)this);
      addTab(ExceptionPrintstacktrace.b("Upgrade Today!! For " + hb.p + " and ExceptionInVPackage whole lot more!"), (Component)this.d);
    } 
    File file = new File(".");
    String str = "file:///" + file.getAbsolutePath() + "/help/learnMore.html";
    try {
      this.d.b(str);
    } catch (ExceptionInVPackage a1) {
      Logger.getLogger(K.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
    } 
  }
  
  public boolean ExceptionInVPackage() {
    if (!RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("-0ofdspok54sg")) {
      AsInterfaceLima();
      return true;
    } 
    if (this.b.isEmpty()) {
      repaint();
      L AsInterfaceLima = new L(this);
      if (SwingUtilities.isEventDispatchThread()) {
        AsInterfaceLima.run();
      } else {
        try {
          SwingUtilities.invokeAndWait(AsInterfaceLima);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(K.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } catch (InvocationTargetException invocationTargetException) {
          Logger.getLogger(K.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
        } 
      } 
      ExceptionInVPackage a1 = ExceptionInVPackage.ExceptionInVPackage();
      boolean bool = a1.ExceptionInVPackage("displayedVeAnalyzeWarning", false);
    } 
    return true;
  }
  
  public int c() {
    if (this.b.isEmpty())
      ExceptionInVPackage(); 
    return this.b.isEmpty() ? -1 : (this.b.size() - 1);
  }
  
  public void ExceptionInVPackage(ExceptionInVPackage parama, R paramR) {
    this.ExceptionInVPackage = paramR;
    paramR.h().ExceptionInVPackage(this);
  }
  
  public void e_() {
    try {
      k();
    } catch (Exception exception) {
      return;
    } 
    this.b.clear();
    if (this.ExceptionInVPackage != null) {
      this.ExceptionInVPackage.h().b(this);
      this.ExceptionInVPackage = null;
    } 
    this.c.clear();
    removeAll();
    AsInterfaceLima.ExceptionInVPackage().b();
  }
  
  public void ExceptionInVPackage(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    d();
  }
  
  public void d() {
    for (byte b = 0; b < getTabCount(); b++) {
      AeInterfaceEcho e1 = (AeInterfaceEcho)RInterfaceIndia().get(b + "");
      if (e1 != null) {
        boolean bool = e1.ExceptionInVPackage();
        if (isEnabledAt(b) != bool)
          setEnabledAt(b, bool); 
      } 
    } 
  }
  
  public void AeInterfaceEcho() {
    for (byte b = 0; b < getTabCount(); b++) {
      AeInterfaceEcho e1 = (AeInterfaceEcho)RInterfaceIndia().get(b + "");
      if (e1 != null) {
        boolean bool = e1.ExceptionInVPackage();
        if (bool) {
          setSelectedIndex(b);
          break;
        } 
      } 
    } 
  }
  
  public void ExceptionInVPackage(ExceptionInVPackage parama) {}
  
  protected Image JPanelExtensionInAiPackage() {
    if (this.JPanelExtensionInAiPackage == null)
      try {
        this.JPanelExtensionInAiPackage = cO.ExceptionInVPackage().ExceptionInVPackage(cO.w);
      } catch (ExceptionInVPackage a1) {
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      }  
    return this.JPanelExtensionInAiPackage;
  }
  
  public void ExceptionPrintstacktrace() {
    h();
    this.AeInterfaceEcho = new O(this);
    this.AeInterfaceEcho.start();
  }
  
  public void h() {
    if (this.AeInterfaceEcho != null) {
      this.AeInterfaceEcho.ExceptionInVPackage();
      this.AeInterfaceEcho = null;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/K.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */