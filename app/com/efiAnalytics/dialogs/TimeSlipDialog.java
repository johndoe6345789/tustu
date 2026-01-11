package com.efiAnalytics.dialogs;

import bH.J;
import bH.ab;
import bu.a;
import com.efiAnalytics.ui.a;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class TimeSlipDialog extends JDialog {
  e a;
  
  ab b = null;
  
  ArrayList c = new ArrayList();
  
  public b(Window paramWindow, String paramString, ab paramab) {
    super(paramWindow, paramString, Dialog.ModalityType.MODELESS);
    this.a = new e(paramString, paramab);
    this.b = paramab;
    setLayout(new BorderLayout());
    add(this.a, "Center");
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    JButton jButton1 = new JButton(a("Apply"));
    jButton1.addActionListener(new c(this));
    JButton jButton2 = new JButton(a("Cancel"));
    jButton2.addActionListener(new d(this));
    if (J.a()) {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    } else {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    } 
    add(jPanel, "South");
  }
  
  public void a(a parama) {
    this.a.a(parama);
  }
  
  public a a() {
    return this.a.b();
  }
  
  public String b() {
    return this.a.a();
  }
  
  private void c() {
    for (a a : this.c) {
      if (!a.a())
        return; 
    } 
    dispose();
  }
  
  private void d() {
    for (a a : this.c)
      a.b(); 
    dispose();
  }
  
  public void a(a parama) {
    this.c.add(parama);
  }
  
  private String a(String paramString) {
    if (this.b != null)
      paramString = this.b.a(paramString); 
    return paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/dialogs/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */