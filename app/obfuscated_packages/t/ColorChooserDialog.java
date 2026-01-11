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
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

public class ColorChooserDialog extends IOPropertiesUsingFile implements f {
  JPanel IOPropertiesUsingFile = new JPanel();
  
  bd b = new bd();
  
  JRadioButton c;
  
  JRadioButton d;
  
  JRadioButton e;
  
  JRadioButton SComponentGolf;
  
  JRadioButton h;
  
  JRadioButton i;
  
  JRadioButton j;
  
  JRadioButton k;
  
  JRadioButton l;
  
  JRadioButton m;
  
  JRadioButton n;
  
  JRadioButton o;
  
  static String p = SComponentGolf.b("Border Color");
  
  static String q = SComponentGolf.b("Face Color");
  
  static String r = SComponentGolf.b("Font Color");
  
  static String s = SComponentGolf.b("Needle Color");
  
  static String t = SComponentGolf.b("Warning Color");
  
  static String u = SComponentGolf.b("Critical Color");
  
  static String v = SComponentGolf.b("On Background");
  
  static String w = SComponentGolf.b("On Text Color");
  
  static String x = SComponentGolf.b("Off Background");
  
  static String y = SComponentGolf.b("Off Text");
  
  static String z = SComponentGolf.b("Label Background");
  
  static String A = SComponentGolf.b("Label Text");
  
  ButtonGroup B = new ButtonGroup();
  
  ArrayList C = new ArrayList();
  
  ArrayList D = new ArrayList();
  
  ArrayList E = new ArrayList();
  
  ArrayList F = new ArrayList();
  
  String G = p;
  
  JDialog H = null;
  
  public d(Window paramWindow, ai paramai, String paramString) {
    super(paramWindow, paramString);
    IOPropertiesUsingFile((et)new dQ((IOPropertiesUsingFile.IOPropertiesUsingFile()).an, "DashDesignerColorDialog"));
    IOPropertiesUsingFile(paramai);
    setLayout(new BorderLayout());
    add(this.IOPropertiesUsingFile, "Center");
    this.IOPropertiesUsingFile.setLayout(new BorderLayout());
    this.IOPropertiesUsingFile.add((Component)this.b, "Center");
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
    this.SComponentGolf = new JRadioButton(s);
    this.B.add(this.SComponentGolf);
    this.SComponentGolf.addActionListener(e);
    jPanel.add(this.SComponentGolf);
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
    this.IOPropertiesUsingFile.add(jPanel, "North");
    pack();
    this.G = b().b("selected", p);
    IOPropertiesUsingFile(this.G);
  }
  
  public void IOPropertiesUsingFile(String paramString) {
    Gauge gauge = b(this.F);
    Indicator indicator = c(this.F);
    DashLabel dashLabel = d(this.F);
    this.G = paramString;
    b().IOPropertiesUsingFile("selected", paramString);
    if (paramString.equals(p)) {
      b().IOPropertiesUsingFile("lastGaugeRadio", paramString);
      this.b.IOPropertiesUsingFile(new j(this));
      if (gauge != null)
        this.b.IOPropertiesUsingFile(gauge.getTrimColor()); 
    } else if (paramString.equals(q)) {
      b().IOPropertiesUsingFile("lastGaugeRadio", paramString);
      this.b.IOPropertiesUsingFile(new k(this));
      if (gauge != null)
        this.b.IOPropertiesUsingFile(gauge.getBackColor()); 
    } else if (paramString.equals(r)) {
      b().IOPropertiesUsingFile("lastGaugeRadio", paramString);
      this.b.IOPropertiesUsingFile(new l(this));
      if (gauge != null)
        this.b.IOPropertiesUsingFile(gauge.getFontColor()); 
    } else if (paramString.equals(s)) {
      b().IOPropertiesUsingFile("lastGaugeRadio", paramString);
      this.b.IOPropertiesUsingFile(new m(this));
      if (gauge != null)
        this.b.IOPropertiesUsingFile(gauge.getNeedleColor()); 
    } else if (paramString.equals(t)) {
      b().IOPropertiesUsingFile("lastGaugeRadio", paramString);
      this.b.IOPropertiesUsingFile(new n(this));
      if (gauge != null)
        this.b.IOPropertiesUsingFile(gauge.getWarnColor()); 
    } else if (paramString.equals(u)) {
      b().IOPropertiesUsingFile("lastGaugeRadio", paramString);
      this.b.IOPropertiesUsingFile(new o(this));
      if (gauge != null)
        this.b.IOPropertiesUsingFile(gauge.getCriticalColor()); 
    } else if (paramString.equals(v)) {
      b().IOPropertiesUsingFile("lastIndRadio", paramString);
      this.b.IOPropertiesUsingFile(new p(this));
      if (indicator != null)
        this.b.IOPropertiesUsingFile(indicator.getOnBackgroundColor()); 
    } else if (paramString.equals(w)) {
      b().IOPropertiesUsingFile("lastIndRadio", paramString);
      this.b.IOPropertiesUsingFile(new q(this));
      if (indicator != null)
        this.b.IOPropertiesUsingFile(indicator.getOnTextColor()); 
    } else if (paramString.equals(x)) {
      b().IOPropertiesUsingFile("lastIndRadio", paramString);
      this.b.IOPropertiesUsingFile(new f(this));
      if (indicator != null)
        this.b.IOPropertiesUsingFile(indicator.getOffBackgroundColor()); 
    } else if (paramString.equals(y)) {
      b().IOPropertiesUsingFile("lastIndRadio", paramString);
      this.b.IOPropertiesUsingFile(new SComponentGolf(this));
      if (indicator != null)
        this.b.IOPropertiesUsingFile(indicator.getOffTextColor()); 
    } else if (paramString.equals(z)) {
      b().IOPropertiesUsingFile("lastLabelRadio", paramString);
      this.b.IOPropertiesUsingFile(new h(this));
      if (dashLabel != null)
        this.b.IOPropertiesUsingFile(dashLabel.getBackgroundColor()); 
    } else if (paramString.equals(A)) {
      b().IOPropertiesUsingFile("lastLabelRadio", paramString);
      this.b.IOPropertiesUsingFile(new i(this));
      if (dashLabel != null)
        this.b.IOPropertiesUsingFile(dashLabel.getTextColor()); 
    } 
    this.c.setEnabled((gauge != null));
    this.d.setEnabled((gauge != null));
    this.e.setEnabled((gauge != null));
    this.SComponentGolf.setEnabled((gauge != null));
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
  
  public void IOPropertiesUsingFile(ArrayList paramArrayList) {
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
    IOPropertiesUsingFile(str);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */