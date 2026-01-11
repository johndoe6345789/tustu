package t;

import com.efiAnalytics.apps.ts.dashboard.f;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import s.g;

class bn extends a implements f {
  JSlider c = new JSlider();
  
  JPanel d = new JPanel();
  
  JLabel e = new JLabel();
  
  bn(Window paramWindow, String paramString) {
    super(paramWindow, g.b(paramString) + " " + g.b("Slider"));
    setLayout(new BorderLayout());
    add(this.d, "Center");
    this.d.setLayout(new BorderLayout());
    this.c.setPaintTrack(true);
    this.d.add("Center", this.c);
    this.d.setBorder(BorderFactory.createTitledBorder(paramString));
    this.d.add("East", this.e);
    this.c.addChangeListener(new bo(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    JButton jButton = new JButton(g.b("Close"));
    jButton.addActionListener(new bp(this));
    jPanel.add(jButton);
    pack();
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString) {
    this.c.setMajorTickSpacing(10 / (paramInt3 - paramInt2));
    this.c.setMinimum(paramInt2);
    this.c.setMaximum(paramInt3);
    this.c.setValue(paramInt1);
    this.e.setText("" + paramInt1);
    setTitle(paramString);
    this.c.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(1), paramString));
  }
  
  public void a(ChangeListener paramChangeListener) {
    this.c.addChangeListener(paramChangeListener);
  }
  
  public void a(ArrayList paramArrayList) {}
  
  public JPanel a() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/bn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */