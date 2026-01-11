package business.box_extensions;

import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.DocumentFilter;

class DocumentFilterExtension extends DocumentFilter {
  String a = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ _";
  
  DocumentFilterExtension(q paramq) {}
  
  public void insertString(DocumentFilter.FilterBypass paramFilterBypass, int paramInt, String paramString, AttributeSet paramAttributeSet) {
    if (paramString == null)
      return; 
    String str = this.b.getText();
    if (a(paramString)) {
      super.insertString(paramFilterBypass, paramInt, paramString, paramAttributeSet);
    } else {
      Toolkit.getDefaultToolkit().beep();
    } 
    if (!a(this.b.getText())) {
      this.b.setText(str);
      Toolkit.getDefaultToolkit().beep();
    } 
  }
  
  public void replace(DocumentFilter.FilterBypass paramFilterBypass, int paramInt1, int paramInt2, String paramString, AttributeSet paramAttributeSet) {
    if (paramString == null)
      return; 
    String str = this.b.getText();
    int i = str.length() + paramString.length() - paramInt2;
    if (a(paramString) && i < this.b.a) {
      super.replace(paramFilterBypass, paramInt1, paramInt2, paramString, paramAttributeSet);
    } else {
      Toolkit.getDefaultToolkit().beep();
    } 
    if (!a(this.b.getText()) && a(str)) {
      this.b.setText(str);
      Toolkit.getDefaultToolkit().beep();
    } 
  }
  
  private boolean a(String paramString) {
    for (byte b = 0; b < paramString.length(); b++) {
      if (this.a.indexOf(paramString.charAt(b)) == -1)
        return false; 
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bx/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */