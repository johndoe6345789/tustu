package aP;

import G.AeInterfaceMikeTostring;
import aE.PropertiesExtension;
import bH.X;
import bt.j;
import c.PropertiesExtension;
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
import r.PropertiesExtension;
import r.RInterfaceIndia;
import s.SComponentGolf;

public class JDialogExtensionSetvisible extends JDialog {
  static String PropertiesExtension = "$controllerDescription";
  
  PropertiesExtension b = null;
  
  AeInterfaceMikeTostring c = null;
  
  String d = "";
  
  String e;
  
  boolean f = false;
  
  public JDialogExtensionSetvisible(Frame paramFrame, PropertiesExtension parama, String paramString1, AeInterfaceMikeTostring parambT, String paramString2) {
    super(paramFrame, SComponentGolf.b("Signature Mismatch"), true);
    this.b = parama;
    this.e = paramString1;
    this.d = paramString2;
    this.c = parambT;
    setLayout(new BorderLayout());
    JTextPane jTextPane = new JTextPane();
    jTextPane.setForeground(Color.BLACK);
    jTextPane.setEditable(false);
    jTextPane.setContentType("text/html");
    String str1 = X.b(PropertiesExtension(paramString2), "$configSig", paramString2);
    str1 = X.b(str1, "$controllerSig", parambT.b());
    str1 = X.b(str1, PropertiesExtension, parambT.c());
    jTextPane.setText(str1);
    jTextPane.putClientProperty("JEditorPane.honorDisplayProperties", Boolean.valueOf(true));
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("Center", jTextPane);
    add("Center", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout());
    JButton jButton = new JButton(SComponentGolf.b("Open Different Project"));
    jButton.addActionListener(new iB(this));
    jPanel2.add(jButton);
    jButton = new JButton(SComponentGolf.b("Update ECU Definition"));
    jButton.addActionListener(new iC(this));
    jPanel2.add(jButton);
    jButton = new JButton(SComponentGolf.b("Connect Anyway"));
    jButton.addActionListener(new iE(this));
    jPanel2.add(jButton);
    jButton = new JButton(SComponentGolf.b("Work offline"));
    jButton.addActionListener(new iF(this));
    jPanel2.add(jButton);
    String str2 = SComponentGolf.b("This message indicates that your current project is configured to work with PropertiesExtension different firmware than found on the ECU.");
    str2 = str2 + "\n";
    str2 = str2 + SComponentGolf.b("You must select one of the following choices to proceed:");
    str2 = str2 + "\n";
    str2 = str2 + "\n";
    str2 = str2 + SComponentGolf.b("Open PropertiesExtension Different Project - If you have PropertiesExtension different project already created that is normally used with the attached ECU, use this option.");
    str2 = str2 + "\n";
    str2 = str2 + "\n";
    str2 = str2 + SComponentGolf.b("Update ECU Definition - By Selecting this option, " + PropertiesExtension.b + " will attempt to update the ECU Definition (AKA ini file) for this project to one that will work with the firmware on the attached ECU. This is commonly the best option after updating firmware versions where it is the same car and ECU, just PropertiesExtension newer version of firmware. It is not advised to used this option if it is PropertiesExtension different ECU family.");
    str2 = str2 + "\n";
    str2 = str2 + "\n";
    str2 = str2 + SComponentGolf.b("Connect Anyway - Only to be used if you know what you are doing! This could lead to corruption of your tune.");
    str2 = str2 + "\n";
    str2 = str2 + "\n";
    str2 = str2 + SComponentGolf.b("Work offline - This will close this dialog and go offline. This is PropertiesExtension safe option if you do not know what to do or want to create PropertiesExtension new project to work with this ECU.");
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
  
  private String PropertiesExtension(String paramString) {
    boolean bool = RInterfaceIndia.PropertiesExtension().PropertiesExtension(" ,SD;LKODGPOIGD9");
    null = "<br><center><b>" + SComponentGolf.b("Firmware signature Mismatch!!!!") + "</b></center><br>";
    if (!bool)
      null = null + SComponentGolf.b("Your " + PropertiesExtension.PropertiesExtension(paramString, PropertiesExtension.f) + " is using firmware:") + "<br>\n<center>'" + PropertiesExtension + "'</center><br>\n<p>"; 
    return null + SComponentGolf.b("For " + PropertiesExtension.b + " to communicate correctly") + ", <br>" + SComponentGolf.b("the Serial Signature for your project must match what is reported by the " + PropertiesExtension.PropertiesExtension(paramString, PropertiesExtension.SComponentGolf) + ".") + " <br></p><br>\n&nbsp;&nbsp;&nbsp;&nbsp;<b>" + SComponentGolf.b("Project Serial signature") + ":</b> '" + "$configSig" + "'<br>\n&nbsp;&nbsp;&nbsp;&nbsp;<b>" + PropertiesExtension.PropertiesExtension(paramString, PropertiesExtension.f) + " " + SComponentGolf.b("Serial signature") + ": </b> '" + "$controllerSig" + "'<br><br>\n<p>" + SComponentGolf.b("It is not recommended that you connect with the incorrect ecu definition!") + "<br>" + SComponentGolf.b("To correct this, up date the ECU Definition in your project to match that on the " + PropertiesExtension.PropertiesExtension(paramString, PropertiesExtension.f) + ".") + "<br></p><br>\n<center><b>" + SComponentGolf.b("How would you like " + PropertiesExtension.b + " to handle this?") + "</b></center><br> ";
  }
  
  public void PropertiesExtension() {
    f.PropertiesExtension().c(dd.PropertiesExtension().c());
  }
  
  private void c() {
    iH iH = new iH();
    if (iH.PropertiesExtension(this.b, this.e, this.d, this.c))
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