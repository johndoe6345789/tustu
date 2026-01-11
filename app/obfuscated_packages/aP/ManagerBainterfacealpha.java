package aP;

import bA.BaInterfaceAlpha;
import bA.BaInterfaceBravo;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.SComponentGolf;

class ManagerBainterfacealpha extends JPanel implements BaInterfaceBravo {
  JComboBox BaInterfaceAlpha = new JComboBox();
  
  ArrayList BaInterfaceBravo = new ArrayList();
  
  public ManagerBainterfacealpha(dB paramdB) {
    setLayout(new BorderLayout());
    add("North", new JLabel(SComponentGolf.BaInterfaceBravo("Device")));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("North", this.BaInterfaceAlpha);
    add("Center", jPanel);
    this.BaInterfaceAlpha.addActionListener(new gH(this, paramdB));
  }
  
  public void BaInterfaceAlpha(String paramString) {
    this.BaInterfaceAlpha.addItem(paramString);
  }
  
  public void BaInterfaceAlpha() {
    this.BaInterfaceAlpha.removeAllItems();
  }
  
  public List BaInterfaceBravo() {
    ArrayList<String> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < this.BaInterfaceAlpha.getItemCount(); b1++)
      arrayList.add(this.BaInterfaceAlpha.getItemAt(b1)); 
    return arrayList;
  }
  
  public void BaInterfaceBravo(String paramString) {
    this.BaInterfaceAlpha.setSelectedItem(paramString);
  }
  
  public void BaInterfaceAlpha(BaInterfaceAlpha parama) {
    this.BaInterfaceBravo.add(parama);
  }
  
  private void d(String paramString) {
    for (BaInterfaceAlpha BaInterfaceAlpha : this.BaInterfaceBravo)
      BaInterfaceAlpha.BaInterfaceAlpha(paramString); 
  }
  
  public void c(String paramString) {
    this.BaInterfaceAlpha.removeItem(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */