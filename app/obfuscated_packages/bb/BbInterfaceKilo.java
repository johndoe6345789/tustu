package bb;

import V.ExceptionInVPackage;
import aP.ManagerUsingHashMap;
import ae.AeInterfaceQuebec;
import com.efiAnalytics.apps.ts.dashboard.HtmlDisplay;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fT;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.SComponentGolf;

public class BbInterfaceKilo extends JPanel implements fT {
  HtmlDisplay ExceptionInVPackage;
  
  JCheckBox b = new JCheckBox(SComponentGolf.b("Accept"));
  
  boolean c = false;
  
  private AeInterfaceQuebec d = null;
  
  private boolean e = false;
  
  public BbInterfaceKilo(String paramString, boolean paramBoolean) {
    setLayout(new BorderLayout());
    JLabel jLabel = new JLabel(SComponentGolf.b(paramString), 0);
    Font font = new Font("SansSerif", 1, eJ.ExceptionInVPackage() * 2);
    jLabel.setFont(font);
    add("North", jLabel);
    this.ExceptionInVPackage = new HtmlDisplay();
    add("Center", (Component)this.ExceptionInVPackage);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    jPanel.add(this.b);
    if (paramBoolean) {
      add("South", jPanel);
      this.c = true;
    } else {
      this.c = false;
    } 
  }
  
  public void ExceptionInVPackage(File paramFile) {
    if (paramFile.exists()) {
      paramFile = b(paramFile);
      ExceptionInVPackage(paramFile.getAbsolutePath());
    } else {
      throw new ExceptionInVPackage("File not found: " + paramFile.getAbsolutePath());
    } 
  }
  
  public void ExceptionInVPackage(String paramString) {
    this.ExceptionInVPackage.setDocumentUrl(paramString);
  }
  
  public boolean ExceptionInVPackage() {
    return (this.c && !this.b.isSelected());
  }
  
  public boolean g_() {
    return true;
  }
  
  private File b(File paramFile) {
    if (!this.e)
      return paramFile; 
    try {
      File file;
      if (paramFile.getParentFile().canWrite()) {
        file = new File(paramFile.getParentFile(), "prepped_" + paramFile.getName());
        file.deleteOnExit();
      } else {
        String str = paramFile.getName().contains(".") ? paramFile.getName().substring(paramFile.getName().lastIndexOf(".") + 1) : "";
        try {
          file = File.createTempFile("prepped_" + paramFile.getName(), str);
        } catch (IOException iOException) {
          Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, iOException);
          return paramFile;
        } 
      } 
      file.deleteOnExit();
      return ManagerUsingHashMap.ExceptionInVPackage().ExceptionInVPackage(paramFile, file);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
      return paramFile;
    } 
  }
  
  public void ExceptionInVPackage(AeInterfaceQuebec paramq) {
    this.d = paramq;
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    this.e = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */