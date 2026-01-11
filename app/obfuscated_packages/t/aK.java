package t;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.f;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import s.g;

public class aK extends a implements f {
  JTextField a;
  
  JTextField b;
  
  JPanel c = new JPanel();
  
  public aK(Window paramWindow, ai paramai) {
    super(paramWindow, g.b("Gauge Text"));
    a(paramai);
    aN aN = new aN(this);
    this.c.setLayout(new GridLayout(0, 1, eJ.a(1), eJ.a(3)));
    String str = g.b("Gauge Text");
    this.c.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), str));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(2, 2));
    JLabel jLabel = new JLabel(g.b("Gauge Title"));
    jLabel.setMinimumSize(new Dimension(eJ.a(80), eJ.a(18)));
    jLabel.setPreferredSize(new Dimension(eJ.a(80), eJ.a(18)));
    jLabel.setHorizontalAlignment(4);
    jPanel.add("West", jLabel);
    this.a = new JTextField("", 23);
    this.a.addFocusListener(aN);
    this.a.addKeyListener(new aL(this));
    jPanel.add("Center", this.a);
    this.c.add(jPanel);
    jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(2, 2));
    jLabel = new JLabel(g.b("Gauge Units"));
    jLabel.setMinimumSize(eJ.a(80, 18));
    jLabel.setPreferredSize(eJ.a(80, 18));
    jLabel.setHorizontalAlignment(4);
    jPanel.add("West", jLabel);
    this.b = new JTextField("", 23);
    this.b.addFocusListener(aN);
    this.b.addKeyListener(new aM(this));
    jPanel.add("Center", this.b);
    this.c.add(jPanel);
    add("Center", this.c);
  }
  
  public void e(ArrayList paramArrayList) {
    Gauge gauge = b(paramArrayList);
    if (gauge != null) {
      fp.a(a(), true);
      this.a.setText(gauge.getTitle().toString());
      this.b.setText(gauge.getUnits().toString());
      this.a.setForeground(UIManager.getColor("Label.foreground"));
      this.b.setForeground(UIManager.getColor("Label.foreground"));
      for (s s : paramArrayList) {
        if (s instanceof Gauge && !((Gauge)s).getTitle().equals(gauge.getTitle())) {
          this.a.setForeground(Color.GRAY);
          break;
        } 
      } 
      for (s s : paramArrayList) {
        if (s instanceof Gauge && !((Gauge)s).getUnits().equals(gauge.getUnits())) {
          this.b.setForeground(Color.GRAY);
          break;
        } 
      } 
    } else {
      fp.a(a(), false);
    } 
  }
  
  public void a(ArrayList paramArrayList) {
    e(paramArrayList);
  }
  
  public void setEnabled(boolean paramBoolean) {
    Component[] arrayOfComponent = this.c.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++)
      arrayOfComponent[b].setEnabled(paramBoolean); 
    this.c.setEnabled(paramBoolean);
  }
  
  public JPanel a() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */