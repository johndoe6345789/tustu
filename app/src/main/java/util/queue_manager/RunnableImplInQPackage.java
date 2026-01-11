package q;

import bH.D;
import bt.A;
import bt.JTextFieldExtension;
import bt.JLabelExtensionSettext;
import bt.y;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

class RunnableImplInQPackage implements Runnable {
  public void run() {
    try {
      h.a().a(JLabel.class, 75);
      h.a().a(A.class, 50);
      h.a().a(y.class, 35);
      h.a().a(JLabelExtensionSettext.class, 120);
      h.a().a(JTextFieldExtension.class, 20);
    } catch (Exception exception) {
      D.a("Seed UI Cache failed!");
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/q/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */