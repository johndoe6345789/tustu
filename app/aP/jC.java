package aP;

import B.a;
import B.b;
import B.g;
import B.i;
import B.n;
import G.R;
import G.T;
import G.aG;
import G.aM;
import G.bT;
import V.g;
import aE.a;
import bH.D;
import bH.X;
import bQ.l;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import r.j;
import s.g;

class jC implements aG {
  jC(jA paramjA) {}
  
  public boolean a(String paramString, bT parambT) {
    R r = T.a().c(paramString);
    a a = null;
    if (r.C() instanceof l && ((l)r.C()).a() instanceof a)
      a = (a)((l)r.C()).a(); 
    i i = null;
    if (a.A() != null)
      i = j.d(new File(a.A().t())); 
    if (r != null) {
      aM aM = r.c("SERIAL_NUMBER");
      try {
        if (aM != null && aM.n(r.h()) && aM.j(r.h()) > 0.0D && parambT.c() != null && parambT.c().length() == 4) {
          String str = Integer.toHexString((int)aM.j(r.h()));
          str = X.a(str, '0', 4).toUpperCase();
          if (!str.equals(parambT.c()))
            return a(r); 
        } else if (i != null && i.e() != null && !i.e().isEmpty() && a != null && !a.a().equals(i.e())) {
          D.d("Project and controller serial numbers match. Controller: " + a.a() + ", Project: " + i.e());
          i i1 = new i();
          i1.g(i.j());
          i1.c(i.d());
          i1.f(i.i());
          i1.a(r.i());
          i1.e("Serial# " + a.a());
          i1.a(i.g());
          i1.d(a.a());
          String str = n.a(r);
          i i2 = g.a().a(str);
          if (a(i2, i.e(), a.a())) {
            D.d("User selected to use anyway, updating project to new Serial number.");
            j.a(new File(a.A().t()), i1);
          } else {
            return false;
          } 
        } else {
          if (i != null && b.c().d() != null && b.c().d().e() != null && !b.c().d().e().isEmpty()) {
            D.d("Project with no serial number, adding it.");
            i.e(i.f() + " : serial.cfg was deleted.");
            j.a(new File(a.A().t()), i);
            return true;
          } 
          D.d("Project and controller serial numbers match.");
        } 
      } catch (g g) {
        D.a((Exception)g);
      } 
    } else {
      D.b("EcuConfig not loaded, can't check serial.");
    } 
    return true;
  }
  
  public void a(String paramString) {}
  
  private boolean a(R paramR) {
    JFrame jFrame = dd.a().c();
    String str = g.b("The loaded Project was used last used with a different ECU.") + "\n\n" + g.b("To assist in maintaining calibration restore points and data logs") + " \n" + g.b("a separate project should be used for each ECU you work with.") + "\n\n" + g.b("It is recommended that you use a Project that was created for this car or create a new Project.") + "\n";
    String[] arrayOfString = { g.b("Open another Project"), g.b("Create a new Project"), g.b("Connect anyway") };
    int i = JOptionPane.showOptionDialog(jFrame, str, g.b("Different ECU Detected!"), 1, 2, null, (Object[])arrayOfString, arrayOfString[0]);
    if (i == 0) {
      jD jD = new jD(this, jFrame);
      SwingUtilities.invokeLater(jD);
    } else if (i == 1) {
      jE jE = new jE(this, jFrame);
      SwingUtilities.invokeLater(jE);
    } else {
      paramR.h().f();
      return true;
    } 
    return false;
  }
  
  private boolean a(i parami, String paramString1, String paramString2) {
    JFrame jFrame = dd.a().c();
    String str = g.b("The loaded Project was used last used with a different ECU.") + "\n\n" + g.b("To assist in maintaining calibration restore points and data logs") + " \n" + g.b("a separate project is used for each ECU you work with.") + "\n\n" + g.b("It is recommended that you use a Project that was created for this ECU.") + "\n";
    String[] arrayOfString = { g.b("Open Project for this ECU"), g.b("Assign this project to this ECU") };
    int j = JOptionPane.showOptionDialog(jFrame, str, g.b("Different ECU Detected!"), 0, 2, null, (Object[])arrayOfString, arrayOfString[0]);
    if (j == 0) {
      jF jF = new jF(this, parami);
      SwingUtilities.invokeLater(jF);
    } else {
      return true;
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */