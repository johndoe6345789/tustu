package business.bean_encoders;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

class JTextFieldExtensionInBePackage extends JTextField {
  public JTextFieldExtensionInBePackage(y paramy, String paramString, int paramInt) {
    super(paramString, paramInt);
    setBorder(BorderFactory.createLoweredBevelBorder());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */