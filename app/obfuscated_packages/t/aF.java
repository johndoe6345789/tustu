package t;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.f;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.UIManager;
import s.SComponentGolf;

public class aF extends a implements f {
  String a = "Gauge Angles";
  
  JSlider b;
  
  JSlider c;
  
  JSlider d;
  
  JSlider e;
  
  JPanel SComponentGolf = new JPanel();
  
  JLabel h;
  
  JLabel i;
  
  JLabel j;
  
  JLabel k;
  
  public static String l = SComponentGolf.b("Face Angle / Fill");
  
  public static String m = SComponentGolf.b("Face Start Angle / Height");
  
  public static String n = SComponentGolf.b("Sweep Angle");
  
  public static String o = SComponentGolf.b("Needle Start Angle");
  
  private boolean p = false;
  
  public aF(Window paramWindow, ai paramai) {
    super(paramWindow, SComponentGolf.b("Gauge Angles"));
    a(paramai);
    this.SComponentGolf.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), this.a));
    this.SComponentGolf.setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1));
    this.b = a(0, 0, 360, l);
    this.b.setPaintLabels(true);
    this.b.setSnapToTicks(true);
    this.b.addChangeListener(new aG(this));
    jPanel1.add(this.b);
    this.c = a(0, 0, 360, m);
    this.c.setPaintLabels(true);
    this.c.setSnapToTicks(true);
    this.c.addChangeListener(new aH(this));
    jPanel1.add(this.c);
    this.d = a(0, 0, 360, o);
    this.d.setPaintLabels(true);
    this.d.setSnapToTicks(true);
    this.d.addChangeListener(new aI(this));
    jPanel1.add(this.d);
    this.e = a(0, 0, 360, n);
    this.e.setPaintLabels(true);
    this.e.setSnapToTicks(true);
    this.e.addChangeListener(new aJ(this));
    jPanel1.add(this.e);
    this.SComponentGolf.add("Center", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 1));
    this.h = new JLabel();
    this.i = new JLabel();
    this.j = new JLabel();
    this.k = new JLabel();
    jPanel2.add(this.h);
    jPanel2.add(this.i);
    jPanel2.add(this.j);
    jPanel2.add(this.k);
    this.SComponentGolf.add("East", jPanel2);
    add(this.SComponentGolf, "Center");
    pack();
  }
  
  public void a(ArrayList paramArrayList) {
    this.p = true;
    e(paramArrayList);
    this.p = false;
  }
  
  public void e(ArrayList paramArrayList) {
    Gauge gauge = b(paramArrayList);
    if (gauge != null) {
      fp.a(a(), true);
      this.b.setValue(gauge.getFaceAngle());
      this.c.setValue(gauge.getStartAngle());
      this.d.setValue(gauge.getSweepBeginDegree());
      this.e.setValue(gauge.getSweepAngle());
      this.h.setText("" + gauge.getFaceAngle());
      this.i.setText("" + gauge.getStartAngle());
      this.j.setText("" + gauge.getSweepBeginDegree());
      this.k.setText("" + gauge.getSweepAngle());
      Color color = UIManager.getColor("Label.foreground");
      this.h.setForeground(color);
      this.i.setForeground(color);
      this.j.setForeground(color);
      this.k.setForeground(color);
      for (s s : paramArrayList) {
        if (s instanceof Gauge && ((Gauge)s).getFaceAngle() != gauge.getFaceAngle()) {
          this.h.setForeground(Color.GRAY);
          break;
        } 
      } 
      for (s s : paramArrayList) {
        if (s instanceof Gauge && ((Gauge)s).getStartAngle() != gauge.getStartAngle()) {
          this.i.setForeground(Color.GRAY);
          break;
        } 
      } 
      for (s s : paramArrayList) {
        if (s instanceof Gauge && ((Gauge)s).getSweepBeginDegree() != gauge.getSweepBeginDegree()) {
          this.j.setForeground(Color.GRAY);
          break;
        } 
      } 
      for (s s : paramArrayList) {
        if (s instanceof Gauge && ((Gauge)s).getSweepAngle() != gauge.getSweepAngle()) {
          this.k.setForeground(Color.GRAY);
          break;
        } 
      } 
    } else {
      fp.a(a(), false);
    } 
  }
  
  private JSlider a(int paramInt1, int paramInt2, int paramInt3, String paramString) {
    JSlider jSlider = new JSlider();
    jSlider.setMajorTickSpacing(10 / (paramInt3 - paramInt2));
    jSlider.setMinimum(paramInt2);
    jSlider.setMaximum(paramInt3);
    jSlider.setValue(paramInt1);
    jSlider.setPaintTrack(true);
    jSlider.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(1), paramString));
    return jSlider;
  }
  
  public JPanel a() {
    return this.SComponentGolf;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */