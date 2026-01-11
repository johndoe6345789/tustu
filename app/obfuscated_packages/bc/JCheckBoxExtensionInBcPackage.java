package bc;

import bH.D;
import javax.swing.JCheckBox;

class JCheckBoxExtensionInBcPackage extends JCheckBox implements i {
  d(a parama) {}
  
  public Object a() {
    return Boolean.valueOf(isSelected());
  }
  
  public void a(Object paramObject) {
    if (paramObject instanceof Boolean) {
      setSelected(((Boolean)paramObject).booleanValue());
    } else if (paramObject instanceof String) {
      setSelected(Boolean.parseBoolean(paramObject.toString()));
    } else {
      D.c("Invalid Boolean value: " + paramObject);
      this.a.b();
    } 
  }
  
  public boolean b() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bc/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */