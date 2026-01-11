package business.binary_transformers;

import G.R;
import G.SerializableImpl;
import G.GInterfaceAh;
import G.GComponentBq;
import G.GComponentBz;
import G.GComponentCq;
import G.ManagerUsingArrayList;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.p;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.ac;
import com.efiAnalytics.apps.ts.dashboard.renderers.BasicReadoutGaugePainter;
import com.efiAnalytics.apps.ts.dashboard.renderers.GaugePainter;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dD;
import com.efiAnalytics.ui.eJ;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class GaugeReadoutPanel extends bh implements ca, h, ac, bc {
  dD ExceptionInVPackage = new dD(this);
  
  GridLayout b = new GridLayout(0, 1, eJ.ExceptionInVPackage(3), eJ.ExceptionInVPackage(4));
  
  List c = new ArrayList();
  
  R d;
  
  GComponentBz e;
  
  public D(R paramR, GComponentBz parambz) {
    this.d = paramR;
    this.e = parambz;
    ExceptionInVPackage(paramR);
    setLayout(this.b);
    setBorder(BorderFactory.createEmptyBorder(eJ.ExceptionInVPackage(2), eJ.ExceptionInVPackage(2), eJ.ExceptionInVPackage(1), eJ.ExceptionInVPackage(2)));
  }
  
  public D(R paramR, GComponentBq parambq) {
    this.d = paramR;
    this.e = new GComponentBz();
    this.e.u(parambq.aJ());
    this.e.x(parambq.m());
    ExceptionInVPackage(paramR);
    setLayout(this.b);
    setBorder(BorderFactory.createEmptyBorder(eJ.ExceptionInVPackage(1), eJ.ExceptionInVPackage(1), eJ.ExceptionInVPackage(1), eJ.ExceptionInVPackage(1)));
    ExceptionInVPackage(1);
    SerializableImpl SerializableImpl = paramR.ExceptionPrintstacktrace(parambq.b());
    if (SerializableImpl == null)
      bH.D.ExceptionInVPackage("Invalid Channel Name!!!" + parambq.b()); 
    int i = (int)-Math.round(Math.log10(SerializableImpl.h()));
    ExceptionInVPackage(parambq.b(), i);
  }
  
  public void ExceptionInVPackage(int paramInt) {
    this.b.setColumns(paramInt);
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    if (!isEnabled()) {
      Color color = new Color(64, 64, 64, 100);
      paramGraphics.setColor(color);
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    } 
  }
  
  public void ExceptionInVPackage(GInterfaceAh paramah) {
    boolean bool = true;
    try {
      bool = p.ExceptionInVPackage(paramah.aJ(), b_());
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
    if (bool) {
      Gauge gauge = new Gauge();
      gauge.setEcuConfigurationName(this.d.c());
      gauge.setOutputChannel(paramah.i());
      try {
        gauge.setTitle(paramah.k().ExceptionInVPackage());
      } catch (Exception exception) {
        bH.D.b("Unable to get Title for Gauge Def.. " + paramah.i());
        gauge.setTitle(paramah.i());
      } 
      try {
        gauge.setUnits(paramah.j().ExceptionInVPackage());
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        bH.D.b("Unable to get Units for Gauge Def.. " + paramah.j() + "\nErr: " + ExceptionPrintstacktrace.getLocalizedMessage());
        gauge.setTitle(paramah.i());
      } 
      gauge.setMin(paramah.b());
      gauge.setMax(paramah.e());
      gauge.setLowCritical(paramah.o());
      gauge.setLowWarning(paramah.f());
      gauge.setHighCritical(paramah.h());
      gauge.setHighWarning(paramah.ExceptionPrintstacktrace());
      gauge.setValueDigitsVP(paramah.m());
      gauge.setShortClickAction(paramah.r());
      gauge.setLongClickAction(paramah.s());
      gauge.setBackColor(Color.black);
      gauge.setFontColor(Color.white);
      gauge.setWarnColor(Color.YELLOW.darker());
      gauge.setCriticalColor(Color.RED.darker());
      gauge.setGaugePainter((GaugePainter)new BasicReadoutGaugePainter());
      gauge.setBorderWidth(0);
      this.c.add(gauge);
      try {
        gauge.subscribeToOutput();
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        bV.d(ExceptionInVPackage.getMessage(), this);
      } 
      add((Component)gauge);
      gauge.setDirty(true);
      gauge.repaint();
    } 
  }
  
  protected void ExceptionInVPackage(String paramString, int paramInt) {
    boolean bool = true;
    try {
      bool = p.ExceptionInVPackage(this.e.V(), b_());
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
    if (bool) {
      Gauge gauge = new Gauge();
      gauge.setEcuConfigurationName(this.d.c());
      gauge.setOutputChannel(paramString);
      gauge.setTitle("");
      gauge.setUnits("");
      int i = -100000000;
      int j = 100000000;
      gauge.setMin(Integer.valueOf(i));
      gauge.setMax(Integer.valueOf(j));
      gauge.setLowCritical(Integer.valueOf(i));
      gauge.setLowWarning(Integer.valueOf(i));
      gauge.setHighCritical(Integer.valueOf(j));
      gauge.setHighWarning(Integer.valueOf(j));
      gauge.setValueDigits(Integer.valueOf(paramInt));
      gauge.setBackColor(Color.black);
      gauge.setFontColor(Color.white);
      gauge.setWarnColor(Color.YELLOW.darker());
      gauge.setCriticalColor(Color.RED.darker());
      gauge.setGaugePainter((GaugePainter)new BasicReadoutGaugePainter());
      gauge.setBorderWidth(0);
      gauge.setFontSizeAdjustment(6);
      this.c.add(gauge);
      try {
        gauge.subscribeToOutput();
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        bV.d(ExceptionInVPackage.getMessage(), this);
      } 
      add((Component)gauge);
      gauge.setDirty(true);
      gauge.repaint();
    } 
  }
  
  public void ExceptionInVPackage(s params) {
    this.ExceptionInVPackage.ExceptionInVPackage();
  }
  
  public void close() {
    for (Gauge gauge : this.c)
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage((GComponentCq)gauge); 
  }
  
  public Dimension getPreferredSize() {
    if (this.c.size() > 1) {
      int k = eJ.ExceptionInVPackage(38) * this.c.size() / this.b.getColumns();
      int m = eJ.ExceptionInVPackage(115) * this.b.getColumns();
      return new Dimension(m, k);
    } 
    int i = eJ.ExceptionInVPackage(28) * this.c.size() / this.b.getColumns();
    int j = eJ.ExceptionInVPackage(125) * this.b.getColumns();
    return new Dimension(j, i);
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
  
  public void ExceptionInVPackage() {
    if (this.e != null && this.e.aJ() != null && !this.e.aJ().equals("")) {
      boolean bool = true;
      try {
        bool = p.ExceptionInVPackage(this.e.aJ(), b_());
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      } 
      if (isEnabled() && !bool) {
        setEnabled(false);
        if (getParent() instanceof JPanel)
          ((JPanel)getParent()).revalidate(); 
      } else if (!isEnabled() && bool) {
        setEnabled(true);
        if (getParent() instanceof JPanel)
          ((JPanel)getParent()).revalidate(); 
      } 
    } 
  }
  
  public void b() {
    if (this.e != null && this.e.V() != null && !this.e.V().equals("")) {
      boolean bool = true;
      try {
        bool = p.ExceptionInVPackage(this.e.V(), b_());
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      } 
      if (isVisible() && !bool) {
        setVisible(false);
        if (getParent() instanceof JPanel)
          ((JPanel)getParent()).revalidate(); 
      } else if (!isVisible() && bool) {
        setVisible(true);
        if (getParent() instanceof JPanel)
          ((JPanel)getParent()).revalidate(); 
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */