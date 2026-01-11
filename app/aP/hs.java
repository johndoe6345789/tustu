package aP;

import G.R;
import G.T;
import G.cV;
import bH.D;
import bH.c;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import r.a;
import s.g;
import z.k;
import z.m;
import z.n;

public class hs extends JDialog implements ActionListener {
  final int a = 450;
  
  final int b = 600;
  
  private JButton d;
  
  private JButton e;
  
  private JButton f;
  
  private JPanel g;
  
  private JPanel h;
  
  private JTextField i;
  
  JButton c;
  
  private JTextArea j;
  
  private JTextArea k;
  
  private hy l;
  
  private n m = new n();
  
  private k n;
  
  private Properties o = null;
  
  private int p = 3;
  
  public hs(Frame paramFrame, boolean paramBoolean) {
    super(paramFrame, "Mini-Term", true);
    h();
    a a = a.a();
    this.p = a.c(a.aA, 3);
    addWindowListener(new hx(this, this));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(1, 0));
    jPanel1.add(new JLabel(g.b("Output Format") + ":", 0));
    ButtonGroup buttonGroup = new ButtonGroup();
    JCheckBox jCheckBox = new JCheckBox("ASCII");
    buttonGroup.add(jCheckBox);
    if (this.p == 3)
      jCheckBox.setSelected(true); 
    jCheckBox.addItemListener(new ht(this));
    jPanel1.add(jCheckBox);
    jCheckBox = new JCheckBox("Hex", (this.p == 2));
    buttonGroup.add(jCheckBox);
    if (this.p == 2)
      jCheckBox.setSelected(true); 
    jCheckBox.addItemListener(new hu(this));
    jPanel1.add(jCheckBox);
    jCheckBox = new JCheckBox("Decimal");
    buttonGroup.add(jCheckBox);
    if (this.p == 1)
      jCheckBox.setSelected(true); 
    jCheckBox.addItemListener(new hv(this));
    jPanel1.add(jCheckBox);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("North", jPanel1);
    if (paramBoolean) {
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new BorderLayout());
      this.i = new JTextField();
      jPanel.add("Center", this.i);
      this.c = new JButton("Send");
      this.c.addActionListener(new hw(this));
      jPanel.add("East", this.c);
      jPanel2.add("Center", jPanel);
    } 
    add("North", jPanel2);
    this.h = new JPanel();
    this.h.setLayout(new GridLayout(2, 1, 2, 2));
    add("East", new JLabel());
    add("West", new JLabel());
    this.j = new JTextArea();
    JScrollPane jScrollPane1 = new JScrollPane(this.j);
    this.j.setBorder(BorderFactory.createLoweredBevelBorder());
    this.h.add(jScrollPane1);
    this.k = new JTextArea();
    JScrollPane jScrollPane2 = new JScrollPane(this.k);
    this.k.setBorder(BorderFactory.createLoweredBevelBorder());
    this.k.setEditable(false);
    this.h.add(jScrollPane2);
    add(this.h, "Center");
    R r = T.a().c();
    boolean bool = (r != null && r.C().q()) ? true : false;
    this.l = new hy(this, paramFrame);
    if (bool) {
      Component[] arrayOfComponent = this.l.getComponents();
      for (byte b = 0; b < arrayOfComponent.length; b++)
        arrayOfComponent[b].setEnabled(false); 
    } 
    this.g = new JPanel();
    this.d = new JButton(g.b("Open Port"));
    this.d.addActionListener(this);
    this.d.setEnabled(!bool);
    this.g.add(this.d);
    this.e = new JButton(g.b("Close Port"));
    this.e.addActionListener(this);
    this.e.setEnabled(false);
    this.e.setEnabled(!bool);
    this.g.add(this.e);
    this.f = new JButton(g.b("Exit"));
    this.f.addActionListener(this);
    this.g.add(this.f);
    JPanel jPanel3 = new JPanel();
    GridBagLayout gridBagLayout = new GridBagLayout();
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    jPanel3.setLayout(gridBagLayout);
    gridBagConstraints.gridwidth = 0;
    gridBagLayout.setConstraints(this.l, gridBagConstraints);
    gridBagConstraints.weightx = 1.0D;
    jPanel3.add(this.l);
    gridBagLayout.setConstraints(this.g, gridBagConstraints);
    jPanel3.add(this.g);
    add(jPanel3, "South");
    this.n = new k(this, this.m, this.j, this.k);
    a();
    setSize(600, 450);
    this.j.requestFocus();
  }
  
  private void f() {
    String[] arrayOfString;
    String str = this.i.getText();
    if (str.contains(",")) {
      arrayOfString = str.split(",");
    } else {
      arrayOfString = str.split(" ");
    } 
    try {
      int[] arrayOfInt = c.a(arrayOfString);
      boolean bool = false;
      if (bool && T.a().c() != null && T.a().c().O().C() != null) {
        cV cV = T.a().c().O().C();
        byte[] arrayOfByte = c.a(arrayOfInt);
        arrayOfByte = cV.a(arrayOfByte);
        arrayOfInt = c.b(arrayOfByte);
      } 
      D.c("Sending: " + c.b(arrayOfInt));
      this.n.a(arrayOfInt);
    } catch (IOException iOException) {
      JOptionPane.showMessageDialog(this.rootPane, "Error sending bytes.\nCheck the port is open.Reported Error:\n" + iOException.getMessage());
      Logger.getLogger(hs.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } catch (Exception exception) {
      JOptionPane.showMessageDialog(this.rootPane, "Error Parsing bytes.\nMust be in the format:\n<number><space><number><space>...\nExample: 0x02 0x66 0x00 0xF4 0xDB 0xDF 0x21\nReported Error:\n" + exception.getMessage());
      Logger.getLogger(hs.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
  }
  
  public void a() {
    this.l.a();
  }
  
  public void a(int paramInt) {
    if (paramInt == 2 || paramInt == 1 || paramInt == 3) {
      this.p = paramInt;
      D.c("format changed to:" + paramInt);
      a a = a.a();
      a.b(a.aA, "" + paramInt);
    } 
  }
  
  public int b() {
    return this.p;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = paramActionEvent.getActionCommand();
    this.j.requestFocus();
    if (str.equals(g.b("Open Port")))
      try {
        c();
      } catch (m m) {
        bV.d("Error Opening Port!\nError opening port,\n" + m.getMessage() + ".\nSelect new settings, try again.", this);
      }  
    if (str.equals(g.b("Close Port")))
      e(); 
    if (str.equals(g.b("Exit"))) {
      e();
      dispose();
    } 
  }
  
  public void c() {
    this.d.setEnabled(false);
    Cursor cursor = getCursor();
    a(Cursor.getPredefinedCursor(3));
    this.l.b();
    try {
      this.n.a();
    } catch (m m) {
      this.d.setEnabled(true);
      a(cursor);
      throw m;
    } 
    d();
    a(cursor);
  }
  
  public void d() {
    this.d.setEnabled(false);
    this.e.setEnabled(true);
  }
  
  public void e() {
    this.n.c();
    this.d.setEnabled(true);
    this.e.setEnabled(false);
  }
  
  private void a(Cursor paramCursor) {
    setCursor(paramCursor);
    this.k.setCursor(paramCursor);
    this.j.setCursor(paramCursor);
  }
  
  private void g() {
    this.n.c();
    dispose();
  }
  
  private void h() {
    a a = a.a();
    this.p = a.c(a.aA, 2);
    this.m.a(a.c(a.az, "COM1"));
    this.m.b(a.c(a.ay, "9600"));
  }
  
  public void setVisible(boolean paramBoolean) {
    super.setVisible(paramBoolean);
    if (paramBoolean)
      this.j.requestFocus(); 
  }
  
  public void a(String paramString) {
    this.l.a(paramString);
  }
  
  public void b(String paramString) {
    this.l.b(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */