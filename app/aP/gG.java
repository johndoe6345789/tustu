package aP;

import bA.a;
import bA.b;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.g;

class gG extends JPanel implements b {
  JComboBox a = new JComboBox();
  
  ArrayList b = new ArrayList();
  
  public gG(dB paramdB) {
    setLayout(new BorderLayout());
    add("North", new JLabel(g.b("Device")));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("North", this.a);
    add("Center", jPanel);
    this.a.addActionListener(new gH(this, paramdB));
  }
  
  public void a(String paramString) {
    this.a.addItem(paramString);
  }
  
  public void a() {
    this.a.removeAllItems();
  }
  
  public List b() {
    ArrayList<String> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < this.a.getItemCount(); b1++)
      arrayList.add(this.a.getItemAt(b1)); 
    return arrayList;
  }
  
  public void b(String paramString) {
    this.a.setSelectedItem(paramString);
  }
  
  public void a(a parama) {
    this.b.add(parama);
  }
  
  private void d(String paramString) {
    for (a a : this.b)
      a.a(paramString); 
  }
  
  public void c(String paramString) {
    this.a.removeItem(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */