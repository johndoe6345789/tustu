package bb;

import ae.k;
import ae.l;
import ae.x;
import com.efiAnalytics.ui.bV;
import java.io.File;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import r.a;
import s.g;

class I extends Thread {
  I(E paramE, File paramFile, JDialog paramJDialog) {}
  
  public void run() {
    try {
      k k = l.a(this.a);
      if (k != null && k.a()) {
        this.c.f.setSelected(true);
        this.c.e.setText(this.a.getAbsolutePath());
        this.c.e.setEnabled(true);
        this.c.a(k);
        a.a().b(a.E, this.a.getParentFile().getAbsolutePath());
      } else {
        bV.d(g.b("The selected file does not appear to be a firmware file."), this.b);
        this.c.f.setSelected(false);
        this.c.e.setText("");
        this.c.e.setEnabled(false);
      } 
    } catch (x x) {
      bV.d(g.b(x.getMessage()), this.b);
      this.c.f.setSelected(false);
      this.c.e.setText("");
      this.c.e.setEnabled(false);
    } catch (IOException iOException) {
      bV.d(g.b("Error Reading File.") + "\n" + iOException.getLocalizedMessage(), this.b);
      this.c.f.setSelected(false);
      this.c.e.setText("");
      this.c.e.setEnabled(false);
    } catch (NullPointerException nullPointerException) {
      bV.d(g.b("Unhandled Error"), this.b);
      this.c.f.setSelected(false);
      this.c.e.setText("");
      this.c.e.setEnabled(false);
      nullPointerException.printStackTrace();
    } catch (Exception exception) {
      bV.d(g.b("Error") + ":\n" + exception.getLocalizedMessage(), this.b);
      this.c.f.setSelected(false);
      this.c.e.setText("");
      this.c.e.setEnabled(false);
      exception.printStackTrace();
    } finally {
      J j = new J(this);
      SwingUtilities.invokeLater(j);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */