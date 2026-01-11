package com.efiAnalytics.dialogs;

import bH.c;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.util.zip.CRC32;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class CrcCheckPanel extends JPanel {
  JTextPane a = new JTextPane();
  
  JLabel b = new JLabel();
  
  JButton c = new JButton("Calculate CRC");
  
  public CrcCheckPanel() {
    setLayout(new BorderLayout());
    add("Center", this.a);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("Center", this.b);
    jPanel.add("East", this.c);
    this.c.addActionListener(new a(this));
    add("South", jPanel);
  }
  
  private void a() {
    int[] arrayOfInt;
    try {
      arrayOfInt = c.b(this.a.getText());
    } catch (Exception exception) {
      bV.d("Failed to parse input. Expected format: xFF xFE x0F ...", this);
      return;
    } 
    CRC32 cRC32 = new CRC32();
    cRC32.reset();
    for (int i : arrayOfInt)
      cRC32.update((byte)i); 
    byte[] arrayOfByte = new byte[4];
    arrayOfByte = c.a((int)cRC32.getValue(), arrayOfByte, true);
    this.b.setText("CRC32: " + c.d(arrayOfByte));
  }
  
  public static void main(String[] paramArrayOfString) {
    CrcCheckPanel crcCheckPanel = new CrcCheckPanel();
    JDialog jDialog = bV.a(crcCheckPanel, null, "CRC Calculator", null);
    jDialog.setDefaultCloseOperation(2);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/dialogs/CrcCheckPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */