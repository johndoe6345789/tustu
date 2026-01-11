package be;

import G.R;
import G.ac;
import G.ak;
import V.ExceptionInVPackage;
import bH.D;
import com.efiAnalytics.ui.br;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import r.RInterfaceIndia;
import s.SComponentGolf;

public class BeComponentJuliet extends JPanel implements o {
  static String ExceptionInVPackage = "Log Other OutputChannels";
  
  static String b = "Log Indicator";
  
  CardLayout c = new CardLayout();
  
  SComponentGolf d;
  
  R e;
  
  JButton f;
  
  public BeComponentJuliet(R paramR) {
    this.e = paramR;
    setLayout(new BorderLayout());
    this.f = new JButton(SComponentGolf.b("Templates"));
    this.f.addActionListener(new k(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("East", this.f);
    add("North", jPanel);
    this.d = new SComponentGolf(paramR);
    if (!RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("09ggdslkmkgoiu")) {
      fp.ExceptionInVPackage(this.d, false);
      this.f.setEnabled(false);
    } 
    add("Center", this.d);
  }
  
  public void ExceptionInVPackage() {
    br br = new br();
    ArrayList<?> arrayList = new ArrayList();
    Iterator iterator = this.e.A();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    Collections.sort(arrayList, new l(this));
    if (!arrayList.isEmpty()) {
      m m = new m(this);
      JMenu jMenu1 = new JMenu(SComponentGolf.b("Log Indicator State"));
      br.add(jMenu1);
      byte b1 = 0;
      byte b2 = 25;
      JMenu jMenu2 = jMenu1;
      if (arrayList.size() > b2)
        jMenu2 = new JMenu(SComponentGolf.b("Predefined Indicators 1")); 
      for (ak ak : arrayList) {
        if (b1++ % b2 == 0) {
          jMenu2 = new JMenu(SComponentGolf.b("Predefined Indicators") + " " + (b1 / b2 + 1));
          jMenu1.add(jMenu2);
        } 
        JMenuItem jMenuItem = new JMenuItem(SComponentGolf.b(ak.b()));
        jMenuItem.addActionListener(m);
        jMenuItem.setActionCommand(ak.aL());
        jMenu2.add(jMenuItem);
      } 
    } 
    this.f.add((Component)br);
    br.show(this.f, 0, this.f.getHeight());
  }
  
  private void ExceptionInVPackage(ak paramak) {
    try {
      ac ac = this.d.ExceptionInVPackage();
      ac.c(paramak.b());
      ac.b(4);
      ac.b(paramak.f());
      this.d.ExceptionInVPackage(ac);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage((Exception)ExceptionInVPackage);
    } 
  }
  
  public boolean c() {
    return this.d.c();
  }
  
  public void ExceptionInVPackage(R paramR) {
    this.d.ExceptionInVPackage(paramR);
  }
  
  public void ExceptionInVPackage(ac paramac) {
    this.d.ExceptionInVPackage(paramac);
  }
  
  void ExceptionInVPackage(boolean paramBoolean) {
    if (!RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("09ggdslkmkgoiu")) {
      this.f.setEnabled(false);
    } else {
      this.f.setEnabled(paramBoolean);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */