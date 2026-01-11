package bt;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import G.be;
import G.RInterfaceIndia;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.J;
import bH.X;
import bH.p;
import c.CInterfaceDelta;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.fF;
import com.efiAnalytics.ui.fa;
import com.efiAnalytics.ui.p;
import com.efiAnalytics.ui.s;
import com.efiAnalytics.ui.w;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import r.ExceptionInVPackage;
import r.RInterfaceIndia;
import s.ExceptionPrintstacktrace;

public class bu extends JPanel implements aN, L, h, CInterfaceDelta, bc, p, TableModelListener {
  R ExceptionInVPackage = null;
  
  aM b = null;
  
  aM c = null;
  
  aM CInterfaceDelta = null;
  
  fF e = null;
  
  w f = null;
  
  JLabel ExceptionPrintstacktrace = null;
  
  be h = null;
  
  private String l = null;
  
  bP RInterfaceIndia = null;
  
  List j = new ArrayList();
  
  private static double m = 100.0D;
  
  fa k = new bv(this);
  
  public bu(R paramR, be parambe) {
    this(paramR, parambe, true);
  }
  
  public bu(R paramR, be parambe, boolean paramBoolean) {
    this.ExceptionInVPackage = paramR;
    this.h = parambe;
    this.l = parambe.aJ();
    setLayout(new BorderLayout());
    this.f = new w();
    this.f.setName(parambe.aL());
    this.f.h().e(x.ExceptionInVPackage());
    setName(parambe.aL());
    this.f.ExceptionInVPackage(new bw(this));
    this.b = paramR.c(parambe.c());
    this.c = paramR.c(parambe.b());
    this.CInterfaceDelta = paramR.c(parambe.ExceptionInVPackage());
    try {
      RInterfaceIndia.ExceptionInVPackage(paramR.c(), this.c, this);
      RInterfaceIndia.ExceptionInVPackage(paramR.c(), this.b, this);
      RInterfaceIndia.ExceptionInVPackage(paramR.c(), this.c.q(), this);
      RInterfaceIndia.ExceptionInVPackage(paramR.c(), this.CInterfaceDelta.F(), this);
      if (parambe.p() != null)
        RInterfaceIndia.ExceptionInVPackage(paramR.c(), parambe.p(), this); 
      if (parambe.q() != null)
        RInterfaceIndia.ExceptionInVPackage(paramR.c(), parambe.q(), this); 
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(bu.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
    } 
    s s = null;
    try {
      if (paramBoolean) {
        s = bQ.ExceptionInVPackage().ExceptionInVPackage(paramR, parambe.aL(), parambe.l(), parambe.aL());
      } else {
        s = bQ.ExceptionInVPackage().b(paramR, parambe.aL());
      } 
      s.addTableModelListener(this);
      s.ExceptionInVPackage(this.k);
      this.f.h().ExceptionInVPackage(this.b.v());
      this.f.b(this.c.v());
      this.f.ExceptionInVPackage(this.CInterfaceDelta.v());
      int RInterfaceIndia = ExceptionInVPackage(this.c);
      this.f.h().c((RInterfaceIndia <= 3 && this.CInterfaceDelta.v() < 1 && ExceptionInVPackage(this.b) <= 3 && J.ExceptionInVPackage()));
      this.f.ExceptionInVPackage(s);
      this.f.h().f(this.b.B());
      if (parambe.RInterfaceIndia() > 0) {
        this.f.c(parambe.RInterfaceIndia());
        this.f.ExceptionInVPackage(false);
      } else {
        int j = this.f.getFont().getSize() + ExceptionInVPackage.ExceptionInVPackage().p();
        int k = ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage(ExceptionInVPackage.aH, j);
        this.f.c(k);
      } 
      this.f.ExceptionInVPackage(this);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Unable to load table. See log for details.", (Exception)ExceptionPrintstacktrace, this);
    } 
    String[] arrayOfString = this.b.Q();
    if (arrayOfString.length == 1 || arrayOfString.length == 2) {
      bY bY = new bY(paramR, parambe, s);
      this.f.ExceptionInVPackage(bY);
    } 
    this.f.h().addFocusListener(new bx(this));
    add("Center", (Component)this.f);
    this.ExceptionPrintstacktrace = new JLabel();
    this.ExceptionPrintstacktrace.setHorizontalAlignment(0);
    add("South", this.ExceptionPrintstacktrace);
    this.e = new fF();
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    if (parambe.c() != null) {
      jPanel2.setLayout(new GridLayout(2, 1));
      ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage(paramR, parambe.c());
      jPanel2.add(ExceptionInVPackage);
      l l = new l(paramR, parambe.c());
      jPanel2.add(l);
      jPanel1.add("North", jPanel2);
    } 
    jPanel1.add("Center", (Component)this.e);
    add("West", jPanel1);
    if (s.w() != null) {
      String str;
      if (parambe.p() == null) {
        str = ExceptionPrintstacktrace.b(s.w());
      } else {
        try {
          str = ExceptionPrintstacktrace.b(parambe.p().ExceptionInVPackage());
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(bu.class.getName()).log(Level.WARNING, "Failed to resolve X Axis Label", (Throwable)ExceptionPrintstacktrace);
          str = ExceptionPrintstacktrace.b(s.w());
        } 
      } 
      this.ExceptionPrintstacktrace.setText(str);
    } 
    if (s.v() != null) {
      String str;
      if (parambe.q() == null) {
        str = ExceptionPrintstacktrace.b(s.v());
      } else {
        try {
          str = ExceptionPrintstacktrace.b(parambe.q().ExceptionInVPackage());
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(bu.class.getName()).log(Level.WARNING, "Unable to resolve Y Axis Label", (Throwable)ExceptionPrintstacktrace);
          str = ExceptionPrintstacktrace.b(s.v());
        } 
      } 
      if (this.c.p() != null && !this.c.p().equals("")) {
        String str1;
        if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("645fds645fds  fdsd098532#@") && ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.cc, ExceptionInVPackage.cd) && this.c.p().toLowerCase().equals("kpa")) {
          str1 = "PSI";
        } else {
          str1 = this.c.p();
        } 
        str = str + " " + ExceptionPrintstacktrace.b(str1);
      } 
      this.e.setText(ExceptionPrintstacktrace.b(str));
    } 
    if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("reoirew rew oiurew")) {
      this.f.c(true);
    } else {
      this.f.c(true);
    } 
    if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("jheoibnw747d mds 982"))
      this.f.c(); 
    this.f.ExceptionInVPackage(new bA(this));
    this.f.ExceptionInVPackage(new bz(this));
    if (parambe.m() || parambe.o())
      this.f.b(false); 
    c();
    ExceptionInVPackage(paramR, this.c);
  }
  
  private void ExceptionInVPackage(R paramR, aM paramaM) {
    if (paramaM.p() != null && paramaM.p().equalsIgnoreCase("kpa")) {
      try {
        double[] arrayOfDouble = paramaM.h(paramR.h());
        for (byte b = 0; b < arrayOfDouble.length; b++) {
          double d1 = arrayOfDouble[arrayOfDouble.length - 1 - b];
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("<html>");
          stringBuilder.append(X.b(d1, paramaM.v())).append(" kPa:<br>");
          stringBuilder.append(X.b(d1 * 0.145038D, 2)).append(" ").append(ExceptionPrintstacktrace.b("PSI Absolute")).append("<br>");
          stringBuilder.append(X.b((d1 - m) * 0.145038D, 2)).append(" ").append(ExceptionPrintstacktrace.b("PSI Relative to " + m + " kPa")).append("<br>");
          stringBuilder.append(X.b((d1 - m) * 0.29538D, 2)).append(" ").append(ExceptionPrintstacktrace.b("inHg Relative to " + m + " kPa")).append("<br>");
          this.f.ExceptionInVPackage(stringBuilder.toString(), b);
        } 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(bu.class.getName()).log(Level.WARNING, "Failed to set Y Axis tooltips", (Throwable)ExceptionPrintstacktrace);
      } 
      by by = new by(this);
      SwingUtilities.invokeLater(by);
    } else {
      this.f.o();
      this.f.CInterfaceDelta(false);
    } 
  }
  
  private int ExceptionInVPackage(aM paramaM) {
    return (int)Math.log10(paramaM.s()) + paramaM.v();
  }
  
  public void c() {
    if (this.RInterfaceIndia == null) {
      this.RInterfaceIndia = new H(this.ExceptionInVPackage, this.h, this.f);
    } else {
      this.RInterfaceIndia.b();
    } 
    this.RInterfaceIndia.ExceptionInVPackage();
  }
  
  public void e() {
    if (this.RInterfaceIndia != null)
      this.RInterfaceIndia.b(); 
  }
  
  public void ExceptionInVPackage(bP parambP) {
    e();
    this.RInterfaceIndia = parambP;
  }
  
  public boolean requestFocusInWindow() {
    return this.f.requestFocusInWindow();
  }
  
  public void ExceptionInVPackage(int paramInt, String paramString1, String paramString2) {}
  
  public void b(int paramInt, String paramString1, String paramString2) {}
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    s s = (s)paramTableModelEvent.getSource();
    if (paramTableModelEvent.getFirstRow() != -1 && paramTableModelEvent.getColumn() != -1)
      try {
        this.f.repaint();
      } catch (Exception exception) {
        exception.printStackTrace();
        bV.CInterfaceDelta("Error updating table:\n" + exception.getMessage() + "\nSee log for more detail.", this);
      }  
  }
  
  public void ExceptionInVPackage(double paramDouble1, double paramDouble2) {
    this.f.h().ExceptionInVPackage(Double.toString(paramDouble1), Double.toString(paramDouble2));
  }
  
  public void ExceptionInVPackage(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    this.f.h().ExceptionInVPackage(paramArrayOffloat1, paramArrayOffloat2);
  }
  
  public int f() {
    return this.f.h().J();
  }
  
  public void close() {
    e();
    this.f.ExceptionPrintstacktrace().removeTableModelListener(this);
    aR.ExceptionInVPackage().ExceptionInVPackage(this);
    this.f.ExceptionPrintstacktrace().b(this.k);
  }
  
  public void ExceptionInVPackage(Double[][] paramArrayOfDouble) {
    this.f.ExceptionPrintstacktrace().ExceptionInVPackage(paramArrayOfDouble);
  }
  
  public Double[][] ExceptionPrintstacktrace() {
    return this.f.ExceptionPrintstacktrace().s();
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    this.f.b(this.c.v());
    this.f.h().ExceptionInVPackage(this.b.v());
    this.f.h().b(this.CInterfaceDelta.v());
    if (this.f.ExceptionPrintstacktrace().v() != null) {
      String str;
      if (this.h.q() == null) {
        str = ExceptionPrintstacktrace.b(this.f.ExceptionPrintstacktrace().v());
      } else {
        try {
          str = ExceptionPrintstacktrace.b(this.h.q().ExceptionInVPackage());
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(bu.class.getName()).log(Level.WARNING, "Unable to resolve Y Axis Label", (Throwable)ExceptionPrintstacktrace);
          str = ExceptionPrintstacktrace.b(this.f.ExceptionPrintstacktrace().v());
        } 
      } 
      if (this.c.p() != null && !this.c.p().equals(""))
        str = str + " " + ExceptionPrintstacktrace.b(this.c.p()); 
      this.e.setText(ExceptionPrintstacktrace.b(str));
      this.e.repaint();
    } 
    if (this.f.ExceptionPrintstacktrace().w() != null) {
      String str;
      if (this.h.p() == null) {
        str = ExceptionPrintstacktrace.b(this.f.ExceptionPrintstacktrace().w());
      } else {
        try {
          str = ExceptionPrintstacktrace.b(this.h.p().ExceptionInVPackage());
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(bu.class.getName()).log(Level.WARNING, "Failed to resolve X Axis Label", (Throwable)ExceptionPrintstacktrace);
          str = ExceptionPrintstacktrace.b(this.f.ExceptionPrintstacktrace().w());
        } 
      } 
      this.ExceptionPrintstacktrace.setText(str);
    } 
    if (this.c.aL().equals(paramString2))
      ExceptionInVPackage(this.ExceptionInVPackage, this.c); 
  }
  
  public void ExceptionInVPackage() {
    if (a_() != null) {
      boolean bool = true;
      try {
        bool = p.ExceptionInVPackage(a_(), this.ExceptionInVPackage);
        setEnabled(bool);
      } catch (Exception exception) {
        D.ExceptionInVPackage(exception.getMessage());
        exception.printStackTrace();
      } 
    } 
  }
  
  public String a_() {
    return this.l;
  }
  
  public void c_(String paramString) {
    this.l = paramString;
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.ExceptionPrintstacktrace.setEnabled(paramBoolean);
    this.e.setEnabled(paramBoolean);
    this.f.setEnabled(paramBoolean);
  }
  
  public boolean isOptimizedDrawingEnabled() {
    return false;
  }
  
  public R b_() {
    return this.ExceptionInVPackage;
  }
  
  public void ExceptionInVPackage(K paramK) {
    this.j.add(paramK);
  }
  
  public void b(K paramK) {
    this.j.remove(paramK);
  }
  
  public String CInterfaceDelta() {
    return this.b.aL();
  }
  
  private void b(String paramString) {
    for (K k : this.j)
      k.b(paramString); 
  }
  
  private void c(String paramString) {
    for (K k : this.j)
      k.ExceptionInVPackage(paramString); 
  }
  
  public static void ExceptionInVPackage(double paramDouble) {
    m = paramDouble;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */