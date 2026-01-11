package bt;

import G.aM;
import G.aR;
import G.bV;
import G.bj;
import G.bq;
import G.c;
import G.cq;
import G.da;
import G.db;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.T;
import bH.X;
import bH.p;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.fp;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.UIManager;
import s.ExceptionPrintstacktrace;

public class ArrayEditorPanel extends JPanel implements cq, h, bc {
  ArrayList ExceptionInVPackage = new ArrayList();
  
  ArrayList b = new ArrayList();
  
  Color c = UIManager.getColor("TextField.background");
  
  Color d = UIManager.getColor("TextField.foreground");
  
  Color e = Color.RED;
  
  Color f = Color.GREEN;
  
  G.R ExceptionPrintstacktrace;
  
  private int i = -1;
  
  private int j = -1;
  
  private ArrayList k = new ArrayList();
  
  bj h = null;
  
  public R(G.R paramR, bj parambj) {
    this.h = parambj;
    this.ExceptionPrintstacktrace = paramR;
    String str = (parambj.M() != null) ? parambj.M() : "";
    str = ExceptionPrintstacktrace.ExceptionInVPackage(str, str);
    if (str != null && !str.equals("")) {
      setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), str));
    } else if (str != null && str.equals(".")) {
      setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0)));
    } 
    aR aR = aR.ExceptionInVPackage();
    aM aM = paramR.c(parambj.b());
    if (aM != null && parambj.h()) {
      setLayout(new GridLayout(1, 0));
    } else {
      setLayout(new BoxLayout(this, 1));
    } 
    for (byte b = 0; b < aM.b(); b++) {
      bq bq = new bq();
      bq.ExceptionInVPackage(b);
      bq.u(parambj.c());
      bq.b(parambj.b());
      String str1 = parambj.ExceptionInVPackage();
      if (str1 != null) {
        str1 = ExceptionPrintstacktrace.b(str1);
        str1 = X.b(str1, "%INDEX%", (1 + b) + "");
        try {
          bq.b(da.ExceptionInVPackage().ExceptionInVPackage(paramR, str1));
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          bq.e(str1);
          Logger.getLogger(bh.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
        } 
      } else if (parambj.d() != null && (parambj.d()).length > b) {
        bq.b((db)new c(parambj.d()[b] + T.ExceptionInVPackage() + " "));
      } 
      if (parambj.f() == null) {
        this.c = UIManager.getColor("TextField.background");
      } else {
        this.c = new Color(parambj.f().b(), parambj.f().c(), parambj.f().d());
      } 
      aV aV = new aV(paramR, bq);
      aV.setBackground(this.c);
      aV.ExceptionInVPackage(new S(this, b));
      if (parambj.h())
        aV.b(10); 
      add(aV);
      this.b.add(aV);
      if (bq.b() != null && paramR.c(bq.b()) != null) {
        this.ExceptionInVPackage.add(bq.b());
        try {
          aR.ExceptionInVPackage(paramR.c(), bq.b(), aV);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          ExceptionInVPackage.printStackTrace();
          D.ExceptionInVPackage("Error subscribing to ParameterValue Changes. Parameter:" + bq.b(), (Exception)ExceptionInVPackage, this);
        } 
      } 
    } 
    Iterator<bV> iterator = parambj.ExceptionPrintstacktrace();
    while (iterator.hasNext())
      ExceptionInVPackage(iterator.next()); 
  }
  
  public void close() {
    for (aV aV : this.b) {
      FocusListener[] arrayOfFocusListener = aV.getFocusListeners();
      for (byte b1 = 0; b1 < arrayOfFocusListener.length; b1++)
        aV.removeFocusListener(arrayOfFocusListener[b1]); 
    } 
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < getComponentCount(); b++) {
      if (arrayOfComponent[b] instanceof bc)
        ((bc)arrayOfComponent[b]).close(); 
    } 
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {}
  
  private void c() {
    for (byte b = 0; b < this.b.size(); b++) {
      if (b == this.j && this.c.equals(this.f)) {
        ((aV)this.b.get(b)).setBackground(Color.YELLOW);
        ((aV)this.b.get(b)).setForeground(Color.BLACK);
      } else if (b == this.j && b == this.i) {
        ((aV)this.b.get(b)).setBackground(ExceptionInVPackage(this.f, this.e));
        ((aV)this.b.get(b)).setForeground(Color.BLACK);
      } else if (b == this.j) {
        ((aV)this.b.get(b)).setBackground(this.f);
        ((aV)this.b.get(b)).setForeground(Color.BLACK);
      } else if (b == this.i && this.c.equals(this.e)) {
        ((aV)this.b.get(b)).setBackground(Color.MAGENTA);
        ((aV)this.b.get(b)).setForeground(Color.BLACK);
      } else if (b == this.i) {
        ((aV)this.b.get(b)).setBackground(this.e);
        ((aV)this.b.get(b)).setForeground(Color.BLACK);
      } else {
        Color color2;
        Color color1 = this.c;
        ((aV)this.b.get(b)).setBackground(color1);
        if (color1.getRed() + color1.getBlue() + color1.getGreen() > 250) {
          color2 = Color.BLACK;
        } else {
          color2 = Color.WHITE;
        } 
        ((aV)this.b.get(b)).setForeground(color2);
      } 
    } 
  }
  
  private Color ExceptionInVPackage(Color paramColor1, Color paramColor2) {
    int i = 2 * (paramColor1.getRed() + paramColor2.getRed()) / 3;
    int j = 2 * (paramColor1.getGreen() + paramColor2.getGreen()) / 3;
    int k = 2 * (paramColor1.getBlue() + paramColor2.getBlue()) / 3;
    i = (i <= 255) ? i : 255;
    j = (j <= 255) ? j : 255;
    k = (k <= 255) ? k : 255;
    return new Color(i, j, k);
  }
  
  private void c(int paramInt) {
    d(paramInt);
  }
  
  public void ExceptionInVPackage(bV parambV) {
    this.k.add(parambV);
  }
  
  private void d(int paramInt) {
    Iterator<bV> iterator = this.k.iterator();
    while (iterator.hasNext()) {
      try {
        ((bV)iterator.next()).ExceptionInVPackage(paramInt);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
  }
  
  public void ExceptionInVPackage(int paramInt) {
    this.j = paramInt;
    c();
  }
  
  public void b(int paramInt) {
    this.i = paramInt;
    c();
  }
  
  public JComponent b() {
    return (this.i >= 0 && this.i < getComponentCount()) ? (JComponent)getComponent(this.i) : null;
  }
  
  public void ExceptionInVPackage() {
    if (this.h != null)
      try {
        boolean bool = p.ExceptionInVPackage(this.h.c(), this.ExceptionPrintstacktrace);
        fp.ExceptionInVPackage(this, bool);
      } catch (Exception exception) {
        D.ExceptionInVPackage(exception.getMessage());
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */