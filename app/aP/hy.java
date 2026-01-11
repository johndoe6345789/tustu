package aP;

import bt.y;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import r.a;
import s.g;
import z.i;
import z.m;

class hy extends JPanel implements ItemListener {
  private Frame b;
  
  private JLabel c;
  
  private y d;
  
  private JLabel e;
  
  private y f;
  
  public hy(hs paramhs, Frame paramFrame) {
    this.b = paramFrame;
    setLayout(new GridLayout(1, 4, 10, 10));
    this.c = new JLabel(g.b("Port Name") + ":", 0);
    add(this.c);
    this.d = new y();
    this.d.setEditable(true);
    this.d.addItemListener(this);
    add((Component)this.d);
    c();
    this.d.a(hs.c(paramhs).a());
    this.e = new JLabel(g.b("Baud Rate") + ":", 0);
    add(this.e);
    this.f = new y();
    i i = new i();
    String[] arrayOfString = i.c();
    for (byte b = 0; b < arrayOfString.length; b++)
      this.f.addItem(arrayOfString[b]); 
    this.f.a(Integer.toString(hs.c(paramhs).b()));
    this.f.addItemListener(this);
    add((Component)this.f);
  }
  
  public void a(String paramString) {
    this.d.a(paramString);
  }
  
  public void b(String paramString) {
    this.f.a(paramString);
  }
  
  public void a() {
    this.d.a(hs.c(this.a).a());
    this.f.a(hs.c(this.a).c());
  }
  
  public void b() {
    if (this.f != null && this.d != null) {
      hs.c(this.a).a(this.d.a());
      a a = a.a();
      a.b(a.az, hs.c(this.a).a());
      hs.c(this.a).b(this.f.a());
      a.b(a.ay, hs.c(this.a).c());
    } 
  }
  
  void c() {
    i i = new i();
    String[] arrayOfString = i.a();
    for (byte b = 0; b < arrayOfString.length; b++)
      this.d.addItem(arrayOfString[b]); 
  }
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (hs.d(this.a) != null && hs.d(this.a).d()) {
      if (paramItemEvent.getItemSelectable() == this.d) {
        this.a.e();
        bV.d("Port Open!\nPort can not\nbe changed\nwhile a port is open.", this.b);
        a();
        return;
      } 
      b();
      try {
        hs.d(this.a).b();
      } catch (m m) {
        bV.d("Unsupported Configuration!\nConfiguration Parameter unsupported,\nselect new value.\nReturning to previous configuration.", this.b);
        a();
      } 
    } else {
      b();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */