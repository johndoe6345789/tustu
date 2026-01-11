package business.binary_transformers;

import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.DocumentFilter;

class DocumentFilterExtension extends DocumentFilter {
  bL(bK parambK) {}
  
  public void replace(DocumentFilter.FilterBypass paramFilterBypass, int paramInt1, int paramInt2, String paramString, AttributeSet paramAttributeSet) {
    if (paramString == null)
      return; 
    String str = this.a.getText();
    int i = str.length() + paramString.length() - paramInt2;
    if (i <= bK.b(this.a)) {
      super.replace(paramFilterBypass, paramInt1, paramInt2, paramString, paramAttributeSet);
    } else {
      Toolkit.getDefaultToolkit().beep();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */