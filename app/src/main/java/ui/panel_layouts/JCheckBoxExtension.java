package aW;

import javax.swing.JCheckBox;

class JCheckBoxExtension extends JCheckBox implements n {
  JCheckBoxExtension(e parame, String paramString) {
    super(paramString);
  }
  
  public Object a() {
    return new Boolean(isSelected());
  }
  
  public void a(Object paramObject) {
    setSelected(((Boolean)paramObject).booleanValue());
  }
  
  public boolean b() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aW/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */