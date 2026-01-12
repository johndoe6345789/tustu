package com.efiAnalytics.apps.ts.dashboard;

import G.R;
import G.T;
import bH.X;
import com.efiAnalytics.apps.ts.dashboard.renderers.GaugePainter;
import com.efiAnalytics.apps.ts.dashboard.renderers.e;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cp;
import com.efiAnalytics.ui.cq;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import r.ThreadedFile;

public class GaugePropertiesPanel extends JPanel implements GaugeSettingsCallback, bc {
  Gauge a = null;

  JDialog b = null;

  boolean c = false;

  public GaugePropertiesPanel(Gauge paramGauge) {
    this.a = paramGauge;
    this.c = paramGauge.isRunDemo();
    c();
  }

  private void c() {
    aF aF = new aF(this);
    setLayout(new GridLayout(0, 2));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    String str = "Output Channel / Style";
    jPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), str));
    jPanel2.setLayout(new GridLayout(0, 1));
    JPanel jPanel3 = new JPanel();
    jPanel2.add(jPanel3);
    JLabel jLabel = new JLabel("OutputChannel");
    jPanel3.add(jLabel);
    T t = T.a();
    R r = t.c();
    JComboBox<String> jComboBox = new JComboBox();
    jComboBox.setEditable(false);
    jComboBox.addItem("");
    String[] arrayOfString1 = r.s();
    Object[] arrayOfObject = X.a((Object[]) arrayOfString1);
    for (byte b1 = 0; b1 < arrayOfObject.length; b1++) jComboBox.addItem(arrayOfObject[b1]);
    jComboBox.setSelectedItem(this.a.getOutputChannel());
    jComboBox.addActionListener(new ae(this));
    jPanel3.add(jComboBox);
    jPanel3 = new JPanel();
    jLabel = new JLabel("Gauge Style");
    jPanel3.add(jLabel);
    GaugePainter[] arrayOfGaugePainter = e.a();
    jComboBox = new JComboBox<>();
    jComboBox.setEditable(false);
    for (byte b2 = 0; b2 < arrayOfGaugePainter.length; b2++)
      jComboBox.addItem(new aE(this, arrayOfGaugePainter[b2]));
    jComboBox.setSelectedItem(new aE(this, this.a.getGaugePainter()));
    jComboBox.addActionListener(new ap(this));
    jPanel3.add(jComboBox);
    jPanel2.add(jPanel3);
    jPanel1.add("North", jPanel2);
    JPanel jPanel4 = new JPanel();
    str = "Gauge Angles";
    jPanel4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), str));
    jPanel4.setLayout(new GridLayout(0, 1));
    JSlider jSlider = a(this.a.getFaceAngle(), 0, 360, "Face Angle");
    jSlider.setPaintLabels(true);
    jSlider.setSnapToTicks(true);
    jSlider.addChangeListener(new ax(this));
    jPanel4.add(jSlider);
    jSlider = a(this.a.getFaceAngle(), 0, 360, "Face Start Angle");
    jSlider.setPaintLabels(true);
    jSlider.setSnapToTicks(true);
    jSlider.addChangeListener(new ay(this));
    jPanel4.add(jSlider);
    jSlider = a(this.a.getSweepBeginDegree(), 0, 360, "Needle Start Angle");
    jSlider.setPaintLabels(true);
    jSlider.setSnapToTicks(true);
    jSlider.addChangeListener(new az(this));
    jPanel4.add(jSlider);
    jSlider = a(this.a.getSweepAngle(), 0, 360, "Sweep Angle");
    jSlider.setPaintLabels(true);
    jSlider.setSnapToTicks(true);
    jSlider.addChangeListener(new aA(this));
    jPanel4.add(jSlider);
    jPanel1.add("Center", jPanel4);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new GridLayout(0, 1));
    str = "Border Settings";
    jPanel6.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), str));
    jSlider = a(this.a.getBorderWidth(), 0, 25, "Border Thickness");
    jSlider.setPaintLabels(true);
    jSlider.setSnapToTicks(true);
    jSlider.addChangeListener(new aB(this));
    jPanel6.add(jSlider);
    jPanel5.add("North", jPanel6);
    JPanel jPanel7 = new JPanel();
    jPanel7.setLayout(new GridLayout(0, 1));
    jSlider = a(this.a.getFontSizeAdjustment(), -6, 6, "Font Size");
    jSlider.setPaintLabels(true);
    jSlider.setSnapToTicks(true);
    jSlider.setValue(this.a.getFontSizeAdjustment());
    jSlider.addChangeListener(new aC(this));
    jPanel7.add(jSlider);
    jComboBox = new JComboBox<>();
    jComboBox.setEditable(false);
    jComboBox.addItem("");
    String[] arrayOfString2 = b();
    for (byte b3 = 0; b3 < arrayOfString2.length; b3++) jComboBox.addItem(arrayOfString2[b3]);
    jComboBox.setSelectedItem(this.a.getFontFamily());
    jComboBox.addActionListener(new aD(this));
    jPanel3 = new JPanel();
    jPanel3.add(jComboBox);
    jPanel7.add(jPanel3);
    jPanel5.add("South", jPanel7);
    jPanel1.add("South", jPanel5);
    add(jPanel1);
    Font font = new Font("Arial Unicode MS", 1, eJ.a(12));
    JPanel jPanel8 = new JPanel();
    jPanel8.setLayout(new BorderLayout());
    JPanel jPanel9 = new JPanel();
    jPanel9.setLayout(new GridLayout(0, 2));
    str = "Title / units";
    jPanel9.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), str));
    jLabel = new JLabel("Gauge Title");
    jLabel.setHorizontalAlignment(4);
    jPanel9.add(jLabel);
    JTextField jTextField = new JTextField(this.a.title());
    jTextField.addFocusListener(aF);
    jTextField.addKeyListener(new af(this));
    jPanel9.add(jTextField);
    jLabel = new JLabel("Gauge Units");
    jLabel.setHorizontalAlignment(4);
    jPanel9.add(jLabel);
    jTextField = new JTextField(this.a.units());
    jTextField.addFocusListener(aF);
    jTextField.addKeyListener(new ag(this));
    jPanel9.add(jTextField);
    jLabel = new JLabel("Value");
    jLabel.setHorizontalAlignment(4);
    jPanel9.add(jLabel);
    jTextField = new JTextField(this.a.getValue() + "");
    jTextField.addFocusListener(aF);
    jTextField.addKeyListener(new ah(this));
    jPanel9.add(jTextField);
    jPanel8.add("North", jPanel9);
    JPanel jPanel10 = new JPanel();
    jPanel10.setLayout(new GridLayout(0, 1, 4, 4));
    str = "Gauge Colors";
    jPanel10.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), str));
    cp cp = new cp("Border Color");
    cp.setFont(font);
    cp.a(this.a.getTrimColor());
    cp.b(20);
    cp.a(new ai(this));
    jPanel10.add((Component) cp);
    cp = new cp("Face Color");
    cp.setFont(font);
    cp.a(this.a.getBackColor());
    cp.b(20);
    cp.a(new aj(this));
    jPanel10.add((Component) cp);
    cp = new cp("Font Color");
    cp.setFont(font);
    cp.a(this.a.getFontColor());
    cp.b(20);
    cp.a(new ak(this));
    jPanel10.add((Component) cp);
    cp = new cp("Needle Color");
    cp.setFont(font);
    cp.a(this.a.getNeedleColor());
    cp.b(20);
    cp.a(new al(this));
    jPanel10.add((Component) cp);
    cp = new cp("Warning Color");
    cp.setFont(font);
    cp.a(this.a.getWarnColor());
    cp.b(20);
    cp.a(new am(this));
    jPanel10.add((Component) cp);
    cp = new cp("Critical Limits Color");
    cp.setFont(font);
    cp.a(this.a.getCriticalColor());
    cp.b(20);
    cp.a(new an(this));
    jPanel10.add((Component) cp);
    jPanel8.add("Center", jPanel10);
    JPanel jPanel11 = new JPanel();
    jPanel11.setLayout(new GridLayout(0, 2));
    str = "Limits and Thresholds";
    jPanel11.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), str));
    jLabel = new JLabel("Minimum Value");
    jLabel.setHorizontalAlignment(4);
    jPanel11.add(jLabel);
    jTextField = new JTextField(X.a(this.a.min()));
    jTextField.addFocusListener(aF);
    jTextField.addKeyListener(new ao(this));
    jPanel11.add(jTextField);
    jLabel = new JLabel("Maximum Value");
    jLabel.setHorizontalAlignment(4);
    jPanel11.add(jLabel);
    jTextField = new JTextField(X.a(this.a.max()));
    jTextField.addFocusListener(aF);
    jTextField.addKeyListener(new aq(this));
    jPanel11.add(jTextField);
    jLabel = new JLabel("Low Critical");
    jLabel.setHorizontalAlignment(4);
    jPanel11.add(jLabel);
    jTextField = new JTextField(X.a(this.a.lowCritical()));
    jTextField.addFocusListener(aF);
    jTextField.addKeyListener(new ar(this));
    jPanel11.add(jTextField);
    jLabel = new JLabel("Low Warning");
    jLabel.setHorizontalAlignment(4);
    jPanel11.add(jLabel);
    jTextField = new JTextField(X.a(this.a.lowWarning()));
    jTextField.addFocusListener(aF);
    jTextField.addKeyListener(new as(this));
    jPanel11.add(jTextField);
    jLabel = new JLabel("High Warning");
    jLabel.setHorizontalAlignment(4);
    jPanel11.add(jLabel);
    jTextField = new JTextField(X.a(this.a.highWarning()));
    jTextField.addFocusListener(aF);
    jTextField.addKeyListener(new at(this));
    jPanel11.add(jTextField);
    jLabel = new JLabel("High Critical");
    jLabel.setHorizontalAlignment(4);
    jPanel11.add(jLabel);
    jTextField = new JTextField(X.a(this.a.highCritical()));
    jTextField.addFocusListener(aF);
    jTextField.addKeyListener(new au(this));
    jPanel11.add(jTextField);
    JPanel jPanel12 = new JPanel();
    jTextField = new JTextField(this.a.getValueDigitsVP().toString());
    jTextField.addFocusListener(aF);
    jTextField.addKeyListener(new av(this));
    jPanel12.add(jTextField);
    jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add("Center", jPanel11);
    jPanel3.add("South", jPanel12);
    jPanel8.add("South", jPanel3);
    add(jPanel8);
  }

  protected Gauge a() {
    return this.a;
  }

  private JSlider a(int paramInt1, int paramInt2, int paramInt3, String paramString) {
    JSlider jSlider = new JSlider();
    jSlider.setMajorTickSpacing(10 / (paramInt3 - paramInt2));
    jSlider.setMinimum(paramInt2);
    jSlider.setMaximum(paramInt3);
    jSlider.setValue(paramInt1);
    jSlider.setPaintTrack(true);
    jSlider.setBorder(
        BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(1), paramString));
    return jSlider;
  }

  public void a(s params) {
    params.repaint();
  }

  public void close() {
    this.a.setRunDemo(this.c);
  }

  public void a(Component paramComponent) {
    this.b = new JDialog(bV.a(paramComponent), "Adjust Gauge Settings");
    this.b.add("Center", this);
    JButton jButton = new JButton("Close");
    jButton.addActionListener(new aw(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    jPanel.add(jButton);
    this.b.add("South", jPanel);
    this.b.pack();
    this.b.setLocationRelativeTo(this.a);
    this.b.setLocation(
        this.b.getX() + this.b.getWidth() / 2 + this.a.getWidth() / 2, this.b.getY());
    this.b.setVisible(true);
  }

  public static String[] b() {
    cq.a().a(ThreadedFile.F());
    return cq.a().c();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
