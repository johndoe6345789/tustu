package be;

import G.R;
import G.SerializableImplExceptionprintstacktrace;
import G.GInterfaceAh;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import s.SComponentGolf;

public class BeInterfaceTango extends JPanel {
  SComponentGolf a;
  
  y b;
  
  JCheckBox c;
  
  JCheckBox d;
  
  R e;
  
  public BeInterfaceTango(R paramR) {
    this.e = paramR;
    FlowLayout flowLayout = new FlowLayout(1);
    flowLayout.setAlignOnBaseline(true);
    setLayout(flowLayout);
    W w1 = new W(this);
    w1.setLayout(new BorderLayout());
    this.c = new JCheckBox(SComponentGolf.b("Add Gauge Template"));
    this.c.addActionListener(new U(this));
    w1.add(this.c, "North");
    this.b = new y(paramR);
    w1.add(this.b, "Center");
    add(w1);
    W w2 = new W(this);
    w2.setLayout(new BorderLayout());
    this.d = new JCheckBox(SComponentGolf.b("Add Data Log Field"));
    this.d.addActionListener(new V(this));
    w2.add(this.d, "North");
    this.a = new SComponentGolf(paramR);
    w2.add(this.a, "Center");
    add(w2);
    fp.a(this.b, false);
    fp.a(this.a, false);
  }
  
  public void a(String paramString) {
    this.a.a(paramString);
    this.b.a(paramString);
  }
  
  public boolean a() {
    if (this.c.isSelected()) {
      R r = this.b.b();
      if (!r.a()) {
        bV.d(SComponentGolf.b(r.d()), this);
        return false;
      } 
    } 
    if (this.d.isSelected()) {
      R r = this.a.b();
      if (!r.a()) {
        bV.d(SComponentGolf.b(r.d()), this);
        return false;
      } 
    } 
    return true;
  }
  
  public SerializableImplExceptionprintstacktrace b() {
    return this.d.isSelected() ? this.a.a() : null;
  }
  
  public GInterfaceAh c() {
    return this.c.isSelected() ? this.b.a() : null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */