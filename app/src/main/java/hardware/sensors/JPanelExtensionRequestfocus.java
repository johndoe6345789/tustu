package aA;

import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.TextField;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

class JPanelExtensionRequestfocus extends JPanel {
  TextField a = null;
  
  JLabel b = null;
  
  JPanelExtensionRequestfocus(a parama, String paramString1, String paramString2) {
    this(parama, paramString1, paramString2, false);
  }
  
  JPanelExtensionRequestfocus(a parama, String paramString1, String paramString2, boolean paramBoolean) {
    setLayout(new BorderLayout(eJ.a(10), eJ.a(10)));
    setBorder(BorderFactory.createEmptyBorder(eJ.a(1), eJ.a(10), eJ.a(1), eJ.a(10)));
    JLabel jLabel = new JLabel(a.a(parama, paramString1));
    jLabel.setHorizontalAlignment(4);
    add("Center", jLabel);
    if (!paramBoolean) {
      this.a = new TextField(paramString2);
      this.a.addFocusListener(new f(this));
      this.a.setColumns(30);
      add("East", this.a);
    } else {
      this.b = new JLabel(paramString2);
      add("East", this.b);
    } 
  }
  
  public void requestFocus() {
    if (this.a != null) {
      this.a.requestFocus();
    } else {
      super.requestFocus();
    } 
  }
  
  public String a() {
    return (this.b == null) ? this.a.getText() : this.b.getText();
  }
  
  public void a(String paramString) {
    if (this.b == null) {
      this.a.setText(paramString);
    } else {
      this.b.setText(paramString);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aA/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */