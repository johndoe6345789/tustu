package bs;

import G.R;
import G.dp;
import bH.X;
import bL.TostringInBlPackage;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import s.SComponentGolf;

public class JPanelExtensionInBsPackage extends JPanel {
  R a = null;
  
  dp b = null;
  
  ArrayList c = null;
  
  public JPanelExtensionInBsPackage(R paramR, dp paramdp) {
    this.a = paramR;
    setLayout(new BorderLayout());
    e e = e.a();
    this.c = e.a(paramR, paramdp);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(0, 2));
    jPanel.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Filters")));
    if (this.c != null) {
      for (TostringInBlPackage TostringInBlPackage : this.c) {
        if (TostringInBlPackage.h()) {
          JButton jButton = a(TostringInBlPackage);
          jPanel.add(jButton);
        } 
      } 
      add("Center", jPanel);
    } 
  }
  
  private JButton a(TostringInBlPackage paramk) {
    JButton jButton = new JButton();
    jButton.setName(paramk.SComponentGolf());
    a(jButton, paramk);
    jButton.addActionListener(new b(this));
    return jButton;
  }
  
  private void a(JButton paramJButton, TostringInBlPackage paramk) {
    if (paramk.e() == 128) {
      String str = paramk.f();
      paramJButton.setText(SComponentGolf.b(paramk.a()) + (str.equals("") ? SComponentGolf.b("Off") : SComponentGolf.b("On")));
    } else {
      paramJButton.setText(SComponentGolf.b(paramk.a()) + ": " + X.a(paramk.c()));
    } 
  }
  
  private void a(JButton paramJButton) {
    TostringInBlPackage TostringInBlPackage = a(paramJButton.getName());
    if (TostringInBlPackage.e() == 128) {
      d d = new d(this, TostringInBlPackage);
      String str = "";
      str = bV.a("{Custom filter condition}", false, "Performs custom filter as evaluated by " + r.a.b + ".\nSee website for more details. \nex. (throttle > 25 ) || rpm > 3000 \nfilters any record where throttle is greater than 25% OR rpm is greater than 3000.\nTo deactivate custom filter, press cancel or clear and press Ok.", true, this, d, new c(this, this));
      if (str != null && !str.equals("")) {
        TostringInBlPackage.c(str);
      } else {
        TostringInBlPackage.c("");
      } 
    } else {
      String str = bV.a(this, true, SComponentGolf.b(TostringInBlPackage.a()), "" + TostringInBlPackage.c());
      if (str == null || str.equals(""))
        return; 
      double d = Double.parseDouble(str);
      TostringInBlPackage.a(d);
    } 
    a(paramJButton, TostringInBlPackage);
  }
  
  private TostringInBlPackage a(String paramString) {
    for (TostringInBlPackage TostringInBlPackage : this.c) {
      if (TostringInBlPackage.SComponentGolf().equals(paramString))
        return TostringInBlPackage; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */