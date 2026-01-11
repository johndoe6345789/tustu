package business.byte_writers;

import ax.ArrayListUsingPattern;
import ax.ExceptionInAxPackage;
import bH.ac;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.NumericTextField;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class UIInBwPackage extends JPanel {
  final DefaultListModel a = new DefaultListModel();
  
  JList b = new JList(this.a);
  
  NumericTextField c = new NumericTextField();
  
  NumericTextField d = new NumericTextField();
  
  JLabel e = new JLabel("", 0);
  
  JLabel f = new JLabel("", 0);
  
  List g = new ArrayList();
  
  i h = null;
  
  HashMap i = new HashMap<>();
  
  j j = new j(this);
  
  public UIInBwPackage(Window paramWindow) {
    a();
    c();
  }
  
  private void a() {
    setBorder(BorderFactory.createTitledBorder(ac.a().a("Conversion Calculator")));
    setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    JScrollPane jScrollPane = new JScrollPane(this.b);
    add("West", jScrollPane);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new FlowLayout(1));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(2, 3));
    jPanel2.add(this.e);
    jPanel2.add(new JLabel(""));
    jPanel2.add(this.f);
    jPanel2.add((Component)this.c);
    jPanel2.add(new JLabel("-->>", 0));
    jPanel2.add((Component)this.d);
    jPanel1.add(jPanel2);
    add("Center", jPanel1);
    this.d.setEditable(false);
    this.c.addKeyListener(new g(this));
    this.c.addFocusListener(this.j);
    this.b.addListSelectionListener(new h(this));
    setPreferredSize(eJ.a(480, 240));
  }
  
  private i a(Object paramObject) {
    if (paramObject == null)
      return null; 
    for (i i1 : this.g) {
      if (i1.a.equals(paramObject))
        return i1; 
    } 
    return null;
  }
  
  private void b() {
    if (this.h != null) {
      String str = this.h.d;
      ArrayListUsingPattern q = (ArrayListUsingPattern)this.i.get(str);
      if (q == null) {
        q = new ArrayListUsingPattern();
        try {
          q.a(str);
          this.i.put(str, q);
        } catch (ExceptionInAxPackage u) {
          Logger.getLogger(f.class.getName()).log(Level.WARNING, "Unable to parser expression", (Throwable)u);
          bV.d(a("Unable to parse expression") + ": " + str, this);
        } 
      } 
      try {
        q.a("inputVar", this.c.e());
        double d = q.d();
        this.d.a(d);
      } catch (ExceptionInAxPackage u) {
        Logger.getLogger(f.class.getName()).log(Level.WARNING, "Unable to evaluate expression", (Throwable)u);
        bV.d(a("Unable to evaluate expression") + ": " + str, this);
      } 
    } 
  }
  
  private void c() {
    this.g.add(new i(this, "Degrees F to Degrees C", "°F", "°C", "(inputVar - 32) * 5 / 9", 1));
    this.g.add(new i(this, "Degrees C to Degrees F", "°C", "°F", "(inputVar * 9 / 5) + 32", 1));
    this.g.add(new i(this, "Cubic Inches to cc", "CID", "cc", "inputVar * 16.3871", 0));
    this.g.add(new i(this, "Cubic Inches to Liters", "CID", "L", "inputVar * 0.0163871", 2));
    this.g.add(new i(this, "Liters to Cubic Inches", "L", "CID", "inputVar / 0.0163871", 1));
    this.g.add(new i(this, "cc to Cubic Inches", "cc", "CID", "inputVar / 16.3871", 1));
    this.g.add(new i(this, "kPa to PSI", "kPa", "PSI", "inputVar * 0.145038", 2));
    this.g.add(new i(this, "kPa to inHg", "kPa", "inHg", "inputVar * 0.2953", 2));
    this.g.add(new i(this, "inHg to kPa", "inHg", "kPa", "inputVar / 0.2953", 1));
    this.g.add(new i(this, "PSI to kPa", "PSI", "kPa", "inputVar / 0.145038", 1));
    this.g.add(new i(this, "MPH to KPH", "MPH", "KPH", "inputVar * 1.60934", 1));
    this.g.add(new i(this, "MPH to ft/sec", "MPH", "ft/sec", "inputVar * 1.46667", 2));
    this.g.add(new i(this, "MPH to m/s", "MPH", "m/s", "inputVar * 0.44704", 3));
    this.g.add(new i(this, "KPH to MPH", "KPH", "MPH", "inputVar / 1.60934", 1));
    this.g.add(new i(this, "KPH to m/s", "KPH", "MPH", "inputVar / 0.277778", 1));
    this.g.add(new i(this, "lb/hr to cc/min", "lb/hr", "cc/min", "inputVar * 10.5", 1));
    this.g.add(new i(this, "cc/min to lb/hr", "cc/min", "lb/hr", "inputVar / 10.5", 1));
    this.g.add(new i(this, "1/4 mile ET to 1/8 mile ET", "s.", "s.", "inputVar / 1.55", 2));
    this.g.add(new i(this, "1/8 mile ET to 1/4 mile ET", "s.", "s.", "inputVar * 1.55", 2));
    for (i i1 : this.g)
      this.a.addElement(i1.a); 
  }
  
  private String a(String paramString) {
    return ac.a().a(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bw/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */