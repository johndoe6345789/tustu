package aS;

import aP.ThreadedJFrameIsoptimizeddrawingenabled;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

class ThreadExtensionInAsPackage extends Thread {
  c(b paramb) {}
  
  public void run() {
    if (IOPropertiesUsingFile.b(this.IOPropertiesUsingFile.SComponentGolf)) {
      JPanel jPanel = new JPanel();
      if (this.IOPropertiesUsingFile.SComponentGolf.d) {
        jPanel.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Attention!")));
      } else {
        jPanel.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Settings Error!")));
      } 
      jPanel.setLayout(new BorderLayout());
      JLabel jLabel = new JLabel(b.IOPropertiesUsingFile(this.IOPropertiesUsingFile));
      jLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
      jPanel.add("Center", jLabel);
      d d = new d(this);
      if (this.IOPropertiesUsingFile.SComponentGolf.d) {
        bV.IOPropertiesUsingFile(jPanel, ThreadedJFrameIsoptimizeddrawingenabled.IOPropertiesUsingFile().c(), SComponentGolf.b("Attention") + "!", d);
      } else {
        bV.IOPropertiesUsingFile(jPanel, ThreadedJFrameIsoptimizeddrawingenabled.IOPropertiesUsingFile().c(), SComponentGolf.b("Error") + "!", d);
      } 
    } 
    try {
      Thread.sleep(1000L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(IOPropertiesUsingFile.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    String str = SComponentGolf.b("Settings Configuration Error!") + "\n" + SComponentGolf.b(IOPropertiesUsingFile.b + " is online") + "\n" + SComponentGolf.b("Correct Settings and Power Cycle Controller.");
    if (this.IOPropertiesUsingFile.d != null && this.IOPropertiesUsingFile.d.length() > 0)
      str = str + "\n \nReported Setting Error:       \n" + this.IOPropertiesUsingFile.d; 
    str = str + "\n\nYou must correct this error, then power cycle your controller.";
    this.IOPropertiesUsingFile.f = ThreadedJFrameIsoptimizeddrawingenabled.IOPropertiesUsingFile().b();
    this.IOPropertiesUsingFile.f.l(str);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aS/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */