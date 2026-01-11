package com.efiAnalytics.tunerStudio.panels;

import G.R;
import G.bT;
import G.s;
import W.I;
import W.v;
import W.z;
import aE.d;
import aP.T;
import aP.aF;
import aP.iH;
import bH.t;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import r.j;
import s.g;

public class a extends JPanel {
  JTextField a = new JTextField("", 16);
  
  JTextField b = new JTextField("", 16);
  
  JTextField c = new JTextField("", 20);
  
  T d;
  
  JButton e = new JButton("...");
  
  JCheckBox f = new JCheckBox(g.b("Disable Runtime Data"));
  
  aF g = new aF();
  
  private d j = null;
  
  aE.a h = null;
  
  R i;
  
  public a(R paramR) {
    this.i = paramR;
    this.d = new T(paramR);
    this.d.a(new d(this));
    setLayout(new BorderLayout(4, 4));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BoxLayout(jPanel1, 1));
    jPanel1.add(a(this.a, "<html>Device Identifier (short)<br>", "The short name, 6 characters or less for this CAN device.<br><b>Must be unique</b><br>This will be used to identify components of this device<br>such as OutputChannels and Data Log field names.</html>"));
    this.a.addKeyListener(new b(this));
    jPanel1.add(a(this.b, "Device description", "The long name or description used for this CAN device"));
    this.b.addKeyListener(new c(this));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 1));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add("West", this.f);
    this.f.setToolTipText(g.b("When checked, runtime data for gauges and data logs will not be read directly from this controller."));
    jPanel2.add(jPanel3);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout(8, 8));
    jPanel4.add("East", (Component)this.d);
    jPanel2.add(jPanel4);
    jPanel1.add(jPanel2);
    add("North", jPanel1);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout(4, 4));
    jPanel5.setBorder(BorderFactory.createTitledBorder(g.b("Device Configuration File:")));
    this.c.setBorder(BorderFactory.createLoweredBevelBorder());
    this.c.setEditable(false);
    jPanel5.add("Center", this.c);
    this.e.addActionListener(new f(this));
    jPanel5.add("East", this.e);
    add("Center", jPanel5);
    JScrollPane jScrollPane = new JScrollPane();
    jScrollPane.getViewport().setView((Component)this.g);
    jScrollPane.setAutoscrolls(true);
    jScrollPane.setMinimumSize(new Dimension(250, 60));
    jScrollPane.setPreferredSize(new Dimension(300, 100));
    add("South", jScrollPane);
    b(false);
  }
  
  public void a(aE.a parama) {
    this.h = parama;
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.a.setEnabled(paramBoolean);
    this.b.setEnabled(paramBoolean);
    this.c.setEnabled(paramBoolean);
    this.d.setEnabled(paramBoolean);
    this.e.setEnabled(paramBoolean);
    this.f.setEnabled(paramBoolean);
  }
  
  private JPanel a(JTextField paramJTextField, String paramString1, String paramString2) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(8, 8));
    JLabel jLabel = new JLabel(g.b(paramString1), 4);
    jPanel.add("Center", jLabel);
    jLabel.setToolTipText(paramString2);
    jPanel.add("East", paramJTextField);
    paramJTextField.setToolTipText(g.b(paramString2));
    paramJTextField.setBorder(BorderFactory.createLoweredBevelBorder());
    return jPanel;
  }
  
  private void b(String paramString) {
    String str = this.j.a(this.h);
    try {
      String str1 = this.h.t() + aE.a.h;
      if (!paramString.startsWith(str1)) {
        String str2 = this.a.getText() + ".ini";
        String str3 = str1 + str2;
        t.a(paramString, str3);
        paramString = str3;
      } 
      this.j.c(paramString);
      this.c.setText(paramString);
      a(paramString);
    } catch (V.a a1) {
      bV.d(g.b("Unable to load configuration settings.") + "\n" + a1.getLocalizedMessage(), this);
      a1.printStackTrace();
      this.j.c(str);
    } 
  }
  
  protected void a(String paramString) {
    if (this.j == null)
      throw new V.a("CAN Device not initialized."); 
    s[] arrayOfS = v.a().b(paramString);
    arrayOfS = (new I()).a(arrayOfS, paramString);
    this.g.a(arrayOfS);
    if (this.j != null && this.j.d() != null) {
      String[] arrayOfString = this.j.d();
      for (byte b = 0; b < arrayOfString.length; b++)
        this.g.a(arrayOfString[b]); 
    } 
    this.g.validate();
  }
  
  public d a() {
    if (this.j == null)
      return null; 
    this.j.a(this.a.getText());
    this.j.b(this.b.getText());
    this.j.c(this.c.getText());
    this.j.a(this.g.d());
    this.j.a(b());
    this.j.a(!this.f.isSelected());
    return this.j;
  }
  
  public void a(d paramd) {
    this.j = paramd;
    try {
      if (paramd.c() != null && !paramd.c().equals("")) {
        this.c.setText(paramd.a(this.h));
        a(this.c.getText());
      } else {
        this.c.setText("");
        this.g.a();
      } 
      this.a.setText(paramd.a());
      this.b.setText(paramd.b());
      a(paramd.e());
      b(true);
      this.f.setSelected(!paramd.f());
    } catch (V.a a1) {
      bV.d(g.b("Unable to load configuration settings.") + "\n" + a1.getMessage(), this);
      a1.printStackTrace();
    } 
    if (paramd.e() < 0 || this.d.d() < 0)
      this.d.e(); 
  }
  
  public int b() {
    return this.d.d();
  }
  
  public void a(int paramInt) {
    this.d.a(paramInt);
  }
  
  public void c() {
    this.j = null;
    this.a.setText("");
    this.b.setText("");
    this.c.setText("");
    b(false);
    this.g.a();
    this.g.validate();
  }
  
  private void b(boolean paramBoolean) {
    this.a.setEditable(paramBoolean);
    this.b.setEditable(paramBoolean);
    this.e.setEnabled(paramBoolean);
  }
  
  public void a(boolean paramBoolean) {
    this.a.setEnabled(paramBoolean);
  }
  
  public void d() {
    this.d.close();
  }
  
  public void a(aH.a parama) {
    if (parama.d() != null && !parama.d().isEmpty()) {
      bT bT = new bT();
      bT.a(parama.d());
      bT.b(parama.a());
      File file = new File(this.c.getText());
      String str = z.a(file);
      if (str == null || str.equals(bT.b()))
        return; 
      try {
        file = j.d(bT.b());
      } catch (V.a a1) {
        a1.printStackTrace();
      } 
      if (file != null && file.exists()) {
        b(file.getAbsolutePath());
        this.g.validate();
      } else {
        try {
          file = iH.a(bT);
        } catch (FileNotFoundException fileNotFoundException) {}
        if (file != null && file.exists()) {
          b(file.getAbsolutePath());
          this.g.validate();
        } else {
          String str1 = g.b(r.a.b + " does not have a configuration to support the found firmware") + ":\n" + parama.a() + "\n\n" + g.b("Required Serial Signature") + ":\n" + parama.d() + "\n\n\n" + g.b("Please click the 'Other' checkbox and browse") + ", \n" + g.b("to the Ecu Definition (ini) file provided with your firmware.");
          bV.d(str1, this);
        } 
      } 
    } 
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    return new Dimension(dimension.width, dimension.height + eJ.a(12));
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    return new Dimension(dimension.width, dimension.height + eJ.a(12));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */