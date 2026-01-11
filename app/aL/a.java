package aL;

import bH.D;
import bH.J;
import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Line;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.TargetDataLine;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class a extends JPanel {
  ab a = null;
  
  f b;
  
  JComboBox c = new JComboBox();
  
  JButton d;
  
  JButton e;
  
  JPanel f = new JPanel();
  
  JDialog g = null;
  
  JCheckBox h;
  
  public a(f paramf, ab paramab) {
    this.b = paramf;
    this.a = paramab;
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createEmptyBorder(eJ.a(6), eJ.a(6), eJ.a(6), eJ.a(6)));
    this.h = new JCheckBox(a("Include Audio in Data Logs"));
    add("North", this.h);
    this.h.setSelected(paramf.a());
    this.h.addActionListener(new b(this));
    JPanel jPanel = new JPanel();
    jPanel.setBorder(BorderFactory.createEmptyBorder(eJ.a(10), eJ.a(10), eJ.a(10), eJ.a(10)));
    jPanel.setLayout(new FlowLayout(2));
    this.d = new JButton(a("Ok"));
    this.d.addActionListener(new c(this));
    this.e = new JButton(a("Cancel"));
    this.e.addActionListener(new d(this));
    if (J.a()) {
      jPanel.add(this.d);
      jPanel.add(this.e);
    } else {
      jPanel.add(this.e);
      jPanel.add(this.d);
    } 
    add("South", jPanel);
    List list = a();
    this.f.setLayout(new GridLayout(0, 1, eJ.a(5), eJ.a(5)));
    for (e e : list)
      this.c.addItem(e); 
    b(paramf.b());
    this.f.add(a("Audio Input", this.c));
    add("Center", this.f);
  }
  
  private JPanel a(String paramString, Component paramComponent) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    JLabel jLabel = new JLabel(a(paramString) + ":", 4);
    Font font = UIManager.getFont("Label.font");
    Dimension dimension = new Dimension(eJ.a(100), font.getSize() + eJ.a(4));
    jLabel.setMaximumSize(dimension);
    jLabel.setPreferredSize(dimension);
    jPanel.add("West", jLabel);
    jPanel.add("Center", paramComponent);
    return jPanel;
  }
  
  private List a() {
    ArrayList<e> arrayList = new ArrayList();
    Mixer.Info[] arrayOfInfo = AudioSystem.getMixerInfo();
    for (Mixer.Info info : arrayOfInfo) {
      Mixer mixer = AudioSystem.getMixer(info);
      Line.Info[] arrayOfInfo1 = mixer.getTargetLineInfo();
      if (arrayOfInfo1.length > 0 && arrayOfInfo1[0].getLineClass().equals(TargetDataLine.class)) {
        D.d("Found Audio Input: " + info.getName());
        D.d("Line Description: " + info.getDescription());
        for (Line.Info info1 : arrayOfInfo1) {
          D.d("\t--- " + info1);
          arrayList.add(new e(this, info, mixer, info1));
        } 
      } 
    } 
    return arrayList;
  }
  
  private void b() {
    e e = (e)this.c.getSelectedItem();
    this.b.a(e.toString());
    if (this.g != null) {
      this.g.dispose();
      this.g = null;
    } 
  }
  
  private void c() {
    if (this.g != null) {
      this.g.dispose();
      this.g = null;
    } 
  }
  
  private void d() {
    this.b.a(this.h.isSelected());
  }
  
  public void a(Window paramWindow) {
    this.g = new JDialog(paramWindow, a("Data Log Audio Configuration"));
    this.g.add("Center", this);
    this.g.pack();
    bV.a(paramWindow, this.g);
    this.g.setVisible(true);
  }
  
  private String a(String paramString) {
    if (this.a != null)
      paramString = this.a.a(paramString); 
    return paramString;
  }
  
  private void b(String paramString) {
    for (byte b = 0; b < this.c.getItemCount(); b++) {
      if (((e)this.c.getItemAt(b)).equals(paramString)) {
        this.c.setSelectedIndex(b);
        return;
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aL/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */