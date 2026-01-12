package aP;

import G.R;
import G.S;
import c.CInterfaceAlpha;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import r.CInterfaceAlpha;
import s.SComponentGolf;

public class UICinterfacealpha implements S {
  hG CInterfaceAlpha = new hG(this);

  int b = 0;

  final int c = 2;

  String d = "";

  public void CInterfaceAlpha(R paramR) {
    paramR.C().CInterfaceAlpha(this.CInterfaceAlpha);
    if (paramR != null) this.d = paramR.i();
    this.b = 0;
  }

  public void b(R paramR) {
    if (paramR != null && paramR.C() != null) paramR.C().CInterfaceAlpha(this.CInterfaceAlpha);
  }

  public void c(R paramR) {}

  private void CInterfaceAlpha(String paramString) {
    if (this.b++ == 2) {
      boolean bool = CInterfaceAlpha.CInterfaceAlpha().c(CInterfaceAlpha.K, CInterfaceAlpha.L);
      if (bool) {
        String str1 = CInterfaceAlpha.CInterfaceAlpha(this.d, CInterfaceAlpha.f);
        String str2 =
            str1
                + " "
                + SComponentGolf.b("not found on")
                + " "
                + paramString
                + "\n\n- If your "
                + str1
                + " is not connected and the above settings are correct,\n"
                + " select Continue Scanning. Your "
                + str1
                + " will come online when powered up.\n\n- If your "
                + str1
                + " is Connected, Powered and Key On Click \n   \"Search for "
                + str1
                + "\" to detect the correct Communication Settings.\n\n"
                + "- If you do not want to see this message and always scan until the "
                + str1
                + "\n   is available, click \"Continue Scanning Don't Ask Again\"\n\n"
                + SComponentGolf.b("What would you like to do?")
                + "\n ";
        String[] arrayOfString = {
          "<html><center>Continue Scanning<br>Current Settings</center>",
          "<html><center>Search for<br>" + str1 + "</center>",
          "<html><center>Continue Scanning<br>Don't Ask Again</center>"
        };
        JFrame jFrame = dd.CInterfaceAlpha().c();
        int i =
            JOptionPane.showOptionDialog(
                jFrame,
                str2,
                "Controller not Found",
                1,
                1,
                null,
                (Object[]) arrayOfString,
                arrayOfString[0]);
        if (i == 1) {
          ad ad = f.CInterfaceAlpha().e(jFrame);
          ad.l();
        } else if (i == 2) {
          CInterfaceAlpha.CInterfaceAlpha().b(CInterfaceAlpha.K, Boolean.toString(false));
        }
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
