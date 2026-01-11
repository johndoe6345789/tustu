package aW;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

class m extends JTextField implements n {
  m(e parame) {
    super("", 10);
    setBorder(BorderFactory.createLoweredBevelBorder());
  }
  
  public Object a() {
    return getText();
  }
  
  public void a(Object paramObject) {
    setText(paramObject.toString());
  }
  
  public boolean b() {
    return this.a.a.b(a());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aW/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */