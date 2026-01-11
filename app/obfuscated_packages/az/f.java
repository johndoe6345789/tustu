package az;

import bH.X;
import bH.ab;
import com.efiAnalytics.ui.bV;
import f.a;
import f.b;
import f.d;
import f.h;
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

public class f extends JDialog implements ClipboardOwner {
  b a;
  
  JTextPane b = new JTextPane();
  
  JTextPane c = new JTextPane();
  
  a d = null;
  
  ab e = null;
  
  d f = null;
  
  JButton g = null;
  
  JButton h = null;
  
  public f(Window paramWindow, d paramd, ab paramab, b paramb) {
    super(paramWindow, paramab.a("Offline Activate") + " " + X.b(paramd.a(), "Lite!", ""), Dialog.ModalityType.APPLICATION_MODAL);
    this.e = paramab;
    this.a = paramb;
    this.f = paramd;
    c();
  }
  
  private void c() {
    byte b1;
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createTitledBorder(this.f.f() + " " + this.e.a("Offline Registration Activation")));
    this.g = new JButton(this.e.a("Accept"));
    this.h = new JButton(this.e.a("Cancel"));
    JLabel jLabel = new JLabel();
    String str = "<html><body><H1>" + this.e.a("5 Step Offline Activation") + "</H1><strong>" + this.e.a("Step 1") + "</strong> - " + this.e.a("Save Activation Request to File ActivationRequest.txt on a USB drive or other medium.") + "<br><strong>" + this.e.a("Step 2") + "</strong> - " + this.e.a("On a Computer that is connected to the Internet, open a web browser and go to") + "<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"blue\"><u>https://www.efianalytics.com/activate</u></font><br><strong>" + this.e.a("Step 3") + "</strong> - " + this.e.a("Upload your saved ActivationRequest.txt, the site will provide you with ActivationCode.txt") + "<br><strong>" + this.e.a("Step 4") + "</strong> - " + this.e.a("Return to TunerStudio and click Load Activation From File to load ActivationCode.txt into TunerStudio") + "<br><strong>" + this.e.a("Step 5") + "</strong> - " + this.e.a("Click Accept") + "<br>" + this.e.a("Done!") + "</body></html>";
    jLabel.setText(str);
    jLabel.addMouseListener(new g(this));
    jPanel1.add("North", jLabel);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.setBorder(BorderFactory.createTitledBorder(this.e.a("Activation Request")));
    if ((Toolkit.getDefaultToolkit().getScreenSize()).height < 640) {
      b1 = 60;
    } else {
      b1 = 120;
    } 
    this.b.setMinimumSize(new Dimension(520, b1));
    this.b.setPreferredSize(new Dimension(520, b1));
    this.b.setMaximumSize(new Dimension(520, b1));
    this.b.setBorder(BorderFactory.createBevelBorder(1));
    this.b.setEditable(false);
    this.b.setBackground(Color.LIGHT_GRAY);
    try {
      String str1 = this.a.a();
      this.b.setText(str1);
      this.b.selectAll();
    } catch (IOException iOException) {
      bV.d(iOException.getMessage(), this);
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
    jPanel2.add("Center", this.b);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    jPanel3.add(new JLabel("Step 1 -->"));
    JButton jButton1 = new JButton(this.e.a("Save Request to File"));
    jButton1.addActionListener(new h(this));
    jPanel3.add(jButton1);
    JButton jButton2 = new JButton(this.e.a("Copy Request to Clipboard"));
    jButton2.addActionListener(new i(this));
    jPanel3.add(jButton2);
    jPanel2.add("South", jPanel3);
    jPanel1.add("Center", jPanel2);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.setBorder(BorderFactory.createTitledBorder(this.e.a("Server Activation Code")));
    this.c.setMinimumSize(new Dimension(520, 120));
    this.c.setPreferredSize(new Dimension(520, 120));
    this.c.setMaximumSize(new Dimension(520, 120));
    this.c.setBorder(BorderFactory.createBevelBorder(1));
    this.c.getDocument().addDocumentListener(new n(this));
    jPanel4.add("Center", this.c);
    jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    jPanel3.add(new JLabel("Step 4 -->"));
    JButton jButton3 = new JButton(this.e.a("Load Activation From File"));
    jButton3.addActionListener(new j(this));
    jPanel3.add(jButton3);
    JButton jButton4 = new JButton(this.e.a("Paste Activation Code"));
    jButton4.addActionListener(new k(this));
    jPanel3.add(jButton4);
    jPanel4.add("South", jPanel3);
    jPanel1.add("South", jPanel4);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new FlowLayout(2));
    this.g.addActionListener(new l(this));
    this.h.addActionListener(new m(this));
    jPanel5.add(new JLabel("Step 5 -->"));
    jPanel5.add(this.g);
    jPanel5.add(this.h);
    this.g.setEnabled(false);
    add("South", jPanel5);
    add("Center", jPanel1);
  }
  
  private void d() {
    dispose();
  }
  
  private void e() {
    this.d = null;
    dispose();
  }
  
  private void f() {
    this.b.selectAll();
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    StringSelection stringSelection = new StringSelection(this.b.getText());
    clipboard.setContents(stringSelection, this);
  }
  
  private void g() {
    String str1 = this.f.b();
    String[] arrayOfString = { "txt" };
    String str2 = bV.b(this, this.e.a("Load Activation From File"), arrayOfString, "*.txt", str1);
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
        bV.d("unable to read file:\n" + file.getAbsolutePath(), this);
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
  
  private void h() {
    this.b.selectAll();
    String str1 = this.b.getText();
    String str2 = this.f.b();
    String[] arrayOfString = { "txt" };
    String str3 = bV.a(this, "Save Activation Request to File", arrayOfString, this.f.f() + "ActivationRequest.txt", str2);
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
          bV.d("Can not write file to:\n" + file.getAbsolutePath(), this);
        } 
      } catch (IOException iOException) {
        bV.d("Can not write to file:\n" + file.getAbsolutePath(), this);
      } finally {
        if (fileWriter != null)
          try {
            fileWriter.close();
          } catch (Exception exception) {} 
      } 
    } 
  }
  
  public String a() {
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
    String str = a();
    if (str != null && !str.trim().equals("")) {
      try {
        this.d = new a(str);
        this.d.i(str);
      } catch (h h) {
        bV.d(this.e.a(c.d), this);
        this.d = null;
        this.g.setEnabled(false);
        return;
      } 
      if (this.d.h().before(new Date())) {
        bV.d("This Activation code has expired. Please request a new one from:\nhttps://www.efianalytics.com/activate", this);
        return;
      } 
      o o = o.d();
      d d1 = o.a(this.d);
      if (d1.a() != 0) {
        bV.d(d1.b(), this);
        this.d = null;
        this.g.setEnabled(false);
        return;
      } 
    } 
    this.g.setEnabled(true);
  }
  
  public void lostOwnership(Clipboard paramClipboard, Transferable paramTransferable) {}
  
  public a b() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */