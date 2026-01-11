package br;

import G.R;
import G.dm;
import bH.X;
import bL.k;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import s.g;

public class a extends JPanel {
  R a = null;
  
  dm b = null;
  
  ArrayList c = null;
  
  public a(R paramR, dm paramdm) {
    this.a = paramR;
    setLayout(new BorderLayout());
    e e = e.a();
    this.c = e.a(paramR, paramdm);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(0, 2));
    jPanel.setBorder(BorderFactory.createTitledBorder(g.b("Filters")));
    if (this.c != null) {
      for (k k : this.c) {
        if (k.h()) {
          JButton jButton = a(k);
          jPanel.add(jButton);
        } 
      } 
      add("Center", jPanel);
    } 
  }
  
  private JButton a(k paramk) {
    JButton jButton = new JButton();
    jButton.setName(paramk.g());
    a(jButton, paramk);
    jButton.addActionListener(new b(this));
    return jButton;
  }
  
  private void a(JButton paramJButton, k paramk) {
    if (paramk.e() == 128) {
      String str = paramk.f();
      paramJButton.setText(g.b(paramk.a()) + (str.equals("") ? g.b("Off") : g.b("On")));
    } else {
      paramJButton.setText(g.b(paramk.a()) + ": " + X.a(paramk.c()));
    } 
  }
  
  private void a(JButton paramJButton) {
    k k = a(paramJButton.getName());
    if (k.e() == 128) {
      d d = new d(this, k);
      String str = "";
      str = bV.a("{" + g.b("Custom filter condition") + "}", false, g.b("Performs custom filter as evaluated by " + r.a.b + ".") + "\n" + g.b("See website for more details.") + " \nex. (coolant > 200) && rpm > 5000 \n" + g.b("filters any record where coolant temp is greater than 200 and rpm is greater than 500.") + "\n" + g.b("To deactivate custom filter, press cancel or clear and press Ok."), true, this, d, new c(this, this), g.d());
      if (str == null)
        return; 
      if (!str.trim().equals("")) {
        k.c(str);
      } else {
        k.c("");
      } 
    } else {
      String str = bV.a(this, true, g.b(k.a()), "" + k.c());
      if (str == null || str.equals(""))
        return; 
      double d = Double.parseDouble(str);
      k.a(d);
    } 
    a(paramJButton, k);
  }
  
  private k a(String paramString) {
    for (k k : this.c) {
      if (k.g().equals(paramString))
        return k; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */