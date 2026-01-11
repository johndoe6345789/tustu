package business.binding_generators;

import G.GInterfaceBf;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import s.SComponentGolf;

public class BgComponentOscar extends JPanel {
  JTable a;
  
  List b = new ArrayList();
  
  q c;
  
  List d = new ArrayList();
  
  public BgComponentOscar() {
    this.b = this.b;
    this.c = new q(this);
    this.a = new JTable();
    this.a.setModel(this.c);
    this.a.setSelectionMode(0);
    this.a.getSelectionModel().addListSelectionListener(new p(this));
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Tuning Views in Loaded ECU Definition")));
    setLayout(new BorderLayout());
    JScrollPane jScrollPane = new JScrollPane(this.a);
    add("Center", jScrollPane);
  }
  
  public void a(GInterfaceBf parambf) {
    this.b.add(parambf);
    this.c.fireTableDataChanged();
  }
  
  public boolean b(GInterfaceBf parambf) {
    boolean bool = this.b.remove(parambf);
    this.c.fireTableDataChanged();
    this.a.validate();
    return bool;
  }
  
  public GInterfaceBf a() {
    int i = this.a.getSelectedRow();
    return (i >= 0) ? this.b.get(i) : null;
  }
  
  public void b() {
    int i = this.a.getSelectedRow();
    if (i > 0) {
      GInterfaceBf GInterfaceBf = this.b.remove(i);
      this.b.add(i - 1, GInterfaceBf);
      for (byte b = 0; b < this.b.size(); b++)
        ((GInterfaceBf)this.b.get(b)).a(b); 
      this.c.fireTableDataChanged();
      this.a.getSelectionModel().setSelectionInterval(i - 1, i - 1);
    } 
  }
  
  public void c() {
    int i = this.a.getSelectedRow();
    if (i >= 0 && i < this.b.size() - 1) {
      GInterfaceBf GInterfaceBf = this.b.remove(i);
      this.b.add(i + 1, GInterfaceBf);
      for (byte b = 0; b < this.b.size(); b++)
        ((GInterfaceBf)this.b.get(b)).a(b); 
      this.c.fireTableDataChanged();
      this.a.getSelectionModel().setSelectionInterval(i + 1, i + 1);
    } 
  }
  
  public void a(t paramt) {
    this.d.add(paramt);
  }
  
  private void e() {
    GInterfaceBf GInterfaceBf = a();
    for (t t : this.d)
      t.a(GInterfaceBf); 
  }
  
  public int d() {
    return this.a.getSelectionModel().getMaxSelectionIndex();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bg/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */