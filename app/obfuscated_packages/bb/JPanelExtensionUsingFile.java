package bb;

import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import ae.AeInterfaceDelta;
import ae.ThreadedInAePackage;
import ae.AeInterfaceWhiskey;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fT;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import r.ThreadedFile;
import s.SComponentGolf;

public class JPanelExtensionUsingFile extends JPanel implements AeInterfaceWhiskey, fT {
  AeInterfaceWhiskey ExceptionInVPackage = new AeInterfaceWhiskey(this);
  
  ThreadedInAePackage b = null;
  
  JTextPane c = new JTextPane();
  
  JProgressBar AeInterfaceDelta = new JProgressBar(0, 100);
  
  JLabel e = new JLabel();
  
  k ThreadedInAePackage = new k(SComponentGolf.b("Firmware Loaded"), false);
  
  p SComponentGolf = new p(SComponentGolf.b("Preparing for firmware load"));
  
  p h = new p(SComponentGolf.b("Finalizing firmware load"));
  
  JPanel i = new JPanel();
  
  CardLayout ThreadedFile = new CardLayout();
  
  boolean k = false;
  
  boolean l = false;
  
  boolean m = false;
  
  private static final File n = new File(ThreadedFile.C(), "firmwareLoader/firmwareLoadCompleteNoProject.html");
  
  private static final File o = new File(ThreadedFile.C(), "firmwareLoader/firmwareLoadCompleteProject.html");
  
  private static final File p = new File(ThreadedFile.C(), "firmwareLoader/loadError.html");
  
  public JPanelExtensionUsingFile() {
    setLayout(new BorderLayout());
    this.i.setLayout(this.ThreadedFile);
    this.i.add(this.SComponentGolf, "PrepPanel");
    try {
      Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.K);
      boolean bool = false;
      if (bool) {
        int i = eJ.ExceptionInVPackage(671);
        int ThreadedFile = eJ.ExceptionInVPackage(300);
        image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.K).getScaledInstance(i, ThreadedFile, 1);
      } 
      ImageIcon imageIcon = new ImageIcon(image);
      this.e.setIcon(imageIcon);
      this.e.setHorizontalAlignment(0);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(v.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
    } 
    this.i.add(this.e, "Animation");
    this.i.add(this.h, "PostPanel");
    this.i.add(this.ThreadedInAePackage, "Complete");
    this.ThreadedInAePackage.ExceptionInVPackage(true);
    this.ThreadedFile.show(this.i, "PrepPanel");
    add(this.i, "Center");
    JPanel jPanel = new JPanel();
    this.c.setMinimumSize(new Dimension(200, eJ.ExceptionInVPackage() * 3));
    jPanel.setLayout(new BorderLayout());
    jPanel.add(this.c, "North");
    jPanel.add(this.AeInterfaceDelta, "Center");
    add(jPanel, "South");
  }
  
  public void ExceptionInVPackage(ThreadedInAePackage paramf) {
    paramf.ExceptionInVPackage(this.ExceptionInVPackage);
    this.k = false;
    this.l = false;
    this.m = false;
    this.b = paramf;
    paramf.ExceptionInVPackage(this);
  }
  
  public boolean ExceptionInVPackage() {
    return this.m;
  }
  
  public boolean g_() {
    return true;
  }
  
  public void ExceptionInVPackage(List paramList) {
    if (b(paramList)) {
      this.l = true;
      this.m = true;
      try {
        this.ThreadedInAePackage.ExceptionInVPackage(p);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(v.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
      } 
      this.AeInterfaceDelta.setValue(100);
      this.b.b(this.ExceptionInVPackage);
      this.ThreadedFile.show(this.i, "Complete");
    } else if (this.b != null) {
      if (!this.k) {
        this.b.b(this);
        this.k = true;
        this.ThreadedFile.show(this.i, "Animation");
      } else if (!this.l) {
        this.l = true;
        this.ThreadedFile.show(this.i, "PostPanel");
        this.b.c(this);
      } else {
        this.m = true;
        this.AeInterfaceDelta.setValue(100);
        try {
          File file;
          if (ExceptionInVPackage.A() == null) {
            file = n;
          } else {
            file = o;
          } 
          this.ThreadedInAePackage.ExceptionInVPackage(file);
        } catch (ExceptionInVPackage ExceptionInVPackage) {}
        this.b.b(this.ExceptionInVPackage);
        this.ThreadedFile.show(this.i, "Complete");
      } 
    } else {
      bV.AeInterfaceDelta("No Valid Loader Set, Can not complete.", this);
    } 
  }
  
  private boolean b(List paramList) {
    StringBuffer stringBuffer1 = new StringBuffer();
    StringBuffer stringBuffer2 = new StringBuffer();
    for (AeInterfaceDelta AeInterfaceDelta : paramList) {
      if (AeInterfaceDelta.ExceptionInVPackage() == AeInterfaceDelta.b) {
        stringBuffer2.append(AeInterfaceDelta.b()).append("\n\n");
        continue;
      } 
      if (AeInterfaceDelta.ExceptionInVPackage() == AeInterfaceDelta.c)
        stringBuffer1.append(AeInterfaceDelta.b()).append("\n\n"); 
    } 
    if (stringBuffer1.length() > 0 || stringBuffer2.length() > 0) {
      StringBuilder stringBuilder = new StringBuilder();
      if (stringBuffer2.length() > 0)
        stringBuilder.append(SComponentGolf.b("Could not complete due to the following errors:")).append("\n").append(stringBuffer2); 
      if (stringBuffer1.length() > 0)
        stringBuilder.append(SComponentGolf.b("Could not complete due to the following errors:")).append("\n").append(stringBuffer1); 
      bV.AeInterfaceDelta(stringBuilder.toString(), this);
    } 
    return (stringBuffer2.length() > 0);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */