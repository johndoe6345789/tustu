package com.efiAnalytics.tunerStudio.panels;

import G.cr;
import J.h;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.aa;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bb;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class ProtocolStatsPanel extends JPanel implements bc {
  x a = null;
  
  public F(h paramh) {
    this.a = new x();
    this.a.f(true);
    setBorder(BorderFactory.createTitledBorder("Protocol Stats"));
    setLayout(new BorderLayout());
    add("Center", (Component)this.a);
    setPreferredSize(eJ.a(800, 320));
    setMinimumSize(eJ.a(800, 320));
    Z z = (new aa()).a((cr)paramh);
    this.a.a(z);
    this.a.setEnabled(false);
  }
  
  public void close() {
    this.a.removeAll();
  }
  
  public JDialog a(Window paramWindow, String paramString, bc parambc) {
    JDialog jDialog = new JDialog(paramWindow, paramString);
    jDialog.add("Center", this);
    JButton jButton = new JButton("Close");
    jButton.addActionListener(new G(this));
    if (parambc != null)
      jButton.addActionListener((ActionListener)new bb(parambc)); 
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    jPanel.add(jButton);
    jDialog.add("South", jPanel);
    jDialog.pack();
    bV.a(paramWindow, jDialog);
    jDialog.setVisible(true);
    return jDialog;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */