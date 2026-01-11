package be;

import G.Q;
import G.R;
import G.aH;
import G.ac;
import G.ah;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.J;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import r.RInterfaceIndia;
import s.ExceptionPrintstacktrace;

public class BeComponentSierra extends JPanel {
  c ExceptionInVPackage = null;
  
  j b = null;
  
  y c = null;
  
  R d = null;
  
  v e = new v(this);
  
  private B h = null;
  
  JPanel f = new JPanel();
  
  JPanel ExceptionPrintstacktrace;
  
  public BeComponentSierra() {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.f.setLayout(new GridLayout(1, 1));
    jPanel.add(this.f, "Center");
    this.ExceptionPrintstacktrace = new JPanel();
    this.ExceptionPrintstacktrace.setLayout(new FlowLayout(1));
    JButton jButton1 = new JButton(ExceptionPrintstacktrace.b("Ok"));
    jButton1.addActionListener(new t(this));
    JButton jButton2 = new JButton(ExceptionPrintstacktrace.b("Cancel"));
    jButton2.addActionListener(new u(this));
    if (J.ExceptionInVPackage()) {
      this.ExceptionPrintstacktrace.add(jButton1);
      this.ExceptionPrintstacktrace.add(jButton2);
    } else {
      this.ExceptionPrintstacktrace.add(jButton1);
      this.ExceptionPrintstacktrace.add(jButton2);
    } 
    jPanel.add(this.ExceptionPrintstacktrace, "South");
    setLayout(new FlowLayout(1));
    add(jPanel);
  }
  
  private void ExceptionInVPackage() {
    if (d() instanceof c) {
      c c1 = (c)d();
      if (c1.ExceptionInVPackage()) {
        try {
          aH aH = this.d.ExceptionPrintstacktrace(c1.b().aL());
          if (aH != null && !aH.aN() && !bV.ExceptionInVPackage(ExceptionPrintstacktrace.b("There is an existing OuputChannel in the main config by that name.") + "\n" + ExceptionPrintstacktrace.b("Are you sure you want to over-ride that channel?"), this, true))
            return; 
          this.h.ExceptionInVPackage(c1.b());
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          bV.d(ExceptionPrintstacktrace.getMessage(), this);
          Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
          return;
        } 
      } else {
        return;
      } 
    } else if (d() instanceof j) {
      j j1 = (j)d();
      ExceptionPrintstacktrace ExceptionPrintstacktrace = j1.d;
      R r = ExceptionPrintstacktrace.b();
      if (r.ExceptionInVPackage()) {
        try {
          this.h.ExceptionInVPackage((Q)ExceptionPrintstacktrace.ExceptionInVPackage());
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
          bV.d(ExceptionPrintstacktrace.b(ExceptionInVPackage.getLocalizedMessage()), this);
          return;
        } 
      } else {
        bV.d(ExceptionPrintstacktrace.b(r.d()), this);
        return;
      } 
    } else if (d() instanceof y) {
      y y1 = (y)d();
      R r = y1.b();
      if (r.ExceptionInVPackage()) {
        try {
          this.h.ExceptionInVPackage((Q)y1.ExceptionInVPackage());
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
          bV.d(ExceptionPrintstacktrace.b(ExceptionInVPackage.getLocalizedMessage()), this);
          return;
        } 
      } else {
        bV.d(ExceptionPrintstacktrace.b(r.d()), this);
        return;
      } 
    } 
    this.f.removeAll();
    fp.ExceptionInVPackage(this.ExceptionPrintstacktrace, false);
    validate();
  }
  
  private void b() {
    this.f.removeAll();
    fp.ExceptionInVPackage(this.ExceptionPrintstacktrace, false);
    validate();
  }
  
  public void ExceptionInVPackage(Q paramQ) {
    if (c()) {
      Component component = d();
      if ((!(component instanceof o) || ((o)component).c()) && bV.ExceptionInVPackage(ExceptionPrintstacktrace.b("Would you like to save the current settings?"), this, true)) {
        ExceptionInVPackage();
      } else {
        b();
      } 
    } 
    if (paramQ instanceof aH) {
      this.f.add(f());
      f().ExceptionInVPackage((aH)paramQ);
    } else if (paramQ instanceof ah) {
      this.f.add(ExceptionPrintstacktrace());
      ExceptionPrintstacktrace().ExceptionInVPackage((ah)paramQ);
    } else if (paramQ instanceof ac) {
      this.f.add(e());
      e().ExceptionInVPackage((ac)paramQ);
      e().ExceptionInVPackage((((ac)paramQ).ExceptionInVPackage() == null));
    } 
    fp.ExceptionInVPackage(this.ExceptionPrintstacktrace, (this.f.getComponentCount() > 0));
    this.f.doLayout();
    doLayout();
    validate();
  }
  
  private boolean c() {
    return (this.f.getComponentCount() > 0);
  }
  
  private Component d() {
    return (this.f.getComponentCount() > 0) ? this.f.getComponent(0) : null;
  }
  
  private j e() {
    if (this.b == null)
      this.b = new j(this.d); 
    return this.b;
  }
  
  private c f() {
    if (this.ExceptionInVPackage == null)
      this.ExceptionInVPackage = new c(this.d); 
    return this.ExceptionInVPackage;
  }
  
  private y ExceptionPrintstacktrace() {
    if (this.c == null) {
      this.c = new y(this.d);
      if (!RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("09ggdslkmkgoiu"))
        fp.ExceptionInVPackage(this.c, false); 
    } 
    return this.c;
  }
  
  public void ExceptionInVPackage(R paramR) {
    this.d = paramR;
    if (this.ExceptionInVPackage != null)
      this.ExceptionInVPackage.ExceptionInVPackage(paramR); 
    if (this.b != null)
      this.b.ExceptionInVPackage(paramR); 
    if (this.c != null)
      this.c.ExceptionInVPackage(paramR); 
  }
  
  public void ExceptionInVPackage(B paramB) {
    if (paramB != null)
      paramB.b(this.e); 
    this.h = paramB;
    paramB.ExceptionInVPackage(this.e);
  }
  
  private void h() {
    ExceptionInVPackage(this.d);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */