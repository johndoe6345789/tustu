package aV;

import A.f;
import A.g;
import A.r;
import G.l;
import ai.b;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.g;

public class a extends JPanel implements bc {
  JDialog a = null;
  
  aW.a b;
  
  JCheckBox c = new JCheckBox(g.b("GPS Enabled"));
  
  b d = new b();
  
  public a(aK.a parama) {
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("Center", this.c);
    JLabel jLabel = new JLabel();
    jLabel.setText("<html><font color=\"blue\"><u>" + g.b("More Information") + "</u></font>&nbsp;&nbsp;</html>");
    this.d.a(g.b("GPS Setup Help"));
    this.d.b("/help/gps.html");
    jLabel.addMouseListener(new b(this));
    jPanel.add("East", jLabel);
    add("North", jPanel);
    this.c.setSelected(x.a().c());
    this.c.addActionListener(new c(this));
    this.b = new aW.a(f.c(), (g)parama);
    add("Center", (Component)this.b);
    fp.a((Component)this.b, this.c.isSelected());
  }
  
  private void b() {
    try {
      x.a().d();
      if (x.a().b() != null && x.a().b().a() != null)
        this.b.a(x.a().b().a()); 
    } catch (l l) {
      bV.d(l.getLocalizedMessage(), this);
    } 
  }
  
  public void close() {
    if (this.a != null)
      this.a.dispose(); 
  }
  
  public boolean a() {
    if (this.c.isSelected()) {
      f f = this.b.b();
      if (f == null) {
        bV.d(g.b("Please Select a Connection Type"), this);
        return false;
      } 
      if (!this.b.c()) {
        bV.d(g.b("Please Correct the setting"), this);
        return false;
      } 
      boolean bool = (x.a().a(x.a) == null || !x.a().a(x.a).equals(f.h())) ? true : false;
      x.a().a(x.a, f.h());
      List list = f.l();
      for (r r : list) {
        if (r.a() != 5) {
          if (!bool && !x.a().a(x.a, r).equals(this.b.a(r.c())))
            bool = true; 
          x.a().a(x.a, r, this.b.a(r.c()));
        } 
      } 
      if (bool) {
        x.a().e();
        try {
          x.a().d();
        } catch (l l) {
          bV.d(l.getLocalizedMessage(), this);
          Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)l);
        } 
      } 
      return true;
    } 
    x.a().e();
    return true;
  }
  
  public void a(Component paramComponent) {
    this.a = new JDialog(bV.a(paramComponent), g.b("GPS Configuration"));
    this.a.add("Center", this);
    JButton jButton1 = new JButton(g.b("Cancel"));
    jButton1.addActionListener(new d(this));
    JButton jButton2 = new JButton(g.b("Accept"));
    jButton2.addActionListener(new e(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (bV.d()) {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    } else {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    } 
    this.a.add("South", jPanel);
    this.a.pack();
    bV.a(bV.a(paramComponent), this.a);
    this.a.setVisible(true);
    validate();
    this.a.pack();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aV/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */