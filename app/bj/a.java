package bj;

import G.R;
import G.bo;
import V.g;
import aG.e;
import bD.r;
import bH.p;
import bt.aV;
import bt.ca;
import bt.d;
import bt.h;
import com.efiAnalytics.remotefileaccess.RemoteFileAccess;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import s.g;

public class a extends d implements ca, h, bc {
  R a;
  
  bo b;
  
  e c = null;
  
  String d = null;
  
  Image e = null;
  
  JPanel f = null;
  
  public a(R paramR, bo parambo) {
    this.a = paramR;
    this.b = parambo;
    setLayout(new BorderLayout());
    this.f = new JPanel();
    this.f.setLayout(new BorderLayout());
    if (parambo == null)
      parambo = new bo(); 
    this.c = new e(paramR, parambo, aE.a.A().L());
    r r = new r((RemoteFileAccess)this.c, g.d());
    r.a(new b(this));
    r.b().a(450);
    this.f.add("Center", (Component)r);
    add("Center", this.f);
    r.a(true);
  }
  
  public void close() {
    this.c.a();
  }
  
  public void a() {
    if (this.b.aJ() != null && !this.b.aJ().isEmpty()) {
      boolean bool = true;
      try {
        bool = p.a(this.b.aJ(), this.a);
      } catch (g g) {
        Logger.getLogger(aV.class.getName()).log(Level.WARNING, "Failed to evaluate enable condition", (Throwable)g);
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
    if (this.b.aJ() != null && !this.b.aJ().isEmpty()) {
      boolean bool = true;
      try {
        bool = p.a(this.b.V(), this.a);
      } catch (g g) {
        Logger.getLogger(aV.class.getName()).log(Level.WARNING, "Failed to evaluate visible condition", (Throwable)g);
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bj/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */