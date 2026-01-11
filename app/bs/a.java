package bs;

import G.R;
import G.dp;
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
  
  dp b = null;
  
  ArrayList c = null;
  
  public a(R paramR, dp paramdp) {
    this.a = paramR;
    setLayout(new BorderLayout());
    e e = e.a();
    this.c = e.a(paramR, paramdp);
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
      str = bV.a("{Custom filter condition}", false, "Performs custom filter as evaluated by " + r.a.b + ".\nSee website for more details. \nex. (throttle > 25 ) || rpm > 3000 \nfilters any record where throttle is greater than 25% OR rpm is greater than 3000.\nTo deactivate custom filter, press cancel or clear and press Ok.", true, this, d, new c(this, this));
      if (str != null && !str.equals("")) {
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */