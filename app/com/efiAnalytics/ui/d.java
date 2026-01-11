package com.efiAnalytics.ui;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.StringTokenizer;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class d extends JDialog {
  JLabel a = new JLabel(" ", 0);
  
  public d(Window paramWindow, String paramString1, String paramString2) {
    super(paramWindow, paramString1, Dialog.ModalityType.MODELESS);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    add("Center", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("wait_animated.gif"));
    ImageIcon imageIcon = new ImageIcon(image);
    JLabel jLabel = new JLabel();
    jLabel.setIcon(imageIcon);
    jPanel2.add(jLabel);
    jPanel1.add("Center", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(0, 1, 4, 4));
    StringTokenizer stringTokenizer = new StringTokenizer(paramString2, "\n");
    while (stringTokenizer.hasMoreTokens())
      jPanel3.add(new JLabel(stringTokenizer.nextToken(), 0)); 
    jPanel3.add(this.a);
    jPanel1.add("South", jPanel3);
    jPanel1.add("North", new JLabel(" "));
    pack();
  }
  
  public void a(String paramString) {
    this.a.setText(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */