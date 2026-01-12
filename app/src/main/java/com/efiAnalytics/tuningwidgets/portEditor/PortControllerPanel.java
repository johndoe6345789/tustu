package com.efiAnalytics.tuningwidgets.portEditor;

import G.ArrayListExceptionprintstacktrace;
import G.Manager;
import G.R;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JPanel;
import r.RInterfaceIndia;
import s.SComponentGolf;

class PortControllerPanel extends JPanel implements bc {
  ArrayList a = new ArrayList();

  ArrayList b = new ArrayList();

  JPanel c = null;

  public PortControllerPanel(
      OutputPortEditor paramOutputPortEditor, R paramR, ArrayListExceptionprintstacktrace paramaS) {
    Manager Manager = paramR.c(paramaS.m());
    setLayout(new GridLayout(0, 1, 8, 8));
    int RInterfaceIndia = 0;
    if (Manager != null)
      if (Manager.c().a() == 1 || !RInterfaceIndia.a().a("HF-0FD-0HHFJG")) {
        RInterfaceIndia = 1;
      } else {
        RInterfaceIndia = Manager.c().b();
      }
    this.c = new JPanel();
    this.c.setLayout(new FlowLayout(2));
    JLabel jLabel = new JLabel(SComponentGolf.b("Controller") + "                ");
    String str = paramaS.o();
    if (str != null && paramR.c(str) != null && RInterfaceIndia.a().a("HF-0FD-0HHFJG"))
      this.c.add(jLabel);
    this.c.add(new JLabel(" " + SComponentGolf.b("Output Channel") + " "));
    this.c.add(new JLabel("                   "));
    this.c.add(new JLabel("  " + SComponentGolf.b("Threshold")));
    this.c.add(new JLabel("  " + SComponentGolf.b("Hysteresis")));
    add(this.c);
    for (byte b = 0; b <= RInterfaceIndia; b++) {
      z z = new z(paramR, paramaS, b);
      this.a.add(z);
      add(z);
      if (b < RInterfaceIndia) {
        ArrayList<String> arrayList = new ArrayList();
        Iterator iterator = paramaS.c();
        while (iterator.hasNext())
          arrayList.add((new StringBuilder()).append(iterator.next()).append("").toString());
        String[] arrayOfString = new String[arrayList.size()];
        arrayOfString = arrayList.<String>toArray(arrayOfString);
        v v = new v(paramR, paramaS.m(), arrayOfString);
        v.a(b);
        this.b.add(v);
        v.addItemListener(new k(this, paramOutputPortEditor));
        f f = new f(paramOutputPortEditor);
        f.setLayout(new BorderLayout(8, 8));
        f.add("West", v);
        add(f);
      }
    }
    a(0);
  }

  public void setEnabled(boolean paramBoolean) {
    bV.a(this.c, paramBoolean);
    for (byte b = 0; b < this.a.size(); b++) {
      z z = this.a.get(b);
      bV.a(z, paramBoolean);
      if (b < this.b.size()) ((v) this.b.get(b)).setEnabled(paramBoolean);
      if (paramBoolean && b < this.b.size()) {
        v v = this.b.get(b);
        paramBoolean = v.a();
      }
    }
  }

  public void a(int paramInt) {
    Iterator<v> iterator = this.b.iterator();
    while (iterator.hasNext()) ((v) iterator.next()).b(paramInt);
    iterator = this.a.iterator();
    while (iterator.hasNext()) ((z) iterator.next()).a(paramInt);
  }

  public void close() {
    for (byte b = 0; b < getComponentCount(); b++) {
      Component component = getComponent(b);
      if (component instanceof bc) ((bc) component).close();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
