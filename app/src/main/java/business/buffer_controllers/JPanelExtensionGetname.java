package business.buffer_controllers;

import ae.AeInterfaceTango;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.SComponentGolf;

class JPanelExtensionGetname extends JPanel {
  AeInterfaceTango a = null;
  
  i b = null;
  
  JPanel c = new JPanel();
  
  c d = null;
  
  List e = new ArrayList();
  
  public JPanelExtensionGetname(AeInterfaceTango paramt) {
    this.a = paramt;
    setLayout(new BorderLayout());
    f f = new f(this, SComponentGolf.b(this.a.a()) + ": ");
    add("Center", f);
    b b = new b(this);
    if (this.a.b() == 2 || this.a.b() == 0) {
      SComponentGolf SComponentGolf = new SComponentGolf(this);
      this.b = SComponentGolf;
      List<E> list = this.a.e();
      for (byte b1 = 0; b1 < list.size(); b1++)
        SComponentGolf.addItem(list.get(b1)); 
      a(SComponentGolf);
      SComponentGolf.addActionListener(b);
    } else if (this.a.b() == 3) {
      e e = new e(this);
      this.b = e;
      a((Component)e);
    } else if (this.a.b() == 1) {
      h h = new h(this);
      this.b = h;
      a(h);
    } else if (this.a.b() == 4) {
      d d = new d(this);
      this.b = d;
      a(d);
      d.addActionListener(b);
    } else {
      JLabel jLabel = new JLabel(SComponentGolf.b("Unknown Setting Type."));
      a(jLabel);
    } 
    a(paramt.f());
  }
  
  private void a(Component paramComponent) {
    this.c.setBorder(BorderFactory.createEmptyBorder(2, 5, 2, 5));
    this.c.add("Center", paramComponent);
    add("East", this.c);
  }
  
  public Object a() {
    return (this.b != null) ? this.b.a() : null;
  }
  
  public void a(Object paramObject) {
    if (this.b != null)
      this.b.a(paramObject); 
  }
  
  public void b() {
    c();
    this.d = new c(this);
    this.d.start();
  }
  
  public void c() {
    if (this.d != null) {
      this.d.a();
      this.d = null;
    } 
  }
  
  public void a(m paramm) {
    this.e.add(paramm);
  }
  
  public String getName() {
    return this.a.a();
  }
  
  private void a(String paramString, Object paramObject) {
    for (m m : this.e)
      m.a(paramString, paramObject); 
  }
  
  public boolean d() {
    return (this.b != null) ? this.b.b() : false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bc/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */