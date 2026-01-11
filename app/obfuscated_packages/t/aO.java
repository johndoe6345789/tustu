package t;

import bH.I;
import bH.X;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.f;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.do;
import com.efiAnalytics.ui.fp;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import s.g;

public class aO extends a implements f {
  JTextField a;
  
  JTextField b;
  
  JTextField c;
  
  JTextField d;
  
  JTextField e;
  
  JTextField g;
  
  do h;
  
  do i;
  
  JPanel j = new JPanel();
  
  String k = null;
  
  String l = null;
  
  String m = null;
  
  String n = null;
  
  String o = null;
  
  String p = null;
  
  public aO(Window paramWindow, ai paramai) {
    super(paramWindow, g.b("Gauge Values"));
    a(paramai);
    bd bd = new bd(this);
    this.j.setLayout(new GridLayout(0, 2));
    String str = g.b("Limits and Thresholds");
    this.j.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), str));
    JLabel jLabel = new JLabel(g.b("Current Value"));
    jLabel.setHorizontalAlignment(4);
    this.j.add(jLabel);
    this.h = new do();
    this.h.addFocusListener(bd);
    this.h.addKeyListener(new aP(this));
    this.j.add((Component)this.h);
    jLabel = new JLabel(g.b("Historical Peak Value"));
    jLabel.setHorizontalAlignment(4);
    this.j.add(jLabel);
    this.i = new do();
    this.i.addFocusListener(bd);
    this.i.addKeyListener(new aV(this));
    this.j.add((Component)this.i);
    jLabel = new JLabel(g.b("Minimum Value"));
    jLabel.setHorizontalAlignment(4);
    this.j.add(jLabel);
    this.a = new JTextField();
    this.a.setBorder(BorderFactory.createLoweredBevelBorder());
    this.a.addFocusListener(bd);
    this.a.addKeyListener(new aW(this));
    this.a.addFocusListener(new aX(this));
    this.j.add(this.a);
    jLabel = new JLabel(g.b("Maximum Value"));
    jLabel.setHorizontalAlignment(4);
    this.j.add(jLabel);
    this.b = new JTextField();
    this.b.setBorder(BorderFactory.createLoweredBevelBorder());
    this.b.addFocusListener(bd);
    this.b.addKeyListener(new aY(this));
    this.b.addFocusListener(new aZ(this));
    this.j.add(this.b);
    jLabel = new JLabel(g.b("Low Critical"));
    jLabel.setHorizontalAlignment(4);
    this.j.add(jLabel);
    this.d = new JTextField();
    this.d.setBorder(BorderFactory.createLoweredBevelBorder());
    this.d.addFocusListener(bd);
    this.d.addKeyListener(new ba(this));
    this.d.addFocusListener(new bb(this));
    this.j.add(this.d);
    jLabel = new JLabel(g.b("Low Warning"));
    jLabel.setHorizontalAlignment(4);
    this.j.add(jLabel);
    this.c = new JTextField();
    this.c.setBorder(BorderFactory.createLoweredBevelBorder());
    this.c.addFocusListener(bd);
    this.c.addKeyListener(new bc(this));
    this.c.addFocusListener(new aQ(this));
    this.j.add(this.c);
    jLabel = new JLabel(g.b("High Warning"));
    jLabel.setHorizontalAlignment(4);
    this.j.add(jLabel);
    this.e = new JTextField();
    this.e.setBorder(BorderFactory.createLoweredBevelBorder());
    this.e.addFocusListener(bd);
    this.e.addKeyListener(new aR(this));
    this.e.addFocusListener(new aS(this));
    this.j.add(this.e);
    jLabel = new JLabel(g.b("High Critical"));
    jLabel.setHorizontalAlignment(4);
    this.j.add(jLabel);
    this.g = new JTextField();
    this.g.setBorder(BorderFactory.createLoweredBevelBorder());
    this.g.addFocusListener(bd);
    this.g.addKeyListener(new aT(this));
    this.g.addFocusListener(new aU(this));
    this.j.add(this.g);
    add("Center", this.j);
  }
  
  private double a(String paramString) {
    Double double_ = I.a(paramString);
    return (double_ == null) ? 0.0D : double_.doubleValue();
  }
  
  public void e(ArrayList paramArrayList) {
    Gauge gauge = b(paramArrayList);
    if (gauge != null) {
      fp.a(a(), true);
      this.k = gauge.getMinVP().toString();
      this.l = gauge.getMaxVP().toString();
      this.m = gauge.getLowCriticalVP().toString();
      this.n = gauge.getLowWarningVP().toString();
      this.o = gauge.getHighWarningVP().toString();
      this.p = gauge.getHighCriticalVP().toString();
      this.h.setText(X.b(gauge.getValue(), gauge.getLabelDigits()));
      this.a.setText(gauge.getMinVP().toString());
      this.b.setText(gauge.getMaxVP().toString());
      this.c.setText(gauge.getLowWarningVP().toString());
      this.d.setText(gauge.getLowCriticalVP().toString());
      this.e.setText(gauge.getHighWarningVP().toString());
      this.g.setText(gauge.getHighCriticalVP().toString());
      this.i.setText(X.b(gauge.getHistoricalPeakValue(), gauge.getLabelDigits()));
      this.h.setForeground(UIManager.getColor("Label.foreground"));
      this.a.setForeground(UIManager.getColor("Label.foreground"));
      this.b.setForeground(UIManager.getColor("Label.foreground"));
      this.c.setForeground(UIManager.getColor("Label.foreground"));
      this.d.setForeground(UIManager.getColor("Label.foreground"));
      this.e.setForeground(UIManager.getColor("Label.foreground"));
      this.g.setForeground(UIManager.getColor("Label.foreground"));
      this.i.setForeground(UIManager.getColor("Label.foreground"));
      for (s s : paramArrayList) {
        if (s instanceof Gauge && ((Gauge)s).getValue() != gauge.getValue()) {
          this.h.setForeground(Color.GRAY);
          break;
        } 
      } 
      for (s s : paramArrayList) {
        if (s instanceof Gauge && !((Gauge)s).getMinVP().toString().equals(gauge.getMinVP().toString())) {
          this.a.setForeground(Color.GRAY);
          break;
        } 
      } 
      for (s s : paramArrayList) {
        if (s instanceof Gauge && !((Gauge)s).getMaxVP().toString().equals(gauge.getMaxVP().toString())) {
          this.b.setForeground(Color.GRAY);
          break;
        } 
      } 
      for (s s : paramArrayList) {
        if (s instanceof Gauge && !((Gauge)s).getLowWarningVP().toString().equals(gauge.getLowWarningVP().toString())) {
          this.c.setForeground(Color.GRAY);
          break;
        } 
      } 
      for (s s : paramArrayList) {
        if (s instanceof Gauge && !((Gauge)s).getLowCriticalVP().toString().equals(gauge.getLowCriticalVP().toString())) {
          this.d.setForeground(Color.GRAY);
          break;
        } 
      } 
      for (s s : paramArrayList) {
        if (s instanceof Gauge && !((Gauge)s).getHighWarningVP().toString().equals(gauge.getHighWarningVP().toString())) {
          this.e.setForeground(Color.GRAY);
          break;
        } 
      } 
      for (s s : paramArrayList) {
        if (s instanceof Gauge && !((Gauge)s).getHighCriticalVP().toString().equals(gauge.getHighCriticalVP().toString())) {
          this.g.setForeground(Color.GRAY);
          break;
        } 
      } 
      for (s s : paramArrayList) {
        if (s instanceof Gauge && ((Gauge)s).getHistoricalPeakValue() != gauge.getHistoricalPeakValue()) {
          this.i.setForeground(Color.GRAY);
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
  
  public JPanel a() {
    return this.j;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */