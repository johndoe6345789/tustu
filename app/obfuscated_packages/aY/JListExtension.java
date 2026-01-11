package aY;

import W.ag;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class JListExtension extends JList {
  DefaultListModel a = null;
  
  A(s params) {
    this.a = new DefaultListModel();
    setCellRenderer(new C(params));
    setModel(this.a);
    setSelectionMode(0);
    setVisibleRowCount(12);
  }
  
  public void a(ag paramag) {
    B b = new B(this.b, paramag);
    this.a.add(0, b);
  }
  
  public ag a() {
    B b = (B)getSelectedValue();
    return (b != null) ? b.a : null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */