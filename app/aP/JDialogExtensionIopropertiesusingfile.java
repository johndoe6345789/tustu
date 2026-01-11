package aP;

import W.FileOutputStreamExtension;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cn;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridLayout;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import r.IOPropertiesUsingFile;

public class JDialogExtensionIopropertiesusingfile extends JDialog {
  cn IOPropertiesUsingFile = new cn();
  
  cn b = new cn();
  
  Frame c = null;
  
  public JDialogExtensionIopropertiesusingfile(Frame paramFrame) {
    super(paramFrame, "File Encryption Dialog");
    this.c = paramFrame;
    setLayout(new GridLayout(0, 1));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("West", new JLabel("Input File:"));
    jPanel1.add("Center", (Component)this.IOPropertiesUsingFile);
    JButton jButton1 = new JButton("Select Input");
    jButton1.addActionListener(new bN(this));
    jPanel1.add("East", jButton1);
    add(jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("West", new JLabel("Output File:"));
    jPanel2.add("Center", (Component)this.b);
    JButton jButton2 = new JButton("Select Output");
    jButton2.addActionListener(new bO(this));
    jPanel2.add("East", jButton2);
    add(jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(1, 0));
    JButton jButton3 = new JButton("Close");
    jButton3.addActionListener(new bP(this));
    jPanel3.add(jButton3);
    JButton jButton4 = new JButton("Encrypt / Decrypt");
    jButton4.addActionListener(new bQ(this));
    jPanel3.add(jButton4);
    add(jPanel3);
  }
  
  public void IOPropertiesUsingFile() {
    String[] arrayOfString = { "" };
    String str1 = IOPropertiesUsingFile.IOPropertiesUsingFile().c("encrypDialogDirIn", ".");
    String str2 = bV.IOPropertiesUsingFile(this, "Select Input", arrayOfString, "", str1, true);
    if (str2 != null && !str2.isEmpty())
      IOPropertiesUsingFile.IOPropertiesUsingFile().b("encrypDialogDirIn", (new File(str2)).getParent()); 
    this.IOPropertiesUsingFile.IOPropertiesUsingFile(str2);
  }
  
  public void b() {
    String[] arrayOfString = { "" };
    String str1 = IOPropertiesUsingFile.IOPropertiesUsingFile().c("encrypDialogDir", ".");
    String str2 = bV.IOPropertiesUsingFile(this, "Select Output", arrayOfString, "", str1, false);
    if (str2 != null && !str2.isEmpty())
      IOPropertiesUsingFile.IOPropertiesUsingFile().b("encrypDialogDir", (new File(str2)).getParent()); 
    this.b.IOPropertiesUsingFile(str2);
  }
  
  public void c() {
    FileInputStream fileInputStream;
    FileOutputStreamExtension FileOutputStreamExtension;
    BufferedOutputStream bufferedOutputStream;
    File file1 = new File(this.IOPropertiesUsingFile.IOPropertiesUsingFile());
    if (!file1.exists()) {
      bV.d("Must Select an Input File", this);
      return;
    } 
    try {
      fileInputStream = new FileInputStream(file1);
    } catch (FileNotFoundException fileNotFoundException) {
      bV.d("Error reading file:\n" + file1.getAbsolutePath(), this);
      return;
    } 
    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
    File file2 = new File(this.b.IOPropertiesUsingFile());
    if (file2.exists())
      file2.delete(); 
    try {
      file2.createNewFile();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      bV.d("Failed to create file:\n" + file2.getAbsolutePath(), this);
      return;
    } 
    try {
      FileOutputStreamExtension = new FileOutputStreamExtension(file2);
      bufferedOutputStream = new BufferedOutputStream((OutputStream)FileOutputStreamExtension);
    } catch (FileNotFoundException fileNotFoundException) {
      bV.d("Error reading file:\n" + file2.getAbsolutePath(), this);
      fileNotFoundException.printStackTrace();
      return;
    } 
    try {
      int i;
      for (i = bufferedInputStream.read(); i != -1; i = bufferedInputStream.read())
        bufferedOutputStream.write(i); 
    } catch (IOException iOException) {
      Logger.getLogger(bM.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } finally {
      try {
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        FileOutputStreamExtension.flush();
        FileOutputStreamExtension.close();
      } catch (IOException iOException) {
        Logger.getLogger(bM.class.getName()).log(Level.SEVERE, (String)null, iOException);
      } 
    } 
  }
  
  public static void IOPropertiesUsingFile(Frame paramFrame) {
    bM bM1 = new bM(paramFrame);
    bM1.pack();
    bM1.setSize(600, bM1.getHeight());
    bV.IOPropertiesUsingFile(paramFrame, bM1);
    bM1.setVisible(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */