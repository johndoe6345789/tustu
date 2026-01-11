package bb;

import V.a;
import aP.iP;
import ae.q;
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
import s.g;

public class k extends JPanel implements fT {
  HtmlDisplay a;
  
  JCheckBox b = new JCheckBox(g.b("Accept"));
  
  boolean c = false;
  
  private q d = null;
  
  private boolean e = false;
  
  public k(String paramString, boolean paramBoolean) {
    setLayout(new BorderLayout());
    JLabel jLabel = new JLabel(g.b(paramString), 0);
    Font font = new Font("SansSerif", 1, eJ.a() * 2);
    jLabel.setFont(font);
    add("North", jLabel);
    this.a = new HtmlDisplay();
    add("Center", (Component)this.a);
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
  
  public void a(File paramFile) {
    if (paramFile.exists()) {
      paramFile = b(paramFile);
      a(paramFile.getAbsolutePath());
    } else {
      throw new a("File not found: " + paramFile.getAbsolutePath());
    } 
  }
  
  public void a(String paramString) {
    this.a.setDocumentUrl(paramString);
  }
  
  public boolean a() {
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
      return iP.a().a(paramFile, file);
    } catch (a a) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      return paramFile;
    } 
  }
  
  public void a(q paramq) {
    this.d = paramq;
  }
  
  public void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */