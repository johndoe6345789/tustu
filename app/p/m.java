package p;

import G.R;
import bH.I;
import com.efiAnalytics.tuningwidgets.panels.V;
import com.efiAnalytics.ui.do;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import s.g;

class m extends JPanel {
  JRadioButton a = new JRadioButton(g.b("Simple"));
  
  JRadioButton b = new JRadioButton(g.b("Expression"));
  
  JRadioButton c = new JRadioButton(g.b("Reset after:"));
  
  JSlider d = null;
  
  JComboBox e = new JComboBox();
  
  JTextField f;
  
  do g;
  
  V h;
  
  JPanel i;
  
  JPanel j;
  
  JPanel k = null;
  
  boolean l;
  
  public m(g paramg, R paramR, boolean paramBoolean, String paramString) {
    ButtonGroup buttonGroup = new ButtonGroup();
    this.l = false;
    n n = new n(this, paramg);
    buttonGroup.add(this.a);
    this.a.addActionListener(n);
    buttonGroup.add(this.b);
    this.b.addActionListener(n);
    setLayout(new BoxLayout(this, 1));
    this.i = a(this.a);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(3, 3));
    this.h = new V(paramR);
    if (this.l) {
      this.h.removeAllItems();
      this.h.a("TPS_Pct");
    } 
    jPanel.add("West", (Component)this.h);
    this.e.setEditable(false);
    this.e.addItem(">");
    this.e.addItem("=");
    this.e.addItem("<");
    jPanel.add("Center", this.e);
    this.g = new do("", 4);
    jPanel.add("East", (Component)this.g);
    this.i.add("Center", jPanel);
    add(this.i);
    this.j = a(this.b);
    this.f = new JTextField("", 25);
    this.f.setBorder(BorderFactory.createLoweredBevelBorder());
    this.j.add("Center", this.f);
    if (!this.l)
      add(this.j); 
    if (paramBoolean) {
      this.k = a(this.c);
      this.d = new JSlider(0, 0, 600, 30);
      this.d.setMajorTickSpacing(100);
      this.d.setMinorTickSpacing(10);
      this.d.setPaintLabels(true);
      this.d.setPaintTicks(true);
      buttonGroup.add(this.c);
      this.c.addActionListener(n);
      this.k.add("Center", this.d);
      JLabel jLabel = new JLabel("   " + this.d.getValue() + " s.");
      this.d.addChangeListener(new o(this, paramg, jLabel));
      this.k.add("East", jLabel);
      add(this.k);
    } 
    this.a.setSelected(true);
  }
  
  public void a(String paramString) {
    if (paramString == null) {
      this.f.setText(paramString);
      return;
    } 
    this.f.setText(paramString);
    String[] arrayOfString = paramString.split(" ");
    if (arrayOfString.length == 1 && arrayOfString[0].trim().isEmpty()) {
      this.a.setSelected(true);
    } else if (arrayOfString.length == 3 && (arrayOfString[1].equals("<") || arrayOfString[1].equals("=") || arrayOfString[1].equals(">")) && I.a(arrayOfString[2])) {
      String str = arrayOfString[0].trim();
      if (this.d != null && str.equals("AppEvent.")) {
        int i = (int)Double.parseDouble(arrayOfString[2]);
        this.d.setValue(i);
        this.c.setSelected(true);
      } else {
        this.h.setSelectedItem(str);
        this.e.setSelectedItem(arrayOfString[1].trim());
        this.g.setText(arrayOfString[2].trim());
        this.a.setSelected(true);
      } 
    } else {
      this.b.setSelected(true);
    } 
    b();
  }
  
  public String a() {
    if (this.c != null && this.c.isSelected()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(g.a).append(this.d.getValue());
      return stringBuilder.toString();
    } 
    if (this.a.isSelected()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.h.getSelectedItem().toString()).append(" ").append(this.e.getSelectedItem().toString()).append(" ").append(this.g.getText());
      return stringBuilder.toString();
    } 
    return this.f.getText();
  }
  
  public void b() {
    if (this.m.c == null || !this.m.e.isSelected()) {
      fp.a(this, false);
      return;
    } 
    fp.a(this, true);
    if (this.a.isSelected()) {
      fp.a(this.i.getComponent(1), true);
      fp.a(this.j.getComponent(1), false);
      if (this.k != null) {
        fp.a(this.k.getComponent(1), false);
        fp.a(this.k.getComponent(2), false);
      } 
    } else if (this.c.isSelected()) {
      fp.a(this.i.getComponent(1), false);
      fp.a(this.j.getComponent(1), false);
      fp.a(this.k.getComponent(1), true);
      fp.a(this.k.getComponent(2), true);
    } else {
      fp.a(this.i.getComponent(1), false);
      fp.a(this.j.getComponent(1), true);
      if (this.k != null) {
        fp.a(this.k.getComponent(1), false);
        fp.a(this.k.getComponent(2), false);
      } 
    } 
  }
  
  private JPanel a(JRadioButton paramJRadioButton) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    paramJRadioButton.setPreferredSize(eJ.a(120, 25));
    jPanel.add("West", paramJRadioButton);
    return jPanel;
  }
  
  private void a(int paramInt) {
    this.d.setValue(paramInt);
    this.c.setSelected(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */