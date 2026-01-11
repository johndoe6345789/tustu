package bc;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

class JTextFieldExtensionInBcPackage extends JTextField implements i {
  h(a parama) {
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
    return this.a.a.a(a());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bc/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */