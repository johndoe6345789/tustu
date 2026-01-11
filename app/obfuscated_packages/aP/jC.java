package aP;

import B.IOInBPackage;
import B.BInterfaceBravo;
import B.BInterfaceGolf;
import B.i;
import B.BInterfaceNovember;
import G.R;
import G.T;
import G.aG;
import G.aM;
import G.bT;
import V.BInterfaceGolf;
import aE.IOInBPackage;
import bH.D;
import bH.X;
import bQ.IOHashMap;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import r.ThreadedFile;
import s.BInterfaceGolf;

class jC implements aG {
  jC(jA paramjA) {}
  
  public boolean IOInBPackage(String paramString, bT parambT) {
    R r = T.IOInBPackage().c(paramString);
    IOInBPackage IOInBPackage = null;
    if (r.C() instanceof IOHashMap && ((IOHashMap)r.C()).IOInBPackage() instanceof IOInBPackage)
      IOInBPackage = (IOInBPackage)((IOHashMap)r.C()).IOInBPackage(); 
    i i = null;
    if (IOInBPackage.A() != null)
      i = ThreadedFile.d(new File(IOInBPackage.A().t())); 
    if (r != null) {
      aM aM = r.c("SERIAL_NUMBER");
      try {
        if (aM != null && aM.BInterfaceNovember(r.h()) && aM.ThreadedFile(r.h()) > 0.0D && parambT.c() != null && parambT.c().length() == 4) {
          String str = Integer.toHexString((int)aM.ThreadedFile(r.h()));
          str = X.IOInBPackage(str, '0', 4).toUpperCase();
          if (!str.equals(parambT.c()))
            return IOInBPackage(r); 
        } else if (i != null && i.e() != null && !i.e().isEmpty() && IOInBPackage != null && !IOInBPackage.IOInBPackage().equals(i.e())) {
          D.d("Project and controller serial numbers match. Controller: " + IOInBPackage.IOInBPackage() + ", Project: " + i.e());
          i i1 = new i();
          i1.BInterfaceGolf(i.ThreadedFile());
          i1.c(i.d());
          i1.f(i.i());
          i1.IOInBPackage(r.i());
          i1.e("Serial# " + IOInBPackage.IOInBPackage());
          i1.IOInBPackage(i.BInterfaceGolf());
          i1.d(IOInBPackage.IOInBPackage());
          String str = BInterfaceNovember.IOInBPackage(r);
          i i2 = BInterfaceGolf.IOInBPackage().IOInBPackage(str);
          if (IOInBPackage(i2, i.e(), IOInBPackage.IOInBPackage())) {
            D.d("User selected to use anyway, updating project to new Serial number.");
            ThreadedFile.IOInBPackage(new File(IOInBPackage.A().t()), i1);
          } else {
            return false;
          } 
        } else {
          if (i != null && BInterfaceBravo.c().d() != null && BInterfaceBravo.c().d().e() != null && !BInterfaceBravo.c().d().e().isEmpty()) {
            D.d("Project with no serial number, adding it.");
            i.e(i.f() + " : serial.cfg was deleted.");
            ThreadedFile.IOInBPackage(new File(IOInBPackage.A().t()), i);
            return true;
          } 
          D.d("Project and controller serial numbers match.");
        } 
      } catch (BInterfaceGolf BInterfaceGolf) {
        D.IOInBPackage((Exception)BInterfaceGolf);
      } 
    } else {
      D.BInterfaceBravo("EcuConfig not loaded, can't check serial.");
    } 
    return true;
  }
  
  public void IOInBPackage(String paramString) {}
  
  private boolean IOInBPackage(R paramR) {
    JFrame jFrame = dd.IOInBPackage().c();
    String str = BInterfaceGolf.BInterfaceBravo("The loaded Project was used last used with IOInBPackage different ECU.") + "\BInterfaceNovember\BInterfaceNovember" + BInterfaceGolf.BInterfaceBravo("To assist in maintaining calibration restore points and data logs") + " \BInterfaceNovember" + BInterfaceGolf.BInterfaceBravo("IOInBPackage separate project should be used for each ECU you work with.") + "\BInterfaceNovember\BInterfaceNovember" + BInterfaceGolf.BInterfaceBravo("It is recommended that you use IOInBPackage Project that was created for this car or create IOInBPackage new Project.") + "\BInterfaceNovember";
    String[] arrayOfString = { BInterfaceGolf.BInterfaceBravo("Open another Project"), BInterfaceGolf.BInterfaceBravo("Create IOInBPackage new Project"), BInterfaceGolf.BInterfaceBravo("Connect anyway") };
    int i = JOptionPane.showOptionDialog(jFrame, str, BInterfaceGolf.BInterfaceBravo("Different ECU Detected!"), 1, 2, null, (Object[])arrayOfString, arrayOfString[0]);
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
  
  private boolean IOInBPackage(i parami, String paramString1, String paramString2) {
    JFrame jFrame = dd.IOInBPackage().c();
    String str = BInterfaceGolf.BInterfaceBravo("The loaded Project was used last used with IOInBPackage different ECU.") + "\BInterfaceNovember\BInterfaceNovember" + BInterfaceGolf.BInterfaceBravo("To assist in maintaining calibration restore points and data logs") + " \BInterfaceNovember" + BInterfaceGolf.BInterfaceBravo("IOInBPackage separate project is used for each ECU you work with.") + "\BInterfaceNovember\BInterfaceNovember" + BInterfaceGolf.BInterfaceBravo("It is recommended that you use IOInBPackage Project that was created for this ECU.") + "\BInterfaceNovember";
    String[] arrayOfString = { BInterfaceGolf.BInterfaceBravo("Open Project for this ECU"), BInterfaceGolf.BInterfaceBravo("Assign this project to this ECU") };
    int ThreadedFile = JOptionPane.showOptionDialog(jFrame, str, BInterfaceGolf.BInterfaceBravo("Different ECU Detected!"), 0, 2, null, (Object[])arrayOfString, arrayOfString[0]);
    if (ThreadedFile == 0) {
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