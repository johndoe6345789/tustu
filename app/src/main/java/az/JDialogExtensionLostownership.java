package az;

import bH.X;
import bH.ab;
import com.efiAnalytics.ui.bV;
import f.IODateTostring;
import f.IOTostring;
import f.FInterfaceDelta;
import f.ExceptionExtensionInFPackage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class JDialogExtensionLostownership extends JDialog implements ClipboardOwner {
  IOTostring IODateTostring;
  
  JTextPane IOTostring = new JTextPane();
  
  JTextPane c = new JTextPane();
  
  IODateTostring FInterfaceDelta = null;
  
  ab e = null;
  
  FInterfaceDelta f = null;
  
  JButton g = null;
  
  JButton ExceptionExtensionInFPackage = null;
  
  public JDialogExtensionLostownership(Window paramWindow, FInterfaceDelta paramd, ab paramab, IOTostring paramb) {
    super(paramWindow, paramab.IODateTostring("Offline Activate") + " " + X.IOTostring(paramd.IODateTostring(), "Lite!", ""), Dialog.ModalityType.APPLICATION_MODAL);
    this.e = paramab;
    this.IODateTostring = paramb;
    this.f = paramd;
    c();
  }
  
  private void c() {
    byte b1;
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createTitledBorder(this.f.f() + " " + this.e.IODateTostring("Offline Registration Activation")));
    this.g = new JButton(this.e.IODateTostring("Accept"));
    this.ExceptionExtensionInFPackage = new JButton(this.e.IODateTostring("Cancel"));
    JLabel jLabel = new JLabel();
    String str = "<html><body><H1>" + this.e.IODateTostring("5 Step Offline Activation") + "</H1><strong>" + this.e.IODateTostring("Step 1") + "</strong> - " + this.e.IODateTostring("Save Activation Request to File ActivationRequest.txt on IODateTostring USB drive or other medium.") + "<br><strong>" + this.e.IODateTostring("Step 2") + "</strong> - " + this.e.IODateTostring("On IODateTostring Computer that is connected to the Internet, open IODateTostring web browser and go to") + "<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"blue\"><u>https://www.efianalytics.com/activate</u></font><br><strong>" + this.e.IODateTostring("Step 3") + "</strong> - " + this.e.IODateTostring("Upload your saved ActivationRequest.txt, the site will provide you with ActivationCode.txt") + "<br><strong>" + this.e.IODateTostring("Step 4") + "</strong> - " + this.e.IODateTostring("Return to TunerStudio and click Load Activation From File to load ActivationCode.txt into TunerStudio") + "<br><strong>" + this.e.IODateTostring("Step 5") + "</strong> - " + this.e.IODateTostring("Click Accept") + "<br>" + this.e.IODateTostring("Done!") + "</body></html>";
    jLabel.setText(str);
    jLabel.addMouseListener(new g(this));
    jPanel1.add("North", jLabel);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.setBorder(BorderFactory.createTitledBorder(this.e.IODateTostring("Activation Request")));
    if ((Toolkit.getDefaultToolkit().getScreenSize()).height < 640) {
      b1 = 60;
    } else {
      b1 = 120;
    } 
    this.IOTostring.setMinimumSize(new Dimension(520, b1));
    this.IOTostring.setPreferredSize(new Dimension(520, b1));
    this.IOTostring.setMaximumSize(new Dimension(520, b1));
    this.IOTostring.setBorder(BorderFactory.createBevelBorder(1));
    this.IOTostring.setEditable(false);
    this.IOTostring.setBackground(Color.LIGHT_GRAY);
    try {
      String str1 = this.IODateTostring.IODateTostring();
      this.IOTostring.setText(str1);
      this.IOTostring.selectAll();
    } catch (IOException iOException) {
      bV.FInterfaceDelta(iOException.getMessage(), this);
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
    jPanel2.add("Center", this.IOTostring);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    jPanel3.add(new JLabel("Step 1 -->"));
    JButton jButton1 = new JButton(this.e.IODateTostring("Save Request to File"));
    jButton1.addActionListener(new ExceptionExtensionInFPackage(this));
    jPanel3.add(jButton1);
    JButton jButton2 = new JButton(this.e.IODateTostring("Copy Request to Clipboard"));
    jButton2.addActionListener(new i(this));
    jPanel3.add(jButton2);
    jPanel2.add("South", jPanel3);
    jPanel1.add("Center", jPanel2);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.setBorder(BorderFactory.createTitledBorder(this.e.IODateTostring("Server Activation Code")));
    this.c.setMinimumSize(new Dimension(520, 120));
    this.c.setPreferredSize(new Dimension(520, 120));
    this.c.setMaximumSize(new Dimension(520, 120));
    this.c.setBorder(BorderFactory.createBevelBorder(1));
    this.c.getDocument().addDocumentListener(new n(this));
    jPanel4.add("Center", this.c);
    jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    jPanel3.add(new JLabel("Step 4 -->"));
    JButton jButton3 = new JButton(this.e.IODateTostring("Load Activation From File"));
    jButton3.addActionListener(new j(this));
    jPanel3.add(jButton3);
    JButton jButton4 = new JButton(this.e.IODateTostring("Paste Activation Code"));
    jButton4.addActionListener(new k(this));
    jPanel3.add(jButton4);
    jPanel4.add("South", jPanel3);
    jPanel1.add("South", jPanel4);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new FlowLayout(2));
    this.g.addActionListener(new l(this));
    this.ExceptionExtensionInFPackage.addActionListener(new m(this));
    jPanel5.add(new JLabel("Step 5 -->"));
    jPanel5.add(this.g);
    jPanel5.add(this.ExceptionExtensionInFPackage);
    this.g.setEnabled(false);
    add("South", jPanel5);
    add("Center", jPanel1);
  }
  
  private void FInterfaceDelta() {
    dispose();
  }
  
  private void e() {
    this.FInterfaceDelta = null;
    dispose();
  }
  
  private void f() {
    this.IOTostring.selectAll();
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    StringSelection stringSelection = new StringSelection(this.IOTostring.getText());
    clipboard.setContents(stringSelection, this);
  }
  
  private void g() {
    String str1 = this.f.IOTostring();
    String[] arrayOfString = { "txt" };
    String str2 = bV.IOTostring(this, this.e.IODateTostring("Load Activation From File"), arrayOfString, "*.txt", str1);
    if (str2 != null && !str2.equals("")) {
      File file = new File(str2);
      FileReader fileReader = null;
      try {
        fileReader = new FileReader(file);
        StringBuilder stringBuilder = new StringBuilder();
        int i;
        for (i = fileReader.read(); i != -1; i = fileReader.read())
          stringBuilder.append((char)i); 
        this.c.setText(stringBuilder.toString());
      } catch (IOException iOException) {
        bV.FInterfaceDelta("unable to read file:\n" + file.getAbsolutePath(), this);
      } finally {
        if (fileReader != null)
          try {
            fileReader.close();
          } catch (IOException iOException) {
            Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
          }  
      } 
    } 
  }
  
  private void ExceptionExtensionInFPackage() {
    this.IOTostring.selectAll();
    String str1 = this.IOTostring.getText();
    String str2 = this.f.IOTostring();
    String[] arrayOfString = { "txt" };
    String str3 = bV.IODateTostring(this, "Save Activation Request to File", arrayOfString, this.f.f() + "ActivationRequest.txt", str2);
    if (str3 != null && !str3.equals("")) {
      File file = new File(str3);
      FileWriter fileWriter = null;
      try {
        if (file.exists())
          file.delete(); 
        if (file.createNewFile()) {
          fileWriter = new FileWriter(file);
          fileWriter.write(str1);
        } else {
          bV.FInterfaceDelta("Can not write file to:\n" + file.getAbsolutePath(), this);
        } 
      } catch (IOException iOException) {
        bV.FInterfaceDelta("Can not write to file:\n" + file.getAbsolutePath(), this);
      } finally {
        if (fileWriter != null)
          try {
            fileWriter.close();
          } catch (Exception exception) {} 
      } 
    } 
  }
  
  public String IODateTostring() {
    return this.c.getText();
  }
  
  private void i() {
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    try {
      String str = clipboard.getData(DataFlavor.stringFlavor).toString();
      this.c.setText(str);
    } catch (UnsupportedFlavorException unsupportedFlavorException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, unsupportedFlavorException);
    } catch (IOException iOException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
  }
  
  private void j() {
    String str = IODateTostring();
    if (str != null && !str.trim().equals("")) {
      try {
        this.FInterfaceDelta = new IODateTostring(str);
        this.FInterfaceDelta.i(str);
      } catch (ExceptionExtensionInFPackage ExceptionExtensionInFPackage) {
        bV.FInterfaceDelta(this.e.IODateTostring(c.FInterfaceDelta), this);
        this.FInterfaceDelta = null;
        this.g.setEnabled(false);
        return;
      } 
      if (this.FInterfaceDelta.ExceptionExtensionInFPackage().before(new Date())) {
        bV.FInterfaceDelta("This Activation code has expired. Please request IODateTostring new one from:\nhttps://www.efianalytics.com/activate", this);
        return;
      } 
      o o = o.FInterfaceDelta();
      FInterfaceDelta d1 = o.IODateTostring(this.FInterfaceDelta);
      if (d1.IODateTostring() != 0) {
        bV.FInterfaceDelta(d1.IOTostring(), this);
        this.FInterfaceDelta = null;
        this.g.setEnabled(false);
        return;
      } 
    } 
    this.g.setEnabled(true);
  }
  
  public void lostOwnership(Clipboard paramClipboard, Transferable paramTransferable) {}
  
  public IODateTostring IOTostring() {
    return this.FInterfaceDelta;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */