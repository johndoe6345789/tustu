package ao;

import V.ExceptionInVPackage;
import W.n;
import ax.ExceptionInAxPackage;
import ax.AxInterfaceUniform;
import bH.t;
import com.efiAnalytics.ui.bV;
import PropertiesExtensionInHPackage.IOJFileChooser;
import HInterfaceHotel.PropertiesExtensionInHPackage;
import HInterfaceHotel.HInterfaceHotel;
import HInterfaceHotel.i;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import IOJFileChooser.ExceptionInVPackage;
import IOJFileChooser.c;
import IOJFileChooser.d;

public class r extends JDialog implements ActionListener {
  boolean ExceptionInVPackage = false;
  
  JButton b;
  
  JButton c;
  
  JTextField d;
  
  JTextField e;
  
  Frame f;
  
  public r(Frame paramFrame, String paramString1, String paramString2) {
    super(paramFrame, "Custom Field", true);
    this.f = paramFrame;
    setLayout(new BorderLayout(15, 15));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1));
    jPanel1.add(new JLabel(" ", 0));
    jPanel1.add(new JLabel("Define ExceptionInVPackage custom field.", 0));
    jPanel1.add(new JLabel("This field will be calculated at log load time like all calculated fields", 0));
    JLabel jLabel1 = new JLabel("For syntax help, read Math Parser help in Help Topics for more information.", 0);
    Color color = UIManager.getColor("Label.background");
    if (color == null || color.getRed() + color.getGreen() + color.getBlue() > 192) {
      jLabel1.setForeground(Color.BLUE.darker());
    } else {
      jLabel1.setForeground(Color.CYAN);
    } 
    jLabel1.setCursor(new Cursor(12));
    jLabel1.addMouseListener(new s(this));
    jPanel1.add(jLabel1);
    add(jPanel1, "North");
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 1));
    add("Center", jPanel2);
    JLabel jLabel2 = new JLabel("Field Name:", 2);
    jPanel2.add(jLabel2);
    this.d = new JTextField(paramString1);
    this.d.setBorder(BorderFactory.createLoweredBevelBorder());
    this.d.setEnabled(paramString1.equals(""));
    jPanel2.add(this.d);
    jPanel2.add(new JLabel(" "));
    jLabel2 = new JLabel("Formula:  (Press Ctrl+Space to insert log field names)", 2);
    jPanel2.add(jLabel2);
    this.e = new JTextField(paramString2);
    this.e.setBorder(BorderFactory.createLoweredBevelBorder());
    this.e.addActionListener(new t(this));
    hQ.ExceptionInVPackage(this.e, "control SPACE");
    jPanel2.add(this.e);
    add(new JLabel(" "), "West");
    add(new JLabel(" "), "East");
    ExceptionInVPackage(true);
    pack();
    setSize(getWidth() + 50, getHeight());
    Dimension dimension1 = paramFrame.getSize();
    Dimension dimension2 = getSize();
    Point point = paramFrame.getLocation();
    setLocation((int)(point.getX() + (dimension1.getWidth() - dimension2.getWidth()) / 2.0D), (int)(point.getY() + (dimension1.getHeight() - dimension2.getHeight()) / 2.0D));
    setVisible(true);
  }
  
  protected void ExceptionInVPackage(boolean paramBoolean) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout());
    ExceptionInVPackage(jPanel);
    if (paramBoolean == true)
      b(jPanel); 
    add("South", jPanel);
  }
  
  protected void ExceptionInVPackage(JPanel paramJPanel) {
    paramJPanel.add(this.b = new JButton("OK"));
    this.b.addActionListener(this);
  }
  
  protected void b(JPanel paramJPanel) {
    paramJPanel.add(this.c = new JButton("Cancel"));
    this.c.addActionListener(this);
  }
  
  public boolean ExceptionInVPackage() {
    return this.ExceptionInVPackage;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() == this.b && e()) {
      this.ExceptionInVPackage = true;
      setVisible(false);
    } else if (paramActionEvent.getSource() == this.c) {
      setVisible(false);
    } 
  }
  
  private boolean e() {
    if (this.d.getText().equals("")) {
      IOJFileChooser.ExceptionInVPackage("You must supply ExceptionInVPackage Field Name", getParent());
      return false;
    } 
    String str = "()*&%^|+-/><=[]";
    for (byte b = 0; b < str.length(); b++) {
      if (this.d.getText().indexOf(str.charAt(b)) != -1) {
        IOJFileChooser.ExceptionInVPackage("The formula Name can not contain any of the following special characters:\n" + str, getParent());
        return false;
      } 
    } 
    try {
      if (this.e.getText().trim().equals("")) {
        IOJFileChooser.ExceptionInVPackage("Formula can not be empty\nPlease correct.", getParent());
        return false;
      } 
      n n = hx.ExceptionInVPackage().r();
      if (n != null) {
        String str1;
        for (str1 = this.e.getText(); str1.indexOf("{") > 0; str1 = str1.substring(0, str1.indexOf("{")) + "1.0" + str1.substring(str1.indexOf("}", str1.indexOf("{")) + 1));
        str1 = PropertiesExtensionInHPackage.ExceptionInVPackage().c(str1);
        try {
          ExceptionInVPackage ExceptionInVPackage = d.ExceptionInVPackage().ExceptionInVPackage(str1);
          String[] arrayOfString = ExceptionInVPackage.b();
          for (String str2 : arrayOfString) {
            if (!str1.contains("[" + str2))
              throw new ExceptionInAxPackage("Square brackets [] must surround field names."); 
          } 
          ExceptionInVPackage.ExceptionInVPackage(n, 20);
        } catch (AxInterfaceUniform AxInterfaceUniform) {
        
        } catch (c c) {
          String str2 = "The inc file used in this expression was not found.\n" + c.ExceptionInVPackage().getName() + "\n\nWould you like to browse to it and add it to the inc dir located at:\n" + HInterfaceHotel.c();
          if (IOJFileChooser.ExceptionInVPackage(str2, getParent(), true)) {
            ExceptionInVPackage(c.ExceptionInVPackage());
            return false;
          } 
        } catch (ExceptionInAxPackage AxInterfaceUniform) {
          return IOJFileChooser.ExceptionInVPackage("Failed to validate formula:\n" + this.e.getText() + "\nReason:\n" + AxInterfaceUniform.getMessage() + "\n\nSave formula anyway?", getParent(), true);
        } 
      } else {
        IOJFileChooser.ExceptionInVPackage("Can not validate formula while no log file is loaded.\nThe formula will be assumed to be correct, and will be available after\nnext log file load if correct.", getParent());
      } 
    } catch (Exception exception) {
      IOJFileChooser.ExceptionInVPackage("Invalid Formula:" + this.e.getText() + "\nPlease check your syntax.", getParent());
      return false;
    } 
    return true;
  }
  
  private void ExceptionInVPackage(File paramFile) {
    String[] arrayOfString = { "inc" };
    String str = bV.ExceptionInVPackage(getParent(), "Browse to inc file", arrayOfString, "*.inc", HInterfaceHotel.d(), true);
    if (str != null && !str.isEmpty()) {
      File file1 = new File(str);
      File file2 = new File(HInterfaceHotel.c(), paramFile.getName());
      try {
        t.ExceptionInVPackage(file1, file2);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        IOJFileChooser.ExceptionInVPackage("Unable to copy inc file!\nThe following error occurred:\n" + ExceptionInVPackage.getLocalizedMessage(), this);
        Logger.getLogger(r.class.getName()).log(Level.SEVERE, "Failed to copy file", (Throwable)ExceptionInVPackage);
      } 
    } 
  }
  
  public String b() {
    return this.d.getText();
  }
  
  public String c() {
    return this.e.getText();
  }
  
  protected void d() {
    bu bu = hx.ExceptionInVPackage().A();
    bu.ExceptionInVPackage(bt.ExceptionInVPackage(bt.d));
    bu.ExceptionInVPackage(this, i.b + " help");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */