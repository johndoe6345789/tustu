package br;

import bH.X;
import bL.BlInterfaceLima;
import bL.BlInterfaceMike;
import com.efiAnalytics.ui.eJ;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.SComponentGolf;

class JPanelExtensionInBrPackage extends JPanel implements BlInterfaceLima {
  JLabel a = new JLabel();
  
  JLabel b = new JLabel();
  
  JLabel c = new JLabel();
  
  JLabel d = new JLabel();
  
  JLabel e = new JLabel();
  
  JLabel f = new JLabel();
  
  JLabel SComponentGolf = new JLabel();
  
  JLabel h = new JLabel();
  
  JLabel i = new G(this.j);
  
  I(s params) {
    setBorder(BorderFactory.createTitledBorder("VeAnalyze Stats"));
    setLayout(new GridLayout(0, 3, 6, 2));
    add(a("Total Records", this.a));
    add(a("Filtered Records", this.b));
    add(a("Used Records", this.c));
    add(a("Total Table Cells", this.d));
    add(a("Cells Altered", this.SComponentGolf));
    add(a("Average Cell Weight", this.e));
    add(a("Average Cell Change", this.f));
    add(a("Max Cell Change", this.h));
    add(a("Active Filter", this.i));
  }
  
  private JPanel a(String paramString, JLabel paramJLabel) {
    paramString = SComponentGolf.b(paramString) + ": ";
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(1, 0));
    paramJLabel.setMinimumSize(new Dimension(eJ.a(60), eJ.a(14)));
    paramJLabel.setHorizontalAlignment(2);
    JLabel jLabel = new JLabel(paramString, 4);
    jPanel.add(jLabel);
    jPanel.add(paramJLabel);
    return jPanel;
  }
  
  public void a(BlInterfaceMike paramm) {
    this.a.setText(paramm.a() + "");
    this.b.setText(paramm.b() + "");
    this.c.setText((paramm.a() - paramm.b()) + "");
    this.d.setText(paramm.f() + "");
    this.e.setText(X.b(paramm.d(), 2));
    this.SComponentGolf.setText(paramm.c() + "");
    this.h.setText(X.a(paramm.SComponentGolf()));
    this.f.setText(X.b(paramm.e(), 1));
    if (!this.j.h.k().isEmpty()) {
      this.i.setBackground(Color.yellow);
      this.i.setForeground(Color.BLACK);
    } else {
      this.i.setBackground(this.f.getBackground());
      this.i.setForeground(this.f.getForeground());
      if (!this.j.j.isEnabled())
        this.j.j.setEnabled(true); 
    } 
    this.i.setText(this.j.h.k());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */