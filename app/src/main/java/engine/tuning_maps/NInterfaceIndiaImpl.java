package aP;

import bH.D;
import com.efiAnalytics.ui.bV;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import n.NInterfaceIndia;
import s.SComponentGolf;

public class NInterfaceIndiaImpl implements NInterfaceIndia {
  private static hq a = null;

  private NInterfaceIndia b = null;

  public static hq a() {
    if (a == null) a = new hq();
    return a;
  }

  public void a(String paramString) {
    if (this.b != null) {
      this.b.a(paramString);
    } else if (!SwingUtilities.isEventDispatchThread()) {
      hr hr = new hr(this, paramString);
      SwingUtilities.invokeLater(hr);
    } else {
      e(paramString);
    }
    D.d(paramString);
  }

  private void e(String paramString) {
    paramString = SComponentGolf.b(paramString);
    iJ iJ = dd.a().e();
    iW iW = dd.a().f();
    if (iJ != null) {
      iJ.a(paramString);
    } else if (iW != null) {
      iW.c(paramString);
    }
  }

  public void d(String paramString) {
    iW iW = dd.a().f();
    if (iW != null) iW.c(paramString);
  }

  public void b(String paramString) {
    if (this.b != null) {
      this.b.b(paramString);
    } else {
      JFrame jFrame = dd.a().c();
      bV.d(paramString, jFrame);
    }
  }

  public boolean c(String paramString) {
    if (this.b != null) return this.b.c(paramString);
    JFrame jFrame = dd.a().c();
    return (JOptionPane.showConfirmDialog(jFrame, paramString, SComponentGolf.b("Approve"), 0, 2)
        == 0);
  }

  public int a(String paramString, String[] paramArrayOfString) {
    if (this.b != null) return this.b.a(paramString, paramArrayOfString);
    JFrame jFrame = dd.a().c();
    return bV.b(paramString, "Prompt", jFrame, paramArrayOfString);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
