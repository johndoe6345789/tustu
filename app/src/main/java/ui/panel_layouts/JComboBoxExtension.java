package aW;

import javax.swing.JComboBox;

class JComboBoxExtension extends JComboBox implements n {
  public void l(e parame) {
    setEditable(true);
  }
  
  public Object a() {
    return getSelectedItem();
  }
  
  public void a(Object paramObject) {
    if (this.a.a.b(a()))
      setSelectedItem(paramObject); 
  }
  
  public boolean b() {
    return this.a.a.b(a());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aW/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */