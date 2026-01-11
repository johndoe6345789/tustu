package bt;

import G.R;
import G.bl;
import G.cu;
import G.i;
import G.m;
import G.q;
import V.g;
import bH.X;
import bH.p;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dF;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Window;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import s.g;

public class ak extends JPanel implements h, bc {
  R a = null;
  
  bl b = null;
  
  JButton c;
  
  am d;
  
  String e = null;
  
  boolean f = false;
  
  public ak(R paramR, bl parambl) {
    this.a = paramR;
    this.b = parambl;
    this.e = toString();
    setLayout(new FlowLayout(1));
    this.c = new JButton(g.b(parambl.l()));
    this.c.addActionListener(new al(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(4, 4));
    jPanel.add("Center", this.c);
    add(jPanel);
    String str = paramR.w(parambl.a());
    if (str != null && !str.isEmpty()) {
      this.c.setToolTipText(str);
      l l = new l(paramR, parambl.a());
      jPanel.add("East", l);
    } 
    if (parambl.aJ() != null && !parambl.aJ().trim().equals(""))
      try {
        i.b(this.e, paramR.c(), parambl.aJ());
      } catch (q q) {
        Logger.getLogger(ak.class.getName()).log(Level.SEVERE, (String)null, (Throwable)q);
      }  
  }
  
  private void b() {
    List<m> list = m.b(this.a.O(), this.b.a());
    m m = null;
    if (list.size() > 1) {
      m = m.a(this.a.O(), list);
    } else if (list.size() == 1) {
      m = list.get(0);
    } else {
      bV.d("Command " + this.b.a() + " not found in current configuration.", this);
      return;
    } 
    this.a.C().b(m);
    if (this.b.b(bl.d)) {
      String str = X.b(this.b.d(), "\\n", "\n");
      bV.d(str, this);
    } 
    if (this.b.b(bl.e)) {
      Window window = bV.b(this);
      if (window instanceof dF)
        ((dF)window).k(); 
      window.dispose();
    } 
  }
  
  public void a() {
    boolean bool = c();
    if (this.c.isEnabled() != bool)
      this.c.setEnabled(bool); 
  }
  
  private boolean c() {
    if (this.b.aJ() != null && this.b.aJ().trim().length() > 0)
      try {
        return p.a(this.b.aJ(), this.a);
      } catch (g g) {
        Logger.getLogger(ak.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      }  
    return true;
  }
  
  public void close() {
    if (!this.f) {
      if (this.d != null) {
        am.a(this.d);
        i.a(this.e, this.a.c(), this.b.aJ());
        cu.a().a(this.d);
      } 
      if ((this.b.c() & bl.b) != 0 && c()) {
        b();
      } else if ((this.b.c() & bl.c) != 0 && !c()) {
        b();
      } 
      this.f = true;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/ak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */