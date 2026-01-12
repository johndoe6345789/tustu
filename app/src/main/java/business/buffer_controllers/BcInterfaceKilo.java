package business.buffer_controllers;

import AeInterfaceSierra.g;
import ae.AeComponentCharlie;
import ae.AeInterfaceQuebec;
import ae.AeInterfaceSierra;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class BcInterfaceKilo extends JPanel {
  AeInterfaceQuebec a = null;

  ArrayList b = new ArrayList();

  public BcInterfaceKilo() {
    setBorder(BorderFactory.createTitledBorder(g.b("Firmware Loader Options")));
    setLayout(new BoxLayout(this, 1));
  }

  public void a(AeInterfaceQuebec paramq, ae.k paramk, boolean paramBoolean) {
    List list;
    this.a = paramq;
    b();
    if (paramBoolean) {
      List list1 = paramq.AeComponentCharlie();
      list = AeComponentCharlie.a(list1, paramk);
    } else {
      List list1 = paramq.d();
      list = AeComponentCharlie.b(list1, paramk);
    }
    for (AeInterfaceSierra AeInterfaceSierra : list) {
      j j = new j();
      if (paramBoolean) {
        j.a(AeInterfaceSierra.a(paramk));
      } else {
        j.a(AeInterfaceSierra.b(paramk));
      }
      l l = new l(this, AeInterfaceSierra);
      j.a(l);
      this.b.add(j);
      add(j);
    }
  }

  private void b() {
    removeAll();
    this.b.clear();
  }

  public boolean a() {
    for (j j : this.b) {
      if (!j.b()) return false;
    }
    for (j j : this.b) j.AeComponentCharlie();
    return true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bc/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
