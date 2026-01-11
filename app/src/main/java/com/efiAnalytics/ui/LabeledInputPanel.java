package com.efiAnalytics.ui;

import java.awt.BorderLayout;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

class LabeledInputPanel extends JPanel {
  TextField a = null;
  
  JLabel b = null;
  
  ea(dS paramdS, String paramString1, String paramString2) {
    this(paramdS, paramString1, paramString2, false);
  }
  
  ea(dS paramdS, String paramString1, String paramString2, boolean paramBoolean) {
    setLayout(new BorderLayout());
    JLabel jLabel = new JLabel(paramString1 + " ");
    jLabel.setHorizontalAlignment(4);
    add("Center", jLabel);
    if (!paramBoolean) {
      this.a = new TextField(paramString2);
      this.a.addFocusListener(new eb(this));
      this.a.setColumns(35);
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
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */