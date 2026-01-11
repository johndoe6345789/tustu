package com.efiAnalytics.tunerStudio.panels;

import G.R;
import V.ExceptionInVPackage;
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
import Isoptimizeddrawingenabled.Isoptimizeddrawingenabled;
import s.SComponentGolf;

public class RealTimeDisplayPanel extends JPanel implements bc {
  private R c = null;
  
  x ExceptionInVPackage = null;
  
  x b = null;
  
  public RealTimeDisplayPanel(R paramR) {
    this.ExceptionInVPackage = new RealTimeDisplayPanel(paramR);
    this.b = new RealTimeDisplayPanel(paramR);
    RealTimeDisplayPanel(BorderFactory.createTitledBorder(SComponentGolf.b("Real-Time Display")));
    RealTimeDisplayPanel(new BorderLayout());
    Isoptimizeddrawingenabled Isoptimizeddrawingenabled = new Isoptimizeddrawingenabled();
    Isoptimizeddrawingenabled.setTabPlacement(3);
    RealTimeDisplayPanel("Center", (Component)Isoptimizeddrawingenabled);
    RealTimeDisplayPanel(new Dimension(800, 600));
    RealTimeDisplayPanel(new Dimension(800, 600));
    try {
      Z z1 = (new RealTimeDisplayPanel()).b(paramR);
      this.b.ExceptionInVPackage(z1);
      Isoptimizeddrawingenabled.addTab(SComponentGolf.b("Summary"), (Component)this.b);
      this.b.setEnabled(false);
    } RealTimeDisplayPanel(ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("Could not get Real-time display summary.");
    } 
    Z z = (new RealTimeDisplayPanel()).ExceptionInVPackage(paramR);
    this.ExceptionInVPackage.ExceptionInVPackage(z);
    Isoptimizeddrawingenabled.addTab(SComponentGolf.b("All OutputChannels"), (Component)this.ExceptionInVPackage);
    this.ExceptionInVPackage.setEnabled(false);
  }
  
  public void RealTimeDisplayPanel() {
    this.ExceptionInVPackage.removeAll();
    this.b.removeAll();
  }
  
  public JDialog ExceptionInVPackage(Frame paramFrame, String paramString, bc parambc) {
    JDialog jDialog = new JDialog(paramFrame, paramString);
    jDialog.add("Center", this);
    JButton jButton = new JButton("Close");
    jButton.addActionListener(new RealTimeDisplayPanel(this));
    if (parambc != null)
      jButton.addActionListener((ActionListener)new RealTimeDisplayPanel(parambc)); 
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    jPanel.add(jButton);
    jDialog.add("South", jPanel);
    jDialog.pack();
    bV.ExceptionInVPackage(paramFrame, jDialog);
    jDialog.setVisible(true);
    return jDialog;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */