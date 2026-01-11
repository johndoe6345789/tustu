package bt;

import G.R;
import G.ak;
import G.bt;
import G.cq;
import G.cu;
import V.a;
import V.g;
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

public class r extends bh implements ca, h, ac, bc {
  dD a = new dD(this);
  
  GridLayout b = new GridLayout(0, 1, eJ.a(3), eJ.a(4));
  
  List c = new ArrayList();
  
  R d;
  
  bt e;
  
  public r(R paramR, bt parambt) {
    this.d = paramR;
    this.e = parambt;
    a(paramR);
    setLayout(this.b);
    setBorder(BorderFactory.createEmptyBorder(eJ.a(2), eJ.a(2), eJ.a(1), eJ.a(2)));
  }
  
  public void a(int paramInt) {
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
  
  public void a(ak paramak) {
    boolean bool = true;
    try {
      bool = p.a(paramak.aJ(), b_());
    } catch (g g) {
      Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
    } 
    if (bool) {
      Indicator indicator = new Indicator();
      indicator.setEcuConfigurationName(this.d.c());
      indicator.setOutputChannel(paramak.f());
      indicator.setOnText(paramak.a().toString());
      indicator.setOnTextColor(new Color(paramak.i().a()));
      indicator.setOffTextColor(new Color(paramak.j().a()));
      indicator.setOnBackgroundColor(new Color(paramak.g().a()));
      indicator.setOffBackgroundColor(new Color(paramak.h().a()));
      indicator.setOffText(paramak.d().toString());
      indicator.setShortClickAction(paramak.l());
      indicator.setLongClickAction(paramak.m());
      this.c.add(indicator);
      try {
        indicator.subscribeToOutput();
      } catch (a a) {
        bV.d(a.getMessage(), this);
      } 
      add((Component)indicator);
      indicator.setDirty(true);
      indicator.repaint();
    } 
  }
  
  public void a(s params) {
    this.a.a();
  }
  
  public void close() {
    for (Indicator indicator : this.c)
      cu.a().a((cq)indicator); 
  }
  
  public Dimension getPreferredSize() {
    int i = 4 + eJ.a(29) * this.c.size() / this.b.getColumns();
    int j = 3 + eJ.a(116) * this.b.getColumns();
    return new Dimension(j, i);
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
  
  public void a() {
    if (this.e != null && this.e.aJ() != null && !this.e.aJ().equals("")) {
      boolean bool = true;
      try {
        bool = p.a(this.e.aJ(), b_());
      } catch (g g) {
        Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
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
        bool = p.a(this.e.V(), b_());
      } catch (g g) {
        Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */