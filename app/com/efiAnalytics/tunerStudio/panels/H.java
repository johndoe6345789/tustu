package com.efiAnalytics.tunerStudio.panels;

import G.R;
import V.a;
import bH.D;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.aa;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bb;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import n.n;
import s.g;

public class H extends JPanel implements bc {
  private R c = null;
  
  x a = null;
  
  x b = null;
  
  public H(R paramR) {
    this.a = new x(paramR);
    this.b = new x(paramR);
    setBorder(BorderFactory.createTitledBorder(g.b("Real-Time Display")));
    setLayout(new BorderLayout());
    n n = new n();
    n.setTabPlacement(3);
    add("Center", (Component)n);
    setPreferredSize(new Dimension(800, 600));
    setMinimumSize(new Dimension(800, 600));
    try {
      Z z1 = (new aa()).b(paramR);
      this.b.a(z1);
      n.addTab(g.b("Summary"), (Component)this.b);
      this.b.setEnabled(false);
    } catch (a a) {
      D.a("Could not get Real-time display summary.");
    } 
    Z z = (new aa()).a(paramR);
    this.a.a(z);
    n.addTab(g.b("All OutputChannels"), (Component)this.a);
    this.a.setEnabled(false);
  }
  
  public void close() {
    this.a.removeAll();
    this.b.removeAll();
  }
  
  public JDialog a(Frame paramFrame, String paramString, bc parambc) {
    JDialog jDialog = new JDialog(paramFrame, paramString);
    jDialog.add("Center", this);
    JButton jButton = new JButton("Close");
    jButton.addActionListener(new I(this));
    if (parambc != null)
      jButton.addActionListener((ActionListener)new bb(parambc)); 
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    jPanel.add(jButton);
    jDialog.add("South", jPanel);
    jDialog.pack();
    bV.a(paramFrame, jDialog);
    jDialog.setVisible(true);
    return jDialog;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */