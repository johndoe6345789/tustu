package GInterfaceBt;

import G.R;
import G.Exceptionprintstacktrace;
import G.GInterfaceBt;
import G.GComponentCq;
import G.ManagerUsingArrayList;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.p;
import com.efiAnalytics.apps.ts.dashboard.Indicator;
import com.efiAnalytics.apps.ts.dashboard.ac;
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

public class IndicatorReadoutPanel extends bh implements ca, RefreshableComponent, ac, bc {
  dD ExceptionInVPackage = new dD(this);
  
  GridLayout b = new GridLayout(0, 1, eJ.ExceptionInVPackage(3), eJ.ExceptionInVPackage(4));
  
  List c = new ArrayList();
  
  R d;
  
  GInterfaceBt e;
  
  public IndicatorReadoutPanel(R paramR, GInterfaceBt parambt) {
    this.d = paramR;
    this.e = parambt;
    ExceptionInVPackage(paramR);
    setLayout(this.b);
    setBorder(BorderFactory.createEmptyBorder(eJ.ExceptionInVPackage(2), eJ.ExceptionInVPackage(2), eJ.ExceptionInVPackage(1), eJ.ExceptionInVPackage(2)));
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
  
  public void ExceptionInVPackage(Exceptionprintstacktrace paramak) {
    boolean bool = true;
    try {
      bool = p.ExceptionInVPackage(paramak.aJ(), b_());
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
    if (bool) {
      Indicator indicator = new Indicator();
      indicator.setEcuConfigurationName(this.d.c());
      indicator.setOutputChannel(paramak.f());
      indicator.setOnText(paramak.ExceptionInVPackage().toString());
      indicator.setOnTextColor(new Color(paramak.i().ExceptionInVPackage()));
      indicator.setOffTextColor(new Color(paramak.j().ExceptionInVPackage()));
      indicator.setOnBackgroundColor(new Color(paramak.ExceptionPrintstacktrace().ExceptionInVPackage()));
      indicator.setOffBackgroundColor(new Color(paramak.h().ExceptionInVPackage()));
      indicator.setOffText(paramak.d().toString());
      indicator.setShortClickAction(paramak.l());
      indicator.setLongClickAction(paramak.m());
      this.c.add(indicator);
      try {
        indicator.subscribeToOutput();
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        bV.d(ExceptionInVPackage.getMessage(), this);
      } 
      add((Component)indicator);
      indicator.setDirty(true);
      indicator.repaint();
    } 
  }
  
  public void ExceptionInVPackage(s params) {
    this.ExceptionInVPackage.ExceptionInVPackage();
  }
  
  public void close() {
    for (Indicator indicator : this.c)
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage((GComponentCq)indicator); 
  }
  
  public Dimension getPreferredSize() {
    int i = 4 + eJ.ExceptionInVPackage(29) * this.c.size() / this.b.getColumns();
    int j = 3 + eJ.ExceptionInVPackage(116) * this.b.getColumns();
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/GInterfaceBt/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */