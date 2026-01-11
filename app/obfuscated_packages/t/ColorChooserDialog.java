package t;

import com.efiAnalytics.apps.ts.dashboard.DashLabel;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.Indicator;
import com.efiAnalytics.apps.ts.dashboard.f;
import com.efiAnalytics.ui.bd;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.et;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import r.a;
import s.g;

public class ColorChooserDialog extends a implements f {
  JPanel a = new JPanel();
  
  bd b = new bd();
  
  JRadioButton c;
  
  JRadioButton d;
  
  JRadioButton e;
  
  JRadioButton g;
  
  JRadioButton h;
  
  JRadioButton i;
  
  JRadioButton j;
  
  JRadioButton k;
  
  JRadioButton l;
  
  JRadioButton m;
  
  JRadioButton n;
  
  JRadioButton o;
  
  static String p = g.b("Border Color");
  
  static String q = g.b("Face Color");
  
  static String r = g.b("Font Color");
  
  static String s = g.b("Needle Color");
  
  static String t = g.b("Warning Color");
  
  static String u = g.b("Critical Color");
  
  static String v = g.b("On Background");
  
  static String w = g.b("On Text Color");
  
  static String x = g.b("Off Background");
  
  static String y = g.b("Off Text");
  
  static String z = g.b("Label Background");
  
  static String A = g.b("Label Text");
  
  ButtonGroup B = new ButtonGroup();
  
  ArrayList C = new ArrayList();
  
  ArrayList D = new ArrayList();
  
  ArrayList E = new ArrayList();
  
  ArrayList F = new ArrayList();
  
  String G = p;
  
  JDialog H = null;
  
  public d(Window paramWindow, ai paramai, String paramString) {
    super(paramWindow, paramString);
    a((et)new dQ((a.a()).an, "DashDesignerColorDialog"));
    a(paramai);
    setLayout(new BorderLayout());
    add(this.a, "Center");
    this.a.setLayout(new BorderLayout());
    this.a.add((Component)this.b, "Center");
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(3, 0));
    e e = new e(this);
    this.E.add(z);
    this.E.add(A);
    this.D.add(v);
    this.D.add(w);
    this.D.add(x);
    this.D.add(y);
    this.C.add(p);
    this.C.add(q);
    this.C.add(r);
    this.C.add(s);
    this.C.add(t);
    this.C.add(u);
    this.c = new JRadioButton(p);
    this.B.add(this.c);
    this.c.addActionListener(e);
    jPanel.add(this.c);
    this.d = new JRadioButton(q);
    this.B.add(this.d);
    this.d.addActionListener(e);
    jPanel.add(this.d);
    this.e = new JRadioButton(r);
    this.B.add(this.e);
    this.e.addActionListener(e);
    jPanel.add(this.e);
    this.g = new JRadioButton(s);
    this.B.add(this.g);
    this.g.addActionListener(e);
    jPanel.add(this.g);
    this.h = new JRadioButton(t);
    this.B.add(this.h);
    this.h.addActionListener(e);
    jPanel.add(this.h);
    this.i = new JRadioButton(u);
    this.B.add(this.i);
    this.i.addActionListener(e);
    jPanel.add(this.i);
    this.n = new JRadioButton(z);
    this.B.add(this.n);
    this.n.addActionListener(e);
    jPanel.add(this.n);
    this.o = new JRadioButton(A);
    this.B.add(this.o);
    this.o.addActionListener(e);
    jPanel.add(this.o);
    this.j = new JRadioButton(v);
    this.B.add(this.j);
    this.j.addActionListener(e);
    jPanel.add(this.j);
    this.k = new JRadioButton(w);
    this.B.add(this.k);
    this.k.addActionListener(e);
    jPanel.add(this.k);
    this.l = new JRadioButton(x);
    this.B.add(this.l);
    this.l.addActionListener(e);
    jPanel.add(this.l);
    this.m = new JRadioButton(y);
    this.B.add(this.m);
    this.m.addActionListener(e);
    jPanel.add(this.m);
    this.a.add(jPanel, "North");
    pack();
    this.G = b().b("selected", p);
    a(this.G);
  }
  
  public void a(String paramString) {
    Gauge gauge = b(this.F);
    Indicator indicator = c(this.F);
    DashLabel dashLabel = d(this.F);
    this.G = paramString;
    b().a("selected", paramString);
    if (paramString.equals(p)) {
      b().a("lastGaugeRadio", paramString);
      this.b.a(new j(this));
      if (gauge != null)
        this.b.a(gauge.getTrimColor()); 
    } else if (paramString.equals(q)) {
      b().a("lastGaugeRadio", paramString);
      this.b.a(new k(this));
      if (gauge != null)
        this.b.a(gauge.getBackColor()); 
    } else if (paramString.equals(r)) {
      b().a("lastGaugeRadio", paramString);
      this.b.a(new l(this));
      if (gauge != null)
        this.b.a(gauge.getFontColor()); 
    } else if (paramString.equals(s)) {
      b().a("lastGaugeRadio", paramString);
      this.b.a(new m(this));
      if (gauge != null)
        this.b.a(gauge.getNeedleColor()); 
    } else if (paramString.equals(t)) {
      b().a("lastGaugeRadio", paramString);
      this.b.a(new n(this));
      if (gauge != null)
        this.b.a(gauge.getWarnColor()); 
    } else if (paramString.equals(u)) {
      b().a("lastGaugeRadio", paramString);
      this.b.a(new o(this));
      if (gauge != null)
        this.b.a(gauge.getCriticalColor()); 
    } else if (paramString.equals(v)) {
      b().a("lastIndRadio", paramString);
      this.b.a(new p(this));
      if (indicator != null)
        this.b.a(indicator.getOnBackgroundColor()); 
    } else if (paramString.equals(w)) {
      b().a("lastIndRadio", paramString);
      this.b.a(new q(this));
      if (indicator != null)
        this.b.a(indicator.getOnTextColor()); 
    } else if (paramString.equals(x)) {
      b().a("lastIndRadio", paramString);
      this.b.a(new f(this));
      if (indicator != null)
        this.b.a(indicator.getOffBackgroundColor()); 
    } else if (paramString.equals(y)) {
      b().a("lastIndRadio", paramString);
      this.b.a(new g(this));
      if (indicator != null)
        this.b.a(indicator.getOffTextColor()); 
    } else if (paramString.equals(z)) {
      b().a("lastLabelRadio", paramString);
      this.b.a(new h(this));
      if (dashLabel != null)
        this.b.a(dashLabel.getBackgroundColor()); 
    } else if (paramString.equals(A)) {
      b().a("lastLabelRadio", paramString);
      this.b.a(new i(this));
      if (dashLabel != null)
        this.b.a(dashLabel.getTextColor()); 
    } 
    this.c.setEnabled((gauge != null));
    this.d.setEnabled((gauge != null));
    this.e.setEnabled((gauge != null));
    this.g.setEnabled((gauge != null));
    this.h.setEnabled((gauge != null));
    this.i.setEnabled((gauge != null));
    this.j.setEnabled((indicator != null));
    this.k.setEnabled((indicator != null));
    this.l.setEnabled((indicator != null));
    this.m.setEnabled((indicator != null));
    this.n.setEnabled((dashLabel != null));
    this.o.setEnabled((dashLabel != null));
    boolean bool = false;
    Enumeration<AbstractButton> enumeration = this.B.getElements();
    while (enumeration.hasMoreElements()) {
      JRadioButton jRadioButton = (JRadioButton)enumeration.nextElement();
      if (jRadioButton.isEnabled() && jRadioButton.getText().equals(paramString)) {
        jRadioButton.setSelected(true);
        bool = true;
        break;
      } 
    } 
    if (!bool) {
      enumeration = this.B.getElements();
      while (enumeration.hasMoreElements()) {
        JRadioButton jRadioButton = (JRadioButton)enumeration.nextElement();
        if (jRadioButton.isEnabled()) {
          jRadioButton.setSelected(true);
          break;
        } 
      } 
    } 
  }
  
  public void a(ArrayList paramArrayList) {
    String str = this.G;
    if (!paramArrayList.isEmpty())
      if (paramArrayList.get(0) instanceof Gauge) {
        if (!this.C.contains(str))
          str = b().b("lastGaugeRadio", p); 
      } else if (paramArrayList.get(0) instanceof Indicator) {
        if (!this.D.contains(str))
          str = b().b("lastIndRadio", v); 
      } else if (paramArrayList.get(0) instanceof DashLabel && !this.E.contains(str)) {
        str = b().b("lastLabelRadio", z);
      }  
    this.F.clear();
    this.F.addAll(paramArrayList);
    a(str);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */