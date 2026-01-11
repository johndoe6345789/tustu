package aP;

import G.bT;
import aE.a;
import bH.X;
import bt.j;
import c.a;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import r.a;
import r.i;
import s.g;

public class iA extends JDialog {
  static String a = "$controllerDescription";
  
  a b = null;
  
  bT c = null;
  
  String d = "";
  
  String e;
  
  boolean f = false;
  
  public iA(Frame paramFrame, a parama, String paramString1, bT parambT, String paramString2) {
    super(paramFrame, g.b("Signature Mismatch"), true);
    this.b = parama;
    this.e = paramString1;
    this.d = paramString2;
    this.c = parambT;
    setLayout(new BorderLayout());
    JTextPane jTextPane = new JTextPane();
    jTextPane.setForeground(Color.BLACK);
    jTextPane.setEditable(false);
    jTextPane.setContentType("text/html");
    String str1 = X.b(a(paramString2), "$configSig", paramString2);
    str1 = X.b(str1, "$controllerSig", parambT.b());
    str1 = X.b(str1, a, parambT.c());
    jTextPane.setText(str1);
    jTextPane.putClientProperty("JEditorPane.honorDisplayProperties", Boolean.valueOf(true));
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("Center", jTextPane);
    add("Center", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout());
    JButton jButton = new JButton(g.b("Open Different Project"));
    jButton.addActionListener(new iB(this));
    jPanel2.add(jButton);
    jButton = new JButton(g.b("Update ECU Definition"));
    jButton.addActionListener(new iC(this));
    jPanel2.add(jButton);
    jButton = new JButton(g.b("Connect Anyway"));
    jButton.addActionListener(new iE(this));
    jPanel2.add(jButton);
    jButton = new JButton(g.b("Work offline"));
    jButton.addActionListener(new iF(this));
    jPanel2.add(jButton);
    String str2 = g.b("This message indicates that your current project is configured to work with a different firmware than found on the ECU.");
    str2 = str2 + "\n";
    str2 = str2 + g.b("You must select one of the following choices to proceed:");
    str2 = str2 + "\n";
    str2 = str2 + "\n";
    str2 = str2 + g.b("Open a Different Project - If you have a different project already created that is normally used with the attached ECU, use this option.");
    str2 = str2 + "\n";
    str2 = str2 + "\n";
    str2 = str2 + g.b("Update ECU Definition - By Selecting this option, " + a.b + " will attempt to update the ECU Definition (AKA ini file) for this project to one that will work with the firmware on the attached ECU. This is commonly the best option after updating firmware versions where it is the same car and ECU, just a newer version of firmware. It is not advised to used this option if it is a different ECU family.");
    str2 = str2 + "\n";
    str2 = str2 + "\n";
    str2 = str2 + g.b("Connect Anyway - Only to be used if you know what you are doing! This could lead to corruption of your tune.");
    str2 = str2 + "\n";
    str2 = str2 + "\n";
    str2 = str2 + g.b("Work offline - This will close this dialog and go offline. This is a safe option if you do not know what to do or want to create a new project to work with this ECU.");
    j j = new j(str2);
    jPanel2.add((Component)j);
    add("South", jPanel2);
    pack();
  }
  
  public void setVisible(boolean paramBoolean) {
    if (SwingUtilities.isEventDispatchThread()) {
      pack();
      super.setVisible(paramBoolean);
    } else {
      try {
        iG iG = new iG(this, paramBoolean);
        SwingUtilities.invokeAndWait(iG);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(iA.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } catch (InvocationTargetException invocationTargetException) {
        Logger.getLogger(iA.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
      } 
    } 
  }
  
  private String a(String paramString) {
    boolean bool = i.a().a(" ,SD;LKODGPOIGD9");
    null = "<br><center><b>" + g.b("Firmware signature Mismatch!!!!") + "</b></center><br>";
    if (!bool)
      null = null + g.b("Your " + a.a(paramString, a.f) + " is using firmware:") + "<br>\n<center>'" + a + "'</center><br>\n<p>"; 
    return null + g.b("For " + a.b + " to communicate correctly") + ", <br>" + g.b("the Serial Signature for your project must match what is reported by the " + a.a(paramString, a.g) + ".") + " <br></p><br>\n&nbsp;&nbsp;&nbsp;&nbsp;<b>" + g.b("Project Serial signature") + ":</b> '" + "$configSig" + "'<br>\n&nbsp;&nbsp;&nbsp;&nbsp;<b>" + a.a(paramString, a.f) + " " + g.b("Serial signature") + ": </b> '" + "$controllerSig" + "'<br><br>\n<p>" + g.b("It is not recommended that you connect with the incorrect ecu definition!") + "<br>" + g.b("To correct this, up date the ECU Definition in your project to match that on the " + a.a(paramString, a.f) + ".") + "<br></p><br>\n<center><b>" + g.b("How would you like " + a.b + " to handle this?") + "</b></center><br> ";
  }
  
  public void a() {
    f.a().c(dd.a().c());
  }
  
  private void c() {
    iH iH = new iH();
    if (iH.a(this.b, this.e, this.d, this.c))
      dispose(); 
  }
  
  private void d() {
    this.f = true;
    dispose();
  }
  
  public boolean b() {
    return this.f;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */