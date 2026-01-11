package business.box_extensions;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;

public class JTextFieldExtensionInBxPackage extends JTextField {
  int a = 20;
  
  public JTextFieldExtensionInBxPackage() {
    this("");
  }
  
  public JTextFieldExtensionInBxPackage(String paramString) {
    this(paramString, 10);
  }
  
  public JTextFieldExtensionInBxPackage(String paramString, int paramInt) {
    super(paramString, paramInt);
    a();
  }
  
  private void a() {
    ((AbstractDocument)getDocument()).setDocumentFilter(new r(this));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bx/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */