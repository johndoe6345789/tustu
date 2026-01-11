package com.efiAnalytics.ui;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabeledComboBoxPanel extends JPanel {
  JComboBox a = new JComboBox();
  
  public LabeledComboBoxPanel(RegistrationDialog paramdS, String paramString, String[] paramArrayOfString) {
    JLabel jLabel = new JLabel(paramString + " ");
    jLabel.setHorizontalAlignment(4);
    add("Center", jLabel);
    add("East", this.a);
    for (byte b = 0; b < paramArrayOfString.length; b++)
      this.a.addItem(paramArrayOfString[b]); 
  }
  
  public String a() {
    return (String)this.a.getSelectedItem();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */