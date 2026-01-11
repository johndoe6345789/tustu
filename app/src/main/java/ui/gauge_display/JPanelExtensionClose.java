package aV;

import A.IO;
import A.AInterfaceGolf;
import A.AInterfaceRomeo;
import G.l;
import ai.EqualsInAiPackage;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.AInterfaceGolf;

public class JPanelExtensionClose extends JPanel implements bc {
  JDialog a = null;
  
  aW.a EqualsInAiPackage;
  
  JCheckBox c = new JCheckBox(AInterfaceGolf.EqualsInAiPackage("GPS Enabled"));
  
  EqualsInAiPackage d = new EqualsInAiPackage();
  
  public JPanelExtensionClose(aK.a parama) {
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("Center", this.c);
    JLabel jLabel = new JLabel();
    jLabel.setText("<html><font color=\"blue\"><u>" + AInterfaceGolf.EqualsInAiPackage("More Information") + "</u></font>&nbsp;&nbsp;</html>");
    this.d.a(AInterfaceGolf.EqualsInAiPackage("GPS Setup Help"));
    this.d.EqualsInAiPackage("/help/gps.html");
    jLabel.addMouseListener(new EqualsInAiPackage(this));
    jPanel.add("East", jLabel);
    add("North", jPanel);
    this.c.setSelected(x.a().c());
    this.c.addActionListener(new c(this));
    this.EqualsInAiPackage = new aW.a(IO.c(), (AInterfaceGolf)parama);
    add("Center", (Component)this.EqualsInAiPackage);
    fp.a((Component)this.EqualsInAiPackage, this.c.isSelected());
  }
  
  private void EqualsInAiPackage() {
    try {
      x.a().d();
      if (x.a().EqualsInAiPackage() != null && x.a().EqualsInAiPackage().a() != null)
        this.EqualsInAiPackage.a(x.a().EqualsInAiPackage().a()); 
    } catch (l l) {
      bV.d(l.getLocalizedMessage(), this);
    } 
  }
  
  public void close() {
    if (this.a != null)
      this.a.dispose(); 
  }
  
  public boolean a() {
    if (this.c.isSelected()) {
      IO IO = this.EqualsInAiPackage.EqualsInAiPackage();
      if (IO == null) {
        bV.d(AInterfaceGolf.EqualsInAiPackage("Please Select a Connection Type"), this);
        return false;
      } 
      if (!this.EqualsInAiPackage.c()) {
        bV.d(AInterfaceGolf.EqualsInAiPackage("Please Correct the setting"), this);
        return false;
      } 
      boolean bool = (x.a().a(x.a) == null || !x.a().a(x.a).equals(IO.h())) ? true : false;
      x.a().a(x.a, IO.h());
      List list = IO.l();
      for (AInterfaceRomeo AInterfaceRomeo : list) {
        if (AInterfaceRomeo.a() != 5) {
          if (!bool && !x.a().a(x.a, AInterfaceRomeo).equals(this.EqualsInAiPackage.a(AInterfaceRomeo.c())))
            bool = true; 
          x.a().a(x.a, AInterfaceRomeo, this.EqualsInAiPackage.a(AInterfaceRomeo.c()));
        } 
      } 
      if (bool) {
        x.a().e();
        try {
          x.a().d();
        } catch (l l) {
          bV.d(l.getLocalizedMessage(), this);
          Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)l);
        } 
      } 
      return true;
    } 
    x.a().e();
    return true;
  }
  
  public void a(Component paramComponent) {
    this.a = new JDialog(bV.a(paramComponent), AInterfaceGolf.EqualsInAiPackage("GPS Configuration"));
    this.a.add("Center", this);
    JButton jButton1 = new JButton(AInterfaceGolf.EqualsInAiPackage("Cancel"));
    jButton1.addActionListener(new d(this));
    JButton jButton2 = new JButton(AInterfaceGolf.EqualsInAiPackage("Accept"));
    jButton2.addActionListener(new e(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (bV.d()) {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    } else {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    } 
    this.a.add("South", jPanel);
    this.a.pack();
    bV.a(bV.a(paramComponent), this.a);
    this.a.setVisible(true);
    validate();
    this.a.pack();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aV/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */